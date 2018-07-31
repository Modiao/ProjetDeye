package pourDotNet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pourDotNet.entite.Comptegeneral;

public interface ICompteGeneralRepository extends JpaRepository<Comptegeneral, String>
{
	
}
