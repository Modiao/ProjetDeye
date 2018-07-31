package pourDotNet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pourDotNet.entite.Historiquedesbudgets;

public interface IHistoriqueDesBudgetsRepository extends JpaRepository<Historiquedesbudgets, Integer>
{
	
}
