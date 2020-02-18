
public class TaskOne {
    public static void main(String[] args) {

        String ids[]={"CS012002","MECH3303","CS3403","MECH320302","MECH3242303","MECH32302"};
        int csno=0;
        int mechno=0;
        for(String id:ids){
            if(id.startsWith("CS")){
                csno++;
            }else if(id.startsWith("MECH")){
                mechno++;
            }
        }
        System.out.println("TOTAL CS STUDENTS : "+csno);
        System.out.println("TOTAL MECH STUDENTS  :"+mechno);
        
    }
}
