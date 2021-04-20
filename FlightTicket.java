package task9;

public class FlightTicket {
    private Date departureDate;
    private Time departureTime;
    private byte noOfTickets, typeOfCabin;
    private double price = 1000, totalPrice;

    public FlightTicket(Date departureDate, Time departureTime, byte noOfTickets, byte typeOfCabin) {
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.noOfTickets = noOfTickets;
        this.typeOfCabin = typeOfCabin;
    }
    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setNoOfTickets(byte noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public void displayTicketInformation() {
        System.out.println("Following information about the ticket(s) booked");
        System.out.println("------------------------------------------------");
        System.out.println("Departure Date: " + departureDate);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Number of Tickets: " + noOfTickets);
        if (typeOfCabin == 1){
            System.out.println("Type of cabin: Business class");
            this.price = 300;
        }
        else if (typeOfCabin == 2) {
            System.out.println("Type of cabin: First class");
            this.price = 2000;
        }
        else {
            System.out.println("Type of cabin: Economy class");
        }
        System.out.println("Total cost of the ticket: $" + getTotalPrice());
    }
}
