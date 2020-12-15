package com.batch.traitementbatch.repo;

import com.batch.traitementbatch.bean.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepo extends JpaRepository<Compte,Integer> {
}
