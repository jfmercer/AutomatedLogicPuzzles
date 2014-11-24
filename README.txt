Automated Logic Programming Puzzles
===================================

Code Challenge for Automated Logic Job Application

This project is my response to a programming challenge
offered by a potential employer, Automated Logic. 

Dependencies

JUnit: I have included JUnit 4.11 for unit testing. 
The two sub-projects can be built by running Maven on
the pom.xml file in each respective directory, Natural
Numbers or PigLatin. 

Assumptions

For Natural Numbers, I have assumed that the user will
enter a signed integer within the valid integer range. If not, 
the program simply crashes. If a negative integer is entered,
it is muliplied by -1 to make it a natural number. Finally, 
I have included 0 in the set of natural numbers, even though
mathematicians are still undecided on this point. 

For Pig Latin, I have made no assumptions about user input 
and have tested for all possible types of input. I have, however, 
assumed that the user does not want trailing whitespace, and so there
is no trailing whitespace after a PigLatin translation, even if the 
input had trailing whitespace.

JDK

I have used Java 8 (1.8.0_25) as my JDK. 
