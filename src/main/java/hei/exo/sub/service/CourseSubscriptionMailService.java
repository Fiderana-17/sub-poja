package hei.exo.sub.service;

import hei.exo.sub.mail.Email;
import hei.exo.sub.mail.Mailer;
import hei.exo.sub.model.Course;
import hei.exo.sub.model.User;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseSubscriptionMailService {

    private final Mailer mailer;

    public void sendConfirmation(User user, Course course) throws AddressException {
        InternetAddress recipient = new InternetAddress(user.getEmail());

        String body =
                """
                <p>Hello %s,</p>
            
                <p>Your registration for the course <strong>%s</strong> has been confirmed.</p>
            
                <p>Best regards,<br>The Team</p>
                """
                        .formatted(user.getFirstName(), course.getTitle());

        Email email =
                new Email(
                        recipient,
                        List.of(),
                        List.of(),
                        "Course subscription confirmation",
                        body,
                        List.of());

        mailer.accept(email);
    }
}