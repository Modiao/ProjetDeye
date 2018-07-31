package pourDotNet.restController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pourDotNet.dao.IExerciceBudgetaireRepository;
import pourDotNet.entite.Exercicebudgetaire;

@RestController
public class ExerciceBudgetaireAPI
{
	@Autowired
	private IExerciceBudgetaireRepository dao;
	
	@RequestMapping(value = "/allExerciceBudgetaires",method=RequestMethod.GET)
	@ResponseBody
	public List<Exercicebudgetaire> listExercices()
	{
		return dao.findAll();
	}
	/*
	@RequestMapping(value = "/allExerciceBudgetaires{num}",method=RequestMethod.GET)
	@ResponseBody
	public Exercicebudgetaire getExoBudgetaireByNum(@PathVariable("num")String num)
	{
		return dao.getExerciceBudgetaireById(num);
	}

	@RequestMapping(value = "/saveExerciceBudgetaire",method=RequestMethod.POST)
	@ResponseBody
	public Boolean saveExercice(@RequestBody Exercicebudgetaire exercice)
	{
		return dao.addExerciceBudgetaire(exercice);
	}
	@RequestMapping(value = "/editExerciceBudgetaire",method=RequestMethod.PUT)
	@ResponseBody
	public Exercicebudgetaire updateUser(@RequestBody Exercicebudgetaire exercice)
	{
		return dao.updateExerciceBudgetaire(exercice);
	}
	@RequestMapping(value = "/deleteExerciceBudgetaire", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteExerciceBudgetaire(@RequestBody String num)
	{		
		dao.deleteExerciceBudgetaire(num);
	}*/
}
