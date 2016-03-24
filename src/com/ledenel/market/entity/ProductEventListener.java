package com.ledenel.market.entity;

/**
 * Created by Ledenel on 2016/3/19.
 */
public interface ProductEventListener {
    void productSoldOut(Product e);

    void productStock(Product e);

    void productSold(Product e);

    void productDiscount(Product e, SellStrategy strategy);
}
