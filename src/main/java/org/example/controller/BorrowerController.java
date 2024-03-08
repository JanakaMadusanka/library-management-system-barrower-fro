package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.BorrowerDto;
import org.example.entity.BorrowerEntity;
import org.example.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/borrower")
@RequiredArgsConstructor
@CrossOrigin
public class BorrowerController {

    final BorrowerService service;
    @PostMapping("/add")
    public void addBorrower(@RequestBody BorrowerDto borrowerDto){
        service.addBorrower(borrowerDto);
    }
    @GetMapping("/get")
    public Iterable<BorrowerEntity> getBorrower(){
        return service.getBorrowers();
    }
    @DeleteMapping("/{id}")
    public String deleteBorrower(@PathVariable Long id){
        service.deleteBorrower(id);
        return "Deleted";
    }
    @GetMapping("search/{id}")
    public BorrowerDto getBorrowerById(@PathVariable Long id){
        return service.getBorrowerById(id);
    }
}
