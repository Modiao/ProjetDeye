package pourDotNet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pourDotNet.entite.Budgetcrb;
import pourDotNet.entite.BudgetcrbId;

public interface IBudgetCRBRepository extends JpaRepository<Budgetcrb, BudgetcrbId>
{
	
}
