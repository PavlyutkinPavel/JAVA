package hw_36_javaEE_patterns.dataTransferObject;

public class ArticleDTO {
    private String title;
    private String author;
    private String content;

    public ArticleDTO(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }
    public ArticleDTO() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
