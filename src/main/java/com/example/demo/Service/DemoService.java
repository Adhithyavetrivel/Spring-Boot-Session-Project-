package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.DemoModel;
import com.example.demo.Repository.DemoRepo;

import java.util.List;

@Service
public class DemoService{
    @Autowired 
    DemoRepo repository;

    public DemoModel create(DemoModel table) {
        return repository.save(table);
    }

    public DemoModel create2(DemoModel table) {
        return repository.save(table);
    }

    public List<DemoModel> getAll(){
        return repository.findAll();
    }
}
