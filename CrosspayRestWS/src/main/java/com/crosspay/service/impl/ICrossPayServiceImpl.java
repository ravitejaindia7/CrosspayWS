package com.crosspay.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.crosspay.models.CurrencyConversionRequest;
import com.crosspay.models.CurrencyConversionResponse;
import com.crosspay.models.CurrencyConversionToResponse;
import com.crosspay.service.ICrossPayService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ICrossPayServiceImpl implements ICrossPayService {

	@Autowired
	private RestTemplate restTemplate;
	
	private static final String endPoint1 ="https://xecdapi.xe.com/v1/convert_from?from={from}&to={to}&amount={amount}";
	
	private static final String endPoint2 ="https://xecdapi.xe.com/v1/convert_to?to={to}&from={from}&amount={amount}";
	
	@Override
	public CurrencyConversionResponse convertFromApi(CurrencyConversionRequest request) {
		

		CurrencyConversionResponse response = null;
		try {
			 ObjectMapper mapper = new ObjectMapper();
			 mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			 HttpHeaders header = new HttpHeaders();
			 header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		     header.setContentType(MediaType.APPLICATION_JSON);
			 Map<String, String> params = new HashMap<String, String>();
		     params.put("from", request.getFrom());
		     params.put("to", request.getTo());
		     params.put("amount", String.valueOf(request.getAmount()));
		     HttpEntity<Object> entity = new HttpEntity<Object>(header);
		     ResponseEntity<String> responseEntity = restTemplate.exchange(endPoint1, HttpMethod.GET, entity, String.class,params);
		     System.out.println("Response from convertFromAPI: "+responseEntity.getBody());
		     response = mapper.readValue(responseEntity.getBody(), CurrencyConversionResponse.class);
		}catch(Exception e) {
			System.out.println("Exception occured inside convertFromApi:  "+e.getMessage());
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public CurrencyConversionToResponse convertToApi(CurrencyConversionRequest request) {
		CurrencyConversionToResponse response = null;
		try {
			 ObjectMapper mapper = new ObjectMapper();
			 mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			 HttpHeaders header = new HttpHeaders();
			 header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		     header.setContentType(MediaType.APPLICATION_JSON);
			 Map<String, String> params = new HashMap<String, String>();
		     params.put("from", request.getFrom());
		     params.put("to", request.getTo());
		     params.put("amount", String.valueOf(request.getAmount()));
		     HttpEntity<Object> entity = new HttpEntity<Object>(header);
		     ResponseEntity<String> responseEntity = restTemplate.exchange(endPoint2, HttpMethod.GET, entity, String.class,params);
		     System.out.println("Response from convertFromAPI: "+responseEntity.getBody());
		     response = mapper.readValue(responseEntity.getBody(), CurrencyConversionToResponse.class);
		}catch(Exception e) {
			System.out.println("Exception occured inside convertFromApi: "+e.getMessage());
			e.printStackTrace();
		}
		return response;
	}

}
