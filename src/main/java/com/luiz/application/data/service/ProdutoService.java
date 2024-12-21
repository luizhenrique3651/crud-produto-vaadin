package com.luiz.application.data.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.luiz.application.data.entity.Produto;
import com.luiz.application.data.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> findProdutos() {
		return produtoRepository.findAll();
	}

	public Optional<Produto> findProdutoById(Long id) {
		return produtoRepository.findById(id);
	}

	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}

	public boolean deleteById(Long id) {
		if (produtoRepository.existsById(id)) {
			produtoRepository.deleteById(id);
			return true;
		}
		return false;
	}
}
