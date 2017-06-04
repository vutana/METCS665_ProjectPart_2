
package command;


public class SellParts implements Order {
private Parts carParts;

public SellParts(Parts carParts){
       this.carParts = carParts;
}
    @Override
    public void execute() {
       carParts.sell();
    }
    
}
