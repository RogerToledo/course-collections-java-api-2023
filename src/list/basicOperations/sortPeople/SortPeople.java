package list.basicOperations.sortPeople;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPeople {
    private List<People> peopleList;

    public SortPeople() {
        this.peopleList = new ArrayList<>();
    }

    public void addPeople(People people) {
        this.peopleList.add(people);
    }

    public List<People> sortByAge() {
        List<People> sortedList = new ArrayList<>(peopleList);

        if (!peopleList.isEmpty()) {
            Collections.sort(sortedList);
            return sortedList;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<People> sortByHeight() {
        List<People> sortedList = new ArrayList<>(peopleList);

        if (!peopleList.isEmpty()) {
            Collections.sort(sortedList, new CompareByHeight());
            return sortedList;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SortPeople sort = new SortPeople();

        sort.addPeople(new People("P1", 47, 1.80));
        sort.addPeople(new People("P2", 47, 1.60));
        sort.addPeople(new People("P3", 18, 1.65));
        sort.addPeople(new People("P4", 70, 1.75));

        System.out.println(sort.sortByAge());
        System.out.println(sort.sortByHeight());
    }
}
