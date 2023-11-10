package abstractClasses;

public class CustomerManager {
	BaseDatabaseManager databaseManager;    //super sınıftan
	
	public void getCustomers() {
		databaseManager.getData();
	}

}
