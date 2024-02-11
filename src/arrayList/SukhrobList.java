package arrayList;

import java.util.Arrays;

public class SukhrobList<E> {

    Object[] database;
    Object[] newDatabase;
    int size;
    private int indexList = 0;
    private final int copacity = 10;

    public SukhrobList() {
        database = new Object[copacity];
        setSize(copacity);
    }

    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }

    public SukhrobList(int size) {
        this.size = size;
        if (size <= 0) {
            database = new Object[copacity];
            setSize(copacity);
        } else {
            database = new Object[size];
            setSize(size);
        }
    }

    public void ensureCopacity(int newsize) {
        if (copacity <= newsize) {
            newDatabase = new Object[database.length * 3 / 2 + 1];
            database = newDatabase;
        } else if (newsize >= getSize()) {
            newDatabase = new Object[database.length * 3 / 2 + 1];
            database = newDatabase;
        }
    }


    public void add(E element) {
        ensureCopacity(getSize()+1);
        if (getSize() > indexList) {
            database[indexList++] = element;
        } else {
            newDatabase = new Object[getSize() * 3 / 2 + 1];
            newDatabase = database;
            database = newDatabase;
            setSize(getSize() * 3 / 2 + 1);
            System.out.println(getSize());
        }
    }

    public boolean remove(E e) {
        int a = -1;
        for (int i = 0; i < database.length; i++) {
            if (e == database[i]) {
                a = i;
                break;
            }
        }
        for (int i = a; i < database.length - 1; i++) {
            database[i] = database[i + 1];
        }
        if (a != -1) {
            setSize(database.length);
            indexList--;
            System.out.println(getNewDatabase());
            return true;
        }
        return false;
    }

    public void setDatabase(Object[] database) {
        this.database = database;
    }

    public Object[] getDatabase() {
        return database;
    }


    public void edit(E e, int index) {

        for (int i = 0; i < database.length; i++) {
            if(index==i){
                newDatabase[i]=e;
            }
            newDatabase[i]=database[i];
            database=newDatabase;
        }

    }

    public int getIndex(E e) {
        for (int i = 0; i < database.length; i++) {
            if (database[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public boolean getIndexEquals(E e) {
        for (int i = 0; i < database.length; i++) {
            if (database[i] == e) {
                return true;
            }
        }
        return false;
    }

//    private int size() {
//        int count = 0;
//        for (int i = 0; i < getSize(); i++) {
//            if (database[i] == null) {
//                count++;
//            }
//        }
//        setSize(count);
//        return getSize();
//    }

    public String getNewDatabase() {
        return Arrays.toString(Arrays.copyOf(database, indexList));
    }
}
