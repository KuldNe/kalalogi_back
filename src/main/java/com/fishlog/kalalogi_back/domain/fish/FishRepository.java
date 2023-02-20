package com.fishlog.kalalogi_back.domain.fish;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FishRepository extends JpaRepository<Fish, Integer> {
//    f.publicField = ?1
    @Query("""
            select f from Fish f
            where (f.publicField = ?1) and f.acatch.user.status = ?2 and f.acatch.status = ?3 and f.status = ?4 
            and (f.acatch.waterbody.id = ?5 or ?5 is null) and (f.species.id = ?6 or ?6 is null)
            order by f.acatch.date DESC""")
    List<Fish> findPublicFish(Boolean publicField, String userStatus, String catchStatus, String fishStatus, Integer waterbodyId, Integer speciesId, Pageable pagination);

    @Query("""
            select f from Fish f
            where f.acatch.user.id = ?1 and f.publicField = ?2 and f.acatch.status = ?3 and f.status = ?4
            and (f.acatch.waterbody.id = ?5 or ?5 is null) and (f.species.id = ?6 or ?6 is null)
            order by f.acatch.date DESC""")
    List<Fish> findByUserId(Integer Userid, Boolean publicField, String catchStatus, String fishStatus, Integer waterbodyId, Integer speciesId );

    @Query("""
            select f from Fish f
            where f.acatch.id = ?1 and f.publicField = ?2 and f.acatch.status = ?3 and f.status = ?4
            and (f.acatch.waterbody.id = ?5 or ?5 is null) and (f.species.id = ?6 or ?6 is null)
            order by f.species.name""")
    List<Fish> findByCatchId(Integer catchId, Boolean publicField, String catchStatus, String fishStatus, Integer waterbodyId, Integer speciesId);



}