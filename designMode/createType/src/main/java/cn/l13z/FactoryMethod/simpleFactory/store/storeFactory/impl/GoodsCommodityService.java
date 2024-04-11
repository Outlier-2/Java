package cn.l13z.FactoryMethod.simpleFactory.store.storeFactory.impl;

import cn.l13z.FactoryMethod.simpleFactory.store.base.goods.DeliverReq;
import cn.l13z.FactoryMethod.simpleFactory.store.base.goods.GoodsService;
import cn.l13z.FactoryMethod.simpleFactory.store.storeFactory.ICommodity;
import com.alibaba.fastjson.JSON;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName: GoodsCommodityService.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 06:26 <br> Description: 商品实现类 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando 商品实现类 <br>
 */
@SuppressWarnings("unused")
public class GoodsCommodityService implements ICommodity {

    private final Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);

    private final GoodsService goodsService = new GoodsService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId,
        Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess = goodsService.deliverGoods(deliverReq);

        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId,
            commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", isSuccess);

        if (!isSuccess) {
            throw new RuntimeException("实物商品发放失败");
        }
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}
