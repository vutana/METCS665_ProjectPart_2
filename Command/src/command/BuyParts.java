
package command;


public class BuyParts implements Order{
    private Parts carParts;
    
    public BuyParts(Parts carParts){
       this.carParts = carParts;
    }
    
    
    @Override
    public void execute() {
    carParts.buy(); 
    }
   
}
