package cn.l13z.GeneratorMode.floor;

import cn.l13z.GeneratorMode.Matter;
import java.math.BigDecimal;

/**
 * ClassName: ShengXiangFloor.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-05-12 02:44 <br> Description: 圣象地板 <br>
 * <p>
 * Modification History: <br> - 2024/5/12 AlfredOrlando 圣象地板 <br>
 */
public class ShengXiangFloor implements Matter {

    public String scene() {
        return "地板";
    }

    public String brand() {
        return "圣象";
    }

    public String model() {
        return "一级";
    }

    public BigDecimal price() {
        return new BigDecimal(318);
    }

    public String desc() {
        return "圣象地板是中国地板行业著名品牌。圣象地板拥有中国驰名商标、中国名牌、国家免检、中国环境标志认证等多项荣誉。";
    }

}