package com.epam.mjc.stage0;

public class Animal {
    String color;
    int numberOfPaws;
    boolean hasFur;
    public Animal() {

    }
    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }



    public String getDescription (){

        return  "This animal is mostly " + color + ". It has " + isPawsOrPaw() + "and "
                + isHasFurorNo() + "fur.";




    }

    public  String isHasFurorNo() {
        if (hasFur) {
            return "a ";
        }
        return "no ";
    }
    public String isPawsOrPaw(){
        if(numberOfPaws>1){
            return numberOfPaws + " paws ";
        } else if (numberOfPaws == 1) {
            return numberOfPaws + " paw ";

        }
        return " no paw ";
    }


}
