interface Printable {
    void print();

    default void printTwice() {
        print();
        print();
    }
}

interface Shareable {
    void share();

    default void shareWithFriends() {
        share();
        System.out.println("Shared with friends!");
    }
}
