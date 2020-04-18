package com.electric.tesla.rest.service.auth;

public interface TeslaAuthService {
	String getAuthToken();
	String revokeToken();
}
