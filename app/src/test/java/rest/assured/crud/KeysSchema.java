package rest.assured.crud;

public enum KeysSchema {
    ID("id"),
    CREATED_AT("createdAt"),
    NAME("name"),
    AVATAR("avatar");

    public final String label;

    KeysSchema(String label) {
        this.label = label;
    }
}
