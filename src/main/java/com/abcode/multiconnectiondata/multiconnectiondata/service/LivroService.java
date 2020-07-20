package com.abcode.multiconnectiondata.multiconnectiondata.service;

import com.abcode.multiconnectiondata.multiconnectiondata.domain.app.Livro;

import java.util.List;

public interface LivroService {

    public List<Livro> obterLivros();

    public Livro criar(Livro livro);
}
