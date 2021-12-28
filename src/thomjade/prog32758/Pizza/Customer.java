package thomjade.prog32758.Pizza;

public class Customer {
	private String fname;
	private String lname;
	private String email;
	private String phone;
	private String address;
	private String trans;//transmission method (delivery/pickup)
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTrans() {
		return trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

	public Customer(String fname, String lname, String email, String phone, String address, String trans) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.trans = trans;
	}

	@Override
	public String toString() {
		return "Customer " + fname + " " + lname + ", " + email + "\n" + phone + ", "
				+ address + ", delivery: " + trans;
	}
	
	
}
