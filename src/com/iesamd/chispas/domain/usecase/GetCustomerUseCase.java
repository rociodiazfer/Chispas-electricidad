package com.iesamd.chispas.domain.usecase;

import com.iesamd.chispas.data.CustomerDataStore;
import com.iesamd.chispas.data.MemCustomerDataStore;
import com.iesamd.chispas.domain.models.Client;
import java.util.List;

/**
 * Recuperar listado de clientes
 */
public class GetCustomerUseCase {

    private CustomerDataStore customerDataStore;

    public GetCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }
    public List<Client> execute(){
        return customerDataStore.getAllCustomer();
    }

}
