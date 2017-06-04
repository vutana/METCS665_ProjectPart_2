
package inventory;


public class InventoryRepo implements Container{
public String names[] = {" 2015 Honda" , "2012 Kia" , "2011 Acura" , "2002 Mitsubishi"};
    @Override
    public Iterator getIterator() {
     return new NameIterator();   
    }
    private class NameIterator implements Iterator{

        int index;
        
        @Override
        public boolean hasNext() {
            if (index < names.length){
                return true;
           }
               return false;
        }   
        @Override
        public Object next() {
            if(this.hasNext()){
            return names[index++];
            }
            return null;
        }
    
    }
}
