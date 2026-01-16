import java.util.*;

class User
{
    int userID,balance;
    User(int userID,int balance)
    {
        this.userID=userID;
        this.balance=balance;
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer> uamt=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int userID=sc.nextInt();
            int balance=sc.nextInt();
            uamt.put(userID,balance);
        }
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int fromID=sc.nextInt();
            int toID=sc.nextInt();
            int amt=sc.nextInt();
        if(uamt.containsKey(fromID) && uamt.get(fromID) >= amt)
        {
            uamt.put(fromID,uamt.get(fromID) - amt);
            uamt.put(toID,uamt.getOrDefault(toID,0) + amt);
            System.out.println("Success");
        }
        else
        {
            System.out.println("Failure");
        }
        }
        System.out.println("");
        List<User> users=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:uamt.entrySet())
        {
            users.add(new User(entry.getKey(),entry.getValue()));
        }
        users.sort((a,b)->(a.balance==b.balance)?a.userID-b.userID:a.balance-b.balance);
        for(User user:users)
        {
            System.out.println(user.userID+" "+user.balance);
        }
        sc.close();
    }
}