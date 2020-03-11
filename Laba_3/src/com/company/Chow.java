package com.company;

class Chow extends Dog {
    private String breed;
    public Chow(String wool, String size, String breed) {
        super(wool, size);
        this.breed=breed;
    }
    public void displayInfo(){
        System.out.println("Порода: " + breed);
        super.displayInfo();
    }
}
