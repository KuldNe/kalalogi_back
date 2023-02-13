package com.fishlog.kalalogi_back.domain.catches;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AcatchRepository extends JpaRepository<Acatch, Integer> {

    @Query("select a from Acatch a where a.user.id = ?1 and a.status = ?2")
    List<Acatch> findCatchesByUser(Integer id, String status);

}