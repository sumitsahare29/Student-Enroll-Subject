package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.entity.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Integer>{

}
