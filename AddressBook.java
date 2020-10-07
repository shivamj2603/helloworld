package AddressBookSystem;
import java.util.*;

public class AddressBook {
	public String name;
	public AddressBook(String name) {
		this.name = name;
	}
	public Contact contact;
	public ArrayList<Contact> addressBook = new ArrayList<Contact>();
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public ArrayList<Contact> getAddressBook() {
		return addressBook;
	}
	public void setAddressBook(ArrayList<Contact> addressbook) {
		this.addressBook = addressBook;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressBook other = (AddressBook) obj;
		if (contact == null) {
			if (other.contact != null)
				return false;
		} else if (!contact.equals(other.contact))
			return false;
		return true;
	}
	public void addContact(Contact contact) {
		addressBook.add(contact);
	}
	public void editContact(String name) {
		Scanner sc = new Scanner(System.in);
		String editName = "";
		for(Contact contact : addressBook) {
			editName = contact.getFirstName() + contact.getLastName();
			if(name.equals(editName)) {
				System.out.println("1.Change the address");
				System.out.println("2.Change the city");
				System.out.println("3.Change the state");
				System.out.println("4.Change the ZIP code");
				System.out.println("5.Change the phone number");
				System.out.println("6.Change the Email id");
				int choice = sc.nextInt();
				sc.nextLine();
				switch(choice) {
				case 1 : System.out.println("Enter new address");
				String address = sc.nextLine();
				contact.setAddress(address);
				break;
				case 2 : System.out.println("Enter new city");
				String city = sc.nextLine();
				contact.setCity(city);
				break;
				case 3 : System.out.println("Enter new state");
				String state = sc.nextLine();
				contact.setAddress(state);
				break;
				case 4 : System.out.println("Enter new ZIP code");
				int zip = sc.nextInt();
				contact.setZip(zip);
				sc.nextLine();
				break;
				case 5 : System.out.println("Enter new phone number");
				long phone = sc.nextLong();
				sc.nextLine();
				contact.setPhoneNumber(phone);
				break;
				case 6 : System.out.println("Enter new Email id");
				String email = sc.nextLine();
				contact.setEmail(email);
				break;
				}	
			}
			else {
				System.out.println("No such contact exist");
			}
		}
	}
	public void deleteContact(String name) {
		String deleteName = "";
		for(Contact contact : addressBook) {
			deleteName = contact.getFirstName() + contact.getLastName();
			if(name.equals(deleteName)) {
				addressBook.remove(contact);
			}
		}
	}
}


