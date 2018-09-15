package com.example.catalogservice.entities;

import lombok.Data;

@Data
public class ProductInventoryResponse {
	private String productCode;
	private int availableQuantity;
}
