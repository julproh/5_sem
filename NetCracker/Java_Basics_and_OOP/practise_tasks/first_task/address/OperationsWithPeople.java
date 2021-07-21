package address;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;


class Person {
    String name;
    String surname;
    Calendar dateOfBirth;
    Address address;

    Person(String _name, String _surname, Calendar _dateOfBirth) {
        name = _name;
        surname = _surname;
        dateOfBirth = _dateOfBirth;
    };

    class Address {
        int flat;
        int house;
        String street;
        String city;
        String country;
        
        Address () {};

        Address(int _flat, int _house, String _street, String _city,  String _country) {
            flat = _flat;
            house = _house;
            street = _street;
            city = _city;
            country = _country; 
        };

        void printAddress () {
            System.out.print(country + " " + city + " " + street + " " + house + " " + flat);
        }
    }

    void printInformation () {
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        Date date = dateOfBirth.getTime();
        System.out.println("Date of birth: " + date);
        System.out.print("Address: ");
        this.address.printAddress();

    }
}

public class OperationsWithPeople {
    
    static void findBySurname(String _surname, Person[] _people) {
        int k = 0;
        for (int i = 0; i < _people.length; i++) {
            if (_people[i].surname == _surname) {
                k++;
                _people[i].printInformation();
                System.out.println("\n _____________");
            } 
            if (k == 0) {
                System.out.println("There is no person with such surname");
            }
        }
    }

    static void findByFlat (int _flat, Person[] _people) {
        int k = 0;
        for (int i = 0; i < _people.length; i++) {
            if (_people[i].address.flat == _flat) {
                k++;
                _people[i].printInformation();
                System.out.println("\n _____________");
            } 
            if (k == 0) {
                System.out.println("There is no person with such flat");
            }
        }
    }
    static void findByHouse (int _house, Person[] _people) {
        int k = 0;
        for (int i = 0; i < _people.length; i++) {
            if (_people[i].address.house == _house) {
                k++;
                _people[i].printInformation();
                System.out.println("\n _____________");
            } 
            if (k == 0) {
                System.out.println("There is no person with such house");
            }
        }
    }
    
    static void findByStreet (String _street, Person[] _people) {
        int k = 0;
        for (int i = 0; i < _people.length; i++) {
            if (_people[i].address.street == _street) {
                k++;
                _people[i].printInformation();
                System.out.println("\n _____________");
            } 
            if (k == 0) {
                System.out.println("There is no person with such street");
            }
        }
    }

    static void findByCity (String _city, Person[] _people) {
        int k = 0;
        for (int i = 0; i < _people.length; i++) {
            if (_people[i].address.city == _city) {
                k++;
                _people[i].printInformation();
                System.out.println("\n _____________");
            } 
            if (k == 0) {
                System.out.println("There is no person with such city");
            }
        }
    }

    static void findByCountry (String _country, Person[] _people) {
        int k = 0;
        for (int i = 0; i < _people.length; i++) {
            if (_people[i].address.country == _country) {
                k++;
                _people[i].printInformation();
                System.out.println("\n _____________");
            } 
        }
        if (k == 0) {
            System.out.println("There is no person with such country");
        }
    }

    static void findTheMostOld (Person[] _people) {
        int k = 0;
        for (int i = 1; i < _people.length; i++) {
            Date datek = _people[k].dateOfBirth.getTime();
            Date datei = _people[i].dateOfBirth.getTime();
            if (datek.getTime() > datei.getTime()) {
                k = i;
            }
        }
        _people[k].printInformation();
        System.out.println("\n _____________");
    }

    static void findTheYoungest (Person[] _people) {
        int k = 0;
        for (int i = 1; i < _people.length; i++) {
            Date datek = _people[k].dateOfBirth.getTime();
            Date datei = _people[i].dateOfBirth.getTime();
            if (datek.getTime() < datei.getTime()) {
                k = i;
            }
        }
        _people[k].printInformation();
        System.out.println("\n _____________");
    }

    static void findBetween (Calendar _date1, Calendar _date2, Person[] _people) {
            Date date1 = _date1.getTime();
            Date date2 = _date2.getTime();
        for (int i = 1; i < _people.length; i++) {
            Date date = _people[i].dateOfBirth.getTime();
            if ((date.getTime() >= date1.getTime() && date.getTime() <= date2.getTime()) || (date.getTime() <= date1.getTime() && date.getTime() >= date2.getTime())  ) {
                _people[i].printInformation();
                System.out.println("\n _____________");
            }
        }
    }

    public static void main (String[] args) {
        Person[] people = new Person[4];
        
        people[0] = new Person("Ivan", "Petrov", new GregorianCalendar(2001, 01, 01) );
        people[0].address = people[0].new Address(1,1,"First", "Ivanovo", "Russia");
        people[1] = new Person("Ivan", "Ivanov", new GregorianCalendar(2001, 02, 01));
        people[1].address = people[1].new Address(1, 2, "Second", "Moscow", "Russia");
        people[2] = new  Person("Andrew", "Petrov", new GregorianCalendar(1991, 8, 11));
        people[2].address = people[2].new Address(1, 1, "First", "Dolgoprudny", "Russia" );
        people[3] = new Person("Olga", "Sowa", new GregorianCalendar(2010, 8, 05));
        people[3].address = people[3].new Address(10, 5, "Pobeda", "Kiev", "Ukraine");

        System.out.println("Found by city:");
        findByCity("Ivanovo", people);
        System.out.print("\n");
        System.out.println("Find by country:");
        findByCountry("America", people);
        System.out.print("\n");
        System.out.println("Find by flat:");
        findByFlat(1, people);
        System.out.print("\n");
        System.out.println("Find by house:");
        findByHouse(5, people);
        System.out.print("\n");
        System.out.println("Find by street:");
        findByStreet("Pobeda", people);
        System.out.print("\n");
        System.out.println("Find by surname:");
        findBySurname("Ivanov", people);
        System.out.print("\n");
        System.out.println("The oldest:");
        findTheMostOld(people);
        System.out.print("\n");
        System.out.println("The youngest:");
        findTheYoungest(people);
        System.out.print("\n");
        System.out.println("People between dates:");
        findBetween(new GregorianCalendar(2000, 8, 9), new GregorianCalendar(2005, 6, 9), people);
        System.out.print("\n");

    };



}