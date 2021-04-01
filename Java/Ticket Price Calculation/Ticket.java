public class Ticket
{
    private int ticketid;
    private int price;
    private static int availableTickets;
    public void setTicketid(int t)
    {
        ticketid=t;
    }
    public int getTicketid()
    {
        return ticketid;
    }
    public static void setAvailableTickets(int n)
    {
        if(n>=0){
        availableTickets=n;
        }
        
    }
    public static int getAvailableTickets()
    {
        return availableTickets;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int p)
    {
        price=p;
    }
    /*static void Aset(int nooftickets)
    {
        availableTickets-=nooftickets;
    }*/
    public int calculateTicketCost(int nooftickets)
    {
        
        if(getAvailableTickets()>0 && getAvailableTickets()>nooftickets)
        {
            availableTickets-=nooftickets;
            return nooftickets*getPrice();
        }
        else{
            return -1;
        }

    }

}