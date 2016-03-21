package structural.facade.module;

public class LoginSystem {

    private String password;

    public LoginSystem(String password) {
        this.password = password;
    }

    public boolean login(String password) {
        return this.password.equals(password);
    }

}