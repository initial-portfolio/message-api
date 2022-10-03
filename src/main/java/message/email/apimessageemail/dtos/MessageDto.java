package message.email.apimessageemail.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class MessageDto {

    @NotBlank
    private String name;
    @NotBlank
    private String phoneNumber;
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String message;


}
