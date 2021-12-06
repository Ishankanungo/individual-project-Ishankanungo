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
#### 1. Singleton: This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class. The singleton design pattern is used to fetch the datasets inside CustomerOrder File. The program is supposed to fetch multiple dataset files, therefore singleton design pattern is used to implement that.
Singleton UML Diagram:

![Individual Project Singleton](https://user-images.githubusercontent.com/78246787/144801984-b0864bec-0d93-444a-98fe-1a9d42ddfbea.jpg)

#### 2. Factory Method: Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. The factory method design pattern is used to create Invalid orders file and the correct order bill amount file.
Factory Method UML Diagram:






individual-project-Ishankanungo created by GitHub Classroom
