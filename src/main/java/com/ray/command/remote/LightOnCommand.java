package com.ray.command.remote;

import com.ray.command.Command;
import com.ray.command.furniture.Light;

/**
 * 实现产品的命令接口
 *
 * @author leishiguang
 * date  2018/8/14 13:37
 * @version v1.0
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
