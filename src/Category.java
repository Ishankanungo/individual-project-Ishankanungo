public enum Category {
    Essentials(3),
    Luxury(4),
    Misc(6),
    ;
    int maxValue;
    Category(int value) {
        this.maxValue = value;
    }
}