package javabeans;

/** customer storage entity*/

public class Customer {
	private Long id = 0l;
	private String name;
	private String password;

	public Customer() {
		super();
	}

	public Customer(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public Customer(long id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "{Customer " + name + " " + id + "} password:" + password;
	}

}


