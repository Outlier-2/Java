package cn.l13z.FactoryMethod.simpleFactory.store.storeFactory;

import cn.l13z.FactoryMethod.simpleFactory.store.storeFactory.impl.CardCommodityService;
import cn.l13z.FactoryMethod.simpleFactory.store.storeFactory.impl.CouponCommodityService;
import cn.l13z.FactoryMethod.simpleFactory.store.storeFactory.impl.GoodsCommodityService;

/**
 * ClassName: StoreFactory.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 06:18 <br> Description: 工厂类 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando 工厂类 <br>
 */
@SuppressWarnings("unused")
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        switch (commodityType) {
            case 1:
                return new CardCommodityService();
            case 2:
                return new CouponCommodityService();
            case 3:
                return new GoodsCommodityService();
            default:
                return null;
        }
    }
}
