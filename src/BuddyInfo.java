/**
 * SYSC 3110 A
 * Lab 1
 * <p>
 * Class to say "Hello" with a given name
 *
 * @author Curtis Davies, #101146353
 * @version 1.0
 */
public class BuddyInfo {
    private final String name;
    private final Integer age;
    private final String postalCode;

    /**
     * Initialize the object with a specified name
     *
     * @param name       Custom name to initialize buddy with
     * @param age        Age of buddy, in years
     * @param postalCode Postal code of buddy as a string
     */
    public BuddyInfo(String name, Integer age, String postalCode) {
        this.name = name;
        this.age = age;
        this.postalCode = postalCode;
    }

    /**
     * Use "Chuck" as the default name
     */
    public BuddyInfo() {
        this("Chuck", 32, "K4A5B2");
    }

    /**
     * Create a new BuddyInfo object with the name "Sneed" and say hello
     */
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Sneed", 23, "K4A6C1");
        System.out.println("Hello " + buddy.getName());
    }

    /**
     * Return the object's name
     *
     * @return Name as a string
     */
    public String getName() {
        return name;
    }

    /**
     * Print the word "funny"
     * Used to test the new Git branch
     */
    void printFunny() {
        System.out.println("funny");
    }
}
