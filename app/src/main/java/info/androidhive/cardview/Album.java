package info.androidhive.cardview;

/**
 * Created by Lincoln on 18/05/16.
 */
public class Album {
    private String name;
    private int thumbnail;
    private String duration;

    public Album() {
    }

    public Album(String name, String Duration, int thumbnail) {
        this.name = name;
        this.duration = Duration;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumOfSongs() {
        return duration;
    }

    public void setNumOfSongs(String Duration) {
        this.duration = Duration;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
