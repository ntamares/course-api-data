package com.springbootquickstart.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRespository;
	
	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRespository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Optional<Course> getCourse(String id) {
		return courseRespository.findById(id);
	}

	public void addCourse(Course course) {
		courseRespository.save(course);
	}

	public void updateCourse(Course course) {
		courseRespository.save(course);
	}

	public void deleteCourse(String id) {
		courseRespository.deleteById(id);
	}
}
