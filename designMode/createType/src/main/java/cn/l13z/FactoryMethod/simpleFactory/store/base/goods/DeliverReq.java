package cn.l13z.FactoryMethod.simpleFactory.store.base.goods;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: DeliverReq.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 02:39 <br> Description: 快递请求类 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando 快递请求类 <br>
 */
@SuppressWarnings("unused")
@NoArgsConstructor
@Data
public class DeliverReq {

    /**
     * 属性名 用户姓名
     */
    private String userName;
    /**
     * 属性名 用户手机号码
     */
    private String userPhone;
    /**
     * 属性名 商品SKU
     */
    private String sku;
    /**
     * 属性名 订单ID
     */
    private String orderId;
    /**
     * 属性名 收货人姓名
     */
    private String consigneeUserName;
    /**
     * 属性名 收货人手机号码
     */
    private String consigneeUserPhone;
    /**
     * 属性名 收货人地址
     */
    private String consigneeUserAddress;
}
