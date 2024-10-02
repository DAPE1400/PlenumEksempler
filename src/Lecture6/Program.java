package Lecture6;

public class Program {
    private int myNumber;

    public Program(int myNumber) {
        this.myNumber = myNumber;
    }

    public int test(int inputInt){
        if(inputInt>myNumber){
            System.out.println("inputInt larger than myNumber");
        } else if(inputInt<myNumber){
            System.out.println("inputInt smaller than myNumber");
        } else{
            System.out.println("inputInt has same value as myNumber");
        }
        if(inputInt%5==0){
            System.out.println("inputInt is dividable by 5");
        } else {
            System.out.println("inputInt is not dividable by 5");
        }
        if(inputInt%2==0 && inputInt%3==0){
            System.out.println("inputInt is dividable by 2 and 3");
        } else {
            System.out.println("inputInt is not dividable by 2 and 3");
        }
        if(inputInt%10==7 || myNumber%10==7){
            System.out.println("inputInt or myNumber ends with 7");
        } else {
            System.out.println("inputInt or myNumber does not end with 7");
        }
        return inputInt*myNumber;
    }

    public void countEvenBackwards(int value){
        if(value<=0){
            System.out.println("Non-positive value received.");
            return;
        }
        while(value>=0){
            if(value%2==0){
                System.out.println(value);
            }
            value--;
        }
    }

    public void repeatMessage(int repetitions, String message){
        if(repetitions<=0){
            System.out.println("Non-positive value received.");
            return;
        }
        for(int i = repetitions; i>0 ; i--){
            System.out.println(message);
            if(i>2){
                System.out.println("You will be hearing this " + (i-1) + " more times!");
            } else if(i>1){
                System.out.println("You will be hearing this " + (i-1) + " more time!");
            }
        }
    }
}
