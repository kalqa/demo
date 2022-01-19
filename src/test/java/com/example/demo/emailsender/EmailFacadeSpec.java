package com.example.demo.emailsender;

import com.example.demo.emailsender.dto.EmailDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class EmailFacadeSpec {

    EmailFacade emailFacade = new EmailConfiguration().emailFacade(new InMemoryEmailRepository());

    @Test
    @DisplayName("should return added email to user by email id")
    public void should_return_correct_email_to_user() {
        // given
        String emailId = "pies";
        emailFacade.addEmail(emailId, "Super pies");

        // when
        EmailDto emailDto = emailFacade.retrieveEmail(emailId);

        // then
        assertThat(emailDto).isEqualTo(new EmailDto("pies", "Super pies"));
    }

}
