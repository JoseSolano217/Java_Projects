package usta.proj5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usta.proj5.entity.StudentsSubjectsEntity;
import usta.proj5.repository.StudentsSubjectsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentsSubjectsService {
    @Autowired
    private StudentsSubjectsRepository studentsSubjectsRepository;

    public StudentsSubjectsEntity create(StudentsSubjectsEntity studentSubject) {
        return studentsSubjectsRepository.save(studentSubject);
    }

    public List<StudentsSubjectsEntity> listAll() {
        return studentsSubjectsRepository.findAll();
    }

    public void delete(StudentsSubjectsEntity studentSubject) {
        studentsSubjectsRepository.delete(studentSubject);
    }

    public Optional<StudentsSubjectsEntity> findByID(Long id) {
        return studentsSubjectsRepository.findById(id);
    }

    public void deleteById(Long id) {
        studentsSubjectsRepository.deleteById(id);
    }
}
