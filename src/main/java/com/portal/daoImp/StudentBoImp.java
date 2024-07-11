package com.portal.daoImp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.portal.dao.StudentBo;
import com.portal.model.Student;

public class StudentBoImp implements StudentBo {
	
	
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static Statement statement;
	private static ResultSet res;
	
	private final static String INSERT_QUERY = "INSERT into `students`(`name`,`email`,`age`) values(?,?,?) ";
	
	private final static String UPDATE_QUERY = "UPDATE `students` SET `name` = ?, `email` = ? , `age`= ? WHERE id = ?";
	
	private final static String DELETE_QUERY = "DELETE FROM `students` WHERE `id`= ?";
	
	private final static String DISPLAY_ALL = "SELECT * FROM `students`";
	
	private final static String GET_ONE_DETAIL ="SELECT * FROM `students` WHERE `id` = ?";
	
//	private final static String SEARCH_BY_ID ="SELECT * FROM `students` WHERE `id` = ?";

//	private final static String SEARCH_BY_NAME ="SELECT * FROM `students` WHERE `name` = ?";
	
//	private final static String SEARCH_BY_EMAIL ="SELECT * FROM `students` WHERE `email` = ?";
	
	
	
	
	
	public static final StudentBoImp objStudentBoImp() {
		return StudentBoImpHold.obj;
		
	}
	
	private static class StudentBoImpHold{
		private static StudentBoImp obj = new StudentBoImp();
	}
	
	public StudentBoImp() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public int save(Student st) {
	//Register the new Student
		try {
			
			preparedStatement =connection.prepareStatement(INSERT_QUERY);
			preparedStatement.setString(1, st.getName());
			preparedStatement.setString(2, st.getEmail());
			preparedStatement.setInt(3, st.getAge());
			
			int i = preparedStatement.executeUpdate();
			return i;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return 0;
	}

	@Override
	public int update(Student st) {
//		Update: updating the details of an existing student
		try {
			preparedStatement =connection.prepareStatement(UPDATE_QUERY);
			preparedStatement.setString(1, st.getName());
			preparedStatement.setString(2, st.getEmail());
			preparedStatement.setInt(3, st.getAge());
			preparedStatement.setInt(4, st.getId());
			
			System.out.println(st.getName()+" "+st.getEmail()+" "+st.getAge());
			int i = preparedStatement.executeUpdate();
			
			return i;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int delete(int stId) {
//		Delete: deleting a student from the database.
		try {
			preparedStatement =connection.prepareStatement(DELETE_QUERY);
			preparedStatement.setInt(1, stId);
			
			int i = preparedStatement.executeUpdate();
			return i;
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public Student getOneStudent(int stId) {
//		fetch: fetching a student from the database.
		Student st=null;
		try {
			preparedStatement = connection.prepareStatement(GET_ONE_DETAIL);
			preparedStatement.setInt(1, stId);
			res	=preparedStatement.executeQuery();
			
			if(res.next())
			{
				int id = res.getInt("id");
				String name = res.getString("name");
				String email = res.getString("email");
				int age = res.getInt("age");
				st = new Student(id,name,email,age);
			}
			return st;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Student> getAll() {
//		Fecth:fetching all list of student from the database.
		ArrayList<Student> list = new ArrayList<Student>();
		
		try {
			statement =connection.createStatement();
			res =statement.executeQuery(DISPLAY_ALL);
			
			while(res.next())
			{
				int id =res.getInt("id");
				String name = res.getString("name");
				String email = res.getString("email");
				int age = res.getInt("age");
				
//				System.out.println(id+" "+name+" "+" "+email+" "+age);
				Student st =new Student(id,name,email,age);
				list.add(st);
				
//				System.out.println("Added "+list.add(st));
			}
			return list;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/*
	 * tried to list based on search
	public Student searchByName(String sName) {
		
		Student st=null;
		try {
			preparedStatement = connection.prepareStatement(SEARCH_BY_NAME);
			preparedStatement.setString(1, sName);
			res	=preparedStatement.executeQuery();
			
			if(res.next())
			{
				int id = res.getInt("id");
				String name = res.getString("name");
				String email = res.getString("email");
				int age = res.getInt("age");
				System.out.println(id+name+email);
				st = new Student(id,name,email,age);
			}
			return st;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
		
	}
	
public Student searchByEmail(String sEmail) {
		
		Student st=null;
		try {
			preparedStatement = connection.prepareStatement(GET_ONE_DETAIL);
			preparedStatement.setString(1, sEmail);
			res	=preparedStatement.executeQuery();
			
			if(res.next())
			{
				int id = res.getInt("id");
				String name = res.getString("name");
				String email = res.getString("email");
				int age = res.getInt("age");
				st = new Student(id,name,email,age);
			}
			return st;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
		
	}
	*/
	

}
