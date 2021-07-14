public class DuplicateProductException extends Exception{
    private final int addId;

    public DuplicateProductException(int addId) {
        this.addId = addId;
    }

    @Override
    public String getMessage() {
        return "A product with ID (" + addId + ") already exists in the store";
    }
}
