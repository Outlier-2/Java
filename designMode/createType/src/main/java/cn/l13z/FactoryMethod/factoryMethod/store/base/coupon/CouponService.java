package cn.l13z.FactoryMethod.factoryMethod.store.base.coupon;

/**
 * ClassName: CouponService.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 02:34 <br> Description: 茶杯服务类 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando 茶杯服务类 <br>
 */
@SuppressWarnings("unused")
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发一张优惠卷" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("000", "发放成功");
    }
}
