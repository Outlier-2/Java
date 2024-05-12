package cn.l13z.GeneratorMode;

import cn.l13z.GeneratorMode.ceiling.LevelOneCeiling;
import cn.l13z.GeneratorMode.ceiling.LevelTwoCeiling;
import cn.l13z.GeneratorMode.coat.DuluxCoat;
import cn.l13z.GeneratorMode.coat.LiBangCoat;
import cn.l13z.GeneratorMode.floor.ShengXiangFloor;
import cn.l13z.GeneratorMode.tile.DongPengTile;
import cn.l13z.GeneratorMode.tile.MarcoPoloTile;

/**
 * ClassName: Builder.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-05-12 02:50 <br> Description: 建造器 <br>
 * <p>
 * Modification History: <br> - 2024/5/12 AlfredOrlando 建造器 <br>
 */
public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
            // 吊顶，二级顶
            .appendCeiling(new LevelTwoCeiling())
            // 涂料，多乐士
            .appendCoat(new DuluxCoat())
            // 地板，圣象
            .appendFloor(new ShengXiangFloor());
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢田园")

            // 吊顶，二级顶
            .appendCeiling(new LevelTwoCeiling())

            // 涂料，立邦
            .appendCoat(new LiBangCoat())

            // 地砖，马可波罗
            .appendTile(new MarcoPoloTile());
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
            // 吊顶，二级顶
            .appendCeiling(new LevelOneCeiling())
            // 涂料，立邦
            .appendCoat(new LiBangCoat())
            // 地砖，东鹏
            .appendTile(new DongPengTile());
    }
}
