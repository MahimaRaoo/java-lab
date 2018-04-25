 
Design, develop, and implement the following programs in Java
1.		a. Write a java program to find the details of the students eligible to enroll for the examination 
      (Students & Department give the eligibility criteria for the enrollment class) using interface


b. Write a java Program to  create the table named DEPARTMENT with the attributes 
       Dept_id,Name,Year_Established, Head_Name,No_of_Employee and
 (i) Find the number employees in a CSE department.
(ii) List name, Dept_id of all the departments which are established in the year 2010.
2.		a.	Write a java program to maintain the student details like USN, Dept names, 3 subject grades and SGPA in student package and keep the staff details such as Staffid, StaffName, designation and subjects handled in a staff package. In main class use these two packages details for Staff and Student classes and display the student and staff information as requested by the user.
b.	Write a Java servlet  program that loads area  and phone no. of police station of that area from a database. It takes a area or phone number as input and prints the corresponding other
fields. (Note: create police_station table with appropriate fields)
3.		a.	Write a java program to throw a exception for an employee details.  If an employee name is a number, a name exception must be thrown. If an employee age is greater than 50, an age exception must be thrown Or else an object must be created for the entered employee details.
b.	Write  a java servlet  program with a  function called Initials() that takes input  representing a full name and returns the initials of the name in all capital letters. For example If Input: Robert B. Qwerty   then Output : RBQ
4.		a.	Write Java program to create an applet with text box. We must type a string in text box first. Then if we press “P” key check the given string is PALINDROME or not and the result must be displayed on the status bar
b.	Develop a JSP application that has the following pages : register.html  contains 2 text boxes username, password  and a button "REGISTER". Once Register button clicked the page should be redirected to welcome.jsp. In welcome.jsp validate username and password and display welcome message for a valid user. (Use Sessions)


5.		a.	Write a multithreaded program to create 2 threads.  One thread should infinitely display the message as “welcome” while other thread should infinitely display the message “Goodbye”.  Synchronize the execution of these threads.  So that the messages are displayed alternately.
b.	Write a JSP that takes the user’s name and age from a form. Echo back the name and age along with a message stating the price of movie tickets.
•	The price is determined by the age passed to the JSP.
•	If the age is greater than 62, the movie ticket price is Rs. 7.00.
•	If the user is less than 10 years old, the price is Rs. 5.00.
•	For everyone else, the price is Rs. 9.50.
6.		a.	Create a main class to prompt the user to enter his/her age and his CGPA. The user application for a job will be rejected either if his age is greater than 25 years or his CGPA is less than 8. You should declare two nested try-throw-catch blocks; one to handle the AgeOutOfRangeException and the other to handle the  LowCGpaException. If the user enters acceptable age and CGPA, display the message “Your application is accepted and is under study”. 
b.	Write a servlet program to insert Employee details like empid, employee_name, address, date_of_birth in Employee table using JDBC and display in table format.

7.		a.	Write a Java program to create a super class Record has been defined to store the names and ranks of 50 students. Define a sub class Rank to find the highest rank along with the name. The details of both classes are given below
Class Name :Record
Data Members : name[ ], rnk[ ] (store names and respective ranks in an array
Member functions: Record() : constructor to initialize data members
                               void readvalues() : to store names and ranks
                               void display() : displays the names and the corresponding ranks
Class name : Rank
Data Members : index(integer to store the index of the topmost rank)
Member functions : 
Rank() : constructor to invoke the base class constructor and to initialize index to 0.
void highest() : finds the index location of the topmost rank and stores it in index without sorting the array 
void display() : displays the name and ranks along with the name having the topmost rank.

b. Write a JSP program to create a form with bookno, title, author, publication  price and submit button. Using JSP-Database connectivity, get the data from the form and insert the records into the database, retrieve the book details for the particular title matches and display the details.
8.		a.	Write a java program to implement the following :
Consider a restaurant that has one chef and one waitperson. The waitperson must wait for the chef to prepare a meal. When the chef has a meal ready, the chef notifies the waitperson, who then gets the meal and goes back to waiting. The chef represents the producer, and the waitperson represents the consumer.
b.	Write a JSP program to accept the marks entered and display his/her grade to the browser. Department has set the grade for the subject Java as follows : Above 90=A, 80-89=B, 
70-79=C, Below 70=FAIL.
9.		a.	Define a class called Library with the following description:
Instance variables/data members:
 Int acc_num – stores the accession number of the book
String title – stores the title of the book stores the name of the author
Member Methods:
    (i) void input() – To input and store the accession number, title and author.
    (ii)void compute – To accept the number of days late, calculate and display and fine charged 
          at the rate of Rs.2 per day.
   (iii) void display() To display the details in the following format:
      Accession Number Title Author
    Write a main method to create an object of the class and call the above member methods.
b.	Write a Java-JDBC program to implement Banking Application using transaction management.
c.	
10.		a.	Write Java program to create a package called AdvMath. which has two classes.  In main class use this  package display the result as requested by the user.
        (i)  to calculate y = sinx+cosx+tanx
        (ii) to print Pythagorean triplets
b.	Write a servlet program to accept the details of client as client name , password and panid. Write a cookie which stores panid. If the cookie is present print "Welcome to"+clientname other wise print "Welcome"

11.		a.	Write a java program to accept a string. Convert the string to uppercase. Count and output the number of double letter sequences that exist in the string.
Sample Input: “SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE
Sample Output: 4 

b.	Write a Servlet program that uses JDBC that displays the subjects allotted for the faculty with table  namely, Subjects(SubID, SubName, FacID). Update  subject details for a faculty  and display how many rows are updated .
12.		a.	Write a java program to create five threads with different priorities. Send two threads of highest priority to sleep state. Check the aliveness of the threads.

b.  Write a JSP program to create a HTML form with username, age, marks and submit button. The program should get values from HTML form and display message like "Eligible for SEE" along with the message the page includes counter.jsp, it counts the number of visitor visited the page.

13.		a.	Write a Java Program to Implement an abstract class Reservation and two classes ReserveTrain and ReserveBus
      Define a Reservation abstract class with following characteristics
         Method reserve which takes integer value seats and typeOfSeat as parameters and returns boolean type.
       Method getAvailableSeats which return a number of seat remaining. 
b.	Write a SetCookies servlet, a servlet that sets six cookies. Three have the default expiration date, meaning that they should apply only until the user next restarts the browser. The other three use setMaxAge to stipulate that they should apply for the next hour, regardless of whether the user restarts the browser or reboots the computer to initiate a new browsing session.
14.		a.	Write a Java program to create an applet when we drag the mouse, the path of the mouse pointer must be drawn as a rectangle.
b.	Write a JAVA-JDBC program that connects to the database COLLEGE with STUDENT TABLE with appropriate attributes.  Write a program to display the Students whose cgpa is below 9 and also update the  student table to change the cgpa of student named “john” from 8.96 t0 9.4 using updatable result set. Finally display the  results and   disconnect form the database


Marks Distribution: 
Conduction and Result	Viva	Change of Program	Total
Part – a	20 Marks	5 Marks	-10 Marks	50 Marks
Part – b	25 Marks			





