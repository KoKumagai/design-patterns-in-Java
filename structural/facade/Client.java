package structural.facade;

import structural.facade.facade.AdminPage;

public class Client {

    public static void main(String[] args) {
        AdminPage adminPage = new AdminPage();

        adminPage.getPage(1, "CorrectPassword");
        // OK: You can get a admin page.

        adminPage.getPage(1, "WrongPassword");
        // NG: You can not get a admin page.
    }

}