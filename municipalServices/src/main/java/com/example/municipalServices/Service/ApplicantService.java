package com.example.municipalServices.Service;

import com.example.municipalServices.Model.Applicant;
import com.example.municipalServices.Repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantRepository applicantRepository;

    public Applicant saveApplicant(Applicant applicant) {
        return applicantRepository.save(applicant);
    }

    public List<Applicant> getAllApplicants() {
        return applicantRepository.findAll();
    }

    public Optional<Applicant> getApplicantById(Long id) {
        return applicantRepository.findById(id);
    }

    public void deleteApplicant(Long id) {
        applicantRepository.deleteById(id);
    }

    public Applicant updateApplicant(Long id, Applicant applicantDetails) {
        return applicantRepository.findById(id).map(applicant -> {
            applicant.setFullname(applicantDetails.getFullname());
            applicant.setNationalId(applicantDetails.getNationalId());
            applicant.setPhoneNo(applicantDetails.getPhoneNo());
            applicant.setEmail(applicantDetails.getEmail());
            applicant.setAddress(applicantDetails.getAddress());
            applicant.setDateApplied(applicantDetails.getDateApplied());
            applicant.setStatus(applicantDetails.getStatus());
            applicant.setHuduma(applicantDetails.getHuduma());
            return applicantRepository.save(applicant);
        }).orElseThrow(() -> new RuntimeException("Applicant not found with id: " + id));
    }
}
