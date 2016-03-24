package com.ledenel.market.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Ledenel on 2016/3/18.
 */
public interface Product extends Serializable{
    String getName();

    long getUid();

    BigDecimal getCostPrice();

    BigDecimal getSellPrice();

    Date getExpiredDate();

    void sell(int amount);

    void stock(int amount);

    int getAmount();

    void setSellPrice(BigDecimal price);
    void attachProductListener(ProductListener listener);
    void detachProductListener(ProductListener listener);

}
