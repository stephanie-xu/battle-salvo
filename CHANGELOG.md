# Changes made to PA03 files for PA04:

## model
- board, boardImpl, and boardState were updated so that the board implementation 
owned by players will implement separate interfaces so that view and interactions are separate
- in the same vein, shotContainer was updated to implement shotNumState and shotCoordState
- generalPlayer, userPlayer, and computerPlayer were updated to utilize the new implementations of 
board and shot container
- the coord class was updated to add json property tags instead of creating a new record, and the
constructor field order was switched to become column, row instead of row, column

## view
- view and consoleView were updated to receive information from the new view-access only 
interfaces of board and shot container, thereby preventing the view from having access to 
mutate objects it shouldn't have access to
- the methods for displaying a user/opponent's board now use a method that abstracts common logic

## controller
- adapted types of inputs that the controller takes in based on previous changes
