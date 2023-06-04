package HappyLlamas.main;

public class HappyLlamas {
    //hover over class name => right click => Generate => Test... !pay attention to destination package.

    public static boolean areTheLlamasHappy(boolean ultraBouncy, int trampolines){
        if(ultraBouncy){
            if (trampolines >=24){
                return true;
            } else{
                return false;
            }
        } else if(trampolines >=24 && trampolines <=42){
                return true;
            } else {
                return false;
            }
    }
}
