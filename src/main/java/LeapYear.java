public class LeapYear {

    public boolean isLeapYear(int year){

        return isNotMultipleOf400(year);

    }

    private boolean isNotMultipleOf400(int year) {
        return isMultipleOf(year, 400);
    }

    private boolean isMultipleOf(int year, int divisibleNumber) {

        return (year % divisibleNumber) == 0;
    }


}
