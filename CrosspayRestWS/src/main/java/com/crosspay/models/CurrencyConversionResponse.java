package com.crosspay.models;

import java.util.List;

public class CurrencyConversionResponse {

	private String terms;
	private String privacy;
	private String from;
	private int amount;
	private String timestamp;
	private List<CurrencyMids> to;
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
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
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
	public List<CurrencyMids> getTo() {
		return to;
	}
	public void setTo(List<CurrencyMids> to) {
		this.to = to;
	}
	@Override
	public String toString() {
		return "CurrencyConversionResponse [terms=" + terms + ", privacy=" + privacy + ", from=" + from + ", amount="
				+ amount + ", timestamp=" + timestamp + ", to=" + to + "]";
	}
}
