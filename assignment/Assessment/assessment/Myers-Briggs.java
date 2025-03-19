import java.util.Scanner;

import java.util.Arrays;

public class PersonalityTest{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

			
		String[][] personalityQuestions = {

		{"A. expend energy, enjoy groups", "B. conserve energy, enejoy one-on-one "},

		{"A. interpret literally ", "B. look for meaning and possibilities "},

		{"A. logical, thinking, questioning","B.empathetic,feeling,accomodating "},

		{"A. organized, orderly", " B. flexible,adaptable "},

		{"A. more outgoing, think out loud ", " B. more reserved, think to yourself "},

		{"A. pratical, realistic,experiental ", "B. imaginative, innovative, theoretical "},

		{"A. candid, straight forward,frank ", "B. tactful,kind,encouraging "},

		{"A. "plan, schedule", " B. unplanned,spontaneous "},

		{"A. "seek many tasks, public activities,interaction with others", "B. seek private, solitary activities with quiet to concentrate "},

		{"A. " standard, usual,conventional", "B. diffrent,novel,unique "},

		{"A. firm,tend to criticize, hold the line", "B. gentle, tend to appreciate, conciliate "},

		{"A. Regulated, structured "," "B. easygoing, "live" and "let live" "},

		{"A. External, communicative, express yourself", "B. internal, reticent, keep to yourself "},

		{"A. focus on here-and-now", "B. look to the future,global perspective, "big picture "},

		{"A. tough-minded,just ", "B. tender-hearted, merciful "},

		{"A. preparation, plan ahead ", "B. go with the flow, adapt as you go "},

		{"A. active,initiative", "B. reflective, deliberate "},

		{"A. facts,things,"what is", "B. ideas, dreams, "what could be," phisophical " },

		{"A. matter of fact,issue-oriented", "B. sensitive,people-oriented, compassionate " },

		{"A. control,govern", "B. latitude,freedom "},

		}

		for(int count = 0; count < personalityQuestions.length; count++){

			System.out.println(Arrays.toString(personalityQuestions[count]));
		}

	}

}