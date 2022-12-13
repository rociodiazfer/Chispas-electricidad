package com.iesamd.chispas.data;

import com.iesamd.chispas.domain.models.Sales_Line;

import java.util.List;

public interface Sales_LineDataStore {


    void saveSales(Sales_Line sales_line);
    void deleteSales(Sales_Line sales_line);

    void updateSales(Sales_Line sales_line);

    List<Sales_Line> getAllSales_line();

    Sales_Line findById (String SalesCode);
}
