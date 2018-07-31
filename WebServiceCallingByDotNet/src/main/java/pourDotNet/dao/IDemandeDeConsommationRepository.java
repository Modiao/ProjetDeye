package pourDotNet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pourDotNet.entite.Demandedeconsommation;

public interface IDemandeDeConsommationRepository extends JpaRepository<Demandedeconsommation, Integer>
{
	
}
