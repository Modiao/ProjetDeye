package pourDotNet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pourDotNet.entite.Exercicebudgetaire;

public interface IExerciceBudgetaireRepository extends JpaRepository<Exercicebudgetaire, String>
{
	
}
