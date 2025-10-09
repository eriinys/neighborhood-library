public class Book {
    private final int id;
    private final String isbn;
    private final String title;
    private boolean checkedOut;
    private String checkedOutTo;

    //region constructor
    public Book (int id, String isbn, String title, boolean checkedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.checkedOut = checkedOut;
        this.checkedOutTo = checkedOutTo;
    }
    //endregion

//region getters
public int getId() {
        return id;}

public String getIsbn(){
        return isbn;
}

public String getTitle(){
        return title;
}

public boolean checkedOut(){
        return  checkedOut;
}
public void setCheckedOut(boolean checkedOut){
        this.checkedOut = checkedOut;
}

public String getCheckedOutTo(){
        return checkedOutTo;
}
public  void setCheckedOutTo(String checkedOutTo){
        this.checkedOutTo = (checkedOutTo == null) ? "" : checkedOutTo;
}
//endregion


//region method
public boolean checkOutName(String name) {
    String borrower = (name == null) ? "" : name;
    if (borrower.isBlank() || this.checkedOut) {
        return false;
    }
    this.checkedOutTo = borrower;
    this.checkedOut = true;
    return true;
}

public boolean checkIn(){
        if(!this.checkedOut)
            return false;
        this.checkedOutTo = "";
        this.checkedOut = false;
        return checkIn();
}
//endregion


//toString
public String toString(){
        String status = checkedOut ? String.format("Currently checked out to %s", checkedOutTo) : "Available";
        return String.format("#%d | \"%s\" (ISBN %s) - %s", id, title, isbn, status);
}
}
