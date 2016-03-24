package com.ledenel.market.entity;

import java.math.BigDecimal;

/**
 * Created by Ledenel on 2016/3/19.
 */
public interface SellStrategy {
    BigDecimal discount(BigDecimal origin);
}
