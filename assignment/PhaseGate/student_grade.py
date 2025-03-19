
	
students = studentsDetails1(userInput)
subjects = studentsDetails2(userInput)

	

spreadSheet = new [students][subjects]
		
print(" Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>\n  Saved successfully  ")
	
studentScores(userInput,students,subjects,spreadSheet)

print(" ~~~ STUDENTGRADEAPP )SG( ~~~ ")

print("================================= ")		
print(input(" How many students do you have: "))
			
return students
		

def studentsDetails2()

print(input(" How many subject do they offer: "))
print(" ================================= ")

return subjects
			

def studentScores(Scanner userInput,students,subjects,spreadSheet)
totalScore = 0;
for row in students:
	for column in subjects
	print(f"Enter score for student " , (row + 1) , " score for subject " , (column +,1) , ": ")
									while(spreadSheet[row][column] < 0 || spreadSheet[row][column] > 100)
	print("Invalid input!!!!\nTry AGAIN")
					
	





       
		