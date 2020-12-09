package com.kevinberg.devops.repo;

import com.kevinberg.devops.entity.Champion;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChampionRepository extends PagingAndSortingRepository<Champion, Long> {
    List<Champion> findByName(@Param("ssn") String name);
}
