public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String time="";
        int minutesToAdd=0,hh=0,mm=0;
        int totalHours=0, totalMinutes=0;
        int newHours=0, newMinutes=0;
        time= args[0];
        String[] parts = time.split(":");
        hh=Integer.parseInt(parts[0]);
        mm=Integer.parseInt(parts[1]);
        minutesToAdd=Integer.parseInt(args[1]);
        totalMinutes = (hh*60) + mm + minutesToAdd;
        totalHours = totalMinutes / 60;
        newHours = totalHours % 24;
        newMinutes = totalMinutes - (totalHours*60);
        if(newHours<10){
            System.out.print("0" + newHours + ":");
        }
        else{
            System.out.print(newHours + ":");
        }
        if(newMinutes<10){
            System.out.print("0"+newMinutes);
        }
        else{
            System.out.println(newMinutes);
        }
    
    }
}
