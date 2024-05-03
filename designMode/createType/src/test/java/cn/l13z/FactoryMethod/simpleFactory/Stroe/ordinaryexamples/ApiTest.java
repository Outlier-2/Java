package cn.l13z.FactoryMethod.simpleFactory.Stroe.ordinaryexamples;

import cn.l13z.FactoryMethod.factoryMethod.store.ordinaryexamples.AwardReq;
import cn.l13z.FactoryMethod.factoryMethod.store.ordinaryexamples.AwardRes;
import cn.l13z.FactoryMethod.factoryMethod.store.ordinaryexamples.PrizeController;
import com.alibaba.fastjson.JSON;
import java.util.HashMap;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ApiTest {

    private final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_awardToUser(){
        PrizeController prizeController = new PrizeController();

        System.out.println("模拟开始");

        AwardReq awardReq = new AwardReq();
        awardReq.setUId("10001");
        awardReq.setAwardType(1);
        awardReq.setAwardNumber("EGM1023938910232121323432");
        awardReq.setBizId("791098764902132");
        AwardRes awardRes01 = prizeController.awardToUser(awardReq);
        logger.info("请求参数：{}", JSON.toJSON(awardReq));
        logger.info("测试结果：{}", JSON.toJSON(awardRes01));

        System.out.println("\r\n模拟方法实物商品\r\n");
        // 模拟方法实物商品
        AwardReq req02 = new AwardReq();
        req02.setUId("10001");
        req02.setAwardType(2);
        req02.setAwardNumber("9820198721311");
        req02.setBizId("1023000020112221113");
        req02.setExtMap(new HashMap<String, String>() {{
            put("consigneeUserName", "谢飞机");
            put("consigneeUserPhone", "15200292123");
            put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
        }});

        AwardRes awardRes02 = prizeController.awardToUser(req02);
        logger.info("请求参数：{}", JSON.toJSON(req02));
        logger.info("测试结果：{}", JSON.toJSON(awardRes02));

        System.out.println("\r\n第三方兑换卡(爱奇艺)\r\n");
        AwardReq req03 = new AwardReq();
        req03.setUId("10001");
        req03.setAwardType(3);
        req03.setAwardNumber("AQY1xjkUodl8LO975GdfrYUio");

        AwardRes awardRes03 = prizeController.awardToUser(req03);
        logger.info("请求参数：{}", JSON.toJSON(req03));
        logger.info("测试结果：{}", JSON.toJSON(awardRes03));

    }

}