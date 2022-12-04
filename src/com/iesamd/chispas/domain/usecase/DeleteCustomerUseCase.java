package com.iesamd.chispas.domain.usecase;

import com.iesamd.chispas.data.CustomerDataStore;
import com.iesamd.chispas.data.MemCustomerDataStore;
import com.iesamd.chispas.domain.models.Client;

/**
 * Eliminar un cliente
 */
public class DeleteCustomerUseCase {

    private CustomerDataStore customerDataStore;

    public DeleteCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;

    }
    public void execute(Client client){
        customerDataStore.deleteCustomer(client);
    }
}
