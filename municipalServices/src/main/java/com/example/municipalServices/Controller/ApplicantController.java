package com.example.municipalServices.Controller;

import com.example.municipalServices.Model.Applicant;
import com.example.municipalServices.Service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/applicants")
@CrossOrigin(origins = "*") // weka hii kama unatumia frontend
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @PostMapping
    public Applicant createApplicant(@RequestBody Applicant applicant) {
        System.out.println("Received bill: " + applicant.getBill());
        System.out.println("Received payment: " + applicant.getPayment());
        System.out.println("Received huduma: " + applicant.getHuduma());
        return applicantService.saveApplicant(applicant);
    }

    @GetMapping
    public List<Applicant> getAllApplicants() {
        return applicantService.getAllApplicants();
    }

    @GetMapping("/{id}")
    public Optional<Applicant> getApplicantById(@PathVariable Long id) {
        return applicantService.getApplicantById(id);
    }

    @PutMapping("/{id}")
    public Applicant updateApplicant(@PathVariable Long id, @RequestBody Applicant applicant) {
        return applicantService.updateApplicant(id, applicant);
    }

    @DeleteMapping("/{id}")
    public void deleteApplicant(@PathVariable Long id) {
        applicantService.deleteApplicant(id);
    }
}
