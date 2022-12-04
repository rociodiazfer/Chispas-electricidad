package com.iesamd.chispas.domain.usecase;

import com.iesamd.chispas.data.Sales_LineDataStore;
import com.iesamd.chispas.domain.models.Sales_Line;

public class DeleteSales_LineUseCase {

    private Sales_LineDataStore sales_lineDataStore;

    public DeleteSales_LineUseCase(Sales_LineDataStore sales_lineDataStore){
        this.sales_lineDataStore = sales_lineDataStore;
    }
    public void execute (Sales_Line sales_line){
        sales_lineDataStore.deleteSales(sales_line);
    }
}
