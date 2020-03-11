package com.taslim.SpringBootJPACRUDServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentService {

	@Autowired
	StudentRepository repository;
	
	public List<Student> getAllStudents()
	{

				return repository.findAll();
//				List<Student> studentList =
//		if(studentList.size() > 0) {
//            return studentList;
//        } else {  
//            return new ArrayList<Student>();
//        }
		
	}
	
	 public void save(Student student) {
		 repository.save(student);
	    }
	 public Student getStudentById(Long id)  
	    {
	        Optional<Student> student = repository.findById(id);
	         
	        if(student.isPresent()) {
	            return student.get();
	        } else {
	            System.out.println("No student record exist for given id");
	            return null;
	        }
	    }
	 
	 public Student createOrUpdateStudent(Student entity)  
	    {
	        Optional<Student> student = repository.findById(entity.getId());
	         
	        if(student.isPresent()) 
	        {
	        	Student newEntity = student.get();
	            newEntity.setName(entity.getName());
	            newEntity.setBranch(entity.getBranch());
	 
	            newEntity = repository.save(newEntity);
	             
	            return newEntity;
	        } else {
	            entity = repository.save(entity);
	             
	            return entity;
	        }
	    } 
	 
	 public void deleteStudentById(Long id)
	    {
	        Optional<Student> student = repository.findById(id);
	         
	        if(student.isPresent()) 
	        {
	            repository.deleteById(id);
	        } else {
	            System.out.println("No student record exist for given id");
	        }
	    }

	
}

