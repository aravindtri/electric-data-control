package com.electric.solaredge.dao;

import com.electric.solaredge.dto.CurrentStateDTO;

public interface SolarEdgeDAO {
	int logSolarOverview(CurrentStateDTO currentStateDTO);
}
