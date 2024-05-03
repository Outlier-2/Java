package cn.l13z.FactoryMethod.abstractFactory.base.cuisine.impl;

import cn.l13z.FactoryMethod.abstractFactory.base.CacheService;
import cn.l13z.FactoryMethod.abstractFactory.base.RedisUtils;
import java.util.concurrent.TimeUnit;

/**
 * ClassName: CacheServiceImpl.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 10:28 <br> Description: 缓存实现类 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando 缓存实现类 <br>
 */
@SuppressWarnings("unused")
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key){
        return redisUtils.get(key);

    }

    @Override
    public void  set(String key, String value){
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }

}
