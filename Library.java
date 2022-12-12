import java.util.ArrayList;

public class Library {
    ArrayList <Book> list;
    Library(){
        list=new ArrayList<Book>();
    }
    void add(Book s){
        list.add(s);
    }
    void sortByName(){
        list.sort(Book.NameComparator);
    }
    void sortByYear(){
        list.sort(Book.YearComparator);
    }
    void deleteInRange(int y1,int y2){
        for (int i=0;i< list.size();){
            if (list.get(i).getYear()>y1 && list.get(i).getYear()<y2)
                list.remove(i);
            else i++;
        }
    }
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i< list.size(); i++)
            s += list.get(i).toString()+"\n";
        return s;
    }
}