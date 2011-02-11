/**
 *
 * @author timp
 * @since 11/02/11 23:28
 */
public class CalledIntegerParam {
    void modifyParam(Integer i) {
        System.out.println("Param in:" + i);
        i = i.intValue() + 1;
        System.out.println("Param out:" + i);
    }
}
