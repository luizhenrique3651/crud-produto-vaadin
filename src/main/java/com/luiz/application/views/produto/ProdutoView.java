package com.luiz.application.views.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.firitin.components.grid.VGrid;
import org.vaadin.firitin.components.html.VDiv;
import org.vaadin.firitin.components.orderedlayout.VVerticalLayout;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

import com.luiz.application.components.CustomButton;
import com.luiz.application.components.CustomFormLayout;
import com.luiz.application.data.entity.Produto;
import com.luiz.application.data.service.ProdutoService;
import com.luiz.application.util.CustomUtils;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Produto")
@Route("")
@Menu(order = 0, icon = LineAwesomeIconUrl.PRODUCT_HUNT)
public class ProdutoView extends  VVerticalLayout implements BeforeEnterObserver  {

	  private static final long serialVersionUID = 1L;

		private final VGrid<Produto> gridProdutos;
	    
	    @Autowired
	    private ProdutoService service;

	    public ProdutoView(final ProdutoService produtoService) {
	        this.withFullWidth();
	        this.withPadding(false);

	        gridProdutos = new VGrid<>();
	        gridProdutos.withThemeVariants(GridVariant.LUMO_NO_BORDER);
	        gridProdutos.addColumn(Produto::getId).setHeader("ID");
	        gridProdutos.addColumn(Produto::getDescricao).setHeader("Descrição");
	        gridProdutos.addColumn(produto -> {
			    return CustomUtils.formataValor(produto.getValorUnitario());
	        }).setHeader("Valor");


	        final var btnAdicionar = new CustomButton("Adicionar").themeTertiaryInline().themeSmall().withClassName("grid-actions")
	            .withClickListener(ev -> new ProdutoForm(new Produto(), produtoService, consumerProduto -> {
	            	produtoService.save(consumerProduto);
	            	gridProdutos.setItems(produtoService.findProdutos());
	            }).open());

	        gridProdutos.addColumn(new ComponentRenderer<>(produto -> {
	            final var btnEditar = new CustomButton("Editar").themeTertiaryInline().themeSmall()
	                .withClickListener(ev -> new ProdutoForm(produto, produtoService, consumerProduto -> {
	                	produto.setDescricao(consumerProduto.getDescricao());
	                	produto.setValorUnitario(consumerProduto.getValorUnitario());
	                	produtoService.save(produto);
	                	gridProdutos.setItems(produtoService.findProdutos());
	                }).open());

	            final var btnRemover = new CustomButton("Excluir").themeTertiaryInline().themeError().themeSmall()
	                .withClickListener(ev -> {
	                	produtoService.deleteById(produto.getId());
	                	gridProdutos.setItems(produtoService.findProdutos());
	                });

	            return new VDiv(btnEditar, btnRemover).withClassName("grid-actions");
	        })).setHeader(btnAdicionar);

	        final var options = new CustomFormLayout().withFullWidth();

	        this.add(options, gridProdutos);
	    }

	    @Override
	    public void beforeEnter(final BeforeEnterEvent beforeEnterEvent) {
	        gridProdutos.setItems(
	        		service.findProdutos());
	    }

}
