package com.abcode.multiconnectiondata.multiconnectiondata.repository.auth;

import com.abcode.multiconnectiondata.multiconnectiondata.domain.auth.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
