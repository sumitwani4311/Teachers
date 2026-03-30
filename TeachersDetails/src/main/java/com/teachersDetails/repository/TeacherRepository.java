package com.teachersDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teachersDetails.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
