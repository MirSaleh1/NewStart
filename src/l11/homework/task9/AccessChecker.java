package l11.homework.task9;

public class AccessChecker {

    public static boolean canUserDelete(User user){
        if (user.role.canDelete()){
            System.out.println("deleting");
            return true;
        }
        return false;
    }
}
