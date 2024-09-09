public class cd extends product {
    String artist;
    int numSong;
    String label;

    
    
    public cd() {
        super(); //mengakses Constructor SuperClass
        artist = "";
        numSong = 0;
        label = "";
    }

    public cd(String artist, int numSong, String label) {
        this.artist = artist;
        this.numSong = numSong;
        this.label = label;
    }
    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

   

}
