package usta.proj5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usta.proj5.entity.StudentEntity;
import usta.proj5.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentEntity create(StudentEntity person) {
        return studentRepository.save(person);
    }

    public List<StudentEntity> listAll() {
        return studentRepository.findAll();
    }

    public void delete(StudentEntity person) {
        studentRepository.delete(person);
    }

    public Optional<StudentEntity> findByID(Long id) {
        return studentRepository.findById(id);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
