package com.fishlog.kalalogi_back.domain.fish;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FishRepository extends JpaRepository<Fish, Integer> {

    @Query("""
            select f from Fish f
            where f.publicField = ?1 and f.acatch.user.status = ?2 and f.acatch.status = ?3 and f.status = ?4
            order by f.acatch.date DESC""")
    List<Fish> findPublicFish(Boolean publicField, String userStatus, String catchStatus, String fishStatus);





}