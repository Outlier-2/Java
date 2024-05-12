package cn.l13z.GeneratorMode;

/**
 * ClassName: IMenu.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-05-12 02:47 <br> Description: 装修包接口 <br>
 * <p>
 * Modification History: <br> - 2024/5/12 AlfredOrlando 装修包接口 <br>
 */
public interface IMenu {

    IMenu appendCeiling(Matter matter); // 吊顶

    IMenu appendCoat(Matter matter);    // 涂料

    IMenu appendFloor(Matter matter);   // 地板

    IMenu appendTile(Matter matter);    // 地砖

    String getDetail();                 // 明细

}
