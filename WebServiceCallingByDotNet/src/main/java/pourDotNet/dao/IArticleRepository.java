package pourDotNet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pourDotNet.entite.Article;

public interface IArticleRepository extends JpaRepository<Article, String>
{
	
}
