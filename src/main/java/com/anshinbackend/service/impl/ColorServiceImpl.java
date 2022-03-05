package com.anshinbackend.service.impl;

import com.anshinbackend.dao.ColorDAO;
import com.anshinbackend.entity.Color;
import com.anshinbackend.service.ColorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorServiceImpl implements ColorService {
    @Autowired
    ColorDAO _colorDAO;
    
    @Override
	public List<Color> findAll(){
    	return _colorDAO.findAll();
    }
    @Override
	public Color create(Color color) {
    	return _colorDAO.save(color);
    }
    @Override
	public Color findById(int id) {
    	
    	return _colorDAO.getById(id);
    	
    }
   
    
    
}
