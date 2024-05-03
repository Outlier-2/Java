package cn.l13z.FactoryMethod.abstractFactory.base;

import java.util.concurrent.TimeUnit;

/**
 * ClassName: CacheService.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 10:30 <br> Description: 缓存接口 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando 缓存接口 <br>
 */
@SuppressWarnings("unused")
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
