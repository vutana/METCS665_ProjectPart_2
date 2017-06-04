
package command;


public class Parts {
    private String name = "NEW TIRES";
    private String name1 = "OIL";
    private int quantity = 10;
    private int quantity1 = 220;
    public void buy(){
      System.out.println("Parts [ Name: "+name1+", Quantity: "+quantity+" ] bought");
    }
    
    public void sell(){
      System.out.println("Parts [ Name: "+name+", Quantity: "+quantity1+" ] sold");
    }
    
}
