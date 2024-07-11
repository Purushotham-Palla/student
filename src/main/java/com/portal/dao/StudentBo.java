package com.portal.dao;

import java.util.List;

import com.portal.model.Student;

public interface StudentBo {

	int save(Student st);
	int update(Student st);
	int delete(int stId);
	Student getOneStudent(int stId);
	List<Student> getAll();
}
