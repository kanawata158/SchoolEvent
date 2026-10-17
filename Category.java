public class Category {
    private String categoryName;
    private String description;

    public Category (String name, String description){
        this.categoryName = name;
        this.description = description;
    }

    public String getCategoryName(){
        return categoryName;
    }

    public String getDescription(){
        return description;
    }
}

