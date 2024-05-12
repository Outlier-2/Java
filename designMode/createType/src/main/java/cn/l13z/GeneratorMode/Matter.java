package cn.l13z.GeneratorMode;

import java.math.BigDecimal;

/**
 * ClassName: Matter.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-05-12 02:34 <br> Description: 生成器模式 <br>
 * <p>
 * Modification History: <br> - 2024/5/12 AlfredOrlando 生成器模式 <br>
 */
public interface Matter {

    /**
     * 场景
     * @return
     */
    String scene();

    /**
     * 品牌
     * @return
     */
    String brand();

    /**
     * 型号
     * @return
     */
    String model();

    /**
     * 价格
     * @return
     */
    BigDecimal price();

    /**
     * 描述
     * @return
     */
    String desc();

}
