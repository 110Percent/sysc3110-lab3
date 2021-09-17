import java.util.ArrayList;

/**
 * SYSC 3110 A
 * Lab 2
 *
 * Address book to manage a list of buddies stores as BuddyInfo objects
 *
 * @author Curtis Davies, #101146353
 * @version 1.0
 */
public class AddressBook {
    // List of buddies to maintain within the book
    private final ArrayList<BuddyInfo> buddies;

    /**
     * Initialize an empty address book
     */
    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    /**
     * Main method; prints "Address Book"
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", 25, "K1S5B6");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    /**
     * Add a buddy to the address book
     *
     * @param buddy BuddyInfo object representing the new buddy
     */
    public void addBuddy(BuddyInfo buddy) {
        this.buddies.add(buddy);
    }

    /**
     * Remove a buddy from the address book
     * Checks based on the buddy's name, so all buddies with the same name as the queried buddy are removed!
     *
     * @param buddy The BuddyInfo object to query for removal
     */
    public void removeBuddy(BuddyInfo buddy) {
        this.buddies.removeIf(currentBuddy -> currentBuddy.getName().equals(buddy.getName()));
    }
}
