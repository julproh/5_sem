


public class Person {
    private String name;
    private String surname;
    private int age;

    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name) {
            newPerson.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            newPerson.surname = surname;
            return this;
        }

        public Builder withAge(int age) {
            newPerson.age = age;
            return this;
        }

        public Person build() {
            return newPerson;
        }
    }
}
