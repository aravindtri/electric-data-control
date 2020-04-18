package com.electric.tesla.rest.service.auth.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.electric.tesla.rest.data.oauth2.OAuthResponse;
import com.electric.tesla.rest.service.auth.TeslaAuthService;

@Service
public class TeslaAuthServiceImpl implements TeslaAuthService {
	
	@Value("${tesla.security.auth.clientId}")
	private String clientId;
	@Value("${tesla.security.auth.clientSecret}")
	private String clientSecret;
	@Value("${tesla.security.auth.userId}")
	private String userId ;
	@Value("${tesla.security.auth.password}")
	private String password;
	@Value("${tesla.security.auth.grantType}")
	private String grantType;
	@Value("${tesla.security.auth.token.uri}")
	private String authEndpoint;
	@Value("${tesla.security.auth.revoke.uri}")
	private String revokeEndpoint;
	
	private String token;
	
	
	public void setToken(String token) {
		System.out.println(token);
		this.token = token;
	}

	public String getAuthToken()
	{
		Map<String,String> request=new HashMap<String, String>(5);
		request.put("grant_type", grantType);
		request.put("client_id", clientId);
		request.put("client_secret", clientSecret);
		request.put("email", userId);
		request.put("password", password);
		OAuthResponse response = new RestTemplate().postForObject(authEndpoint, request, OAuthResponse.class);
		setToken(response.getAccess_token());
		return this.token;
	}
	
	public String revokeToken()
	{
		Map<String,String> request=new HashMap<String, String>(1);
		request.put("token", this.token);
		return new RestTemplate().postForObject(revokeEndpoint, request, String.class);
	}
	
}
