package com.mac.Controller;

import com.mac.Entity.Product;
import com.mac.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;



@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method= RequestMethod.GET)
    public Collection<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public Product getProductById(@PathVariable("id") int id){
        return productService.getProductById(id);
    }

    @RequestMapping(value="/save", method= RequestMethod.GET)
    public Product save(){
        Product product = productService.save(new Product());
        return product;
    }


}
