package structural.facade.facade;

import structural.facade.module.Database;
import structural.facade.module.LoginSystem;

public class AdminPage {

    public void getPage(int id, String password) {
        Database db = new Database();
        String passwordFromDb = db.getPassword(id);
        LoginSystem loginSystem = new LoginSystem(passwordFromDb);

        if (loginSystem.login(password)) {
            System.out.println("OK: You can get a admin page.");
        } else {
            System.out.println("NG: You can not get a admin page.");
        }
    }

}