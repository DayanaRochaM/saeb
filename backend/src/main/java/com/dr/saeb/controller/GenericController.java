package com.dr.saeb.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dr.saeb.model.vo.FilterVO;
import com.dr.saeb.service.GenericService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/saeb")
@CrossOrigin(origins = "http://localhost:3000")
public class GenericController {

    @Autowired
    GenericService genericService; 
    
    @GetMapping("/fetch")
    Mono<Map<String, Object>> createFuncionario() throws Exception{
        return genericService.getInitialState();
    }
    
    @PostMapping("/inse")
    Mono<Map<String, Object>> createFuncionario(@RequestBody FilterVO filterVO) throws Exception{
        return genericService.findInseEscolaByFilter(filterVO);
    }
 
}
