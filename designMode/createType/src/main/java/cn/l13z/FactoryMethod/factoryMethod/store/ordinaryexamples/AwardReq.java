package cn.l13z.FactoryMethod.factoryMethod.store.ordinaryexamples;

import java.util.Map;
import lombok.Data;

/**
 * ClassName: AwardReq.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 01:47 <br> Description: 奖品请求类额 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando 奖品请求类额 <br>
 */
@SuppressWarnings("unused")
@Data
public class AwardReq {

    /**
     * 属性名 用户唯一ID
     */
    private String uId;
    /**
     * 属性名 奖品类型
     */
    private Integer awardType;
    /**
     * 属性名 奖品编号
     */
    private String awardNumber;
    /**
     * 属性名 业务ID
     */
    private String bizId;
    /**
     * 属性名 拓展信息
     */
    private Map<String,String> extMap;

}
