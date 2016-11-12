public enum Size {
    LARGE("Duże butelkki (2l):"),
    MEDIUM("Średnie butelki (1l):"),
    SMALL("Małe butelki (0.5l):");

    private String description;

    Size(String description) {
        setDescription(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return getDescription();
    }
}
