package message.email.apimessageemail.repositories;

import message.email.apimessageemail.models.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageModel, Long> {
}
