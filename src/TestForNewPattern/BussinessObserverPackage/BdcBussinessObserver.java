package TestForNewPattern.BussinessObserverPackage;

import TestForNewPattern.BussinessObserver;

/**
 * 业务数据：不动产的观察者
 *
 * @author LeiShiGuang
 * Date  2018/9/10 10:06
 * @version v1.0
 */
public class BdcBussinessObserver implements BussinessObserver {

    @Override
    public void sendMessage(String message) {
        System.out.println("不动产观察者已经推送数据: " + message);
    }
}
