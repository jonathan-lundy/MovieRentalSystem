# MovieRentalSystem
**You must install jdk to run**

**The MySQL client included in this repository is for Windows 64 bit machines**

  1.)On windows command line navigate to the project directory 
  
  2.)Navigate to DBConnecton\mysql-8.0.23-win64\bin
  
  3.)run the following command "mysqld --console"
  
  4.)run the following command :
  
      C:\Program Files\Java\jdk-12.0.2\bin\javaw.exe 
      -Dfile.encoding=Cp1252 
      -classpath 
        "C:\~\MRS;C:\~\DBConnection\mysql-connector-java-8.0.23\mysql-connector-java-8.0.23.jar" 
      MovieRentalSystem 
      
 "~" = full path of project directory 
 
 
 **Output**
 
Java program will display :

  "Sucessfully connected Movie Rental System mySQL database"

if unable to connnect to the db it will print :

  "Error"
=======
