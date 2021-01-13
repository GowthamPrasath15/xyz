package com.ammacollege.details.service;


import java.util.List;

import com.ammacollege.details.model.CourseDetails;

public interface AmmaCollegeService {

	List<CourseDetails> getCourseDetails();

	CourseDetails getCourseDetailsBycourseId(int courseId);
}
