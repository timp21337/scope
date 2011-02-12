/**
 *
 * @author timp
 * @since 11/02/11 23:28
 */
public class CalledIntParam {
    void modifyParam(int i) {
        System.out.println("param in:" + i);
        i++;
        System.out.println("param out:" + i);
    }
}
