## User Guide

Big hello to TIC4001 Project Duke. Duke is a personal assistant chatbot that helps us keep track of various things. 

## Quick Start
1. Ensure you have Java 11 or above installed in your Computer.
2. Download the latest DukeProject.jar from [here](https://github.com/e0261618/ip/releases/download/v0.2/DukeProject.jar).
3. Copy the file to the folder you want to use as the home folder for your DukeProject.
4. Open a command window in that folder.
5. Run the command java -jar DukeProject.jar to open up the applcation.
6. Type the command in the command box and press Enter to execute it.

## Features
Todo: tasks without any date/time attached to it e.g., visit new theme park
Deadline: tasks that need to be done before a specific date/time e.g., submit report by 11/10/2019 5pm
Events: tasks that start at a specific time and ends at a specific time e.g., team project meeting on 2/10/2019 2-4pm
List: list down all the tasks that has been added
Delete: delete task that you specified
Find: find keywords in the tasklist

### Todo
Format: todo 
Example: todo read book
Output: 
Got it. I've added this task:
[T][✘] watch movie
Now you have 1 tasks in the list.

### Deadline
Format: deadline {task} /by {yyyy-mm-dd} 
Example: deadline submit homework /by 2020-09-28
Output:
Got it. I've added this task:
[D][✘] do homework (by: Sep 28 2020)
Now you have 2 tasks in the list.

### Events
Format: event {task} /at {yyyy-mm-dd} 
Example: event project meeting /at 2020-09-28
Output:
Got it. I've added this task:
[E][✘] project meeting (at: Sep 28 2020)
Now you have 3 tasks in the list.

### List
Format: list
Example: list
Output:
Here are the tasks in your list:
    1. [T][✘] watch movie
		2. [D][✘] do homework (by: Sep 28 2020)
		3. [E][✘] project meeting (at: Sep 28 2020)

### Delete
Format: delete {index number} - The index must be a positive integer 1, 2, 3,(...)
Example: delete 1
Output:
Noted. I've removed this task:
[T][✘] watch movie
Now you have 2 tasks in the list.

### Find
Format: find {keyword}
Example: find project
Output:
Here are the matching tasks in your list:
1. [E][✘] project meeting (at: Sep 28 2020)
	
## Saving the data
Data/Duke.txt is the directory where you can find the list of tasks being saved.

### Support or Contact
Having trouble with executing the program? Email me [here](e0261618@u.nus.edu) and I’ll help you sort it out.
