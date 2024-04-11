package cn.l13z.FactoryMethod.simpleFactory.store.storeFactory.impl;

import cn.l13z.FactoryMethod.simpleFactory.store.base.card.IQiYiCardService;
import cn.l13z.FactoryMethod.simpleFactory.store.storeFactory.ICommodity;
import com.alibaba.fastjson.JSON;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName: CardCommodityService.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 06:26 <br> Description: 优惠卡商品服务类 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando 优惠卡商品服务类 <br>
 */
@SuppressWarnings("unused")
public class CardCommodityService implements ICommodity {

    private final Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    // 模拟注入
    private final IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId,
        Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId,
            commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }

}
