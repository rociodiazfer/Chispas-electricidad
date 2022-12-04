package com.iesamd.chispas.data;

import com.iesamd.chispas.domain.models.Sales_Line;
import java.util.List;
import java.util.TreeMap;

public class MemSales_LineDataStore implements Sales_LineDataStore{


    private TreeMap<String , Sales_Line> dataStore = new TreeMap<>();


    @Override
    public void saveSales(Sales_Line sales_line) {
        dataStore.put(sales_line.getSalesCode(),sales_line);

    }

    @Override
    public void deleteSales(Sales_Line sales_line) {
    dataStore.remove(sales_line.getSalesCode());
    }

    @Override
    public void updateSales(Sales_Line sales_line) {
    dataStore.replace(sales_line.getSalesCode(),sales_line);
    }

    @Override
    public List<Sales_Line> getAllSales_line() {
        return dataStore.values().stream().toList();
    }

    @Override
    public Sales_Line findById(String SalesCode) {
        return dataStore.get(SalesCode);
    }
}
