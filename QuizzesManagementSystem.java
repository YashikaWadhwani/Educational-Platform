import java.util.*;

public class QuizzesManagementSystem {
    static Scanner scanner = new Scanner(System.in);
    public QuizzesManagementSystem() {
        run();
    }

   

    public void run() {
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Show all quizzes");
            System.out.println("2. Start a quiz");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    showAllQuizzes();
                    break;
                case 2:
                    startQuiz();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println();
        }
    }

    private void showAllQuizzes() {
        System.out.println("Available quizzes:");
        System.out.println("- Mathematics");
        System.out.println("- English");
        System.out.println("- History");
        System.out.println("- Biology");
        System.out.println("- Chemistry");
        System.out.println("- Physics");
    }

    private void startQuiz() {
        System.out.println("Select a quiz:");
        System.out.println("1. Mathematics");
        System.out.println("2. English");
        System.out.println("3. History");
        System.out.println("4. Biology");
        System.out.println("5. Chemistry");
        System.out.println("6. Physics");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                startMathQuiz();
                break;
            case 2:
                startEnglishQuiz();
                break;
            case 3:
                startHistoryQuiz();
                break;
            case 4:
                startBiologyQuiz();
                break;
            case 5:
                startChemistryQuiz();
                break;
            case 6:
                startPhysicsQuiz();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    private void startMathQuiz() {
        System.out.println("Mathematics Quiz:");
        System.out.println("1. What is 2 + 2?");
        System.out.println(" a. 1");
        System.out.println(" b. 2");
        System.out.println(" c. 3");
        System.out.println(" d. 4");
        System.out.println("2. What is the value of pi (π)?");
        System.out.println(" a. 3.14");
        System.out.println(" b. 3.141");
        System.out.println(" c. 3.1415");
        System.out.println(" d. 3.14159");
        System.out.println("3. What is the square root of 64?");
        System.out.println(" a. 6");
        System.out.println(" b. 8");
        System.out.println(" c. 10");
        System.out.println(" d. 12");
        System.out.println("4. What is the formula for the area of a circle?");
        System.out.println(" a. πr²");
        System.out.println(" b. 2πr");
        System.out.println(" c. πd");
        System.out.println(" d. 2πd");
        System.out.println("5. What is the Pythagorean Theorem?");
        System.out.println(" a. a² + b² = c²");
        System.out.println(" b. a² - b² = c²");
        System.out.println(" c. a + b = c");
        System.out.println(" d. a - b = c");
    }
        private void startEnglishQuiz() {
            System.out.println("English Quiz:");
            System.out.println("1. What is the past tense of 'run'?");
            System.out.println("   a. ran");
            System.out.println("   b. runned");
            System.out.println("   c. runned");
            System.out.println("   d. running");
            System.out.println("2. Which of the following is a noun?");
            System.out.println("   a. quickly");
            System.out.println("   b. slowly");
            System.out.println("   c. happiness");
            System.out.println("   d. loudly");
            System.out.println("3. What is a synonym for 'happy'?");
            System.out.println("   a. sad");
            System.out.println("   b. angry");
            System.out.println("   c. joyful");
            System.out.println("   d. tired");
            System.out.println("4. What is a homophone for 'flour'?");
            System.out.println("   a. flower");
            System.out.println("   b. floor");
            System.out.println("   c. flier");
            System.out.println("   d. flee");
            System.out.println("5. What is a synonym for 'big'?");
            System.out.println("   a. small");
            System.out.println("   b. tiny");
            System.out.println("   c. enormous");
            System.out.println("   d. little");
        }
    
        private void startHistoryQuiz() {
            System.out.println("History Quiz:");
            System.out.println("1. In what year did World War II begin?");
            System.out.println("   a. 1939");
            System.out.println("   b. 1940");
            System.out.println("   c. 1941");
            System.out.println("   d. 1942");
            System.out.println("2. Who was the first president of the United States?");
            System.out.println("   a. Thomas Jefferson");
            System.out.println("   b. George Washington");
            System.out.println("   c. Abraham Lincoln");
            System.out.println("   d. John F. Kennedy");
            System.out.println("3. Who wrote the Communist Manifesto?");
            System.out.println("   a. Vladimir Lenin");
            System.out.println("   b. Joseph Stalin");
            System.out.println("   c. Karl Marx");
            System.out.println("   d. Mao Zedong");
            System.out.println("4. Who discovered America?");
            System.out.println("   a. Christopher Columbus");
            System.out.println("   b. Ferdinand Magellan");
            System.out.println("   c. Vasco da Gama");
            System.out.println("   d. Marco Polo");
            System.out.println("5. Who was the first female prime minister of the United Kingdom?");
            System.out.println("   a. Margaret Thatcher");
            System.out.println("   b. Theresa May");
            System.out.println("   c. Angela Merkel");
            System.out.println("   d. Indira Gandhi");
        }
        private void startBiologyQuiz() {
            System.out.println("Biology Quiz:");
            System.out.println("1. What is the powerhouse of the cell?");
            System.out.println("   a. Nucleus");
            System.out.println("   b. Mitochondria");
            System.out.println("   c. Ribosome");
            System.out.println("   d. Lysosome");
            System.out.println("2. Which organ produces insulin in the human body?");
            System.out.println("   a. Liver");
            System.out.println("   b. Pancreas");
            System.out.println("   c. Kidney");
            System.out.println("   d. Stomach");
            System.out.println("3. What is the largest organ in the human body?");
            System.out.println("   a. Brain");
            System.out.println("   b. Heart");
            System.out.println("   c. Skin");
            System.out.println("   d. Liver");
            System.out.println("4. Which of the following is not a type of blood vessel?");
            System.out.println("   a. Artery");
            System.out.println("   b. Capillary");
            System.out.println("   c. Vein");
            System.out.println("   d. Nerve");
            System.out.println("5. Which of the following is not a function of the respiratory system?");
            System.out.println("   a. Transporting oxygen to the body");
            System.out.println("   b. Removing carbon dioxide from the body");
            System.out.println("   c. Helping the body fight infections");
            System.out.println("   d. Regulating the body's pH balance");
        }
    
        private void startChemistryQuiz() {
            System.out.println("Chemistry Quiz:");
            System.out.println("1. What is the chemical symbol for gold?");
            System.out.println("   a. G");
            System.out.println("   b. Au");
            System.out.println("   c. Ag");
            System.out.println("   d. Go");
            System.out.println("2. What is the pH of a neutral solution?");
            System.out.println("   a. 0");
            System.out.println("   b. 7");
            System.out.println("   c. 14");
            System.out.println("   d. 1");
            System.out.println("3. What is the most abundant gas in the Earth's atmosphere?");
            System.out.println("   a. Oxygen");
            System.out.println("   b. Carbon dioxide");
            System.out.println("   c. Nitrogen");
            System.out.println("   d. Methane");
            System.out.println("4. What is the process of a solid turning directly into a gas called?");
            System.out.println("   a. Melting");
            System.out.println("   b. Condensation");
            System.out.println("   c. Sublimation");
            System.out.println("   d. Evaporation");
            System.out.println("5. What is the chemical formula for water?");
            System.out.println("   a. HO");
            System.out.println("   b. H2O");
            System.out.println("   c. O2");
            System.out.println("   d. CO2");
        }
        private void startPhysicsQuiz() {
            System.out.println("Physics Quiz:");
            System.out.println("1. What is the SI unit of force?");
            System.out.println("   a. Newton");
            System.out.println("   b. Kilogram");
            System.out.println("   c. Meter");
            System.out.println("   d. Second");
            System.out.println("2. What is the formula for force?");
            System.out.println("   a. F = ma");
            System.out.println("   b. F = md");
            System.out.println("   c. F = mv");
            System.out.println("   d. F = me");
            System.out.println("3. What is the speed of light?");
            System.out.println("   a. 299,792,458 m/s");
            System.out.println("   b. 300,000,000 m/s");
            System.out.println("   c. 3,000,000 m/s");
            System.out.println("   d. 30,000,000 m/s");
            System.out.println("4. What is the formula for kinetic energy?");
            System.out.println("   a. KE = 1/2 mv^2");
            System.out.println("   b. KE = mv^2");
            System.out.println("   c. KE = 1/2 mv");
            System.out.println("   d. KE = mv");
            System.out.println("5. What is the formula for potential energy?");
            System.out.println("   a. PE = mgh");
            System.out.println("   b. PE = mgh^2");
            System.out.println("   c. PE = mg/h");
            System.out.println("   d. PE = mg*h");
        }
}
