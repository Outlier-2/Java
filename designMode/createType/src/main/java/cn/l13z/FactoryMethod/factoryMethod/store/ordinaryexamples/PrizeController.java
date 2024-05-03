package cn.l13z.FactoryMethod.factoryMethod.store.ordinaryexamples;

import cn.l13z.FactoryMethod.factoryMethod.store.base.card.IQiYiCardService;
import cn.l13z.FactoryMethod.factoryMethod.store.base.coupon.CouponResult;
import cn.l13z.FactoryMethod.factoryMethod.store.base.coupon.CouponService;
import cn.l13z.FactoryMethod.factoryMethod.store.base.goods.DeliverReq;
import cn.l13z.FactoryMethod.factoryMethod.store.base.goods.GoodsService;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName: PrizeController.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 01:48 <br> Description: 价格控制类 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando 价格控制类 <br>
 */

@SuppressWarnings("unused")
public class PrizeController {

    private final Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public AwardRes awardToUser(AwardReq awardReq) {
        String reqJson = JSON.toJSONString(awardReq);
        AwardRes awardRes = null;

        try {
            logger.info("奖品发放开始{}。req:{}", awardReq.getUId(), reqJson);

            if (awardReq.getAwardType() == 1) {
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(awardReq.getUId(),
                    awardReq.getAwardNumber(), awardReq.getBizId());

                if ("0000".equals(couponResult.getCode())) {
                    awardRes = new AwardRes("0000", "发奖成功");
                } else {
                    awardRes = new AwardRes("0001", couponResult.getInfo());
                }

            } else if (awardReq.getAwardType() == 2) {
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = new DeliverReq();
                deliverReq.setUserName(queryUserName(awardReq.getUId()));
                deliverReq.setUserPhone(queryUserPhoneNumber(awardReq.getUId()));
                deliverReq.setSku(awardReq.getAwardNumber());
                deliverReq.setOrderId(awardReq.getBizId());
                deliverReq.setConsigneeUserName(awardReq.getExtMap().get("consigneeUserName"));
                deliverReq.setConsigneeUserPhone(awardReq.getExtMap().get("consigneeUserPhone"));
                deliverReq.setConsigneeUserAddress(
                    awardReq.getExtMap().get("consigneeUserAddress"));

                Boolean isSuccess = goodsService.deliverGoods(deliverReq);

                if (isSuccess) {
                    awardRes = new AwardRes("0000", "发放成功");
                } else {
                    awardRes = new AwardRes("0001", "发放失败");
                }
            } else if (awardReq.getAwardType() == 3) {
                String bindMobileNumber = queryUserPhoneNumber(awardReq.getUId());
                IQiYiCardService iQiYiCardService = new IQiYiCardService();
                iQiYiCardService.grantToken(bindMobileNumber, awardReq.getAwardNumber());
                awardRes = new AwardRes("0000", "发放成功");

            }
            logger.info("发奖完毕{}", awardReq.getUId());
        } catch (Exception e) {
            logger.error("奖品发放失败{}。req:{}", awardReq.getUId(), reqJson, e);
            awardRes = new AwardRes("0001", e.getMessage());
        }
        return awardRes;
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}
