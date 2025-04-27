package com.example.AmigosCodeDemo.Service;

import com.example.AmigosCodeDemo.Entity.SoftwareEngineer;
import com.example.AmigosCodeDemo.Data.SoftwareEngineerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {
    private SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository){
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers(){
        return softwareEngineerRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer  softwareEngineer) {
        softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getAllSoftwareEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id).orElseThrow(()->new NullPointerException("The ID=> "+id+" Could not be found!"));
    }

    public void deleteSoftwareEngineerById(Integer id) {
        softwareEngineerRepository.deleteById(id);
    }

    public SoftwareEngineer updateSoftwareEngineerById(Integer id,SoftwareEngineer  updated) {
        SoftwareEngineer existing = softwareEngineerRepository.findById(id).orElseThrow(()->new NullPointerException("The ID : "+ id+" not found"));
        existing.setName(updated.getName());
        existing.setTechStack(updated.getTechStack());
        return softwareEngineerRepository.save(existing);
    }
}
