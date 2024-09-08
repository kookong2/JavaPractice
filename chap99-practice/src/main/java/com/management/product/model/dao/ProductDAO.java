package com.management.product.model.dao;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;

public interface ProductDAO {
    List<ProductDTO> selectAllProductList();

    List<ProductDTO> selectProductByCondition(SearchCondition searchCondition);

    int registNewProduct(ProductDTO product);

    int modifyProductInfo(ProductDTO product);


}
