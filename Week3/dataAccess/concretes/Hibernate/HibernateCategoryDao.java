package Week3.dataAccess.concretes.Hibernate;

import Week3.dataAccess.abstracts.CategoryDao;
import Week3.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Category added with Hibernate: " + category.getCategoryName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Category deleted with Hibernate: "+ category.getCategoryName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Category updated with Hibernate: " + category.getCategoryName());
    }
}