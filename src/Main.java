import arrayList.SukhrobList;

public class Main {
    public static void main(String[] args) {


        SukhrobList<Integer>list=new SukhrobList<>();
        System.out.println(list.getSize());

        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(17);
        list.add(18);
        list.add(18);
        list.add(19);
        System.out.println(list.getNewDatabase());
        System.out.println(list.remove(14));
        list.edit(11,0);
        System.out.println(list.getNewDatabase());

        System.out.println(list.getIndex(12));
        System.out.println(list.getIndexEquals(11));

    }
}