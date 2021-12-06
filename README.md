# individual-project-Ishankanungo

## Problem Statement
The objective of the project is to develop an application for a user to purchase products online. The user is only allowed to buy a certain number of products from each category available. The order should satisfy the given requirements, and if it does, a bill amount should be generated. If the order does not satisfy the requirements, an output file, stating the limitaion should be generated.

## Instructions to run the program
1. Create a folder by cloning the repo in which all the files are present.
2. Change the current directory to the file location
3. Move the current directory to the src file
4. Type in: javac ExecuteOrder.java
5. Next Type in: java ExecuteOrder

## Design Patterns Used:
#### 1. Singleton: 
This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class. The singleton design pattern is used to fetch the datasets inside CustomerOrder File. The program is supposed to fetch multiple dataset files, therefore singleton design pattern is used to implement that.
Singleton UML Diagram:

![Individual Project Singleton](https://user-images.githubusercontent.com/78246787/144801984-b0864bec-0d93-444a-98fe-1a9d42ddfbea.jpg)

#### 2. Factory Method: 
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. The factory method design pattern is used to create Invalid orders file and the correct order bill amount file.
Factory Method UML Diagram:

![Individual Project Factory](https://user-images.githubusercontent.com/78246787/144802597-15a9d9a9-fd52-4443-9b84-9f5c1b9cd8e0.jpg)


## Output Generated:
The output for the given test files is generated in the form of a CSV file or in the from of a Txt file. If the order given satisfies the constraints, the bill amount is given in the CSV file. If the order does not satisfy the constraints, the Txt file generates the Error causing order values.

### Please note:
To produce the output, please go into the ExecuteOrder file and reassign the path of the file that is being input.

### Test file 1 output:

![test 1](https://user-images.githubusercontent.com/78246787/144803189-fca20362-b7d0-4fbe-b230-029ae0771cea.JPG)

### Test file 2 output:

![test2](https://user-images.githubusercontent.com/78246787/144803280-23c23219-6631-4363-8eb0-da5033ac3e38.JPG)

### Test file 3 output:

![test3](https://user-images.githubusercontent.com/78246787/144803393-492eb85f-c4bd-476c-aae4-ae962d022c57.JPG)


individual-project-Ishankanungo created by GitHub Classroom
