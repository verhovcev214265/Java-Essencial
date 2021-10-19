package ua.com.itvdn.javaessencial.lecture5.hometasks.task1;
//Требуется:
//Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door, которые
//также должны содержать метод print. Создайте экземпляры классов Wheel и Door.
public class Vehicle {
    public void print(String message){
        System.out.println("Your message is: " + message);
    }

   public class Wheel{

        public void print(String massage){
            System.out.println("Method from Wheel, message is: " + massage);
        }
    }

    public class Door{

        public void print(String massage){
            System.out.println("Method from Door, message is: " + massage);
        }
    }
}
