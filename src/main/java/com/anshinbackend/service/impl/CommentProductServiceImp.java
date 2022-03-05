package com.anshinbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.anshinbackend.dao.CommentProductDAO;
import com.anshinbackend.entity.Comment;
import com.anshinbackend.service.CommentProductService;

public class CommentProductServiceImp implements CommentProductService{
	@Autowired
	CommentProductDAO commentDAO;
	@Override
	public Comment addNew(Comment comment) {
		
			
			return commentDAO.save(comment);
		}
	
	
	
	@Override
	public Comment findById(int id) {
		return commentDAO.getById(id);
	}
	@Override
	public void delete(int id) {
		 commentDAO.deleteById(id);
	}
}
