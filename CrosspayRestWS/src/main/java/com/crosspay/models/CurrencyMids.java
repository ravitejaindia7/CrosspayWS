package com.crosspay.models;

public class CurrencyMids {

	private String quotecurrency;
	private int mid;
	public String getQuotecurrency() {
		return quotecurrency;
	}
	public void setQuotecurrency(String quotecurrency) {
		this.quotecurrency = quotecurrency;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	@Override
	public String toString() {
		return "CurrencyMids [quotecurrency=" + quotecurrency + ", mid=" + mid + "]";
	}
}
