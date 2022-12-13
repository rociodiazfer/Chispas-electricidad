package com.iesamd.chispas.domain.usecase;

import com.iesamd.chispas.data.Sales_LineDataStore;
import com.iesamd.chispas.domain.models.Sales_Line;

import java.util.List;

public class GetSales_LineUseCase {

    private Sales_LineDataStore sales_lineDataStore;

    public GetSales_LineUseCase (Sales_LineDataStore sales_lineDataStore){
        this.sales_lineDataStore = sales_lineDataStore;
    }

    public List<Sales_Line> execute(){

        return sales_lineDataStore.getAllSales_line();
    }

}
