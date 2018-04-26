package builder.javamail;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class MailSender {
    private static MimeMessage message;

    public static void main(String[] args) {
        //SMTP服务器地址
        String smtpHost = "smtp.qq.com";
        //发送者邮件地址
        String from = "910376287@qq.com";
        //接受者地址
        String to = "15521227899@163.com";
        Properties pros = new Properties();
        pros.put("mail.smtp.host", smtpHost);
        Session session = Session.getDefaultInstance(pros, null);
        try {
            InternetAddress[] address = {new InternetAddress(to)};
            //创建message对象
            message = new MimeMessage(session);
            //建造发件人位元址零件
            message.setFrom(new InternetAddress(from));
            //建造收件人位元址零件
            message.setRecipients(Message.RecipientType.TO, address);
            //建造主题零件
            message.setSubject("Hello from yanglei");
            //建造发送时间零件
            message.setSentDate(new Date());
            //建造内容零件
            message.setText("Welcome to Beijing!");

            //发送邮件，即建造者模式中的产品返回方法retrieveResult()
            Transport.send(message);
            System.out.println("email has been sent");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
