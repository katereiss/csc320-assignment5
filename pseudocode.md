Develop a Java program that will store data in the form of daily average temperatures for one week. Store the day and average temperature in two different arraylists. Your program should prompt the user for the day of the week (Monday through Sunday) and display both the day and temperature for each day. If "week" is entered, the output for your program should provide the temperature for each day and the weekly average. Use the looping and decision constructs in combination with the arrays to complete this assignment.  

Start Program  

Create ArrayList of strings called days with values Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday  
Create ArrayList of integers called temperatures with sample temperature values  

Prompt user to enter a day of the week or "week"

If user input is "week"
Initialize variable total as double, set to zero

For each day of the week
Print day + ": " + temperature
Add temperature to total
Print average = total / 7

Else-if day of week is in days
Initizalize variable index as integer
Set index equal to the index of day of week in days
Print the result of indexing days with index
Print the result of indexing temperatures with index

Else print invalid day





