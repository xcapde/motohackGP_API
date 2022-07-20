package com.MotoHack_GP.MotoHack_GP.repositories;

import com.MotoHack_GP.MotoHack_GP.models.Moto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMotoRepository extends JpaRepository<Moto, Long> {
}
