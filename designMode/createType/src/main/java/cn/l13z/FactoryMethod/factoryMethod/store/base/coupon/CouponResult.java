package cn.l13z.FactoryMethod.factoryMethod.store.base.coupon;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * ClassName: CouponResult.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 02:33 <br> Description: 茶杯返回类 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando 茶杯返回类 <br>
 */
@SuppressWarnings("unused")
@Data
@AllArgsConstructor
public class CouponResult {

    /**
     * 属性名 编码
     */
    private String code;
    /**
     * 属性名 信息描述
     */
    private String info;
}
