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
 *         <p>
 *         Created: 2024-05-12 02
 *         50 <br>
 *         Description: 建造器 <br>
 *         <p>
 * 
 *         Modification History: <br>
 *         - 2024/5/12 AlfredOrlando 建造器 <br>
 */
public class Builder {

    Menu leve rn new DecorationPackageMenu(area,"豪
    // 吊顶
    .appendCeiling(new Level
    // 涂
    .appendCoat(new DuluxCoat())
    // 地板，圣象
    .appendFloor(new ShengXiangFloor());}

    rn new De

    .app

    .appen

    // 地砖，马可波罗
    .appendTile(new MarcoPoloTile());}

    Menu leve rn new DecorationPackageMenu(area,"现
    // 吊
    .appendCeiling(new LevelO
    // 涂
    .appendCoat(new LiBangCoat())
    // 地砖，东鹏

    class Generator {

        /**
         * Product
         */
        public class Product {

            private String part2;

            public void setPart(String part1 )
            { this.part1 = part;}

            public void setPart2(String part2)
            {this.part2 = part2;}


        }

        /**
         * Builder
 
         */
        public interface Builder {
            void buildPart1();
            void buildPart2();           
            Product build();
            
        }
    }

}