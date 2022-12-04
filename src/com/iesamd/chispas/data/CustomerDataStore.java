package com.iesamd.chispas.data;

import com.iesamd.chispas.domain.models.Client;

import java.util.List;

public interface CustomerDataStore {

    void saveCustomer (Client client);
    void deleteCustomer (Client client);
    void updateCustomer(Client client);
    List<Client> getAllCustomer();
    Client findById(Integer codClient);
}
