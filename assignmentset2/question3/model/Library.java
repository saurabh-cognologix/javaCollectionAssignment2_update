package corejava.collection.assignmentset2.question3.model;

public class Library {
    private String productName;
    private String libraryName;
    private Integer version;

    public Library(String productName, String libraryName, Integer version) {
        this.productName = productName;
        this.libraryName = libraryName;
        this.version = version;
    }

    public Library() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        String placeholder = "productName:{0}, libraryName:{1}, version:{2}";
        return java.text.MessageFormat.format(placeholder,productName,libraryName,version);
    }
}
