package com.ledenel.market.entity;



/**
 * Created by Ledenel on 2016/3/19.
 */
public interface ProductScanner {

    void attach(ProductScannerListener listener);
    void detach(ProductScannerListener listener);
    void notifyListeners();
    void clearAll();
    void count();

}
