package com.ledenel.market.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ledenel on 2016/3/18.
 */
public class GeneralProduct implements Product {
    private String name;
    private long uid;
    private BigDecimal costPrice;
    private BigDecimal sellPrice;
    private Date expiredDate;
    private int amount = 0;

    private List<ProductListener> productListenerList = new ArrayList<ProductListener>();

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    @Override
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    @Override
    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        for (ProductListener listener :
                productListenerList) {
            listener.productSellPriceChanging(this, sellPrice);
        }
        this.sellPrice = sellPrice;
    }

    @Override
    public void attachProductListener(ProductListener listener) {

        productListenerList.add(listener);
    }

    @Override
    public void detachProductListener(ProductListener listener) {

        productListenerList.remove(listener);
    }

    @Override
    public Date getExpiredDate() {
        return expiredDate;
    }

    @Override
    public void sell(int amount) {
        for (ProductListener listener :
                productListenerList) {
            listener.productSold(this, amount);
        }
        if (amount < 0) amount = 0;
        this.amount -= amount;
        if (this.amount < amount) {
            this.amount = 0;
        }
    }

    @Override
    public void stock(int amount) {
        for (ProductListener listener :
                productListenerList) {
            listener.productStocked(this, amount);
        }
        if (amount < 0) amount = 0;
        this.amount += amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }
}

