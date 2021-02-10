package com.crosspay.service;

import com.crosspay.models.CurrencyConversionRequest;
import com.crosspay.models.CurrencyConversionResponse;
import com.crosspay.models.CurrencyConversionToResponse;

public interface ICrossPayService {

	public CurrencyConversionResponse convertFromApi(CurrencyConversionRequest request);

	public CurrencyConversionToResponse convertToApi(CurrencyConversionRequest request);
}
