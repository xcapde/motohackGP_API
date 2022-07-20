package com.MotoHack_GP.MotoHack_GP.repositories;

import com.MotoHack_GP.MotoHack_GP.models.Moto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMotoRepository extends JpaRepository<Moto, Long> {
    @Query("select m from Moto m " +
            "where upper(m.brand) like upper(concat('%', :search, '%')) or upper(m.model) like upper(concat('%', :search, '%')) ")
    List<Moto> findMotosBySearchOfBrandOrModel(@Param("search") String search);

}
