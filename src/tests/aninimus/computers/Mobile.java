package tests.aninimus.computers;

public class Mobile extends Computer{

    @Override
    void process(){
        super.process();
        System.out.println("Mobile");
    }

    Phone creatPhone(){
        return new Phone(){
            @Override
            void process(){
                super.process();
                System.out.println("Mobile");
            }
        };
    }
}
