package com.ledenel.market.entity;

import java.math.BigDecimal;

/**
 * Created by Ledenel on 2016/3/19.
 */
public class PercentSellStrategy implements SellStrategy {
    @Override
    public BigDecimal discount(BigDecimal origin) {
        return null;
    }
}
