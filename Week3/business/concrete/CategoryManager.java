package Week3.business.concrete;

import Week3.business.abstracts.CategoryService;
import Week3.core.Logger;
import Week3.dataAccess.abstracts.CategoryDao;
import Week3.entities.Category;

public class CategoryManager implements CategoryService {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private Category[] categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[] categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    @Override
    public void add(Category category) throws Exception {
        for (Category categories : categories){
            if(categories.getCategoryName() == category.getCategoryName() && categories!=category){
                throw new Exception(category.getCategoryName() + " Category name used before. Enter a new category name.");
            }
        }
        categoryDao.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }
}
