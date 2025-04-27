package com.example.AmigosCodeDemo.Controller;

import com.example.AmigosCodeDemo.Entity.SoftwareEngineer;
import com.example.AmigosCodeDemo.Service.SoftwareEngineerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService){
        this.softwareEngineerService= softwareEngineerService;
    }

    /**
     * To Retrieve All Software Engineers from DB
     */
    @GetMapping
    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerService.getAllSoftwareEngineers();
    }

    /**
     * To Insert Software Engineer into DB
     */
    @PostMapping(path="/add")
    //Not recommended
    public void addSoftwareEngineer(@RequestBody SoftwareEngineer  softwareEngineer){
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }

    /**
     * To Retrieve Software Engineer from DB based on ID
     */
    @GetMapping("{id}")
    public SoftwareEngineer getSoftwareEngineerById(@PathVariable Integer id){
        return softwareEngineerService.getAllSoftwareEngineerById(id);
    }

    /**
     * To Remove Software Engineer From DB based on ID
     */
    @DeleteMapping(path = "/{id}")
    public void deleteSoftwareEngineerById(@PathVariable Integer id){
         softwareEngineerService.deleteSoftwareEngineerById(id);
    }

    /**
     * To Update Software Engineer into DB based on ID
     */
    @PutMapping(path = "/{id}")
    public SoftwareEngineer updateSoftwareEngineerById(@PathVariable Integer id, @RequestBody SoftwareEngineer softwareEngineer){
        return softwareEngineerService.updateSoftwareEngineerById(id,softwareEngineer);
    }
}
