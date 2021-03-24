package person;

public class Locust extends Person {

	// ATRIBUTOS
	private String login;
	private int totalAssisted;
	
	// CONSTRUTOR
	public Locust(String name, int years,  String sex, String Login) {
		super(name, years, sex);
		this.setLogin(login);
		this.setTotalAssisted(0);
	}
	
	// MOSTRAR OS DADOS
	@Override
	public String toString() {
		return  super.toString() + "Login: " + this.getLogin() + "\n" +
				"Quantidade de vezes que assistiu algum filme: " + totalAssisted + "\n";
	}


	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotalAssisted() {
		return totalAssisted;
	}
	public void setTotalAssisted(int totalAssisted) {
		this.totalAssisted = totalAssisted;
	}
	
}
