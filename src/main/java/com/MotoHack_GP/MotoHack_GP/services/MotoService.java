package com.MotoHack_GP.MotoHack_GP.services;

import com.MotoHack_GP.MotoHack_GP.models.Moto;
import com.MotoHack_GP.MotoHack_GP.repositories.IMotoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoService implements IMotoService {
    private IMotoRepository motoRepository;

    public MotoService(IMotoRepository motoRepository) {
        this.motoRepository = motoRepository;
    }

    @Override
    public List<Moto> getAll() {
        return motoRepository.findAll();
    }
}
