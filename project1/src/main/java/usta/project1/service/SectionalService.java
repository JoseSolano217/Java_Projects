package usta.project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usta.project1.model.SectionalEntity;
import usta.project1.repository.SectionalRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SectionalService {
    @Autowired
    private SectionalRepository sectionalRepository;

    public List<SectionalEntity> getAllSectionals() {
        return sectionalRepository.findAll();
    }

    public Optional<SectionalEntity> getById(Long id) {
        return sectionalRepository.findById(id);
    }

    public int countAllUniversities() {
        return sectionalRepository.countAllSectionals();
    }
}
