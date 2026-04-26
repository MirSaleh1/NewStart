package l11.homework.task9;

public enum Role {
    ADMIN(true, true),
    EDITOR(false, true),
    VIEWER(false, false);

    private boolean canDelete;
    private boolean canEdit;

    Role(boolean canDelete,boolean canEdit){
        this.canDelete=canDelete;
        this.canEdit=canEdit;
    }
    public  boolean canDelete(){
        return canDelete;
    }
}
