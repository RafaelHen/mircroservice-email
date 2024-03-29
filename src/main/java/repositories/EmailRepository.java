package repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {

}
