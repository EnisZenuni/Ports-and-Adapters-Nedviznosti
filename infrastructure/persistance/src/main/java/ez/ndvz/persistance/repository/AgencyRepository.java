package ez.ndvz.persistance.repository;

import ez.ndvz.persistance.entity.AgencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AgencyRepository extends JpaRepository<AgencyEntity, Long> {
    Optional<AgencyEntity> findByEmail(String email);
}
