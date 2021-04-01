import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        int bookings=sc.nextInt();
        System.out.println("Enter the available tickets:");
        int tickets=sc.nextInt();
        System.out.println("Enter the ticketid:");
        int id=sc.nextInt();
        System.out.println("Enter the price:");
        int price=sc.nextInt();
        System.out.println("Enter the no of tickets:");
        int notickets=sc.nextInt();
        
        
        Ticket tkt=new Ticket();
        Ticket.setAvailableTickets(tickets);
        tkt.setPrice(price);
        System.out.println("Available Tickets: "+String.valueOf(Ticket.getAvailableTickets()));
        //Ticket.Aset(notickets);
        int tot=tkt.calculateTicketCost(notickets);
        
        System.out.println("Total Amount:"+String.valueOf(tot));
        System.out.println("Availabl ticket after booking: "+String.valueOf(Ticket.getAvailableTickets()));
        

    }
}
