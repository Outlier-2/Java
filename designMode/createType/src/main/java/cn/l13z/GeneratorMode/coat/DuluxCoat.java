package cn.l13z.GeneratorMode.coat;

import cn.l13z.GeneratorMode.Matter;
import java.math.BigDecimal;

/**
 * ClassName: DuluxCoat.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-05-12 02:42 <br> Description: 多乐士涂料 <br>
 * <p>
 * Modification History: <br> - 2024/5/12 AlfredOrlando 多乐士涂料 <br>
 */
public class DuluxCoat  implements Matter {

    public String scene() {
        return "涂料";
    }

    public String brand() {
        return "多乐士(Dulux)";
    }

    public String model() {
        return "第二代";
    }

    public BigDecimal price() {
        return new BigDecimal(719);
    }

    public String desc() {
        return "多乐士是阿克苏诺贝尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国家，每年全球有5000万户家庭使用多乐士油漆。";
    }

}
