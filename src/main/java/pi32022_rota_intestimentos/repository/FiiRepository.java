package pi32022_rota_intestimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pi32022_rota_intestimentos.entity.Fii;

import java.util.Optional;

@Repository
public interface FiiRepository extends JpaRepository<Fii, Long>{
    Optional<Fii> findByName(String name);
}
