package cn.l13z.GeneratorMode.ceiling;

import cn.l13z.GeneratorMode.Matter;
import java.math.BigDecimal;

/**
 * ClassName: LevelOneCeiling.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-05-12 02:38 <br> Description: 一级吊顶 <br>
 * <p>
 * Modification History: <br> - 2024/5/12 AlfredOrlando 一级吊顶 <br>
 */
public class LevelOneCeiling implements Matter {

    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "自带品牌";
    }

    @Override
    public String model() {
        return "一级";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    @Override
    public String desc() {
        return "一个层次的吊顶";
    }
}
