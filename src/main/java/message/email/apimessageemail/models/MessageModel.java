package message.email.apimessageemail.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TB_MESSAGE")
public class MessageModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String phoneNumber;
    private String email;
    @Column(columnDefinition = "TEXT")
    private String message;
    private LocalDateTime createdAt;


}
