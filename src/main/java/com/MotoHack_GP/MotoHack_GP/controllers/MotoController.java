package com.MotoHack_GP.MotoHack_GP.controllers;

import com.MotoHack_GP.MotoHack_GP.models.Moto;
import com.MotoHack_GP.MotoHack_GP.services.IMotoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MotoController {
    private IMotoService motoService;

    public MotoController(IMotoService motoService) {
        this.motoService = motoService;
    }

    @GetMapping("/motos")
    List<Moto> getAll(){
        return motoService.getAll();
    };

    @GetMapping("/motos/{id}")
    List<Moto> getById(){
        return motoService.getAll();
    };
}
