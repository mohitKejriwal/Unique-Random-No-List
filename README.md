# Unique-Random-No-List
This spring boot project is built using java. The aim of this project is to generate a list of "unique" random numbers with the least loop counts.
Many complex algoriths are available on google for you to refer but in my algo you ll find pretty simple steps to achieve the goal.
It goes like this, 
  step 1- Generate a random number between 1 and the limit given by user.
  step 2- Consider this random number as a Node and Generate a random number between 1 and Node. Now you have got a new Node, keep on       generating random numbers between Nodes.
  step 3- Generate a random number between Node and the limit given by user, i.e. the remaining half and then keep on generating nodes and    random numbers between them.
At last when all the loops will reach to their end you ll have a list of random numbers between 1 and the limit. List will include all the numbers between 1 and limit only once.
This is done using recursive function which generates a Node and calls itself with new values of limits i.e. Nodes.
Just read RandomController java class to get the logic. 

Also you can hit this api ( https://unique-random-list.herokuapp.com/random?limit=20 ) hosted on heroku.com 

The output will be something like this - 
(20) (14) (16) (17) (18) (19) (15) (1) (7) (11) (12) (8) (9) (10) (3) (5) (6) (4) (2) (13) ( // *LOOPCOUNT* = 18 ) // *Time taken* = 1.544448 milli sec

You can pass different values of limit in query param. The *LOOPCOUNT* denotes the number of times the recursive function is called and *TIME TAKEN* is the execution time taken to generate the list of random numbers.
