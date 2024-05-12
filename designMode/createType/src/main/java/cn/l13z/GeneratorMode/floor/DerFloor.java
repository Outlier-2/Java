package cn.l13z.GeneratorMode.floor;

import cn.l13z.GeneratorMode.Matter;
import java.math.BigDecimal;

/**
 * ClassName: DerFloor.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-05-12 02:43 <br> Description: 德尔地板 <br>
 * <p>
 * Modification History: <br> - 2024/5/12 AlfredOrlando 德尔地板 <br>
 */
public class DerFloor implements Matter {

    public String scene() {
        return "地板";
    }

    public String brand() {
        return "德尔(Der)";
    }

    public String model() {
        return "A+";
    }

    public BigDecimal price() {
        return new BigDecimal(119);
    }

    public String desc() {
        return "DER德尔集团是全球领先的专业木地板制造商，北京2008年奥运会家装和公装地板供应商";
    }

}