
package command;


public class CommandClientDemo {
    public static void main(String[] args){
    Parts carParts = new Parts();
    
    BuyParts buyPartsOrder = new BuyParts(carParts);
    SellParts sellPartsOrder = new SellParts(carParts);
    
    Broker broker = new Broker();
    broker.takeOrder(buyPartsOrder);
    broker.takeOrder(sellPartsOrder);
    
    broker.placeOrder();
    
    }
}
