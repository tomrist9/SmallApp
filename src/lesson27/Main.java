package lesson27;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import lesson27.HumanUtil;

import java.util.List;

    public class Main {

        public static void main(String[] args) {

            List<Person> people = HumanUtil.loadPeople();

            HumanUtil.showPeopleByNameSortedDesc(people);

        }

    }