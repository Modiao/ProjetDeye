package pourDotNet.restController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pourDotNet.dao.IBureauUtilisateurRepository;
import pourDotNet.entite.Bureauutilisateur;

@RestController
public class BureauUtilisateurAPI
{
	@Autowired
	private IBureauUtilisateurRepository dao;
	
	@RequestMapping(value = "/allBureauUtilisateurs",method=RequestMethod.GET)
	@ResponseBody
	public List<Bureauutilisateur> listBureauUtilisateur()
	{
		return dao.findAll();
	}
	/*
	@RequestMapping(value = "/allBureauUtilisateurs{num}",method=RequestMethod.GET)
	@ResponseBody
	public Bureauutilisateur getBureauUtilisateurByNum(@PathVariable("num")BureauutilisateurId bureauId)
	{
		return dao.getBureauUtilisateurById(bureauId);
	}

	@RequestMapping(value = "/saveBureauUtilisateur",method=RequestMethod.POST)
	@ResponseBody
	public Boolean saveBureauUtilisateur(@RequestBody Bureauutilisateur bureau)
	{
		return dao.addBureauUtilisateur(bureau);
	}
	@RequestMapping(value = "/editBureauUtilisateur",method=RequestMethod.PUT)
	@ResponseBody
	public Bureauutilisateur updateBureauUtilisateur(@RequestBody Bureauutilisateur bureau)
	{
		return dao.updateBureauUtilisateur(bureau);
	}
	@RequestMapping(value = "/deleteBureauUtilisateur", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBureauUtilisateur(@RequestBody BureauutilisateurId bureauId)
	{		
		dao.deleteBureauUtilisateur(bureauId);
	}*/
}
