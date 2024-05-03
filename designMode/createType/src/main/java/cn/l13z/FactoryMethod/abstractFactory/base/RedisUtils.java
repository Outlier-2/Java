package cn.l13z.FactoryMethod.abstractFactory.base;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName: RedisUtils.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 10:31 <br> Description: Redis工具类 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando Redis工具类 <br>
 */
@SuppressWarnings("unused")
public class RedisUtils {

    private Logger logger = LoggerFactory.getLogger(RedisUtils.class);

    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String get(String key){
        logger.info("Redis 获取的数据是key:{}",key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        logger.info("Redis写入数据 key：{} val：{}", key, value);
        dataMap.put(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("Redis写入数据 key：{} val：{} timeout：{} timeUnit：{}", key, value, timeout, timeUnit.toString());
        dataMap.put(key, value);
    }

    public void del(String key) {
        logger.info("Redis删除数据 key：{}", key);
        dataMap.remove(key);
    }

}
