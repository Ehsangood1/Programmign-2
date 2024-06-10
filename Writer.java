public class Writer {
private String note;
    public Writer (String note){
        this.note = note.toUpperCase();
    }

    public String toString(){
        return note;
    }
}
