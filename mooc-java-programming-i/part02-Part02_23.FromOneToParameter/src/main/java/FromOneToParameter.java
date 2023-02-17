

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int end){
        for(int i = 1; i <= end; i++){
            System.out.println(i);
        }
    }

}
