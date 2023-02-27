package application;

public class Program {

    public static void main(String[] args) {
      AverageSensor as = new AverageSensor();
      as.addSensor(new StandardSensor(3));
      as.addSensor(new StandardSensor(7));
      System.out.println(as.readings());
    }

}
