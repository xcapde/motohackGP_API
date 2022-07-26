package com.MotoHack_GP.MotoHack_GP.services;

import com.MotoHack_GP.MotoHack_GP.dto.MotoRequestDto;
import com.MotoHack_GP.MotoHack_GP.models.Moto;

import java.util.List;

public interface IMotoService {
    List<Moto> getAll();
    Moto getById(Long id);
    List<Moto> getBySearch(String search);
    Moto update(MotoRequestDto motoDto, Long id);
}
