package com.ammacollege.details.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ammacollege.details.model.StudentDetails;


@Repository
public interface CompanyRepository extends JpaRepository<StudentDetails, Long>{
	


}
