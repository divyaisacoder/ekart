package com.project.dto;

public class SellerDTO {
	private Integer sellerId;

	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + "]";
	}
}
