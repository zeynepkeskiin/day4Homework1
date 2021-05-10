package Adapters;

import java.time.ZoneId;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean serviceResult = false;
		try {
			serviceResult = client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId() ), 
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
	}
	catch (Exception e) {
		System.out.println("Not a valid person");
	}
	return serviceResult;
	}

}
