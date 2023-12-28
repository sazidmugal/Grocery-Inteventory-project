package com.example.GroceryItem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.GroceryItem.Entity.GroceryItemEntity;
import com.example.GroceryItem.Service.GroceryItemService;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/grocery")
public class GroceryItemController {
    @Autowired
    private GroceryItemService groceryItemService;

    @GetMapping("/form")
    public String showForm(Model model) {
    	List<String> predefinedItems= Arrays.asList("Apple", "Milk", "Bread");
    	model.addAttribute("predefinedItems", predefinedItems);
    	model.addAttribute("groceryItemEntity", new GroceryItemEntity());
    
        return "add";
    }

    @PostMapping("/add")
    public String addGroceryItem(
            @RequestParam String name,
            @RequestParam double price,
            @RequestParam int quantity
    ) {
        GroceryItemEntity item = new GroceryItemEntity();
        item.setName(name);
        item.setPrice(price);
        item.setQuantity(quantity);

        groceryItemService.save(item);

        return "redirect:/grocery/all";
    }

    @GetMapping("/all")
    public String showAllItems(Model model) {
        List<GroceryItemEntity> items = groceryItemService.getAllItems();
        model.addAttribute("items", items);

        return "all";
    }
}