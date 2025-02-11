//Question 5:-Implement multiple inheritance with default method inside interface.




class Document implements Printable, Shareable {
    public String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Printing: " + content);
    }

    @Override
    public void share() {
        System.out.println("Sharing: " + content);
    }
}

public class Fifth {
    public static void main(String[] args) {
        Document doc = new Document("Hello, World!");
        doc.print();
        doc.printTwice();
        doc.share();
        doc.shareWithFriends();
    }
}