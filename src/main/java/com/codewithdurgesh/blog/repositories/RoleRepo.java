package com.codewithdurgesh.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithdurgesh.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
