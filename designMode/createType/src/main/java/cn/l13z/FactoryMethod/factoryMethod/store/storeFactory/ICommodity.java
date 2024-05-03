package cn.l13z.FactoryMethod.factoryMethod.store.storeFactory;

import java.util.Map;

/**
 * ClassName: ICommodity.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 06:19 <br> Description: 公共接口 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando 公共接口 <br>
 */
@SuppressWarnings("unused")
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws  Exception;
}
