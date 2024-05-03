package cn.l13z.FactoryMethod.abstractFactory.base.matter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName: IIR.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 10:30 <br> Description: IIR类 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando IIR类 <br>
 */
@SuppressWarnings("unused")
public class IIR {

    private final Logger logger = LoggerFactory.getLogger(IIR.class);

    private final Map<String, String> dataMap = new ConcurrentHashMap<String, String>();

    public String get(String key) {
        logger.info("IIR获取数据 key：{}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        logger.info("IIR写入数据 key：{} val：{}", key, value);
        dataMap.put(key, value);
    }

    public void setExpire(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("IIR写入数据 key：{} val：{} timeout：{} timeUnit：{}", key, value, timeout,
            timeUnit.toString());
        dataMap.put(key, value);
    }

    public void del(String key) {
        logger.info("IIR删除数据 key：{}", key);
        dataMap.remove(key);
    }

}
