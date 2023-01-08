public class Fortune{
    public static void main(String[] args){
        String[] color =
        {"yellow","green","blue","purple","pink","red","orange","white","black","brown"};

        System.out.print("Today's fortune is ");
        try{
            for(int i = 0; i < 3; i++){
                System.out.print(".");
                Thread.sleep(1000);
            }

            double fn1 = Math.random();
            if(fn1 >= 0.7){
                System.out.println("Excellent!");
            } else if(fn1 >= 0.4){
                System.out.println("Great!");
            } else if(fn1 >= 0.1){
                System.out.println("Good!");
            } else {
                System.out.println("Bad...");
            }

            int fn2 = ((int)(fn1 * 100)) % 10;
            System.out.println("Your lucky color is " + color[fn2]);
        } catch(InterruptedException e){
            System.out.println("Interruption has occourred.");
        }
    }
}