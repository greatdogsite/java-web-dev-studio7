package org.launchcode.studio7;

public class CD extends BaseDisk{

    private final String diskType = "CD";
    private final Integer rpmLow = 200;
    private final Integer rpmHigh = 500;
    private String artistName;
    private String albumTitle;

    CD(String anArtistName ,String anAlbumTitle, Integer capacity, String contents, String mediaType){
        super(capacity, contents, mediaType);
        this.artistName=anArtistName;
        this.albumTitle=anAlbumTitle;
    }

    @Override
    public void spinDisk() {
        System.out.println("The disk is spinning up from "+ this.rpmLow + " RPMs to " + this.rpmHigh +" RPMs.");
    }

    @Override
    public void powerUp() {
        System.out.println("Powering up..." + super.getMediaType());
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down..." + super.getMediaType());
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
