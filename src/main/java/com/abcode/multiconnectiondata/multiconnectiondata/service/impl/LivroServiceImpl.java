package com.abcode.multiconnectiondata.multiconnectiondata.service.impl;

import com.abcode.multiconnectiondata.multiconnectiondata.domain.app.Livro;
import com.abcode.multiconnectiondata.multiconnectiondata.domain.auth.Usuario;
import com.abcode.multiconnectiondata.multiconnectiondata.repository.app.LivroRepository;
import com.abcode.multiconnectiondata.multiconnectiondata.repository.auth.UsuarioRepository;
import com.abcode.multiconnectiondata.multiconnectiondata.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServiceImpl implements LivroService {
    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Livro> obterLivros() {
        return this.livroRepository.findAll();
    }

    @Override
    public Livro criar(Livro livro) {
        Usuario usuario = this.usuarioRepository.findById(livro.getCodigoUsuario())
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado."));
        livro.setNomeUsuario(usuario.getNome());

        return this.livroRepository.save(livro);
    }
}
