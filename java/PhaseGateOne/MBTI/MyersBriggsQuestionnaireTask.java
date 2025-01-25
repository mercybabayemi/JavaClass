package PhaseGateOne.MBTI;

import java.util.Scanner;

public class MyersBriggsQuestionnaireTask{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        String answerExtrovertIntrovert = "";
        String answerSensingIntuition = "";
        String answerThinkingFeeling = "";
        String answerJudgementPerception = "";

        String answerExtrovertIntrovertA = "";
        String answerExtrovertIntrovertB = "";
        String answerSensingIntuitionA = "";
        String answerSensingIntuitionB = "";
        String answerThinkingFeelingA = "";
        String answerThinkingFeelingB = "";
        String answerJudgementPerceptionA = "";
        String answerJudgementPerceptionB = "";

	String personality = "";

        String[][] firstSection = {
	{"A. Expend energy, enjoy groups", "B. Conserve energy, enjoy one-on-one"},
	{"A.Interpret literally", "B. Look for meaning and possibilities"}, 
	{"A. More outgoing, think out loud", "B. More reserved, think to yourself"}, 
	{"A. Seek many tasks, public activities, interaction with others", "B. Seek private solitary activities with quiet to concentrate"}, 
	{"A. External, communicative, express yourself", "B. Internal, reticent, keep to yourself"} };

	String[][] secondSection = {
	{"A. Active, initiate", "B. Reflective, deliberate"},
	{"A. Practical, realistic, experiential", "B. Imaginative, innovative, theoretical"},
	{"A. Standard, usual, conventional", "B. Different, novel, unique"},
	{"A. Focus on here-and-now", "B. Look to the future, global perspective, \"big picture\""},
	{"A. Facts, things, \"what is\" ", "B. Ideas, dreams, \"what could be\", philosophical"} };

        String[][] thirdSection = {
	{"A. Logical, thinking, questioning", "B. Empathetic, feeling, accommodating"},
	{"A. Candid, straightforward, frank", "B. Tactful, kind, encouraging"},
	{"A. Firm, tend to criticize, hold the line", "B. Gentle, tend to appreciate, conciliate"},
	{"A. Tough-minded, just", "B. Tender-hearted, merciful"},
	{"A. Matter of fact, issue-oriented", "B. Sensitive, people-oriented, compassionate"} };

        String[][] fourthSection = {
	{"A. Organized orderly", "B. Flexible, adaptable"},
        {"A. Plan, schedule", "B. Unplanned, spontaneous"},
      	{"A. Regulated, structured", "B. Easygoing, \"live and let live\""},
        {"A. Preparation, plan ahead", "B. Go with the flow, adapt as you go"},
        {"A. Control, govern", "B. Latitude, freedom"} };

        for (int i = 0; i < 5; i++){
		System.out.println(firstSection[i][0] + firstSection[i][1]);
        	System.out.println("Enter a response: ");
        	String response = input.nextLine();

        	while (!response.equalsIgnoreCase("A") && !response.equalsIgnoreCase("B")) {
             		System.out.println("Response is not A or B. Please try again.");
               		System.out.print("Enter a response: ");
               		response = input.nextLine();
       		}


		if (response.equalsIgnoreCase("A")) {
                	answerExtrovertIntrovertA += response;
        	} else {
               		answerExtrovertIntrovertB += response;
        	}
	}

	if(answerExtrovertIntrovertA.length() > answerExtrovertIntrovertB.length()) {
			System.out.println("You are extroverted");
           		personality += "E";
	} else {
			System.out.println("You are introverted");
         	 	 personality += "I";
       	}

	 
        for (int i = 0; i < 5; i++) {
		System.out.println(secondSection[i][0] + secondSection[i][1]);
        	System.out.println("Enter a response: ");
        	String response = input.nextLine();

            	while (!response.equalsIgnoreCase("A") && !response.equalsIgnoreCase("B")) {
              		System.out.println("Response is not A or B. Please try again.");
                	System.out.print("Enter a response: ");
                	response = input.nextLine();
            	}

		if (response.equalsIgnoreCase("A")) {
                	answerSensingIntuitionA += response;
           	} else {
                	answerSensingIntuitionB += response;
            	}

	}
	
	if (answerSensingIntuitionA.length() > answerSensingIntuitionB.length()) {
			System.out.println("You are sensitive");
           		personality += "S";
       	} else {
			System.out.println("You are intuitive");
          		personality += "N";
      	}

