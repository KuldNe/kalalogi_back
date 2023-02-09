package com.fishlog.kalalogi_back.domain.catches;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CatchRepository extends JpaRepository<Catch, Integer> {
}