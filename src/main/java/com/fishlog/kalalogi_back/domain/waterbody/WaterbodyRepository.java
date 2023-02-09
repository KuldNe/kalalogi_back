package com.fishlog.kalalogi_back.domain.waterbody;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WaterbodyRepository extends JpaRepository<Waterbody, Integer> {

    // @Query osa saame JPA Buddy kaudu. Point on kuvada vaid active staatusega waterbodysid.
    @Query("select w from Waterbody w where w.status = ?1 order by w.name")
    List<Waterbody> findWaterbodies(String status);

}
