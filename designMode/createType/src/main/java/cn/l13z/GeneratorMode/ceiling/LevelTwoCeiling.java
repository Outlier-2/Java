package cn.l13z.GeneratorMode.ceiling;

import cn.l13z.GeneratorMode.Matter;
import java.math.BigDecimal;

/**
 * ClassName: LevelTwoCeiling.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-05-12 02:40 <br> Description: 二级吊顶 <br>
 * <p>
 * Modification History: <br> - 2024/5/12 AlfredOrlando 二级吊顶 <br>
 */
public class LevelTwoCeiling implements Matter {

    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "二级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(850);
    }

    @Override
    public String desc() {
        return "两个层次的吊顶，二级吊顶高度一般就往下吊20cm，要是层高很高，也可增加每级的厚度";
    }

}
