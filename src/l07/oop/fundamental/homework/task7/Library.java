package l07.oop.fundamental.homework.task7;

public class Library {
    private  Book[]books=new Book[100];
    int count=0;

    public void addBook(Book book){
        books[count++]=book;
    }

    public void printBooks(){
        for (int i = 0; i < count; i++) {
                System.out.println(books[i]);
        }
    }
}
