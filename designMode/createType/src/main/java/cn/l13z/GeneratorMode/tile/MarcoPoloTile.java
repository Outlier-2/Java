package cn.l13z.GeneratorMode.tile;

import cn.l13z.GeneratorMode.Matter;
import java.math.BigDecimal;

/**
 * ClassName: MarcoPoloTIle.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-05-12 02:46 <br> Description: 马可波罗瓷砖 <br>
 * <p>
 * Modification History: <br> - 2024/5/12 AlfredOrlando 马可波罗瓷砖 <br>
 */
public class MarcoPoloTile implements Matter {

    public String scene() {
        return "地砖";
    }

    public String brand() {
        return "马可波罗(MARCO POLO)";
    }

    public String model() {
        return "缺省";
    }

    public BigDecimal price() {
        return new BigDecimal(140);
    }

    public String desc() {
        return "“马可波罗”品牌诞生于1996年，作为国内最早品牌化的建陶品牌，以“文化陶瓷”占领市场，享有“仿古砖至尊”的美誉。";
    }

}


