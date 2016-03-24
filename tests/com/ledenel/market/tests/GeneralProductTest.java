package com.ledenel.market.tests;

import com.ledenel.market.entity.GeneralProduct;
import com.ledenel.market.entity.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ledenel on 2016/3/24.
 */
public class GeneralProductTest {

    private GeneralProduct product;
    @Before
    public void setUp() throws Exception {
        product = new GeneralProduct();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSell() throws Exception {
        product.stock(5);
        assertEquals(5,product.getAmount());
        product.sell(1);
        assertEquals(4,product.getAmount());
        product.sell(10);
        assertEquals(0,product.getAmount());
        product.sell(-1);
        assertEquals(0,product.getAmount());
        product.stock(-2);
        assertEquals(0,product.getAmount());

    }
}