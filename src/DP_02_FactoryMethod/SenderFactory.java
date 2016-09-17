package DP_02_FactoryMethod;


/**
 * Created by wuwg on 2016/8/29.
 */
public class SenderFactory {

    public Sender produceMail(){
        return  new MailSender();
    }
    public Sender produceSms(){
        return  new SmsSender();
    }
}
