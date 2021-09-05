package entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Ticket {
	//Declaraci� de variables i List
	private int id;
	private static int properId = 0;
	private LocalDateTime data;
	private double valorTotal;
	List<Producte> productes = new ArrayList<>();
	private DateTimeFormatter format = DateTimeFormatter.ofPattern("'DATA:' dd/MM/yyyy	'HORA:' HH:mm");
	
	//Declaraci� de constructor
	public Ticket(List<Producte> compra) throws Exception {
		if (compra.isEmpty())
			throw new Exception("Heu d'introduir com a m�nim un producte per crear un ticket.");
		id = properId++;
		productes = compra;
		valorTotal = compra.stream().mapToDouble((Producte::getPreu)).sum();
		data = LocalDateTime.now();
	}
	
	//Getter
	public int getId() {
		return id;
	}
	
	//Setter
	public double getValorTotal() {
		return valorTotal;
	}
	
	//M�tode retorn llista de productes
	public List<Producte> getProductes() {
		return productes;
	}
	
	//M�tode retorn data
	public LocalDateTime getData() {
		return data;
	}
	
	//M�tode toString
	@Override
	public String toString() {
		return "ID_TICKET: " + id + "	" + data.format(format) + "	VALOR TOTAL: " + valorTotal;
	}

	//M�tode mostra ticket
	public void printTicket() {

		System.out.println(toString());
		productes.stream().forEach(System.out::println);
	
	}

}

