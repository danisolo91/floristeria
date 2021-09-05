package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Ticket;

public class TicketRepository {
		//Declaraci� i instanciaci� de llista Ticket
		private List<Ticket> ticketList = new ArrayList<>();
		
		//Constructor per defecte
		public TicketRepository(){
		}
		
		//Getter
		public List<Ticket> getAllTickets(){
			return ticketList;
		}
		
		//M�tode per afegir tickets
		public void addTicket(Ticket Ticket) {
			ticketList.add(Ticket);
		}		

}
