import java.util.Scanner;

public class THvaBTtuongtacgiuadenpinvapin {
    static class Battery {
        int energy;
        public Battery(){
            this.energy = 20;
        }
        public int getEnergy(){
            return this.energy;
        }
        public void setEnergy(){
            this.energy = 20;
        }
        public void decreaseEnergy(){
            if (energy > 0){
                this.energy-=2;
            }
        }

    }
   static class Lamp {
       boolean status ;
       Battery battery ;
        public Lamp(){
          status = false ;
          battery = null ;
        }
        public void setBattery (Battery b){
           this.battery = b;
        }
        public int getBatteryinfo(){
            return battery.getEnergy();
        }
        public void turnOn(){
            status = true ;
            if (battery.getEnergy()>0){
                System.out.println("Đèn sáng");
                battery.decreaseEnergy();
            }
        }
        public void turnOff(){
            status = false;
            System.out.println("Đèn tắt");
        }

    }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Battery battery = new Battery();
            Lamp lamp = new Lamp();
            lamp.setBattery(battery);
            for (int i = 0 ; i <= 10 ; i ++){
                System.out.println("Switch");
                System.out.println("1. turnOn");
                System.out.println("2. turnOff");
                int chose = input.nextInt();
                switch (chose){
                    case 1:
                        System.out.println("Light turnOn");
                        lamp.turnOn();
                        break;
                    case 2:
                        System.out.println("Light turnOff");
                        lamp.turnOff();
                        break;
                    default:
                        System.out.println("No solution");
                }


            }
            System.out.println("Năng lượng còn lại " + lamp.getBatteryinfo());
        }

}
