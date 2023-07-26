package com.demo.EShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class EShopController {
    @GetMapping(value="/productsOverview")
    public ModelAndView viewProducts(Model model) {
        ModelAndView mav = new ModelAndView();

        model.addAttribute("greetings", "Bine ati venit!");

        List<String> productsNameList = List.of("faina", "Malai", "Orez", "Oua", "Zahar", "Masline", "Ulei");
        model.addAttribute("productsNameList", productsNameList);


        List<Products> productsList = getProductsList();
        model.addAttribute("productsList", productsList);

        Products products1 = Products.builder()
                .id(1)
                .departmentName("Alimente")
                .productCategory("Arpacas")
                .productName("Arpacas Boromir")
                .price(6.00)
                .weight("1kg")
                .build();

        Products products2 = Products.builder()
                .id(2)
                .departmentName("Alimente")
                .productCategory("Arpacas")
                .productName("Arpacas Moara de aur")
                .price(5.50)
                .weight("1kg")
                .build();

        Products products3 = Products.builder()
                .id(3)
                .departmentName("Alimente")
                .productCategory("Faina")
                .productName("Faina Boromir")
                .price(4.50)
                .weight("1kg")
                .build();



        // denumirea paginii de html pe care am adaugat-o in resources->templates
        mav.setViewName("productsOverviewPage");
        return  mav;
    }

    private List<Products> getProductsList() {
        Products products1 = Products.builder()
                .id(1)
                .departmentName("Alimente")
                .productCategory("Arpacas")
                .productName("Arpacas Boromir")
                .price(6.00)
                .weight("1kg")
                .build();

        Products products2 = Products.builder()
                .id(2)
                .departmentName("Alimente")
                .productCategory("Arpacas")
                .productName("Arpacas Moara de aur")
                .price(5.50)
                .weight("1kg")
                .build();

        Products products3 = Products.builder()
                .id(3)
                .departmentName("Alimente")
                .productCategory("Faina")
                .productName("Faina Boromir")
                .price(4.50)
                .weight("1kg")
                .build();

        return List.of(products1, products2, products3);

    }


}
