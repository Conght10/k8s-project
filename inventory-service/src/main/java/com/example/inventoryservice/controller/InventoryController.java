package com.example.inventoryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping
    public Map<String, Integer> getInventory() {
        Map<String, Integer> stocks = new HashMap<>();
        stocks.put("Sản phẩm A", 100);
        stocks.put("Sản phẩm B", 50);
        return stocks;
    }

    @GetMapping("/status")
    public String getStatus() {
        return "Inventory Service is UP and Running";
    }
}
