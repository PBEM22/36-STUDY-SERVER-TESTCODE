package sopt.study.testcode.chaeryun.spring.api.controller.product;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sopt.study.testcode.chaeryun.spring.api.service.product.ProductService;
import sopt.study.testcode.chaeryun.spring.api.service.product.response.ProductResponse;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @GetMapping("/api/v1/products/selling")
    public List<ProductResponse> getSellingProducts(){
        return productService.getSellingProducts();
    }
}
