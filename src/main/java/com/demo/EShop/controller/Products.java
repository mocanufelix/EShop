package com.demo.EShop.controller;
import lombok.*;

@Getter
@Setter
@Builder
public class Products {
    private int id;
    private String departmentName;
    private String productCategory;
    private String productName;
    private String weight;
    private double price;


}

