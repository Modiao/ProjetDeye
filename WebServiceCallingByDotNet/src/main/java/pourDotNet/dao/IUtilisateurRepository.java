package pourDotNet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pourDotNet.entite.Utilisateur;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, String>
{
	
}
