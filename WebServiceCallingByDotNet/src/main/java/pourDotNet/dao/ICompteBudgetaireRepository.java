package pourDotNet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pourDotNet.entite.Comptebudgetaire;


public interface ICompteBudgetaireRepository extends JpaRepository<Comptebudgetaire, String>
{
	
}
