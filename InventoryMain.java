public class InventoryMain {
    public static void main(String[] args) throws InterruptedException {

        int add=Integer.parseInt(args[0]);
        int sub=Integer.parseInt(args[1]);
        int bug=Integer.parseInt(args[2]);
    
        Warehouse w = new Warehouse();  

        AddToWarehouse aw = new AddToWarehouse(w, bug);
        RemoveFromWarehouse rw = new RemoveFromWarehouse(w, bug);
        Thread[] t = new Thread[add];
        Thread[] u = new Thread[sub];
 
        //Thread array depending on the amount of add operations asked to complete
        //Starts each thread made
        for (int i = 0; i < add; i++){
            t[i] = new Thread(aw);
            t[i].start();
        }

        //Thread array depending on the amount of subtract operations asked to complete
        //Starts each thread made
        for (int i = 0; i < sub; i++){
            u[i]= new Thread(rw);
            u[i].start();
        }
        
        //waits for every thread to finish before the next thread starts. 
        //allows me to print the final total at the end
        for (int i = 0; i < add; i++){
            try{
                t[i].join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        //waits for every thread to finish before the next thread starts.
        //allows me to print the final total at the end
        for (int i = 0; i < sub; i++){
            try{
                u[i].join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        w.total();
    }
}