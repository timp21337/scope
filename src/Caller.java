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
}
