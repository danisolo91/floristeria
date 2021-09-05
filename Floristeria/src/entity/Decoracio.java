package entity;

public class Decoracio extends Producte {
	//Declaraci� de camp de clase
	private Material material;
	
	//Declaraci� de constructor de clase
	public Decoracio(String nom, Material material, double preu) throws Exception {
		super(nom, preu);
		if (material == null)
			throw new Exception();
		this.material = material;
	}
	
	//Getter
	public Material getMaterial() {
		return material;
	}
	
	//setter
	public void setMaterial(Material material) {
		this.material = material;
	}
	
	//M�tode toString
	@Override
	public String toString() {
		return "Decoracio [id=" + id + ", nom=" + nom + ", preu=" + preu + ", material=" + material + "]";
	}

}
