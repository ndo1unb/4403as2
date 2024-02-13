package com.as2;

public class Demo {
    public static void main(String[] args) {

        //ResourceManager rm = new ResourceManager();
        ResourceManager rm = ResourceManager.getInstance();

        ResourceUser one = new ResourceUser("one");
        one.getResource(rm); one.getResource(rm);

        ResourceUser two = new ResourceUser("two");
        two.getResource(rm); two.getResource(rm);
    }
}
