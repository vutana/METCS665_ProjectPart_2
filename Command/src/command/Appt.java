
package command;

/**
 *
 * This is part of the Mediator Design Pattern
 */
public class Appt {
    private String name;
    
    public String getName(){
         return name;
    }
    public void setName(String name){
         this.name = name;
    }
    public Appt(String name){
         this.name = name;
    }
    public void sendMessage(String message){
    ViewAppt.showMessage(this, message);
    }
}
