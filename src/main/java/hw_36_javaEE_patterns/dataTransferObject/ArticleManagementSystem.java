package hw_36_javaEE_patterns.dataTransferObject;

import static hw_36_javaEE_patterns.dataTransferObject.DtoMapper.fromArticleToDTO;

public class ArticleManagementSystem {
    public void saveArticle(Article article) {
        // logic for db
        ArticleDTO articleDTO = fromArticleToDTO(article);
        System.out.println("Saving article: " + articleDTO.getTitle());
    }

    public ArticleDTO getArticle(Article article) {
        // logic for db
        String author = "Agata Christy";
        String content = "Content...";
        String title = "title...";
        Article article1 = new Article(title, author, content);
        ArticleDTO articleDTO = fromArticleToDTO(article1);
        return articleDTO;
    }
}
