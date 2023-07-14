package hw_36_javaEE_patterns.dataTransferObject;

import com.java_ee_patterns.dto.Employee;
import com.java_ee_patterns.dto.EmployeeDTO;

public class DtoMapper {
    public static ArticleDTO fromArticleToDTO(Article article){
        ArticleDTO articleDTO = new ArticleDTO();
        articleDTO.setAuthor(article.getAuthor());
        articleDTO.setTitle(article.getTitle());
        articleDTO.setContent(article.getContent());
        return articleDTO;
    }
}
