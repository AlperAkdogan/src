package day9_ifandElseStatement;
/*
if & else: when there are only two option/possibilities ( not more not less than 2 condition)


		if(Condition){
			StatementA
		}else{ // otherwise
			StatementB
		}

		StatementA: if condition MUST be true
		StatementB: if condition MUST be false


		Yes or No
		Leap year
		Female or Male
		Pass or Fail
		Married or not Married
		employeed or not employeed
		Odd or Even
		Enligible or not eligible
 */
public class ifAndElseStatement {

    public static void main(String[] args) {


        int  year =2000;

        boolean LeapYear = year % 4 ==0;

        if (LeapYear){
            System.out.println("Year "+ year+ " is a leap year");
        }
                                                                // Java Complier has to check both of that
        if (!LeapYear){
            System.out.println("Year "+year+ " is not a leap year");
        }

        System.out.println("-----------------------------------------------");



      if (LeapYear){
          System.out.println("Year "+ year+ " is a leap year");
      }else{
          System.out.println("Year "+year+ " is not a leap year");
      }





    }
}
