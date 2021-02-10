package com.crosspay.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crosspay.models.CurrencyConversionRequest;
import com.crosspay.models.CurrencyConversionResponse;
import com.crosspay.models.CurrencyConversionToResponse;
import com.crosspay.service.ICrossPayService;

@RestController
public class CrosspayRestController {
	
	@Autowired
	private ICrossPayService icrossPayService;

	@PostMapping("/convertFrom")
	public CurrencyConversionResponse convertFrom(@RequestBody CurrencyConversionRequest request) {
		CurrencyConversionResponse response  = null;
		try {
			System.out.println("Request Information inside convertFrom: "+request);
			response  = icrossPayService.convertFromApi(request);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
	@PostMapping("/convertTo")
	public CurrencyConversionToResponse convertTo(@RequestBody CurrencyConversionRequest request) {
		CurrencyConversionToResponse response  = null;
		try {
			System.out.println("Request Information inside convertFrom: "+request);
			response  = icrossPayService.convertToApi(request);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return response;
	}
}
