package abstractClasses;

public class CustomerManager {
	BaseDatabaseManager databaseManager;    //super s�n�ftan
	
	public void getCustomers() {
		databaseManager.getData();
	}

}
