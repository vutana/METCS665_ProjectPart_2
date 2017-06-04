
package inventory;


public class IteratorPattermTest {
    public static void main (String[] args){
    InventoryRepo inventoryRepo = new InventoryRepo();
    
    for( Iterator iter = inventoryRepo.getIterator(); iter.hasNext();){
        String name = (String) iter.next();
        System.out.println("Used : " + name);
      }
    }
}
