package pattern.structural.decorator.human;

/**
 * 定义被装饰者，被装饰者的初始状态
 *
 * @author leishiguang
 * date  2018/10/2 9:56
 * @version v1.0
 */
public class Person implements Human {
    @Override
    public void wearClothes() {
        System.out.println("穿什么呢。。");
    }

    @Override
    public void walkToWhere() {
        System.out.println("去哪里呢。。");
    }
}
