package com.MotoHack_GP.MotoHack_GP.services;

import com.MotoHack_GP.MotoHack_GP.models.Moto;
import com.MotoHack_GP.MotoHack_GP.repositories.IMotoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MotoServiceTest {

    @Mock
    IMotoRepository mockMotoRepository;
    @Test
    void shouldReturnAllMotos() {
        //GIVEN
        var motoServices = new MotoService(mockMotoRepository);
        var motoList = List.of(new Moto(), new Moto());

        Mockito.when(mockMotoRepository.findAll()).thenReturn(motoList);

        //SUT
        var sut =motoServices.getAll();

        //THEN
        assertThat(sut.size(), equalTo(2));
//        assertThat(sut.size(), equalTo(1)); // Perquè falli

    }

    @Test
    void shouldReturnTheMotoWithSameId() {
    }

    @Test
    void shouldReturnAListOfMotosWithBrandOrModelThatContainsTheSearchValue() {
    }

    @Test
    void shouldUpdateTheMotoDataOfTheSameId() {
    }
}