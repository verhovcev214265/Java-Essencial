package ua.com.itvdn.javaessencial.lecture5.lab.task2;

//Задание 1
//- Создать класс User, содержащий private переменные login, password.
//- Создать внутренний класс Query в классе User. Класс Query содержит метод printToLog(),
//который распечатывает на консоль сообщение о том что пользователь с таким то логином и паролем отправил запрос.
//- Класс User, содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog().
//В методе main():
//- создать экземпляр класса User и вызвать метод createQuery();
//- создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query();
//- создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();
//
//Задание 2
//Переписать предыдущее задание, используя локальный класс

    public class User {

        private String login;
        private int password;

        public User(String login, int password) {
            this.login = login;
            this.password = password;
        }

        public void  createAndShow(){
            class Query{
                protected void printToLog(){
                    System.out.println("User: " + login + " sent a request");
                }
            }
            new Query().printToLog();
        }

        @Override
        public String toString() {
            return "User{" +
                    "login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

