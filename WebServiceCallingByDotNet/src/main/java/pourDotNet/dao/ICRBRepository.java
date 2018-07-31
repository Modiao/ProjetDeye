package pourDotNet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pourDotNet.entite.Crb;

public interface ICRBRepository extends JpaRepository<Crb, String>
{
	
}
