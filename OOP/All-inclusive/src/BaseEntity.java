public abstract class BaseEntity {

    private final String entityType;

    // Constructor
    public BaseEntity(String entityType) {
        this.entityType = entityType;
    }

    // Getter
    public String getEntityType() {
        return entityType;
    }

    // Abstract Method
    public abstract void display();

}
