package edu.guilford;

public class Animal implements Comparable<Animal> {
   // attributes
   private String type;
    private String color; 
    private int legs; 
    private double size; 
    private String sound; 
    private boolean vegetarian;

    enum SortOrder{FORWARD, REVERSE}
    public static SortOrder sortOrder = SortOrder.FORWARD;

    // constructor
    public Animal(String type, String color, int legs, double size, String sound, boolean vegetarian) {
        super(); 
        this.type = type;
        this.color = color;
        this.legs = legs;
        this.size = size;
        this.sound = sound;
        this.vegetarian = vegetarian;
    }

    // construtor with random values
    public Animal() { 
        // choose random animal from a list of 20 posibilities
        String[] types = {"cheeta", "crab", "snake", "dog", "cat", "bird", "fish", 
        "frog", "lizard", "turtle", "shark", "whale", "dolphin", "mouse", "rat", 
        "hamster", "gerbil", "guinea pig", "rabbit", "pig"};
        int randomIndex = (int) (Math.random() * types.length);
        this.type = types[randomIndex];
        //Choose random color from a list of 20 possibilities
        String[] colors = {"red", "orange", "yellow", "green", "blue", "purple", "pink",
        "brown", "black", "white", "gray", "gold", "silver", "tan", "cream", "beige",
        "maroon", "magenta", "teal", "turquoise"};
        randomIndex = (int) (Math.random() * colors.length);
        this.color = colors[randomIndex];
        // choose random number of legs from 0 to 10
        this.legs = (int) (Math.random() * 11);
        // choose random size from 0 to 130
        this.size = Math.random() * 131;
        // choose random sound from a list of 20 different possibilities
        String[] sounds = {"roar", "click", "hiss", "bark", "meow", "chirp", "splash",
        "ribbit", "croak", "growl", "squeak", "squeal", "neigh", "oink", "moo",
        "hee-haw", "cluck", "hoot", "gobble", "buzz"};
        randomIndex = (int) (Math.random() * sounds.length);
        this.sound = sounds[randomIndex];
        // choose two random values for vegetarian
        boolean[] vegetarianValues = {true, false};
        randomIndex = (int) (Math.random() * vegetarianValues.length);
        this.vegetarian = vegetarianValues[randomIndex];
    }

    // getters and setters for all of the attributes
    public String getType() {
        return type;
    }

    public void setType() {
        this.type = type;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs() {
        if (size > 0) { 
            this.legs = legs; 
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize() {
        if (size > 0) { 
            this.size = size; 
        }
    }

    public String getSound() {
        return sound;
    }

    public void setSound() {
        this.sound = sound;
    }

    public boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian() {
        this.vegetarian = vegetarian;
    }

    // toString method 
    @Override
    public String toString() {
        return "Animal [type=" + type + ", color=" + color + ", legs=" + legs + ", size=" + size + ", sound=" + sound
                + ", vegetarian=" + vegetarian + "]";
    }


    // compareTo method that compares the sound of two animals
    @Override
    public int compareTo(Animal other) {
        int result = sound.compareTo(other.getSound()); 
        // if (result == 0) { 
        //     result = color.compareTo(other.getColor()); 
        // }
        if(sortOrder == SortOrder.REVERSE) { 
            result = -result; 
        }
        return result;
    }







}
