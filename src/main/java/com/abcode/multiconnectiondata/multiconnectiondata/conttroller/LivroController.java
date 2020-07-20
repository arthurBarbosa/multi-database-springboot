package com.abcode.multiconnectiondata.multiconnectiondata.conttroller;

import com.abcode.multiconnectiondata.multiconnectiondata.domain.app.Livro;
import com.abcode.multiconnectiondata.multiconnectiondata.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> obterLivros() {
        return this.livroService.obterLivros();
    }

    @PostMapping
    public ResponseEntity<Livro> criar(@RequestBody Livro livro) {

        try {

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.livroService.criar(livro));

        } catch (IllegalArgumentException e) {

            return ResponseEntity.badRequest().build();
        }
    }
}
