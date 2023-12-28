package com.example.GroceryItem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GroceryItem.Entity.GroceryItemEntity;

public interface GroceryItemRepository extends JpaRepository<GroceryItemEntity, Long> {
	}

