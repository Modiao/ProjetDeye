package pourDotNet.restController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pourDotNet.dao.IRoleRepository;
import pourDotNet.entite.Role;

@RestController
public class RoleAPI
{
	@Autowired
	private IRoleRepository dao;
	
	@RequestMapping(value = "/allRoles",method=RequestMethod.GET)
	@ResponseBody
	public List<Role> listRoles()
	{
		return dao.findAll();
	}
	/*
	@RequestMapping(value = "/allRoles{num}",method=RequestMethod.GET)
	@ResponseBody
	public Role getRoleByNum(@PathVariable("num")int num)
	{
		return dao.getRoleById(num);
	}

	@RequestMapping(value = "/saveRole",method=RequestMethod.POST)
	@ResponseBody
	public Boolean saveRole(@RequestBody Role role)
	{
		return dao.addRole(role);
	}
	@RequestMapping(value = "/editRole",method=RequestMethod.PUT)
	@ResponseBody
	public Role updateRole(@RequestBody Role role)
	{
		return dao.updateRole(role);
	}
	@RequestMapping(value = "/deleteRole", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRole(@RequestBody int num)
	{		
		dao.deleteRole(num);
	}*/
}
