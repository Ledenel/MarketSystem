package com.ledenel.market.entity;

import java.util.Collection;
import java.util.Date;

/**
 * Created by Ledenel on 2016/3/18.
 */
public interface ProductManager extends ProductScannerListener, ProductListener {
    void stockProduct(Product product);

    void sellProduct(Product product);

    Product getProduct(long uid);

    Collection<Product> getProducts(String name);

    Collection<Product> getExpiredProducts(Date expiredDate);

    void attachProductSellScanner(ProductScanner scanner);

    void detachProductSellScanner(ProductScanner scanner);

    void attachProductStockScanner(ProductScanner scanner);

    void detachProductStockScanner(ProductScanner scanner);

    void attachProductEventListener(ProductEventListener listener);

    void detachProductEventListener(ProductEventListener listener);

    void attachFundEventListener(FundEventListener listener);

    void detachFundEventListener(FundEventListener listener);

}
