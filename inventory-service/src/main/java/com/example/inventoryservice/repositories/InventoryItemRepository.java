package com.example.inventoryservice.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventoryservice.entities.InventoryItem;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long>{
	Optional<InventoryItem> findByProductCode(String productCode);
}
