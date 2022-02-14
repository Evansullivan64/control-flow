//TODO INSTRUCTIONS:
//  1. Now that you have the code in IntelliJ on your computer, use VCS to "Share this project to your GitHub repo
//     that is attached to your student email.  MAKE SURE YOU HAVE THIS REPO SET TO PRIVATE.
//  2. Run the app and familiarise yourself with the output and where each part of the output came from in the code.
//  3. There are multiple TO DO comments - follow this workflow when addressing EACH one:
//       a. Locate a single TO DO item that you want to work on
//       b. Add the required code to address it.
//       c. Commit the change to your local repository, making sure your commit message explains (briefly) what you did.
//       d. Push the change to your remote repository
//  4. REMEMBER TO USE THIS GITHUB WORKFLOW FOR EACH CHANGE - failure to use GitHub in this way will result in
//     a lower grade for the assignment as it is a software development tooling module.
// Hint: the week 2 syntax labs are a good support for completing this project


//in the main method we are calling the methods
fun main(args: Array<String>) {
    minimumOf(5,7)
    rangeOf(4)
    inferredTypeOf(0.0F)
    stringContains("wordlea")
}



//this method prints which number is bigger
fun minimumOf(number1: Long, number2: Long){
    if(number1 < number2){
       println("the first number: $number1 is less than second number: $number2");
    }else if(number1 > number2){
        println("the first number: $number1 is greater than second number: $number2");
    }

}



//this method prints what range a number falls into
fun rangeOf(number: Int){
    when{
        number <= 0-> println("the number $number is either less than or equal to zero");
       number in 1..5 -> println("the number $number falls in the range of 1 to 5");
       number in 6..10 -> println("the number $number falls in the range of 6 to 10");
       number in 11..20 -> println("the number $number falls in the range of 11 to 20");
        number >= 21 -> println("the number $number is either greater than or equal to 21");
    }
   }



//this method prints what type of variable the inferred type is.
fun inferredTypeOf(variable: Any){
    when {
        variable is Int -> println("type of $variable is an Int");
        variable is Long-> println("type of $variable is an Long");
        variable is Double-> println("type of $variable is an Double");
        variable is Float-> println("type of $variable is an Float");
        variable is Boolean-> println("type of $variable is an Boolean");
        else-> println("data type is something else")

    }
   }



//this method prints whether of not a string contains a,b or c
fun stringContains(str : String){
    when {
        str.isEmpty()-> println("String is empty")
        str.contains('A')|| str.contains('a')-> println("$str contains A")
        str.contains('B')|| str.contains('b')-> println("$str contains B")
        str.contains('C')|| str.contains('c')-> println("$str contains C")
        else-> println("$str doesn't contain A,B, or C");
    }
  }
