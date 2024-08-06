package nl.smallproject.www.testspring04.repositories;

import nl.smallproject.www.testspring04.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
