package com.sergiecode.apirest.Repositories;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.lang.NonNull;

import com.sergiecode.apirest.Entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @NonNull List<Usuario> findAll(); // Reemplaza getUsuarios()

    void deleteById(@NonNull Long id); // Reemplaza eliminar()


    Optional<Usuario> findByEmail(String email); // Para autenticación
}