        for (int i = 0; i < 5; i++) {
		System.out.println(thirdSection[i][0] + thirdSection[i][1]);
        	System.out.println("Enter a response: ");
        	String response = input.nextLine();

            	while (!response.equalsIgnoreCase("A") && !response.equalsIgnoreCase("B")) {
               		System.out.println("Response is not A or B. Please try again.");
                	System.out.print("Enter a response: ");
                	response = input.nextLine();
           	}

           	if (response.equalsIgnoreCase("A")) {
               		answerThinkingFeelingA += response;
            	} else {
                	answerThinkingFeelingB += response;
           	}

	}

	if (answerThinkingFeelingA.length() > answerThinkingFeelingB.length()) {
		System.out.println("You are thoughtful");
            		personality += "T";
        } else {
		System.out.println("You are emotional");
            		personality += "F";
        }

        for (int i = 0; i < 5; i++) {
		System.out.println(fourthSection[i][0] + fourthSection[i][1]);
        	System.out.println("Enter a response: ");
        	String response = input.nextLine();

            	while (!response.equalsIgnoreCase("A") && !response.equalsIgnoreCase("B")) {
                	System.out.println("Response is not A or B. Please try again.");
                	System.out.print("Enter a response: ");
                	response = input.nextLine();
            	}

           	if (response.equalsIgnoreCase("A")) {
               		answerJudgementPerceptionA += response;
            	} else {
                	answerJudgementPerceptionB += response;
		}
	}

      	if (answerJudgementPerceptionA.length() > answerJudgementPerceptionB.length()) {
			System.out.println("You are judgemental");
          		personality += "J";
       	} else {
			System.out.println("You are perceptive");
            		personality += "P";
       	}



     	System.out.println("Your personality type is: " + personality);

        switch (personality) {
            case "ENFJ":
                System.out.println("ENFJ (Protagonist) is a personality type with the Extroverted, Intuitive, Feeling, and Judging traits. They are charismatic and inspiring leaders, often driven to help others realize their potential.");
                break;
            case "ENTJ":
                System.out.println("ENTJ (Commander) is a personality type with the Extroverted, Intuitive, Thinking, and Judging traits. Bold and imaginative, they are strong-willed leaders who enjoy organizing and directing people and projects.");
                break;
            case "INFP":
                System.out.println("INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits. Idealistic and loyal to their values, they are driven by their beliefs and desire to make the world a better place.");
                break;
            case "INTJ":
                System.out.println("INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one.");
                break;
            case "ESFJ":
                System.out.println("ESFJ (Consul) is a personality type with the Extroverted, Sensing, Feeling, and Judging traits. Caring and social, they have a strong sense of duty and are eager to help others.");
                break;
            case "ESTJ":
                System.out.println("ESTJ (Executive) is a personality type with the Extroverted, Sensing, Thinking, and Judging traits. Organized and driven, they focus on results and managing tasks efficiently.");
                break;
            case "ISFP":
                System.out.println("ISFP (Adventurer) is a personality type with the Introverted, Sensing, Feeling, and Prospecting traits. Creative and spontaneous, they value freedom and often express themselves through art and other forms of creativity.");
                break;
            case "ISTP":
                System.out.println("ISTP (Virtuoso) is a personality type with the Introverted, Sensing, Thinking, and Prospecting traits. They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.");
                break;
            case "ENFP":
                System.out.println("ENFP (Campaigner) is a personality type with the Extroverted, Intuitive, Feeling, and Prospecting traits. Enthusiastic and creative, they have a strong sense of possibility and are driven by their values and ideas.");
                break;
            case "ENTP":
                System.out.println("ENTP (Debater) is a personality type with the Extroverted, Intuitive, Thinking, and Prospecting traits. Quick-witted and clever, they enjoy the challenge of ideas and often think outside the box.");
                break;
            case "INTP":
                System.out.println("INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness to experiment with personal creativity.");
                break;
            case "ISFJ":
                System.out.println("ISFJ (Defender) is a personality type with the Introverted, Sensing, Feeling, and Judging traits. Warm and conscientious, they have a strong sense of duty and take pride in their responsibilities.");
                break;
            case "ISTJ":
                System.out.println("ISTJ (Logistician) is a personality type with the Introverted, Sensing, Thinking, and Judging traits. These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.");
                break;
            case "ESFP":
                System.out.println("ESFP (Entertainer) is a personality type with the Extroverted, Sensing, Feeling, and Prospecting traits. Outgoing and spontaneous, they enjoy life in the moment and often seek new experiences.");
                break;
            case "ESTP":
                System.out.println("ESTP (Entrepreneur) is a personality type with the Extroverted, Sensing, Thinking, and Prospecting traits. Bold and perceptive, they take action to make things happen and enjoy living on the edge.");
                break;
            case "INFJ":
                System.out.println("INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.");
                break;
            default:
                System.out.println("Your personality type is not recognized.");
                break;
        }
    }
}