import arrayList.SukhrobList;

public class Main {
    public static void main(String[] args) {


        SukhrobList<Integer>list=new SukhrobList<>();
        //System.out.println(list.getSize());

        System.out.println(list.add(12));
        System.out.println(list.add(13));
        System.out.println(list.add(14));
        System.out.println(list.add(14));
        System.out.println(list.add(14));
        System.out.println(list.add(14));
        System.out.println(list.add(14));
        System.out.println(list.add(14));
        System.out.println(list.add(14));
        System.out.println(list.add(15));
        System.out.println(list.add(18));
        System.out.println(list.add(18));
        System.out.println(list.add(18));
        System.out.println(list.add(18));
        System.out.println(list.add(18));
        System.out.println(list.add(18));
        System.out.println(list.add(18));
        System.out.println(list.add(18));
        System.out.println(list);
        System.out.println("-----------------");
        System.out.println(list.remove(13));
        System.out.println(list);
        System.out.println("----------------");
        System.out.println(list.contains(1231));
        System.out.println("==================");

        System.out.println(list.get(11));

        //System.out.println(list.getNewDatabase());
//        System.out.println(list.remove(14));
//        list.edit(11,0);
//        System.out.println(list.getNewDatabase());
//
//        System.out.println(list.getIndex(12));
//        System.out.println(list.getIndexEquals(11));

    }
}