package cn.l13z.FactoryMethod.factoryMethod.store.base.goods;

import com.alibaba.fastjson.JSON;

/**
 * ClassName: GoodsService.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 02:39 <br> Description: 商品服务类 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando 商品服务类 <br>
 */
@SuppressWarnings("unused")
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货一个" + JSON.toJSONString(req));
        return true;
    }

}
