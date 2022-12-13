package com.iesamd.chispas.domain.usecase;

import com.iesamd.chispas.data.CustomerDataStore;
import com.iesamd.chispas.data.MemCustomerDataStore;
import com.iesamd.chispas.domain.models.Client;

public class AddCustomerUseCase {

    private CustomerDataStore customerDataStore;

    public AddCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }
    public void execute(Client customer){
        customerDataStore.saveCustomer(customer);

    }

}
