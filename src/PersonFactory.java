import java.util.*;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        ArrayList<String> persons = new ArrayList();

        for(int i = 0; i < allPersons.size(); i++){
            persons.add(allPersons.get(i).getLastName());
        }
        Collections.sort(persons);
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> under18 = new ArrayList();
        for(int i = 0; i < allPersons.size(); i++){
            if(allPersons.get(i).getAge() <=18){
                under18.add(allPersons.get(i));
            }
        }
        return under18;
    }

    public boolean checkLastName(String lastName) {
        for(int i = 0; i < allPersons.size(); i++){
            if(allPersons.get(i).getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
}
