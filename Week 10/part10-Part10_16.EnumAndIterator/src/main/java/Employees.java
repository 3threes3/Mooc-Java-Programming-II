import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    ArrayList<Person> employees;

    public Employees(){
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd){
        this.employees.add(personToAdd);
    }

    public void add(List<Person> newStaff){
        newStaff.stream()
                .forEach(p -> this.employees.add(p));
    }

    public void print(){
        Iterator<Person> iterator = this.employees.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }

    public void print(Education education){
        Iterator<Person> iterator = this.employees.iterator();

        while(iterator.hasNext()){
            Person temp = iterator.next();
            if(temp.getEducation() == education){
                System.out.println(temp);
            }
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = this.employees.iterator();

        while(iterator.hasNext()){
            if(iterator.next().getEducation() == education){
                iterator.remove();
            }
        }
    }
}
