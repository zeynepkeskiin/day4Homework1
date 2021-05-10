import java.util.Date;
import Adapters.MernisServiceAdapter;
import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager =new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.Save(new Customer(1,"Zeynep","Keskin",new Date(2001),"12345678910"));
		System.out.println();
		
	}

}
