import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Club
{
    // An ArrayList to store the members of the club.
    private ArrayList<Membership> members;

    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialize the ArrayList for members.
        members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member); // Add the member to the ArrayList.
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size(); // Return the size of the ArrayList.
    }

    /**
     * Returns the number of members who joined the club in the specified month.
     * @param month The month for which to count the members (1 ... 12).
     * @return The number of members who joined in the specified month.
     *         Returns 0 for invalid input (month out of range).
     */
    public int numberOfMembersInMonth(int month)
    {
        if (month < 1 || month > 12)
        {
            return 0; // Invalid month, return 0.
        }

        int count = 0;
        for (Membership member : members)
        {
            if (member.getMonth() == month)
            {
                count++;
            }
        }
        return count;
    }
}
