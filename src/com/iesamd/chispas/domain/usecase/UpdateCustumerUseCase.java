package com.iesamd.chispas.domain.usecase;

import com.iesamd.chispas.data.CustomerDataStore;
import com.iesamd.chispas.data.MemCustomerDataStore;
import com.iesamd.chispas.domain.models.Client;

//Modificar / actualizar un cliente
public class UpdateCustumerUseCase {

    private CustomerDataStore customerDataStore;

    public UpdateCustumerUseCase (CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void  execute (Client client){
        customerDataStore.updateCustomer(client);

    }


}
