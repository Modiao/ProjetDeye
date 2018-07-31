package pourDotNet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pourDotNet.entite.Role;

public interface IRoleRepository extends JpaRepository<Role, Integer>
{
	
}
