package com.umss.dev.CoursesManagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umss.dev.CoursesManagement.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
//	public Usuario findByUsername(String username);

}