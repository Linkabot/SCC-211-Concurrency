public class AddToWarehouse implements Runnable {
    Warehouse add;
    int bug;

    //Reference object of Warehouse to access Warehouse methods
    //int bug for bug flag to distinguish a 1 or 0.
    public AddToWarehouse(Warehouse add, int bug){
        this.add = add;
        this.bug = bug;
    }


    public void run()
    {
        //if bug flag is 0, it will give a correct answer
        if(bug == 0){
            synchronized(add){
                add.addInventory();
            }
        }
        //if bug flag is 1, it will give a correct answer
        else if(bug == 1){
            add.addInventory();
        }
    }
}
