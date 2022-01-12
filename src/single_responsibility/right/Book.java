package single_responsibility.right;

public class Book {


    private String author;
    private String title;
    private String text;

    private String replaceWordInText(String wordToReplace, String newWord) {
        return text.replaceAll(wordToReplace, newWord);
    }

    public boolean isWordInText(String word) {
        return text.contains(word);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
