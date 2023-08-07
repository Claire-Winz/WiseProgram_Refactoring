package Entity;

public class Entity {

    private int numId;
    private String wise;
    private String author;

    public Entity(int numId, String wise, String author) {
        this.numId = numId;
        this.wise = wise;
        this.author = author;
    }

    public int getNumId() {
        return numId;
    }

    public String getWise() {
        return wise;
    }

    public String getAuthor() {
        return author;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public void setWise(String wise) {
        this.wise = wise;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return numId + " / " + author + " / " + wise;
    }
}
