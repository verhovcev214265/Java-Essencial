package ua.com.itvdn.javaessencial.lecture7.lab.tak1;
//Задание
// Создайте свой класс исключения для проверки выгула животного.
// Программа должна содержать несколько методов, проверяющий экипировку животного (например: ошейник, поводок и тд.) и
// результирующий метод «выгул».
// Если одно из требований хотя бы не выполнено, то выбросить свое исключение или же отработать нормально.
class ExceptionForWalk extends Exception {
    public void exceptionWalk() {
        System.out.println("Sorry but your dog isn`t readying now, you mast have all equipments for your dog");
    }
}

class IncorrectNumber extends Exception {
    public void incorrect() {
        System.out.println("Your entre incorrect symbol");
    }
}

class Dog {
    private boolean collar;
    private boolean leash;
    private boolean covidCertificate; // =)

    public void isCollar(int input) {
        try {
            if (input == 1) {
                collar = true;
                System.out.println("collar = " + collar);
            } else if (input == 2) {
                System.out.println("It`s a pity");
            } else {
                throw new IncorrectNumber();
            }
        } catch (IncorrectNumber e) {
            e.incorrect();
        }
    }

    public void isLeash(int input) {
        try {
            if (input == 1) {
                leash = true;
                System.out.println("leash = " + leash);
            } else if (input == 2) {
                System.out.println("It`s a pity");
            } else {
                throw new IncorrectNumber();
            }
        } catch (IncorrectNumber e) {
            e.incorrect();
        }
    }

    public void isCovidCertificate(int input) {
        try {
            if (input == 1) {
                covidCertificate = true;
                System.out.println("Covid certificate = " + covidCertificate);
            } else if (input == 2) {
                System.out.println("Sorry but covid certificate \"must have\" for today!");
            } else {
                throw new IncorrectNumber();
            }
        } catch (IncorrectNumber e) {
            e.incorrect();
        }
    }

    public void walk() {
        try {
            if (!collar || !leash || !covidCertificate) {
                throw new ExceptionForWalk();

            } else {
                System.out.println("Let`s go for walk!");
            }
        } catch (ExceptionForWalk e) {
            e.exceptionWalk();
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "collar = " + collar +
                ", leash = " + leash +
                ", covidCertificate = " + covidCertificate +
                '}';
    }
}



