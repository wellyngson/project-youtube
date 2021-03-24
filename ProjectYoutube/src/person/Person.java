package person;

public abstract class Person {

	// ATRIBUTOS
	protected String name, sex;
	protected int years;
	public String getName() {
		return name;
	}

	
	// CONSTRUTOR
	public Person(String name, int years, String sex) {
		super();
		this.setName(name);
		this.setSex(sex);
		this.setYears(years);
	}
	
	@Override
	public String toString() {
		return  "Nome: " + name + "\n" + 
				"Sexo: " + sex + "\n" +
				"Idade: " + years + "\n";
	}


	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}

}
