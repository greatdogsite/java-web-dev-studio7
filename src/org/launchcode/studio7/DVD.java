package org.launchcode.studio7;

public class DVD extends BaseDisk{
    private final  String diskType = "DVD";
    private final Integer rpmLow = 570;
    private final Integer rpmHigh = 1600;
    String movieTitle;
    String director;

    DVD(String aDirector ,String aMovieTitle, Integer aCapacity, String aContents, String aMediaType){
        super(aCapacity, aContents, aMediaType);
        this.movieTitle=aMovieTitle;
        this.director=aDirector;
    }
    @Override
    public void spinDisk() {
        System.out.println("The disk is spinning up from "+ this.rpmLow + " RPMs to " + this.rpmHigh +" RPMs.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
