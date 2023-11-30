public class Warehouse {
    private int inventorySize = 0;
    
    /**
     * adds 1 to the warehouseinventory
     */
    public void addInventory(){
        
        int temp = inventorySize;
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        temp = temp + 1;
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        inventorySize = temp;  
         
        System.out.println("Thread added to inventory. Inventory size now = " + this.getTotal());
    }
    /**
     * adds 1 to the warehouseinventory
     */
    public void removeInventory(){
        
        int temp = inventorySize;
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        temp = temp - 1;
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        inventorySize = temp;

        System.out.println("Thread removed from inventory. Inventory size now = " + this.getTotal());
       
    }
    /**
     * returns the warehouse total
     * @return
     */
    public int getTotal(){
        return this.inventorySize;
    }
    
    public void total(){
        System.out.println("Total is = " + this.getTotal());
    }
}