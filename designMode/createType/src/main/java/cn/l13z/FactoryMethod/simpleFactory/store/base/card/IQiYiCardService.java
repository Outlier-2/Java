package cn.l13z.FactoryMethod.simpleFactory.store.base.card;

/**
 * ClassName: IQiYiCardService.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-11 02:30 <br> Description: 爱奇艺实现类 <br>
 * <p>
 * Modification History: <br> - 2024/4/11 AlfredOrlando 爱奇艺实现类 <br>
 */
@SuppressWarnings("unused")
public class IQiYiCardService {

    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发了一张爱奇艺会员卡" + bindMobileNumber + "," + cardId);
    }

}
