import java.util.Date;
import java.sql.Time;

interface CommonFunctions {
    void searchTicket();
    void bookTicket();
    void cancelTicket();
    void makePayment();
    void fillDetails();
}

class Customer implements CommonFunctions {
    private String customerId, name, address;
    private int phoneNo, age;

    public Customer(String customerId, String name, String address, int phoneNo, int age) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.age = age;
    }

    public void addDetails() {}
    public void modifyDetails() {}

    @Override public void searchTicket() {}
    @Override public void bookTicket() {}
    @Override public void cancelTicket() {}
    @Override public void makePayment() {}
    @Override public void fillDetails() {}
}

class Agent implements CommonFunctions {
    private int id;
    private String name;

    public Agent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override public void searchTicket() {}
    @Override public void bookTicket() {}
    @Override public void cancelTicket() {}
    @Override public void makePayment() {}
    @Override public void fillDetails() {}
}

class Ticket {
    private String source, destination, busNo, seatNo;
    private Date dateOfJourney;
    private Time time;

    public Ticket(String source, String destination, Date dateOfJourney, Time time, String busNo, String seatNo) {
        this.source = source;
        this.destination = destination;
        this.dateOfJourney = dateOfJourney;
        this.time = time;
        this.busNo = busNo;
        this.seatNo = seatNo;
    }
}

class Refund {
    private float amount;
    private String customerId;

    public Refund(float amount, String customerId) {
        this.amount = amount;
        this.customerId = customerId;
    }

    public void refundAmount() {}
}

class BookingCounter {}

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("C001", "John Doe", "123 Main St", 1234567890, 30);
        Agent agent = new Agent(101, "Agent Smith");
        Date journeyDate = new Date();
        Time journeyTime = new Time(journeyDate.getTime());
        Ticket ticket = new Ticket("City A", "City B", journeyDate, journeyTime, "B123", "A1");
        Refund refund = new Refund(100.5f, "C001");

        System.out.println("Customer created: " + customer);
        System.out.println("Agent created: " + agent);
        System.out.println("Ticket created: " + ticket);
        System.out.println("Refund created: " + refund);
    }
}
