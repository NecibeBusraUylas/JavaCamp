package Week3.dataAccess.abstracts;

import Week3.entities.Category;

public interface CategoryDao {
    void add(Category category);

    void delete(Category category);

    void update(Category category);
}