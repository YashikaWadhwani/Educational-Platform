import java.io.*;

class Comments implements Serializable {
    private String author;
    private String content;

    public Comments(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "[" + author + "]: " + content;
    }
}