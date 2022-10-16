package Homework.NewPractice.StreamAPI.LoginAndEmail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class InputField {

    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();
        Collections.addAll(accounts,
                new Account("Elly", "elly@yandex.ru"),
                new Account("Jocker", "jocker@gmail.com"),
                new Account("Neo", "neo@yahoo.com"));

        Stream<String> allEmails = getEmails(accounts);
        allEmails.forEach(System.out::println);


    }

    public static Stream<String> getEmails(ArrayList<Account> accounts) {

    return accounts.stream().map(Account::getEmail);
    }
}
