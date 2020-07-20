package com.abcode.multiconnectiondata.multiconnectiondata.repository.app;

import com.abcode.multiconnectiondata.multiconnectiondata.domain.app.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
