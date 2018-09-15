package com.example.inventoryservice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventoryservice.entities.InventoryItem;
import com.example.inventoryservice.repositories.InventoryItemRepository;

@RestController
public class InventoryController {

	private final InventoryItemRepository inventoryItemRepository;
	
	@Autowired
	public InventoryController(InventoryItemRepository inventoryItemRepository){
		this.inventoryItemRepository = inventoryItemRepository;
	}
	
	@GetMapping("/api/inventory/{productCode}")
	public ResponseEntity<InventoryItem> findInventoryByProductCode(@PathVariable("productCode") String productCode){
		Optional<InventoryItem> inventoryItem = inventoryItemRepository.findByProductCode(productCode);
		if(inventoryItem.isPresent()){
			return new ResponseEntity<>(inventoryItem.get(), HttpStatus.OK);
		}else{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
