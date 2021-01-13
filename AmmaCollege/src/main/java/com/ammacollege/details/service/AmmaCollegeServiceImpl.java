package com.ammacollege.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ammacollege.details.data.CompanyRepository;
import com.ammacollege.details.model.CourseDetails;



@Service
public  class AmmaCollegeServiceImpl implements AmmaCollegeService {
	
	
	@Autowired
	CompanyRepository repo;
	
	@Override
	public List<CourseDetails> getCourseDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseDetails getCourseDetailsBycourseId(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
