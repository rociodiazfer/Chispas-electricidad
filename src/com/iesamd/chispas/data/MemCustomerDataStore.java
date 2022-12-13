package com.iesamd.chispas.data;

import com.iesamd.chispas.domain.models.Client;
import java.util.List;
import java.util.TreeMap;

public class MemCustomerDataStore implements CustomerDataStore {

    private TreeMap<String, Client> dataStore = new TreeMap<>();
    @Override
    public void saveCustomer(Client client) {
    dataStore.put(client.getClientCode(),client);
    }

    @Override
    public void deleteCustomer(Client client) {
        dataStore.remove(client.getClientCode());
    }

    @Override
    public void updateCustomer(Client client) {
        dataStore.replace(client.getClientCode(),client);
    }


    @Override
    public List<Client> getAllCustomer() {
        return dataStore.values().stream().toList();
    }

    @Override
    public Client findById(Integer codClient) {
        return dataStore.get(codClient);
    }


}
