import java.util.Scanner;

import java.util.Arrays;

public class PersonalityTest{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);





	
		String[][] personalityQuestions = {{"A. expend energy, enjoy groups", "B. conserve energy, enejoy one-on-one "},

		{"A. interpret literally" , " B. look for meaning and possibilities "},

		{"A. logical, thinking, questioning" , "B.empathetic,feeling,accomodating" },

		{"A. organized, orderly" , " B. flexible,adaptable "},

		{"A. more outgoing, think out loud " , " B. more reserved, think to yourself "},

		{"A. pratical, realistic,experiental " , "B. imaginative, innovative, theoretical "},

		{"A. candid, straight forward,frank " , "B. tactful,kind,encouraging "},

		{"A. plan, schedule", " B. unplanned,spontaneous "},

		{"A. seek many tasks, public activities,interaction with others", "B. seek private, solitary activities with quiet to concentrate "},

		{"A. standard, usual,conventional", "B. diffrent,novel,unique "},

		{"A. firm,tend to criticize, hold the line", "B. gentle, tend to appreciate, conciliate "},

		{"A. Regulated, structured ", "B. easygoing, live and let live "},

		{"A. External, communicative, express yourself", "B. internal, reticent, keep to yourself "},

		{"A. focus on here-and-now", "B. look to the future,global perspective, big picture "},

		{"A. tough-minded,just ", "B. tender-hearted, merciful "},

		{"A. preparation, plan ahead ", "B. go with the flow, adapt as you go "},

		{"A. active,initiative", "B. reflective, deliberate "},

		{"A. facts,things,what is" , "B. ideas, dreams, what could be, phisophical " },

		{"A. matter of fact,issue-oriented", "B. sensitive,people-oriented, compassionate " },

		{"A. control,govern", "B. latitude,freedom "}};


		System.out.print(" Enter your name " );
			String name = input.next();

		String[] response = new String[20];

		String[] personalityCount = new String[4];
		
				


			for(int count = 0; count < personalityQuestions.length; count++){

			System.out.println(Arrays.toString(personalityQuestions [count] ));

			System.out.println("Enter your response either a or b");
				String answer = input.next();

			response[count] = answer;

		}


		for (int index = 0; index < personalityQuestions.length; index+=4){
				int extrovert = 0;
				int introvert = 0;
				if (response[index] == "A"){
					extrovert++;
				}else if(response[index] == "B"){
					introvert++;
				}
				if (extrovert > introvert){
					personalityCount[0] = "Extrovert";
				}else{
					personalityCount[0] = "Introvert";
				
			System.out.print("Number of selected "A" " + response[count] );
			System.out.print("Number of selected "B" " + response[count] );
			
			
				}
		}
		
		for (int index = 1; index < personalityQuestions.length; index +=4 ){
				
				int sensing = 0;
				int intuitive = 0;
				
				if (response[index] == "A"){
					sensing++;
				}else if(response[index] == "B"){
					intuitive++;
				}
				if (sensing > intuitive){
					personalityCount[1] = "Sensing";
				}else{
					personalityCount[1] = "Intuitive";
				}
		}
		
		for (int index = 2; index < personalityQuestions.length; index +=4 ){
				
				int thinking = 0;
				int feeling = 0;
				
				if (response[index] == "A"){
					thinking++;
				}else if(response[index] == "B"){
					feeling++;
				}
				if (thinking > feeling){
					personalityCount[2] = "Thinking";
				}else{
					personalityCount[2] = "Feeling";
				}
		}

		for (int index = 3; index < personalityQuestions.length; index+=4 ){
				
				int judging = 0;
				int perceptive = 0;
				
				if (response[index] == "A"){
					judging++;
				}else if (response[index] == "B"){
					perceptive++;
				}
				if (judging > perceptive){
					personalityCount[3] = "Judging";
				}else {
					personalityCount[3] = "Perceptive";
				}
		}




		 System.out.println( name  + "  Your Personality Type is : " + personalityCount[0] + personalityCount[1] + personalityCount[2] + personalityCount[3]);





            if (personalityCount[0] == "Extrovert" && personalityCount[1] == "Sensing" && personalityCount[2] == "Feeling" && personalityCount[3] == "Perceptive"){
                System.out.println("ESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits. These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social, often encouraging others into shared activities.");
            }

            if(personalityCount[0] == "Extrovert" && personalityCount[1] == "Sensing" && personalityCount[2] == "Thinking" && personalityCount[3] == "Perceptive"){
                System.out.println("ESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits. They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.");

            }

            if(personalityCount[0] == "Introvert" && personalityCount[1] == "Sensing" && personalityCount[2] == "Feeling" && personalityCount[3] == "Perceptive"){
                System.out.println("ISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting traits. They tend to have open minds, approaching life, new experiences, and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials.");

            }

            if(personalityCount[0] == "Intovert" && personalityCount[1] == "S" && personalityCount[2] == "T" && personalityCount[3] == "P"){
                System.out.println("ISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits. They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.");

            }

            if(personalityCount[0] == "Extrovert" && personalityCount[1] == "Sensing" && personalityCount[2] == "Feeling" && personalityCount[3] == "Judging"){
                System.out.println("ESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits. They are attentive and people-focused, and they enjoy taking part in their social community. Their achievements are guided by decisive values, and they willingly offer guidance to others.");

            }

            if(personalityCount[0] == "Extrovert" && personalityCount[1] == "Sensing" && personalityCount[2] == "hinkingT" && personalityCount[3] == "Judging"){
                System.out.println("ESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and Judging traits. They possess great fortitude, emphatically following their own sensible judgment. They often serve as a stabilizing force among others, able to offer solid direction amid adversity.");

            }

            if(personalityCount[0] == "Introvert" && personalityCount[1] == "Sensing" && personalityCount[2] == "Feeling" && personalityCount[3] == "Judging"){
                System.out.println("ISFJ (Defender) is a personality type with the Introverted, Observant, Feeling, and Judging traits. These people tend to be warm and unassuming in their own steady way. They’re efficient and responsible, giving careful attention to practical details in their daily lives.");

            }


            if(personalityCount[0] == "Introvert" && personalityCount[1] == "Sensing" && personalityCount[2] == "T" && personalityCount[3] == "J"){
                System.out.println("ISTJ (Logistician) is a personality type with the Introverted, Observant, Thinking, and Judging traits. These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.");

            }

            if(personalityCount[0] == "Extrovert" && personalityCount[1] == "Intuitive" && personalityCount[2] == "Feeeling" && personalityCount[3] == "Perceptive"){
                System.out.println("ENFP (Campaigner) is a personality type with the Extraverted, Intuitive, Feeling, and Prospecting traits. These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. Their vibrant energy can flow in many directions.");

            }

            if(personalityCount[0] == "Extrovert" && personalityCount[1] == "Intuitive" && personalityCount[2] == "Feeling" && personalityCount[3] == "Judging"){
                System.out.println("ENFJ (Protagonist) is a personality type with the Extraverted, Intuitive, Feeling, and Judging traits. These warm, forthright types love helping others, and they tend to have strong ideas and values. They back their perspective with the creative energy to achieve their goals.");

            }

            if(personalityCount[0] == "Introvert" && personalityCount[1] == "Intuitive" && personalityCount[2] == "Feeling" && personalityCount[3] == "Perceptive"){
                System.out.println("INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits. These rare personality types tend to be quiet, open-minded, and imaginative, and they apply a caring and creative approach to everything they do.");

            }

            if(personalityCount[0] == "Introvert" && personalityCount[1] == "Intuitive" && personalityCount[2] == "Feeling" && personalityCount[3] == "Judging"){
                System.out.println("INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.");

            }

            if(personalityCount[0] == "Extrovert" && personalityCount[1] == "Intutive" && personalityCount[2] == "Thinking" && personalityCount[3] == "Perceptive"){
                System.out.println("ENTP (Debater) is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting traits. They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility. They pursue their goals vigorously despite any resistance they might encounter.");

            }

            if(personalityCount[0] == "Extrovert" && personalityCount[1] == "Intuitive" && personalityCount[2] == "Thinking" && personalityCount[3] == "Judging"){
                System.out.println("ENTJ (Commander) is a personality type with the Extraverted, Intuitive, Thinking, and Judging traits. They are decisive people who love momentum and accomplishment. They gather information to construct their creative visions but rarely hesitate for long before acting on them.");

            }

            if(personalityCount[0] == "Introvert" && personalityCount[1] == "Intuitive" && personalityCount[2] == "Thinking" && personalityCount[3] == "Perceptive"){
                System.out.println("INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness to experiment with personal creativity.");

            }

            if(personalityCount[0] == "Introvert" && personalityCount[1] == "Intuitive" && personalityCount[2] == "Thinking" && personalityCount[3] == "Judging"){
                System.out.println("INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one.");
            }


	}

}