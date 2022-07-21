package com.MotoHack_GP.MotoHack_GP.services;

import com.MotoHack_GP.MotoHack_GP.dto.MotoRequestDto;
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

    @Override
    public Moto getById(Long id) {
        return motoRepository.findById(id).get();
    }

    @Override
    public List<Moto> getBySearch(String search) {
        var searchList = motoRepository.findMotosBySearchOfBrandOrModel(search);
        return searchList;
    }

    @Override
    public Moto update(MotoRequestDto motoDto, Long id) {
        var motoToEdit = motoRepository.findById(id).get();
        motoToEdit.setBrand(motoDto.getBrand());
        motoToEdit.setModel(motoDto.getModel());
        motoToEdit.setImage(motoDto.getImage());
        motoToEdit.setLocation(motoDto.getLocation());
        motoToEdit.setDescription(motoDto.getDescription());
        motoToEdit.setProdYear(motoDto.getProdYear());
        motoToEdit.setCc(motoDto.getCc());
        motoToEdit.setHp(motoDto.getHp());
        motoToEdit.setKm(motoDto.getKm());
        motoToEdit.setPrice(motoDto.getPrice());
        motoToEdit.setIsFavorite(motoDto.getIsFavorite());
        motoToEdit.setIsClassic(motoDto.getIsClassic());
        motoToEdit.setIsEco(motoDto.getIsEco());
        return motoRepository.save(motoToEdit);
    }
}