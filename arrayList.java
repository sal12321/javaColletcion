
import java.sql.SQLOutput;
import java.util.* ;
class myComInt implements Comparator<Integer> {
    @Override
    public int compare(Integer a , Integer b){
        return b-a ;
    }



}class myComStr implements Comparator<String> {
        @Override
    public int compare(String a , String b){
        return b.compareToIgnoreCase(a) ;
    }


}
public class arrayList{


    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>() ;
        ArrayList<Integer> l2 = new ArrayList<>() ;
        System.out.println(l1.contains(12));




        l1.add(112) ;
        l1.add(243) ; /// adding values in arraylist
        l1.add(123) ;
        l1.add(67) ; // after 123


        l2.add(56) ;
        l2.add(2433) ;
        l2.add(1233) ;
        l2.add(67345) ;

    
    // l1.addAll(3, l2) ; // add from index 3 ...
    l1.addAll( l2)  ;// add all the elements present in l2 arrarlist
    System.out.println("size of l1 is " + l1.size());


    // returns the element at the index 9
    System.out.println("element at index 3 : " + l1.get(3) ); 


    // remove all the elements present in arrayList in l2
    l1.removeAll(l2) ;
    System.out.println("size of l1 is " + l1.size());
    

    // removeIf method to remove the values for the given condition ....
    // lambda expression
    l1.removeIf(n ->(n%2 == 0 )) ;
    System.out.println("size of l1 is " + l1.size());

for(int x : l1){
    System.out.println(x +" \n");
}

    // copy to another array object and print it/
    Object[] arr = l1.toArray();
    for (Object obj : arr) {
        System.out.println(obj);  // Output: Apple, Banana, Orange
    }
    //   retuen the index of the given element 
    // -1 if not found



//        System.err.println(l1.indexOf(12900));
//    l1.remove(12); // we provide the index
//        l1.add(12,12); index out of bound
        System.out.println(l1);


    ArrayList<Integer> ar = new ArrayList<>(10);
    ar.add(12);
    ar.add(13);
    ar.add(14);
    ar.add(15);
    System.out.println(ar);

    ar.remove(Integer.valueOf(12));
        System.out.println(ar);
        ar.sort(null);
        System.out.println(ar);
ar.sort(new myComInt() );
        System.out.println(ar);


        System.out.println("---------------------");

        ArrayList<Integer> l = new ArrayList<>();
        l.add(123);
        l.add(1683);
        l.add(123);
        l.add(1212);
        l.add(132123);
        l.add(12342);
        l.sort(null);
        System.out.println(l);
        l.sort(new myComInt());
        System.out.println(l);

        System.out.println("----------------");
        ArrayList<String> st = new ArrayList<>() ;
        st.add("banana");
        st.add("apple");
        st.add("cake");
        st.add("dog");
        st.add("be");
        st.sort(new myComStr());
        System.out.println(st);
        System.out.println("-------------------");
        System.out.println("lamda");
        System.out.println("asc");
        st.sort((a , b) ->  a.compareTo(b)) ;
        System.out.println(st);
        System.out.println("dsc");

        st.sort((a , b) ->  b.compareTo(a)) ;
        System.out.println(st);

System.out.println("length  wise");

        st.sort((a , b) ->  a.length() - b.length()) ;
        System.out.println(st);

        System.out.println(";;;;;;;;;;;;;;;;;");
//        Comparator<ArrayList<String>> comparator = Comparator.comparing(st) ;
//        Comparator<ArrayList<String>> comparator1 = Comparator.comparing(st).reversed() ;

    }

}