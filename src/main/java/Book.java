public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean checkedOut;
    private String checkedOutTo;

    //region constructor
    public Book (int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.checkedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }
        public Book(int id, String isbn, String title){
            this(id, isbn, title, false, "");
        }
    //endregion

//region getters
public int getId() {
        return id;
}
public void setId(int id){
        this.id = id;
}

public String getIsbn(){
        return isbn;
}
public void setIsbn(String isbn){
        this.isbn = isbn;
}

public String getTitle(){
        return title;
}
public void setTitle(String title){
        this.title = title;
}

public boolean isCheckedOut(){
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
        return true;
}

//endregion


//toString
public String toString(){
        String status = checkedOut ? String.format("Currently checked out to %s", checkedOutTo) : "Available";
        return String.format("#%d | \"%s\" (ISBN %s) - %s", id, title, isbn, status);
}
}
