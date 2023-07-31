package ua.com.itvdn.javaessencial.lecture6.classwork.enums.ex4_with_methods;

public enum Company {

    YMCA(10_000) {
        // Можемо перевизначати методи для окремих екземплярів
        @Override
        public int getSalary() {
            return 100 + this.salary;
        }

        // Забов'язані перевизначити абстрактний метод
        @Override
        public String getCurrency() {
            return "euros.";
        }
    },

    META(5_000) {
        @Override
        public String getCurrency() {
            return "dollars";
        }
    },

    SPACE_X(4_500) {
        @Override
        public String getCurrency() {
            return "pounds";
        }
    };

    final int salary;

    Company(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public abstract String getCurrency();

    @Override
    public String toString() {
        return "Company: " + super.toString() +
                ", salary = " + getSalary() +
                " " + getCurrency();
    }

}
