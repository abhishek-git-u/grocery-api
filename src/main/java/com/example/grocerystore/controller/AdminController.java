package com.example.grocerystore.controller;

import com.example.grocerystore.entity.GroceryItem;
import com.example.grocerystore.service.GroceryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/admin/items")
public class AdminController {
    private final GroceryService service;

    public AdminController(GroceryService service) {
        this.service = service;
    }

    @PostMapping
    public GroceryItem addItem(@RequestBody GroceryItem item) {
        return service.addItem(item);
    }

    @GetMapping
    public List<GroceryItem> getAllItems() {
        return service.getAllItems();
    }
}
