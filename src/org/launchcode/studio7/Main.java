package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        BaseDisk cd = new CD("PawPaw Rod" , "PawPaws Hits", 500, "Lots of Songs", "Music");
        BaseDisk dvd = new DVD("Earl" ,"Earl Goes to LaunchCode", 800, "A long Movie", "Movie");
        cd.powerUp();
        dvd.powerUp();
        cd.spinDisk();
        cd.writeData();
        cd.readData();
        dvd.spinDisk();
        dvd.writeData();
        dvd.readData();
        cd.shutDown();
        dvd.shutDown();
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
