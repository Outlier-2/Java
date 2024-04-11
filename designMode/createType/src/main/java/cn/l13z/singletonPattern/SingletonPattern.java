package cn.l13z.singletonPattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName:     SingletonPattern.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * <p>
 * Created:  2024-04-05 05:57 <br> Description: 单例模式 <br>
 * <p>
 * <p>
 * Modification History: <br> - 2024/4/5 AlfredOrlando 单例模式 <br>
 */
@SuppressWarnings("unused")
public class SingletonPattern {

    public static Map<String, String> cache = new ConcurrentHashMap<>();

}


