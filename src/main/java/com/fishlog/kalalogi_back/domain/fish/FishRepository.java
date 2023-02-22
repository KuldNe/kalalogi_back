package com.fishlog.kalalogi_back.domain.fish;

import com.fishlog.kalalogi_back.fishlog.fish.dto.ChartFishDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FishRepository extends JpaRepository<Fish, Integer> {
//    f.publicField = ?1
    @Query("""
            select f from Fish f
            where f.publicField = ?1 and f.acatch.user.status = ?2 and f.acatch.status = ?3 and f.status = ?4 
            and (f.acatch.waterbody.id = ?5 or ?5 = 0) and (f.species.id = ?6 or ?6 = 0)
            order by f.acatch.date DESC""")
    Page<Fish> findPublicFish(Boolean publicField, String userStatus, String catchStatus, String fishStatus, Integer waterbodyId, Integer speciesId, Pageable pagination);

    @Query("""
            select f from Fish f
            where f.acatch.user.id = ?1 and f.publicField = ?2 and f.acatch.status = ?3 and f.status = ?4
            and (f.acatch.waterbody.id = ?5 or ?5 = 0) and (f.species.id = ?6 or ?6 = 0)
            order by f.acatch.date DESC""")
    Page<Fish> findByUserId(Integer Userid, Boolean publicField, String catchStatus, String fishStatus, Integer waterbodyId, Integer speciesId, Pageable pagination);

    @Query("""
            select f from Fish f
            where f.acatch.id = ?1 and f.publicField = ?2 and f.acatch.status = ?3 and f.status = ?4
            and (f.acatch.waterbody.id = ?5 or ?5 = 0) and (f.species.id = ?6 or ?6 = 0)
            order by f.species.name""")
    Page<Fish> findByCatchId(Integer catchId, Boolean publicField, String catchStatus, String fishStatus, Integer waterbodyId, Integer speciesId, Pageable pagination);

    @Query("""
            SELECT new com.fishlog.kalalogi_back.fishlog.fish.dto.ChartFishDto(f.species.name, COUNT(f.species.name))
            FROM Fish AS f where f.acatch.user.id = ?1 GROUP BY f.species.name ORDER BY f.species.name""")
    List<ChartFishDto> getFishChartInfo(Integer userId);

}