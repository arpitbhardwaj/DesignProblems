package com.ab.design.patterns.structural.composite;

public class MenuCompositeDemo {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main","/main");
        MenuItem safetyMenuItem = new MenuItem("Saftey","/main/saftey");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        MenuItem personalClaimsSubMenu = new MenuItem("Personal Claim","/claims/personalClaims");
        claimsSubMenu.add(personalClaimsSubMenu);

        mainMenu.add(claimsSubMenu);

        System.out.println(mainMenu);
    }
}
