package com.electric.solaredge.dao.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.electric.solaredge.dto.CurrentSolarStateDTO;
@Service
public interface CurrentSolarStateRepository extends JpaRepository<CurrentSolarStateDTO, Integer> {
	List<CurrentSolarStateDTO> findAllByOrderByDateDesc();
}
