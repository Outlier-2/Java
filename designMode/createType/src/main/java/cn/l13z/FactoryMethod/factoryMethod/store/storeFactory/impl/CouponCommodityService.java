package cn.l13z.FactoryMethod.factoryMethod.store.storeFactory.impl;

import cn.l13z.FactoryMethod.factoryMethod.store.storeFactory.ICommodity;
import cn.l13z.FactoryMethod.factoryMethod.store.base.coupon.CouponResult;
import cn.l13z.FactoryMethod.factoryMethod.store.base.coupon.CouponService;
import com.alibaba.fastjson.JSON;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName: CouponCommodityService.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 06:26 <br> Description: 茶杯商品服务类 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando 茶杯商品服务类 <br>
 */
@SuppressWarnings("unused")
public class CouponCommodityService implements ICommodity {
    private final Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private final CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
//        if ("0000".equals(couponResult.getCode())) {
//            throw new RuntimeException(couponResult.getInfo());
//        }
    }
}
