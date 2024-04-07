package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "FakeData.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

        List listOfStudents = programObject.handWrittenLoadOfData();

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }
    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }

    private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.
        String[] values = line.split(COMMA_DELIMITER);
        Person newPerson = new Person(values[0], values[1]);
        return newPerson;
    }


private List handWrittenLoadOfData() {
    ArrayList<Person> students = new ArrayList<>();
    Person newPerson = new Person("Abukar", "Abukar");
    newPerson.setgithubHandle("abukarabukar");
    newPerson.setfavColor("yellow");
    newPerson.setbirthMonth("April");
    newPerson.sethasPets(true);
    students.add(newPerson);

    Person newPerson1 = new Person("Chaz", "Adams");
    newPerson1.setgithubHandle("chaz_adams");
    newPerson1.setfavColor("blue");
    newPerson1.setbirthMonth("February");
    newPerson1.sethasPets(true);
    students.add(newPerson1);

    Person newPerson2 = new Person("Asan", "Ahmadli");
    newPerson2.setgithubHandle("asanahamdli");
    newPerson2.setfavColor("dark blue");
    newPerson2.setbirthMonth("December");
    newPerson2.sethasPets(false);
    students.add(newPerson2);

    Person newPerson3 = new Person("Ali", "Bangash");
    newPerson3.setgithubHandle("ali-b14");
    newPerson3.setfavColor("green");
    newPerson3.setbirthMonth("March");
    newPerson3.sethasPets(false);
    students.add(newPerson3);

    Person newPerson4 = new Person("Jenn", "Azer");
    newPerson4.setgithubHandle("cupofjavajenny");
    newPerson4.setfavColor("purple");
    newPerson4.setbirthMonth("November");
    newPerson4.sethasPets(true);
    students.add(newPerson4);

    Person newPerson5 = new Person("Jake", "Brennan");
    newPerson5.setgithubHandle("jake-brennan");
    newPerson5.setfavColor("purple");
    newPerson5.setbirthMonth("April");
    newPerson5.sethasPets(true);
    students.add(newPerson5);
    
    // and so on for EACH person in the cohort.
    return students;
  //Hopefully this commits correctly
  }
}