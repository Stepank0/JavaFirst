package Homework.NewPractice.StreamAPI.LoginAndEmail;

public class Account {

    private String login;
    private String Email;

    public Account(String login, String email) {
        this.login = login;
        Email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return Email;
    }
}
