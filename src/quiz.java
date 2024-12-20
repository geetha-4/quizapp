import java.util.Scanner;

class Quiz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Participant p=new Participant();
		System.out.println("Enter ur Name");
		p.Name=sc.next();
		System.out.println("Enter ur Address");
		p.Address=sc.next();
		System.out.println("Enter ur age");
		p.age=sc.nextInt();
		System.out.println("Enter ur Qualification");
		p.Qualification=sc.next();
		System.out.println("Enter ur MobileNumber");
		p.MobileNumber=sc.nextInt();
		System.out.println("Enter ur emailid");
		p.emailid=sc.next();
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getage());
		System.out.println(p.getQualification());
		System.out.println(p.getMobileNumber());
		System.out.println(p.getemailid());
				        String response = sc.nextLine();
        if (!response.equalsIgnoreCase("yes")) {
            System.out.println("Thank you! See you next time.");
            }

        System.out.println("\nQuiz Rules:");
        System.out.println("1. Each question has 4 options.");
        System.out.println("2. You have 2 lifelines to use, but they can be used only once.");
        System.out.println("3. Each correct answer earns you points.");
        System.out.println("4. You can quit anytime or continue until you finish the quiz.");
        System.out.println("------------------------------------------------------");

        String[][] quiz = {
        		{"Who painted the famous artwork The Starry Night?","A) Leonardo da Vinci","B) Vincent van Gogh","C) Pablo Picassz","D) Claude Monet","B"},
            {"What is the capital of France?", "A) Berlin", "B) Madrid", "C) Paris", "D) Rome", "C"},
            {"Which ancient civilization built the Great Pyramid of Giza?","A) Egyptians","B) Greeks","C)Romans","D) Mesopotamians", "A"},
            {"What is the largest planet in our solar system?","A) Earth","B) Saturn","C) Jupiter","D) Uranus","C"},
            {"Who is credited with the discovery of gravity?","A) Galileo Galilei","B) Isaac Newton","C) Albert Einstein","D) Leonardo da Vinci","B"},
            {"Which football player has won the most Ballon d'Or awards?","A) Lionel Messi","B) Cristiano Ronaldo","C) Zinedine Zidane","D) Diego Maradona","A"},
            {"What is the chemical symbol for gold?","A) Ag","B) Au","C) Hg","D) Pb","B"},     
            {"Which river is the longest in South America?","A) Amazon River","B) Paraná River","C) São Francisco River","D) Magdalena River","A"},
            {"What is the world's largest desert?","A) Sahara Desert","B) Gobi Desert"," C) Mojave Desert","D) Atacama Desert","A"},
            {"Who played the role of Luke Skywalker in the original Star Wars trilogy?","A) Mark Hamill","B) Harrison Ford","C) Carrie Fisher","D) Alec Guinness","A"}
        };

        String[] lifelines = {"50-50", "Ask the Audience"};
        for (int i = 0; i < quiz.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + quiz[i][0]);
            System.out.println(quiz[i][1]);
            System.out.println(quiz[i][2]);
            System.out.println(quiz[i][3]);
            System.out.println(quiz[i][4]);
            System.out.println("Enter your answer (or type 'lifeline' to use one):");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("lifeline")) {
                if (p.lifelineUsed1 && p.lifelineUsed2) {
                    System.out.println("Sorry, you have already used all lifelines.");
                } else {
                    System.out.println("Available lifelines:");
                    if (!p.lifelineUsed1) System.out.println("1. " + lifelines[0]);
                    if (!p.lifelineUsed2) System.out.println("2. " + lifelines[1]);

                    System.out.println("Choose a lifeline:");
                    int choice = s.nextInt();
                    s.nextLine();

                    if (choice == 1 && !p.lifelineUsed1) {
                        p.lifelineUsed1 = true;
                        System.out.println("50-50 lifeline used! Two options remain: ");
                        System.out.println(quiz[i][2] + " and " + quiz[i][3]);
                    } else if (choice == 2 && !p.lifelineUsed2) {
                        p.lifelineUsed2 = true;
                        System.out.println("Audience suggests option " + quiz[i][5]);
                    } else {
                        System.out.println("Invalid or already used lifeline. Choose another.");
                        i--;
                        continue;
                    }
                }

                System.out.println("Enter your answer:");
                answer = s.nextLine();
            }

            if (answer.equals(quiz[i][5])) {
                System.out.println("Correct answer!");
                p.score += 10;
            } else {
                System.out.println("Wrong answer. The correct answer was option " + quiz[i][5]);
                System.out.println("You have won " + p.score + " points.");
                break;
            }
        }

        System.out.println("\nThank you for playing, " + p.Name + "!");
       
        System.out.println("Your final score is: " + p.core + "!");
}

}