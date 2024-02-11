package arrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class SukhrobList<E> implements ListSukhrob<E> {
    private Object[] database;

    public int size;
    private static int copacity = 10;
    public SukhrobList(int size) {
        this.size = size;
        database = new Object[size];
    }
    public SukhrobList() {
        database = new Object[copacity];
    }
    @Override
    public boolean add(E e) {
        insertCopacity();
        Object[] arr = new Object[copacity];
        int k = 0;
        for (int i = 0; i < size(); i++) {
            arr[k++] = database[i];
        }
        arr[k] = e;
        database = arr;
        insertCopacity();
        return true;
    }
    private void insertCopacity() {
        if (copacity - size() <= 0) {
            copacity = (copacity * 3 / 2) + 1;
        }
    }
    @Override
    public boolean remove(E e) {
        int eIndex=-1;
        for (int i = 0; i < size; i++) {
            if(e==database[i]){
                eIndex=i;
                break;
            }
        }
        if(eIndex!=-1){
            for (int i = eIndex; i < size-1; i++) {
                database[i]=database[i+1];
            }
            database[size-1]=null;
            size();
            return true;
        }return false;
    }

    @Override
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if(e==database[i])return true;
        }
        return false;
    }
    public E get(int index){
        for (int i = 0; i < size; i++) {
            if(index==i){
                return (E) database[i];
            }
        }
        return null;
    }

    private int size() {
        int count = 0;
        for (int i = 0; i < database.length; i++) {
            if (database[i] != null) {
                count++;
            }
        }
        size = count;
        return size;
    }

    @Override
    public String toString() {
        Object[] newDatabase = new Object[size()];
        for (int i = 0; i < size(); i++) {
            newDatabase[i] = database[i];
        }
        database=newDatabase;
        return Arrays.toString(database);
    }
}
