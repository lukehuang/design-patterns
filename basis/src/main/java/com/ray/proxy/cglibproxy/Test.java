package com.ray.proxy.cglibproxy;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Test {
    public static void main(String[] args) {
        Customer obj = (Customer) new CglibMeipo().getIntstance(Customer.class);
        obj.findLove();
    }
}
