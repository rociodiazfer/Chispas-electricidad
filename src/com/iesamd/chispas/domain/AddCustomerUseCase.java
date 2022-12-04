package com.iesamd.chispas.domain;

import com.sun.deploy.util.SessionState;
import com.iesamd.chispas.data.CustomerDataStore;
import com.iesamd.chispas.data.MemCustomerDataStore;

public class AddCustomerUseCase {

    public void execute(SessionState.Client customer){
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        customerDataStore.saveCustomer(customer);

    }

}
