package ua.com.itvdn.javaessencial.students.maks.lecture0.task0;

/*
Требуется: Создать класс с именем Address. В теле класса требуется создать поля: index, country, city,
street, house, apartment.
Для каждого поля, создать метод с двумя методами доступа (get, set)
Создать экземпляр класса Address.
В поля экземпляра записать информацию о почтовом адресе.
Выведите на экран значения полей, описывающих адрес.
 */

public class Address {
    byte index;  // краще використовуй int, не заморочуйся з тим byte
    String country;
    String city;
    String street;
    String house;    // в це поле треба записати номер будинку, наіщо String
    String apartment; // в це поле треба записати номер квартири, наіщо String


    /*
    Макс гетери в тебе не мають приймати аргумент, вони лише повертають твоє поле, для прийому даних існують сетери
    Пам'ятаєш я казав, що метод це не швейцарський ніж, метод робить щось 1-е, гетерів і сетерів це теж стосується.
     */
    public byte getIndex(byte index) {
        return index;
    }

    public void setIndex(byte index) {
        this.index = index;
    }

    public String getCountry(String country) {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity(String city) {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet(String street) {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse(String house) {
        return house;
    }

    public void setHouse(String house){
            this.house = house;
    }

    public String getApartment(String apartment) {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
    /*
    Макс створи окремий клас Main в цьому ж пакеті в ньому створи метод main і в ньому заповнюй поля, виводь у консоль інфу
    і.т.і. Дивись ти таким чином відокремлюєш свою логіку від класу де будеш запускати код. Це важливо!
     */
    public static void main(String[] args) {
        // Додай можливість заповнити поля класу з консолі =)
        byte index = 3;
        String country = "Ukraine";
        String house = "House";
        String city = "Kiev";
        String street = "Green";
        String apartment = "Villa";


        Address example = new Address();
        example.setIndex(index);
        example.setCountry(country);
        example.setHouse(house);
        example.setCity(city);
        example.setStreet(street);
        example.setApartment(apartment);

        byte resultIndex = example.getIndex(example.index);
        String resultCountry = example.getCountry(example.country);
        String resultHouse = example.getHouse(example.house);
        String resultCity = example.getCity(example.city);
        String resultStreet = example.getStreet(example.street);
        String resultApartment = example.getApartment(example.apartment);

        System.out.println(resultIndex + "\n" + resultCountry + "\n" + resultHouse + "\n" + resultCity + "\n"+
                resultStreet + "\n" + resultApartment);
    }
}
