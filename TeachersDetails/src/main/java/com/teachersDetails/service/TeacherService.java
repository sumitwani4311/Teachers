package com.teachersDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachersDetails.entity.Teacher;
import com.teachersDetails.repository.TeacherRepository;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository repo;

    public Teacher save(Teacher teacher) {
        return repo.save(teacher);
    }

    public List<Teacher> getAll() {
        return repo.findAll();
    }

    public Teacher getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
