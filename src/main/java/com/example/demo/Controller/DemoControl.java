package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Service.DemoService;
import com.example.demo.Model.DemoModel;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class DemoControl {
    @Autowired 
    DemoService service;

    @PostMapping("/create")
    public DemoModel create(@RequestBody DemoModel table) {
        return service.create(table);
    }

    @PostMapping ("/create2")
    public DemoModel create2(@RequestBody DemoModel table) {
        return service.create(table);
    }
    
    @GetMapping("getAll")
    public List<DemoModel> getAll() {
        return service.getAll();
    }

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
