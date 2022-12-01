package domain;

import com.sun.deploy.util.SessionState;
import data.CustomerDataStore;
import data.MemCustomerDataStore;

public class AddCustomerUseCase {

    public void execute(SessionState.Client customer){
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        customerDataStore.saveCustomer(customer);

    }

}
