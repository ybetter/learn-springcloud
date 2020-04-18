package cn.how2j.springcloud.client;

import cn.how2j.springcloud.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {
    @PostMapping("/products")
    public List<Product> listProdcuts();
}
