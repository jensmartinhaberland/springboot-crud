package com.example.springbootcrud.repository;

import com.example.springbootcrud.bean.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, String> {
}
