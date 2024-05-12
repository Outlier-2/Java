package cn.l13z.GeneratorMode.tile;

import cn.l13z.GeneratorMode.Matter;
import java.math.BigDecimal;

/**
 * ClassName: DongPengTile.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-05-12 02:45 <br> Description: 东鹏地板 <br>
 * <p>
 * Modification History: <br> - 2024/5/12 AlfredOrlando 东鹏地板 <br>
 */
public class DongPengTile implements Matter {

    public String scene() {
        return "地砖";
    }

    public String brand() {
        return "东鹏瓷砖";
    }

    public String model() {
        return "10001";
    }

    public BigDecimal price() {
        return new BigDecimal(102);
    }

    public String desc() {
        return "东鹏瓷砖以品质铸就品牌，科技推动品牌，口碑传播品牌为宗旨，2014年品牌价值132.35亿元，位列建陶行业榜首。";
    }

}
