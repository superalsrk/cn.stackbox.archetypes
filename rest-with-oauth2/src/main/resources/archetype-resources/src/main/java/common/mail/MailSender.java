package ${package}.common.mail;

import org.springframework.scheduling.annotation.Async;


public interface MailSender {

    @Async
    void send(String to, String subject, String body);
}
