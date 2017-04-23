package com.mac.Service;


import com.mac.Entity.Product;
import com.mac.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Collection<Product> getAllProducts(){
        List<Product> products = (List<Product>) productRepository.findAll();
        return products;
    }

    public Product getProductById(int id){
        return productRepository.findById(id);
    }

    public Product save(Product product){
        Product prod = new Product();
        prod.setName("bingo");
        prod.setImageSrc("not local");
        prod.setPrice(33.33);
        Product saved = productRepository.save(prod);
        return saved;
    }
}
