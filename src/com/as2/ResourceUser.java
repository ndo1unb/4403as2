package com.as2;

public class ResourceUser {
    private String identifier;
    private int resource;

    public ResourceUser(String id) {
        this.resource = 0;
        this.identifier = id;
    }

    public void announceResource() {
        System.out.println(identifier+ ": I currently have " + resource + " resource\n");
    }

    public void getResource(ResourceManager rm) {
        if(rm.giveResource()) {
            resource++;
            System.out.println(identifier + ": Resource obtained.");
        }
        else { System.out.println(identifier + ": Resource request failed!"); }
        announceResource();
    }
}
