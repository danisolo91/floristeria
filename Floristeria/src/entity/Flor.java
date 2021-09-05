package entity;

public class Flor extends Producte {
	//Declaraci� de camp de clase
	private String color;
	
	//Declaraci� de constructor de clase
	public Flor(String nom, String color, double preu) throws Exception {
		super(nom, preu);
		if (color.equals(""))
			throw new Exception();
		this.color = color;
	}
	
	//Getter
	public String getColor() {
		return this.color;
	}
	
	//Setter
	public void setColor(String color) {
		this.color = color;
	}
	
	//M�tode toString
	@Override
	public String toString() {
		return "Flor [id=" + id + ", nom=" + nom + ", preu=" + preu + ", color=" + color + "]";
	}

}
