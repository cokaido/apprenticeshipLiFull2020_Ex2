public class LeapYear {

    public boolean isLeapYear(int year){

        boolean isLapYear = false;
        isLapYear = isNotMultipleOf400(year);
        if(!isLapYear)
            isLapYear= isMultipleOf(year,4) && !isMultipleOf(year,100);

        return isLapYear;
    }

    private boolean isNotMultipleOf400(int year) {
        return isMultipleOf(year, 400);
    }

    private boolean isMultipleOf(int year, int divisibleNumber) {

        return (year % divisibleNumber) == 0;
    }


}
