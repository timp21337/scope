/**
 *
 * @author timp
 * @since 11/02/11 23:28
 */
public class Caller {

   public static void main(String[] args) {
       int i = 0;
       System.out.println("local i before:" + i);
       new CalledIntParam().modifyParam(i);
       System.out.println("local i after:" + i);

       System.out.println();

       Integer j = new Integer(0);

       System.out.println("local j before:" + j);
       new CalledIntegerParam().modifyParam(j);
       System.out.println("local j after:" + j);

       System.out.println();

       int k = 0;
       System.out.println("local k before:" + k);
       modifyParam(k);
       System.out.println("local k after:" + k);

       System.out.println();

       Integer l = new Integer(0);
       System.out.println("local l before:" + l);
       modifyParam(l);
       System.out.println("local l after:" + l);

       System.out.println();

       String s = "in";
       System.out.println("local s before:" + s);
       modifyParam(s);
       System.out.println("local s after:" + s);

       System.out.println();

       NamedObject o = new NamedObject();
       System.out.println("local o.name before:" + o.name);
       modifyParam(o);
       System.out.println("local o.name after:" + o.name);

       System.out.println();

       NamedObject o2 = new NamedObject();
       o2.name = "Set outside";
       System.out.println("local o2.name before:" + o2.name);
       changeParam(o2);
       System.out.println("local o2.name after:" + o2.name);

       System.out.println();


    }



    static void modifyParam(int i) {
        System.out.println("param in:" + i);
        i++;
        System.out.println("param out:" + i);
    }

    static void modifyParam(Integer i) {
        System.out.println("param in:" + i);
        i++;
        System.out.println("param out:" + i);
    }

    static void modifyParam(String s){
        System.out.println("param in:" + s);
        s = "out";
        System.out.println("param in:" + s);
    }

    static void modifyParam(NamedObject o) {
        System.out.println("param in:" + o);
        o.name = "named";
        System.out.println("param in:" + o);
    }
    static void changeParam(NamedObject o) {
        System.out.println("param in:" + o);
        o = new NamedObject();
        o.name ="set inside";
        System.out.println("param in:" + o);
    }
}

class NamedObject {
  String name;

}