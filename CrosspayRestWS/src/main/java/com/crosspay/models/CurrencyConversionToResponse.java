package com.crosspay.models;

import java.util.List;

public class CurrencyConversionToResponse {

	private String terms;
	private String privacy;
	private String to;
	private int amount;
	private String timestamp;
	private List<CurrencyMids> from;
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	public String getPrivacy() {
		return privacy;
	}
	public void setPrivacy(String privacy) {
		this.privacy = privacy;
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
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public List<CurrencyMids> getFrom() {
		return from;
	}
	public void setFrom(List<CurrencyMids> from) {
		this.from = from;
	}
	@Override
	public String toString() {
		return "CurrencyConversionToResponse [terms=" + terms + ", privacy=" + privacy + ", to=" + to + ", amount="
				+ amount + ", timestamp=" + timestamp + ", from=" + from + "]";
	}
	
}
