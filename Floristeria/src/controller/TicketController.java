package controller;

import entity.Ticket;
import repository.ProducteRepository;
import repository.TicketRepository;
import view.TicketView;

public class TicketController {
	//Declaraci� de objectes 
	private ProducteRepository producteRepository;
	private TicketRepository ticketRepository;
	private TicketView ticketView;
	
	//Instanciaci� de objectes
	public TicketController() {
		producteRepository = new ProducteRepository();
		ticketRepository = new TicketRepository();
		ticketView = new TicketView();
	}
	
	//M�tode per crear tickets
	public void crearTicket() {
		Ticket ticket = ticketView.crearTicket(producteRepository.getProductes());
		
		ticket.getProductes().forEach(p -> producteRepository.deleteProducteById(p.getId()));
		
		ticketRepository.addTicket(ticket);
	}
	
	//M�tode per mostrar llista de tickets per consola
	public void mostrarTickets() {
		ticketView.mostrarTickets(ticketRepository.getAllTickets());
	}

}

	