package usta.proj05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usta.proj05.models.PartnerEntity;
import usta.proj05.repository.PartnerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PartnerService {
    @Autowired
    private PartnerRepository partnerRepository;

    public PartnerEntity create(PartnerEntity partner) {
        return partnerRepository.save(partner);
    }

    public List<PartnerEntity> listAll() {
        return partnerRepository.findAll();
    }

    public void delete(PartnerEntity partner) {
        partnerRepository.delete(partner);
    }

    public Optional<PartnerEntity> findByID(Long id) {
        return partnerRepository.findById(id);
    }

    public void deleteById(Long id) {
        partnerRepository.deleteById(id);
    }
}
