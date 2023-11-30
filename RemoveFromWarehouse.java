public class RemoveFromWarehouse implements Runnable {
    Warehouse remove;
    int bug;

    /**
     * Reference object of Warehouse to access Warehouse methods
     * int bug for bug flag to distinguish a 1 or 0. 
     * @param remove
     * @param bug
     */
    public RemoveFromWarehouse(Warehouse remove, int bug){
        this.remove = remove;
        this.bug = bug;
    }
    
    public void run()
    {
        //if bug flag is 0, it will give a correct answer
        if(bug == 0){
            synchronized(remove){
                remove.removeInventory();
            }
        }
        //if bug flag is 1, it will give a correct answer
        else if(bug == 1){
            remove.removeInventory();
        }
    }
}
