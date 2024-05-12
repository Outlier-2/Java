package cn.l13z.GeneratorMode.coat;

import cn.l13z.GeneratorMode.Matter;
import java.math.BigDecimal;

/**
 * ClassName: LiBangCoat.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-05-12 02:43 <br> Description: 立邦 <br>
 * <p>
 * Modification History: <br> - 2024/5/12 AlfredOrlando 立邦 <br>
 */
public class LiBangCoat implements Matter {

    public String scene() {
        return "涂料";
    }

    public String brand() {
        return "立邦";
    }

    public String model() {
        return "默认级别";
    }

    public BigDecimal price() {
        return new BigDecimal(650);
    }

    public String desc() {
        return "立邦始终以开发绿色产品、注重高科技、高品质为目标，以技术力量不断推进科研和开发，满足消费者需求。";
    }

}