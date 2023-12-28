package com.example.GroceryItem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GroceryItem.Entity.GroceryItemEntity;
import com.example.GroceryItem.Repository.GroceryItemRepository;

import java.util.List;

@Service
public class GroceryItemService {
    @Autowired
    private GroceryItemRepository groceryItemRepository;

    public void save(GroceryItemEntity item) {
        groceryItemRepository.save(item);
    }

    public List<GroceryItemEntity> getAllItems() {
        return groceryItemRepository.findAll();
    }
}