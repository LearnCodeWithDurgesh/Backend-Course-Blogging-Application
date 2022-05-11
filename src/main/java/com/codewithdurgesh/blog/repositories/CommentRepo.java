package com.codewithdurgesh.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithdurgesh.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
