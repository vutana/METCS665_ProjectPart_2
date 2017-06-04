
package command;
import java.util.Date;

/**
 *
 * This is part of the Mediator Design Pattern
 */
public class ViewAppt {
    public static void showMessage(Appt appt, String message){
       System.out.println(new Date().toString() + "[" + appt.getName() + "] : " + message);
    }
}
