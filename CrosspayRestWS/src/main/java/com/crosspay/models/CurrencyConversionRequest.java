package com.crosspay.models;

public class CurrencyConversionRequest {

	private String from;
	private String to;
	private int amount;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "CurrencyConversionRequest [from=" + from + ", to=" + to + ", amount=" + amount + "]";
	}
}
