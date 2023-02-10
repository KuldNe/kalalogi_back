package com.fishlog.kalalogi_back.domain.fish;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FishRepository extends JpaRepository<Fish, Integer> {

    @Query("select f from Fish f where f.publicField = ?1 and f.acatch.user.status = ?2 order by f.acatch.date")
    List<Fish> findPublicFish(Boolean publicField, String status);



}