package pattern.structural.proxy.c;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Test {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
