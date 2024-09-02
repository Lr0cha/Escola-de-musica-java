package Model.Entities;

public class ContactProfile {
	private String phone;
	private String email;
	
	public ContactProfile() {
		
	}

	public ContactProfile(String phone, String email) {
		this.phone = phone;
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("Telefone: %s\nEmail: %s", phone, email);
	}
	
}

