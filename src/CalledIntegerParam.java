/**
 *
 * @author timp
 * @since 11/02/11 23:28
 */
public class CalledIntegerParam {
    void modifyParam(Integer i) {
        System.out.println("param in:" + i);
        i = new Integer(i.intValue() + 1);
        System.out.println("param out:" + i);
    }
}
