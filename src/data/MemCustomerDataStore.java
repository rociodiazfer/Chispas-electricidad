package data;

import com.sun.deploy.util.SessionState;

import java.util.List;
import java.util.TreeMap;

public class MemCustomerDataStore implements CustomerDataStore {

    private TreeMap<Integer, SessionState.Client> dataStore = new TreeMap<>();
    @Override
    public void saveCustomer(SessionState.Client client) {
    dataStore.put(client.getClientCode(),client);
    }

    @Override
    public void deleteCustomer(SessionState.Client client) {
        dataStore.remove(client);
    }

    @Override
    public void updateCustomer(SessionState.Client client) {
        dataStore.replace(client.getCodClient(),client);
    }


    @Override
    public List<SessionState.Client> getAllCustomer() {
        return dataStore.values().stream().toList();
    }

    @Override
    public SessionState.Client findById(Integer codClient) {
        return dataStore.get(codClient);
    }


}
