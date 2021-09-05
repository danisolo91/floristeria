package entity;

public class Floristeria {
	//Declaraci� de camps de clase
	private String nomFloristeria;
	
	//Declaraci� de constructor de clase
	public Floristeria(String nomFloristeria) throws Exception {
		if (nomFloristeria.equals("")) throw new Exception();
        this.nomFloristeria = nomFloristeria;
	}
	
	//Getter
	public String getNomFloristeria() {
		return nomFloristeria;
	}
	
	//Setter
	public void setNomFloristeria(String nomFloristeria) {
		this.nomFloristeria = nomFloristeria;
	}

}
