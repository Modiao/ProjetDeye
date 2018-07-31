package pourDotNet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pourDotNet.entite.Lignedeconsommation;

public interface ILigneDeConsommationRepository extends JpaRepository<Lignedeconsommation, Integer>
{
	
}
