import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    // Define any necessary fields here ...
    
    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // question 1
        members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        // question 3
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        //question 2  
        return members.size();
    }
    
    public int joinedInMonth(int month){
        // question 4
        if (month < 1 || month > 12){
            System.out.println("Month cannot be outside 1 to 12");
            return 0;
        } else {
            int count = 0;
            for (Membership m : members){
                if (m.getMonth() == month ){
                    count++;
                }
            }
            return count;
        }
    }
}
