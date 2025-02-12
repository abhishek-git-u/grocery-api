package com.example.grocerystore.service;

import com.example.grocerystore.entity.GroceryItem;
import com.example.grocerystore.repository.GroceryItemRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GroceryService {
    private final GroceryItemRepository repository;

    public GroceryService(GroceryItemRepository repository) {
        this.repository = repository;
    }

    public GroceryItem addItem(GroceryItem item) {
        return repository.save(item);
    }

    public List<GroceryItem> getAllItems() {
        return repository.findAll();
    }
}
