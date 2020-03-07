package pl.sda.wyjatki;

import pl.sda.wyjatki.exception.EmailException;

public class User {
    String login;
    String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public User() {

    }
    public boolean checkEmail(String email) {
        return email.contains("@");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException {
        if(!this.checkEmail(email)) {
            throw new EmailException("Niepoprawny email");
        } else {
            this.email = email;
        }
    }
}
