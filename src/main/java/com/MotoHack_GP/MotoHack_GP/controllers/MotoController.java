package com.MotoHack_GP.MotoHack_GP.controllers;

import com.MotoHack_GP.MotoHack_GP.dto.MotoRequestDto;
import com.MotoHack_GP.MotoHack_GP.models.Moto;
import com.MotoHack_GP.MotoHack_GP.services.IMotoService;
import org.springframework.web.bind.annotation.*;

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
    Moto getById(@PathVariable Long id){
        return motoService.getById(id);
    };

    @GetMapping(value="/motos", params = "search")
    List<Moto> getBySearch(@RequestParam String search){
        var searchResult = motoService.getBySearch(search);
        return searchResult;
    }

    @PutMapping("/motos/{id}")
    Moto update(@RequestBody MotoRequestDto motoDto, @PathVariable Long id){
        var updatedMoto = motoService.update(motoDto, id);
        return updatedMoto;
    }
}
