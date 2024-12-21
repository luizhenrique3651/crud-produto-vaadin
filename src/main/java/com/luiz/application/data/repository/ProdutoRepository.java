package com.luiz.application.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.application.data.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
