package org.launchcode.studio7;

public abstract class BaseDisk  implements OpticalDisk{
    private Integer capacity;
    private String contents;
    private String mediaType;

    BaseDisk(Integer aCapacity, String aContents, String aMediaType){
        this.capacity=aCapacity;
        this.contents=aContents;
        this.mediaType=aMediaType;
    }

    public abstract void spinDisk();

    public void writeData() {
        System.out.println("Writing data to " + this.mediaType);
    }

    public void readData(){
        System.out.println("Reading data from " + this.mediaType);
    }

    @Override
    public void powerUp() {
        System.out.println("Powering up...");
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down...");
    }
}
