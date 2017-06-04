
package command;

/**
 *
 * Mediator Design Pattern
 */
public class MediatorClientDemo {
    public static void main(String[] args){
    Appt tire = new Appt ("TIRE Change");
    Appt oil = new Appt ("OIL Change");
    
    tire.sendMessage("Appointment is set to receive 4 new tires");
    oil.sendMessage("Appointment is set to receive an oil change");
    }
}
