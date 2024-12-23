package homework.arrays_and_objects;

import java.util.Random;

public class Author {

    private String fullName;
    private int UUID;
    private String biography;

    Author(String name, String biography){
        this.fullName = name;
        Random random = new Random();
        this.UUID = random.nextInt(900000) + 100000;
        this.biography = biography;
    }

    public int getUUID() {
        return UUID;
    }

    public void setUUID(int UUID) {
        this.UUID = UUID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public String toString(){
        return "Author is" + this.getFullName();
    }

}