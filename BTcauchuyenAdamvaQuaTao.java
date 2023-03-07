import java.util.Scanner;

public class BTcauchuyenAdamvaQuaTao {
    public static class Apple{
        int weight   ;
        public Apple(){
            this.weight = 10 ;
        }
        public void decresed(){
            this.weight--;
        }
        public boolean isEmpty(){
            return true;
        }
        public int getWeight(){
            return this.weight;
        }

    }
    public static class Humman {
        String name ;
        Apple apple ;
        boolean gender ;
        int weight ;
        public Humman(String name ){
            this.name = name;
            this.gender = true ;
            this.weight = 50 ;
        }
        public String getName(){
            return this.name;
        }
        public void HumanWeight(){
             this.weight ++ ;
        }
        public int getHumanWeight(){
            return this.weight;
        }
        public void setGenderMan(){
            this.gender = true ;
        }
        public void setGenderWomman(){
            this.gender = false ;
        }
        public void setVoiceStart(){
            System.out.println("Let eat the apple ");
            System.out.println("Im eating fisrt");
        }
        public void setVoiceEnd(){
            System.out.println("We will get a trouble");
            System.out.println("the god won't never give us hope ");
        }
        public void setApple(Apple apple){
               this.apple = apple;
        }
        public int setinfo(){
            return apple.getWeight();
        }

        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = input.nextLine();
        Apple apple = new Apple();
        Humman getname = new Humman(name);
        getname.setApple(apple);
        System.out.println("Story about Adam and Eva with Apple ");
        if (name.equals("Adam")){
            System.out.println("Class name Adam");
            getname.setGenderMan();
            getname.setVoiceStart();
            for (int i = apple.getWeight(); i > 0 ; i --){
                System.out.println("Start eating apple");
                apple.decresed();
                getname.HumanWeight();
            }
            apple.isEmpty();
            getname.setVoiceEnd();
            System.out.println("The weight from human is " + getname.getHumanWeight());
            System.out.println("The weight from apple after eat " + apple.getWeight());

        }
        if (name.equals("Eva")){
            System.out.println("Class name Eva");
            getname.setGenderWomman();
            getname.setVoiceStart();

            for (int i = apple.getWeight(); i > 0 ; i --){
                System.out.println("Start eating apple");
                apple.decresed();
                getname.HumanWeight();
            }
            apple.isEmpty();
            getname.setVoiceEnd();
            System.out.println("The weight from human is " + getname.getHumanWeight());
            System.out.println("The weight from apple after eat " + apple.getWeight());

        }
    }

    }

