package com.company;

class Staff extends Dog {
    private String breed;
    public Staff(String wool, String size, String breed) {
        super(wool, size);
        this.breed=breed;
    }
    public void displayInfo(){
        System.out.println("Порода: " + breed);
        super.displayInfo();
    }
}
