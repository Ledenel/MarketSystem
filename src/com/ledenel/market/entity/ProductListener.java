package com.ledenel.market.entity;

import java.math.BigDecimal;

/**
 * Created by Ledenel on 2016/3/19.
 */
public interface ProductListener {
    void productSold(Product e, int amount);
    void productStocked(Product e, int amount);
    void productSellPriceChanging(Product e, BigDecimal newprice);
}
