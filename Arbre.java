package entity;

public class Arbre extends Producte {
	private double al�ada;

	public Arbre(String nom, double al�ada, double preu ) throws Exception {
		super(nom, preu);
        if (al�ada <= 0) throw new Exception();
        this.al�ada = al�ada;
    }

    public void setAl�ada(double al�ada){
        this.al�ada = al�ada;
    }

    public double getAl�ada() {
        return al�ada;
    }
	
}



