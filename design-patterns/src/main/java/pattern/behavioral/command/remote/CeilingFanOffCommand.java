package pattern.behavioral.command.remote;


import pattern.behavioral.command.Command;
import pattern.behavioral.command.furniture.CeilingFan;

/**
 * 实现产品的命令接口
 *
 * @author leishiguang
 * date  2018/8/14 14:26
 * @version v1.0
 */
public class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
