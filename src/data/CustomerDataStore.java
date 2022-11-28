package data;

import com.sun.deploy.util.SessionState;

import java.util.List;

public interface CustomerDataStore {

    void execute (SessionState.Client client);
    void deleteCustomer (SessionState.Client client);
    void updateCustomer(SessionState.Client client);
    void addCustomer(SessionState.Client client);
    void findByID (SessionState.Client client);

    List<SessionState.Client> getAllCustomer();
}
