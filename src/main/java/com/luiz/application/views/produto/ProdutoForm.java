package com.luiz.application.views.produto;

import java.util.function.Consumer;

import org.vaadin.firitin.components.button.VButton;
import org.vaadin.firitin.components.dialog.VDialog;
import org.vaadin.firitin.components.html.VDiv;
import org.vaadin.firitin.components.textfield.VBigDecimalField;
import org.vaadin.firitin.components.textfield.VTextField;

import com.luiz.application.components.CustomBinder;
import com.luiz.application.components.CustomButton;
import com.luiz.application.components.CustomFormLayout;
import com.luiz.application.data.entity.Produto;
import com.luiz.application.data.service.ProdutoService;



public class ProdutoForm extends VDialog{

	 public ProdutoForm(final Produto produto, final ProdutoService produtoService, final Consumer<Produto> consumer) {
	        setHeaderTitle("Produto");

	        final var form = new CustomFormLayout();
	        this.add(form);
	        final var binder = new CustomBinder<>(produto);

	        final var tfID = new VTextField("ID").withReadOnly(true);
	        binder.forField(tfID).bindReadOnly(p -> String.valueOf(p.getId()));
	        if(tfID.getValue().equals("0")) {
	        	tfID.setVisible(false);
	        }
	        form.add(tfID);

	        final var tfDescricao = new VTextField("Descricao");
	        binder.forField(tfDescricao).bind(Produto::getDescricao, Produto::setDescricao);
	        form.add(tfDescricao);

	        final var bfValorUnitario = new VBigDecimalField("Valor unitario");
	        binder.forField(bfValorUnitario).bind(Produto::getValorUnitario, Produto::setValorUnitario);
	        form.add(bfValorUnitario, 2);

	        final var btnSalvar = new CustomButton("Salvar").themePrimary()
	            .withClickListener(ev -> {
	                // TODO: Implementar update e insert do produto
	                final var produtoSalvo = produtoService.save(binder.getObject());
	                consumer.accept(produtoSalvo);
	                this.close();
	            });

	        final var btnCancelar = new VButton("Cancelar").withClickListener(ev -> this.close());

	        getFooter().add(new VDiv(btnSalvar, btnCancelar).withClassName("dialog-footer"));
	    }

}
