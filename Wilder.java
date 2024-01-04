package main.java;

public class Wilder {

    private String firstname;
    private boolean aware;

    // constructors
    public Wilder(String firstname) {
        this.firstname = firstname;
        this.aware = false;
    }

    // instance method
    public String whoAmI() {

        if (this.isSwimming()) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        }
        else {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
        }
    }


    // getters
    public String getFirstname() {
        return this.firstname;
    }

    public boolean isSwimming() {
        return this.aware;
    }

    // setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }
}
