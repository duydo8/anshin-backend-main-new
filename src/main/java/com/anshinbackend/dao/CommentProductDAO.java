package com.anshinbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshinbackend.entity.Comment;

public interface CommentProductDAO extends JpaRepository<Comment, Integer> {

}
