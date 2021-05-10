package Entities;



import java.util.Date;

import Abstract.IEntity;

public class Customer implements IEntity{

		public int id;
		public String firstName;
		public String lastName;
		public Date dateOfBirth;
		public String nationalityId;
		
		public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationlityId) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
			this.nationalityId = nationlityId;
		}
		public Customer(int id, String firstName, String lastName , int dateOfBirth,  String nationlityId) {
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getNationalityId() {
			return nationalityId;
		}
		public void setNationlityId(String nationalityId) {
			nationalityId = nationalityId;
		}
		

	}




