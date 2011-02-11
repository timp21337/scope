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

    }
}
