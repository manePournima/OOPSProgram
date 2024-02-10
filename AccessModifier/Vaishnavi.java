package AccessModifier;

public class Vaishnavi {
	private int id;
	private String name;
	private String email;

	public Vaishnavi(int id, int b) {
		this.id = id;
	}

	public Vaishnavi() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Vaishnavi [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
