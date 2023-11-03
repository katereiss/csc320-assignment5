Write a program that will provide important statistics for the grades in a class. The program will utilize a for-loop to read ten floating-point grades from user input. Include code to prevent an endless loop. Ask the user to enter the values, then print the following data:  

-Average  
-Maximum  
-Minimum  

Start program  

Initialize grade = 0 as float  
Initialize max = 0 as float  
Initialize min = 100 as float  
Initialize avg = 0 as float  
Initialize sum = 0 as float  

For grades 0 to 9  
Ask user to input grade  
grade = user input  
Add grade to sum  
If grade > max, then max = grade  
End if  
If grade < min, then min = grade  
End if  
End for loop  

avg = sum/10  

Print "Average grade: " + avg  
Print "Maximum grade: " + max  
Print "Minimum grade: " + min  


End program  



Notes:  

Storing the ten user-input grades as an array would allow for more complex and efficient calculations, but I noticed those are introduced next week.  

An assumption made in this program is that grades can only be floating point numbers from 0 to 100.  One consideration is that a user could input a negative grade or a grade over 100. To prevent these values from being counted, one could include another if statement inside the for loop that prints a statement to the user indicating that the grade is invalid, and decreasing the iteration by 1 to repeat that grade input.






