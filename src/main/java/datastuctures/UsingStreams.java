package datastuctures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class UsingStreams {

    class People {
        private String name, gender;
        private int age;
        public People (String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }

    }

    private List<People> myList;

    public UsingStreams() {
        this.myList = Arrays.asList(
            new People("Bill", "Male", 31),
            new People("Anne", "Female", 26),
            new People("Jon", "Male", 45),
            new People("Alex", "Male", 5),
            new People("Jane", "Female", 13)
        );
    }

    public void setMyList(List<People> myList) {
        this.myList = myList;
    }

    public List<People> getMyList() {
        return myList;
    }

    public List<People> getAdults() {
        return this.getMyList()
			.stream()
			.filter(p -> p.getAge() > 18)
			.collect(Collectors.toList());
    }

    public List<String> namesToUpperCase() {
        return this.getMyList()
            .stream()
            .map(p -> p.getName())
            .map(n -> n.toUpperCase())
            .collect(Collectors.toList());
    }

    public int getSumOfAges() {
        return this.getMyList()
            .stream()
            .reduce(0, (sum, p) -> sum += p.getAge(), (sum1, sum2) -> sum1 + sum2);
    }

    public List<String> getSortedByName() {
        return this.getMyList()
            .stream()
            .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
            .map(p -> p.getName())
            .collect(Collectors.toList());
    }
}
