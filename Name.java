public class Name {
    private String name, first, middle, last;
    public void Name (String f, String m, String l) {
        first = f;
        middle = m;
        last = l;
        name = f + " " + m + " " + l; }
    public String getFirst() {
        return first; }
    public String getMiddle() {
        return middle; }
    public String getLast() {
        return last; }
    public String firstMiddleLast() {
        return name; }
    public String lastFirstMiddle() {
        return last + " " + first + " " + middle; }
    public boolean equals (String Name, String otherName) {
        if (Name.equalsIgnoreCase(otherName))
            return true;
        else
            return false; }
    public String initials() {
        String finit = first.substring(0, 1); 
        finit = finit.toUpperCase(); //First name initial
        String minit = middle.substring(0, 1);
        minit = minit.toUpperCase(); //Middle name initial
        String linit = last.substring(0, 1);
        linit = linit.toUpperCase(); //Last name initial
        return finit + " " + minit + " " + linit; //returns string of all three initials
         }
    public int length() {
        String nameNoSpace = first + middle + last;
        return nameNoSpace.length(); }
    }