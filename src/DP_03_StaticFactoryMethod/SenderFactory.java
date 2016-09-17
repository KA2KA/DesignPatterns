package DP_03_StaticFactoryMethod;


import DP_02_FactoryMethod.MailSender;
import DP_02_FactoryMethod.Sender;
import DP_02_FactoryMethod.SmsSender;

/**
 * Created by wuwg on 2016/8/29.
 */
public class SenderFactory {

    public static Sender produceMail(){
        return  new MailSender();
    }
    public  static Sender produceSms(){
        return  new SmsSender();
    }
}
