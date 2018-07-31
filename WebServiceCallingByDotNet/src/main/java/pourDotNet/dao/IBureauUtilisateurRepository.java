package pourDotNet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pourDotNet.entite.Bureauutilisateur;
import pourDotNet.entite.BureauutilisateurId;

public interface IBureauUtilisateurRepository extends JpaRepository<Bureauutilisateur, BureauutilisateurId>
{
	
}
