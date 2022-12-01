package data;

import com.sun.deploy.util.SessionState;

import java.util.List;

public interface CustomerDataStore {

    void saveCustomer (SessionState.Client client);
    void deleteCustomer (SessionState.Client client);
    void updateCustomer(SessionState.Client client);

    List<SessionState.Client> getAllCustomer();
    SessionState.Client findById(Integer codClient);
}
