package com.electric.tesla.rest.dao.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.electric.tesla.dto.CurrentVehicleStateDTO;
@Service
public interface VehicleDataRepository extends JpaRepository<CurrentVehicleStateDTO, Integer> {

	List<CurrentVehicleStateDTO> findAllByOrderByDateDesc();
}
