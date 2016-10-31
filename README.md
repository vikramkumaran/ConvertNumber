# ConvertNumber
Code to convert a number to a string representation
Language: Java 1.8

Deliverable: All java source files + an executable Jar file that will run the program

Input: Integer values from -999, 999 to 999, 999

Output: String representation of the value

Examples:
```
java -jar ConvertNumber 100 

100 --> one hundred

java -jar ConvertNumber 0 

0 --> zero

java -jar ConvertNumber 1001 

1001 --> one thousand one

java -jar ConvertNumber 99221 

999221 --> nine hundred ninety nine thousand two hundred twenty one 
```


# Build Code

Just to keep things simple in terms of dependency on other tools, the build script is a bash script. In an ideal situation we would be using Maven/Gradle/ANT to build. I have not used them in this version of the code.

To run the build script 

`bash build.sh`

The result is a jar file `ConvertNumber`. Traditionally the jar file should have a jar extension but keeping in line with the given requirements I have not added the extension in the name.


# Run the code

Usage: `java -jar ConvertNumber <number>`

Input `<number>` : The input is a number between -999,999 to 999,999

Output : is in the format `<number> --> string representation of the number`

Example:

```
java -jar ConvertNumber 99221 

999221 --> nine hundred ninety nine thousand two hundred twenty one
```
# Test the code

I have also included a test class that can be used to test the code using a test data file. A sample test file `test.txt` is located in the directory `testdata`. The test data contains numbers and their corresponding string representation.
When the test is run any line that failed the test will be printed on stdout.

To run the test
 
`java -cp ConvertNumber ConvertNumberTest ./testdata/test.txt`



# Notes
The code has quite a few hard coded strings. Ideally we would use enum classes and string contstants. For the purposes of this excercise it seemed like overkill to take that extra step.

Also ideally the test cases would be written to work with a test harness and maybe an automated testing tool, with build automation (continuous integration and continues deployment) using tools like jenkins. Once again for the purposes of this excercise adding all of that seemed like overkill.

