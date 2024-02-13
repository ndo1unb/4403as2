package com.as2;

public class ResourceManager {
    private static ResourceManager instance;
    private int resource;

    private ResourceManager(int rsrc) {
        this.resource = rsrc;
        System.out.println("Manager: initialised, I have " + rsrc + " resource\n");
    }

    public synchronized static ResourceManager getInstance() {
        if(instance == null) {instance = new ResourceManager(3); } //3 resources by default
        return instance;
    }

    public boolean giveResource() {
        if(resource - 1 >= 0) {
            resource--;
            System.out.println("Manager: resource given, " + resource + " resource left");
            return true;
        }
        System.out.println("Manager: Out of resources!");
        return false;
    }

}