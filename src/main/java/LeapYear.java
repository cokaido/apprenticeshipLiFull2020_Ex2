public class LeapYear {

    public boolean isLeapYear(int year){

        boolean result = isNotMultipleOf400(year);

        return result;

    }

    private boolean isNotMultipleOf400(int year) {
        if(isMultipleOf(year,400)){
            return true;
        }
        return false;
    }

    private boolean isMultipleOf(int num, int divisibleNum) {

        if((num % divisibleNum) == 0){

            return true;
        }
        return false;
    }


}
