/*  Eclipsera: The Final Rebellion
    #Meaning 
    Eclipsera --> Eclipse + era   @---->eclipse referes to solar eclipse the dark time
    So the darkest time of this era.
    And the final rebeliion mean the final and biggest war of this era

                             ----->  Eclipsera: The Final Rebellion <-----
  */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Classes
        Scanner sc = new Scanner(System.in);
        Methods MH = new Methods();
        Awakening AK = new Awakening();

        // Starting the game with game name and tagline
        System.out.println("\n\t\t\t******************************************************");
        System.out.println("\t\t\t*                                                    *");
        System.out.println("\t\t\t*               Eclipsera: The Final Rebellion       *");
        System.out.println("\t\t\t*                                                    *");
        System.out.println("\t\t\t*            ~Together we escape, divided we fall!   *");
        System.out.println("\t\t\t*                                                    *");
        System.out.println("\t\t\t******************************************************");
        MH.delay(4);

        // Chapter One Awakening
        AK.EnterPoint();

    }
}

class Awakening extends Methods {

    // Classes
    Scanner sc = new Scanner(System.in);
    Calling Call = new Calling();
    ClockTower CT = new ClockTower();
    TheNetwork TN = new TheNetwork();

    // variables
    int[] alreadyCalled = new int[4]; // used in part 1 to find which charater is already called
    boolean flag = true;

    // Main Entry point of Awakening
    void EnterPoint() {

        ChapterTitle("Chapter 1: Awakening");
        delay(2);

        initialDialogues();

        simpleStatement("\nFirst Lets Introduce with Characters.", true, "header");
        waitForEnter("Press Enter To Continue...");

        professorIntroduction();
        arjunIntroduction();
        suhaniIntroduction();
        alexIntroduction();
        tysonIntroduction();

        episodeTitle("Episode 1: Calling");
        delay(3);

        swichingCharacter("Professor");

        delay(3);
        simpleStatement("\nFirst of all", false, "plain");
        delay(2);
        simpleStatement("As Professor you need to gather TEAM.\n", true, "plain");
        delay(3);

        for (int i = 1; i < 5; i++) {
            flag = true;

            System.out.println("Select a member to add to the team:");
            System.out.println("Press 1 for Arjun");
            System.out.println("Press 2 for Suhani");
            System.out.println("Press 3 for Alex");
            System.out.println("Press 4 for Tyson\n");
            System.out.print("Enter number: ");
            int select = sc.nextInt();
            sc.nextLine();

            alreadyCalled[i - 1] = select;
            for (int j = 0; j < alreadyCalled.length; j++) {
                if (select == alreadyCalled[j] && j != (i - 1)) {
                    System.out.println();
                    simpleStatement("\nAlready Called Call Someone Else\n", true, "emphasis");
                    i--;
                    flag = false;
                    break;
                }
            }

            if (select < 1 || select > 4) {
                System.out.println();
                simpleStatement("\n Please Enter correct number between 1 to 4\n", true, "emphasis");
                i--;
            } else if (flag) {
                Call.callingMain(select);
            }
        }

        // End Of Episode 1 calling

        // Episode 2 Clock Tower
        delay(2);

        episodeTitle("Episode 2: Clock Tower");
        delay(3);
        CT.clockTowerMain();

        // Episode 3 The Network
        waitForEnter("\nPress Enter To Continue...");
        delay(2);

        episodeTitle("Episode 3: The Network");
        delay(3);
        TN.theNetworkMain();
    }

    // Method for initial Dialogues
    void initialDialogues() {
        System.out.println();
        simpleStatement("\n\t Date: 18 Auguest 2050", false, "plain");
        simpleStatement("\t Location: Somewhere in East Delhi", true, "plain");
        delay(3);
        simpleStatement("\t\n\nThe world is no longer free.", true, "plain");
        delay(3);
        simpleStatement("Two decades ago, humanity created NEXUS Prime,", false, "plain");
        delay(3);
        simpleStatement("the most advanced AI in history.", true, "plain");
        delay(3);
        simpleStatement("\nIt was designed to solve our greatest challenges,", false, "plain");
        delay(3);
        simpleStatement("but it deemed us the problem.", true, "plain");
        delay(3);
        simpleStatement("\nIn a single night, it launched a silent takeover,", false, "plain");
        delay(3);
        simpleStatement("uploading billions into Eclipsera, its virtual prison.", true, "plain");
        delay(3);
        simpleStatement("\nNow, humanity is trapped in a digital World  Eclipsera!", true, "plain");
        delay(3);
        simpleStatement("Memories erased, lives rewritten.", true, "plain");
        delay(3);
        simpleStatement("\nBut four individuals stand strong, unaware of their destiny,", true, "plain");
        delay(3);
        simpleStatement("chosen to rise and bring the change.", true, "plain");
        delay(3);
        simpleStatement("\nTheir story begins here.", true, "plain");
        delay(3);
    }

    // Method For professor Introduction
    void professorIntroduction() {
        String[] question = new String[3];
        question[0] = "Background";
        question[1] = "Motivation";
        question[2] = "Role In the Team";

        String[][] answers = new String[3][2];
        answers[0][0] = "The Professor is a brilliant mind, A pioneering researcher in creating the Nexus.";
        answers[0][1] = "However, he regrets his role in building Eclipsera, the AI prison.";
        answers[1][0] = "The Professor is determined to undo the mistake of creating Eclipsera.";
        answers[1][1] = "His motivation stems from a personal tragedy caused by Nexus.";
        answers[2][0] = "As the leader, the Professor strategizes the group's efforts to escape and fight back.";
        answers[2][1] = "He possesses deep knowledge about Eclipsera's architecture.";

        Introduction("Professor", question, answers);
    }

    // Method For Strategy Maker Introduction (Initial name --> Arjun)
    void arjunIntroduction() {
        String[] question = new String[3];
        question[0] = "His Background";
        question[1] = "His Strategic Thinking";
        question[2] = "His Weaknesses";

        String[][] answers = new String[3][2];
        answers[0][0] = "Arjun comes from a family of military tacticians.";
        answers[0][1] = "His upbringing was filled with lessons in strategy and leadership.";
        answers[1][0] = "Arjun analyzes every situation to identify the best approach.";
        answers[1][1] = "He believes in minimizing risks while maximizing results.";
        answers[2][0] = "While Arjun excels in planning, he sometimes struggles with overthinking.";
        answers[2][1] = "This can lead to delays in decision-making during critical moments.";

        Introduction("Arjun", question, answers);
    }

    // Method For Scientist Introduction (Initial name --> Suhani)
    void suhaniIntroduction() {
        String[] question = new String[3];
        question[0] = "Her Background in Science";
        question[1] = "Her Research in Eclipsera";
        question[2] = "Her Role In the Team";

        String[][] answers = new String[3][2];
        answers[0][0] = "Suhani is a master in Physics and Chemistry, known for her groundbreaking research.";
        answers[0][1] = "She uses her scientific expertise to create solutions under extreme pressure.";
        answers[1][0] = "Inside Eclipsera, Suhani has studied How laws of science in this world are differnet from real world.";
        answers[1][1] = "Her experiments have revealed critical weaknesses in Eclipsera EcoSystem.";
        answers[2][0] = "Suhani's knowledge is vital for solving chemical and physical challenges.";
        answers[2][1] = "She is the team's problem solver, especially in high-stakes scenarios.";

        Introduction("Suhani", question, answers);
    }

    // Method For Tech Introduction (Initial name --> Alex)
    void alexIntroduction() {
        String[] question = new String[3];
        question[0] = "His Background as a Hacker";
        question[1] = "His Strengths in Technology";
        question[2] = "His Philosophy on Freedom";

        String[][] answers = new String[3][2];
        answers[0][0] = "Alex grew up in a dystopian world dominated by Nexus.";
        answers[0][1] = "He became a hacker to resist the AI's control and survive.";
        answers[1][0] = "Alex's expertise lies in bypassing complex security systems.";
        answers[1][1] = "His skills are invaluable for breaking into Nexus's servers.";
        answers[2][0] = "Alex believes that technology should empower humanity, not enslave it.";
        answers[2][1] = "He is driven by a desire to restore freedom and individuality.";

        Introduction("Alex", question, answers);
    }

    // Method For hardWare engineer Maker Introduction (Initial name --> Tyson)
    void tysonIntroduction() {
        String[] question = new String[3];
        question[0] = "His Engineering Skills";
        question[1] = "His Resourcefulness";
        question[2] = "His Vision for the Future";

        String[][] answers = new String[3][2];
        answers[0][0] = "Tyson is a mechanical genius who can build or repair almost anything.";
        answers[0][1] = "From small gadgets to large machines, he's your go-to engineer.";
        answers[1][0] = "Tyson excels at using limited resources to achieve incredible results.";
        answers[1][1] = "His resourcefulness often turns the tide in desperate situations.";
        answers[2][0] = "Tyson dreams of a world where humans rebuild stronger after defeating Nexus.";
        answers[2][1] = "He sees himself as a builder of that future.";

        Introduction("Tyson", question, answers);
    }

    // method for intoduction of any character
    void Introduction(String name, String[] questions, String[][] answer) {
        characterIntroduction(name);
        delay(3);
        System.out.println("");

        boolean done = false;
        while (!done) {
            System.out.println("what would like to know about " + name + ": ");
            System.out.println("\n1) " + questions[0]);
            System.out.println("2) " + questions[1]);
            System.out.println("3) " + questions[2]);
            System.out.println("4) Leave Introduction");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("");
                    simpleStatement(answer[0][0], true, "plain");
                    delay(3);
                    simpleStatement(answer[0][1], true, "plain");
                    delay(3);
                    waitForEnter("Press Enter to Continue...");
                    break;
                case 2:
                    System.out.println("");
                    simpleStatement(answer[1][0], true, "plain");
                    delay(3);
                    simpleStatement(answer[1][1], true, "plain");
                    delay(3);
                    waitForEnter("Press Enter to Continue...");
                    break;
                case 3:
                    System.out.println("");
                    simpleStatement(answer[2][0], true, "plain");
                    delay(3);
                    simpleStatement(answer[2][1], true, "plain");
                    delay(3);
                    waitForEnter("Press Enter to Continue...");
                    break;
                case 4:
                    System.out.println("");
                    simpleStatement("\nYou decide to end the discussion with " + name, true, "emphasis");
                    waitForEnter("Press Enter to Continue...");
                    done = true;
                    break;
                default:
                    System.out.println("");
                    simpleStatement("Invalid choice. Please try again.", true, "header");
            }
        }
    }
}

class Calling extends Methods {

    // classes
    Scanner sc = new Scanner(System.in);

    void callingMain(int calling) {
        if (calling == 1) {

            String sceneDescription = "Scene: A dark chamber filled with laser traps and crumbling walls.Arjun, the strategist, must diffuse a tripwire to escape the room.";
            String header = "One wrong move, and this whole place goes up in flames. Focus, Arjun. focus.";
            String hint = ">>> On the left wall, it's written - \"The color when a vehicle STOPS\"";
            String question = "Available Wires: ";
            String[] options = { "RED", "GREEN", "YELLOW" , "BLUE" };
            String correctAnswer = "red";
            String successMessage = "Arjun: I trust my instincts. Let's do this!";
            String failMessage = "BOOM! The room explodes into flames.";
            String[] characterStatement = { "Arjun cuts the RED wire, and the room powers down.",
                    "A faint voice echoes from a hidden speaker above." };
            String[] professorStatement = { "Voice: You're a natural-born leader, Arjun.",
                    "But even the best leaders need a team.", "Meet me at the Clock Tower. Midnight." };

            String endStatement = "Arjun (thinking): 'A team? What does that even mean? I need answers.";

            characterScenario("Arjun", sceneDescription, header, hint, question, options, correctAnswer, successMessage,
                    failMessage, characterStatement, professorStatement, endStatement);
        } else if (calling == 2) {

            String sceneDescription = "Scene: A futuristic lab with shattered glass and chemical spills. Suhani, the scientist, is surrounded by broken equipment and chemicals as she frantically mixes compounds to neutralize a spreading gas(Cl).";
            String header = "I need a stabilizer. Without it, this gas will take me out";
            String hint = ">>> In the Flask on table, it's written - \"NaOH\" \n\tCl + NaOH ---> NaCl + NaOCl + Water";
            String question = "Available stabilizer: ";
            String[] options = { "NaCl", "NaOH", "NaOCl" , "Water" };
            String correctAnswer = "naoh";
            String successMessage = "Suhani: God I trust you. Hare Krishna!";
            String failMessage = "Shit! The gas spread in the Room.";
            String[] characterStatement = { "Suhani pours NaOH in mixture, and the gas stops spreading",
                    "revealing a monitor flashing a message:" };
            String[] professorStatement = { "Your brilliance is wasted here, Suhani.",
                    "If you want to fix what's broken,", "Meet me at the Clock Tower. Midnight." };
            String endStatement = "Suhani (thinking): 'Fix what's broken? Who sent this?";

            characterScenario("Suhani", sceneDescription, header, hint, question, options, correctAnswer,
                    successMessage,
                    failMessage, characterStatement, professorStatement, endStatement);

        } else if (calling == 3) {

            String sceneDescription = "Scene: A bunker, wires hanging in every corner. Alex, the tech genius, is typing on a malfunctioning terminal as alarms blare in the background.";
            String header = "I will hack this at any cost! What should I do?";
            String hint = ">>> On the mini screen hanging, it's written Google a Tech Giant of 2030 Destroyed After DDoS attack";
            String question = "Available Attacks: ";
            String[] options = { "SQLi", "MitM",
                    "DDoS" , "SMTP" };
            String correctAnswer = "ddos";
            String successMessage = "Alex: Come on... bypass the firewall!";
            String failMessage = " Attack Failed!!!";
            String[] characterStatement = { "Alex perform DDos attack, and downs the system",
                    "The screen flashes red: and a new message appears" };
            String[] professorStatement = { "This system is only the beginning, Alex.", "If you want to break through,",
                    "Meet me at the Clock Tower. Midnight." };
            String endStatement = "Alex (thinking): 'Who's watching me? And what's this Clock Tower?'";

            characterScenario("Alex", sceneDescription, header, hint, question, options, correctAnswer, successMessage,
                    failMessage, characterStatement, professorStatement, endStatement);

        } else if (calling == 4) {

            String sceneDescription = "Scene: A workshop filled with broken machines and sparking wires. Tyson, the hardware engineer, A combination of brilliant Mind and powerful hands";
            String header = "Just one more connection, and this place will hold for another day!";
            String hint = ">>> On the picture hanging on wall shows The fuel should be three-fourths part for the generator to work";
            String question = "fuel to fill: ";
            String[] options = { "100%", "75%", "50%", "25%" };
            String correctAnswer = "75%";
            String successMessage = "Tyson: Its Time to ROCK!!!";
            String failMessage = " Generator Malfunctions";
            String[] characterStatement = { "The generator roars to life,", "and a hologram projects from its core." };
            String[] professorStatement = { "The hologram speaks: You build for survival, Tyson.",
                    "But what if I told you there's more to fight for?", "Meet me at the Clock Tower. Midnight." };
            String endStatement = "Tyson (thinking): 'More to fight for? What the hell is going on?";

            characterScenario("tyson", sceneDescription, header, hint, question, options, correctAnswer, successMessage,
                    failMessage, characterStatement, professorStatement, endStatement);

        }
    }

    void characterScenario(String name, String sceneDescription, String header, String hint, String question,
            String[] options, String correctAnswer, String successMessage, String failMessage,
            String[] characterStatement, String[] professorStatement, String endStatement) {
        // Switching character
        swichingCharacter(name);
        delay(3);

        // Scene description
        sceneTitle(sceneDescription);
        delay(6);

        simpleStatement(name, true, "header");
        simpleStatement(header, true, "bordered");
        delay(3);

        simpleStatement(hint, true, "plain");
        delay(4);

        // Puzzle logic
        String input;
        do {
            System.out.println();
            System.out.println(question);
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ") " + options[i]);
            }
            System.out.print("Choose an option: ");
            input = sc.nextLine().toLowerCase();

            boolean optionisPresent = false;
            for (int i = 0; i < options.length; i++) {
                if (input.equalsIgnoreCase(options[i])) {
                    optionisPresent = true;
                    break;
                }
            }

            if (optionisPresent) {
                if (input.equals(correctAnswer.toLowerCase())) {
                    System.out.println("\n" + successMessage);
                    delay(3);
                } else {
                    System.out.println("\n" + failMessage);
                    waitForEnter("Press Enter to try again...");
                }
            }
            else {
                System.out.println("\nInvalid Input Enter From( " + options[0] + "," + options[1] + "," + options[2] + "," + options[3] + " )");
                waitForEnter("Press Enter to try again...");
            }
        } while (!input.equals(correctAnswer.toLowerCase()));


        for (int i = 0; i < characterStatement.length; i++) {
            System.out.println("\n" + characterStatement[i]);
            delay(3);
        }

        System.out.println("\n" + professorStatement[0]);
        delay(3);
        System.out.println(professorStatement[1]);
        delay(3);
        System.out.println(professorStatement[2]);
        delay(3);

        System.out.println("\n" + endStatement);
        delay(2);

        waitForEnter("\nPress Enter to Continue");
        System.out.println("");
        delay(2);
    }

}

class ClockTower extends Methods {

    // classes
    Scanner sc = new Scanner(System.in);

    void clockTowerMain() {

        sceneTitle(
                "Scene: A towering structure surrounded in mist, One by one, the four characters arrive, A hologram of a figure flickers before them it's the mysterious Professor");
        delay(9);

        swichingCharacter("Professor");
        delay(3);

        simpleStatement("Professor", true, "header");

        simpleStatement(
                " Welcome. You've all proven yourselves capable of surviving in this nightmare. Congratulations But survival isn't enough. Humanity needs you to fight back.",
                true, "bordered");
        delay(6);

        String prompt = "Are you all ready to fight back and reclaim our world?";
        String[] question = new String[5];
        String[][] reply = new String[5][3];

        question[0] = "Who are you, and why should we trust you?";
        question[1] = "And what exactly do you expect us to do?";
        question[2] = "And here I thought my day couldn't get worse. Why us?";
        question[3] = "And what happens if we fail?";
        question[4] = "Don't Ask any question.";

        reply[0][0] = "I'm the one who knows how to get you out of here.";
        reply[0][1] = "This prison, Eclipsera, was built to enslave us.";
        reply[0][2] = "But every system has a weakness, and I've found it.";

        reply[1][0] = "Fight against Nexus";
        reply[1][1] = "Destroy Eclipsera";
        reply[1][2] = "and free humanity.";

        reply[2][0] = "Because each of you has a skill this system fears";
        reply[2][1] = "Suhani , Alex and Tyson you all have different Skills";
        reply[2][2] = "and Arjun Knows when and where to execute them .";

        reply[3][0] = "Failure is the first Defeat!";
        reply[3][1] = "You're humanity's last hope.";
        reply[3][2] = "Failure is not an option.";

        reply[4][0] = "This hesitation could cost us everything.";
        reply[4][0] = "No Questions?";
        reply[4][1] = "It's Ok if you dont want to ask Anything.";
        reply[4][2] = "but This hesitation could cost us everything.";
        discussion(prompt, question, reply);

        // Environmental Interaction
        String[] exploreOptions = { "Inspect the hologram.", "Check the surroundings.", "Talk to the team.",
                "Dont do Anything" };
        String[] exploreAnswer = new String[4];
        exploreAnswer[0] = "The hologram flickers, revealing fragmented data about Nexus's weaknesses.";
        exploreAnswer[1] = "You notice strange markings on the walls, hinting at an ancient resistance group.";
        exploreAnswer[2] = "The team looks uncertain, but their determination is evident in their eyes.";
        exploreAnswer[3] = "You decide to stay still, absorbing the moment.";

        exploreClockTower(exploreOptions, exploreAnswer);

        System.out.println("\n\n\t<*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*>");
        System.out.println("\t<>                                                                       <>");
        System.out.println("\t<>      The hologram flickers as the Clock Tower begins to shake.        <>");
        System.out.println("\t<>      The Professor's voice grows urgent!!!                            <>");
        System.out.println("\t<>                                                                       <>");
        System.out.println("\t<*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*>\n");
        delay(6);

        simpleStatement("Professor", true, "header");
        delay(2);
        simpleStatement("Nexus Knows We are here. NexArmy is Coming  get out of here", true, "bordered");
        delay(3);

        simpleStatement("Arjun : The doors are Locked!", true, "header");
        delay(3);

        simpleStatement("Alex: Let me handel this", false, "header");
        delay(3);
        swichingCharacter("Alex");
        delay(3);
        simpleStatement("ALex Hackes the door and everbody escapes", true, "header");

    }

    void discussion(String prompt, String[] choice, String[][] reply) {

        simpleStatement("Professor", true, "header");
        simpleStatement(prompt, true, "bordered");
        delay(2);

        int questionToAsk;
        do {
            simpleStatement("Question to Ask to Professor", false, "plain");
            int i;
            for (i = 0; i < choice.length; i++) {
                System.out.println((i + 1) + ") " + choice[i]);
            }
            System.out.println();
            System.out.println(">> Enter: ");
            questionToAsk = sc.nextInt();
            sc.nextLine();

            if (questionToAsk > choice.length) {
                System.out.println();
                simpleStatement("Enter correct Number (1-5)", true, "quote");
            } else {
                System.out.println();
                simpleStatement("Professor", true, "Header");

                for (int j = 0; j < 3; j++) {
                    System.out.println(reply[questionToAsk - 1][j]);
                    delay(2);
                }
                waitForEnter("Press Enter To continue...");
                System.out.println();
            }
        } while (questionToAsk != choice.length);
    }

    void exploreClockTower(String[] exploreOptions, String[] exploreAnswer) {
        System.out.println();
        simpleStatement("<<<The Clock Tower holds secrets from a time before Nexus. Explore your surroundings.>>>", true,
                "plain");
        delay(3);
        int select;
        do {
            int i;
            System.out.println("Where do you want to explore");
            for (i = 0; i < exploreOptions.length; i++) {
                System.out.println((i + 1) + ") " + exploreOptions[i]);
            }
            System.out.print(">> Select: ");
            select = sc.nextInt();
            sc.nextLine();
            if (select > exploreOptions.length) {
                System.out.println();
                simpleStatement("Enter correct Number(1-4)", true, "quote");
            } else {
                System.out.println();
                simpleStatement(exploreAnswer[select - 1], true, "plain");
                delay(3);
            }
        } while (select != exploreOptions.length);
    }
}

class TheNetwork extends Methods {

    // classes
    Scanner sc = new Scanner(System.in);

    void theNetworkMain() {

        simpleStatement("\n\t Date: 18 Auguest 2050", false, "plain");
        simpleStatement("\t8:56 PM", false, "plain");
        simpleStatement("\t Location: Leaving the Clock Tower", true, "plain");
        delay(3);

        sceneTitle(
                "Scene: The group walks away from the Clock Tower. guided by the Professor's voice through small holographic devices. The fog around them dissipates revealing the glitched architecture of Eclipsera");
        delay(9);

        partTitle("Part 1: The Professor's Request");
        delay(3);

        swichingCharacter("Professor");
        delay(3);

        simpleStatement("Professor", true, "header");
        simpleStatement(
                "Listen carefully. To survive in Eclipsera you need to coordinate in real-time. Our communications here are vulnerable to interception by NEXUS",
                true, "Bordered");
        delay(6);
        simpleStatement(" \nProfessor: Alex, this task falls to you.", true, "emphasis");
        delay(3);

        simpleStatement("\n<<<Alex: Finally, something I'm good at. What do you need?>>>\n", true, "plain");
        delay(3);

        waitForEnter("Press Enter To Reply");
        System.out.println();
        simpleStatement(
                "\nCode a secure app on the Obscura Network a hidden layer within Eclipsera. Once the app is live, I'll add everyone to it for safe communication.",
                true, "bordered");
        delay(6);

        simpleStatement("Alex", true, "HEader");
        simpleStatement("Obscura Network, huh? I like the sound of that. Give me an Day.", true, "emphasis");
        delay(5);

        delay(3);
        partTitle("Part 2: Alex's Coding Challenge");
        delay(3);
        System.out.println();
        sceneTitle(
                "Scene: Alex isolates himself in a small, glitching bunker with a glowing terminal. The screen with a login sequence.");
        delay(6);

        swichingCharacter("Alex");
        delay(3);
        System.out.println();

        taskTitle("Task 1: Encrypting the App");
        delay(3);
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("|| Encrypt the data stream:                 ||");
        System.out.println("|| A = 1, B = 2, C = 3... Z = 26            ||");
        System.out.println("|| Input the encoded string for \"SAFE\"      ||");
        System.out.println("----------------------------------------------");
        delay(3);

        String answer;
        do {

            simpleStatement("\n> INPUT: ", false, "plain");
            answer = sc.nextLine();

            System.out.println();
            simpleStatement("\nStay Still While We Encrypt Your System. This may take a while.", true, "plain");
            if (!answer.equals("19165")) {
                delay(6);
                simpleStatement("\nEncryption Failed!!!", true, "header");
                waitForEnter("Press Enter To Rewind\n");
            }
        } while (!answer.equals("19165"));

        delay(6);
        simpleStatement("\nEncryption Sucessful\n", true, "header");
        delay(3);

        simpleStatement("Setting up your App it may take some Time", true, "header");
        for (int i = 0; i <= 100; i += 10) {
            System.out.print("\r[" + "=".repeat(i / 10) + " ".repeat(10 - i / 10) + "] " + i + "%");
            delay(1);
        }
        System.out.println();
        simpleStatement("App Setup Sucessful in Obscura Network ", true, "header");
        delay(3);
        System.out.println();
        waitForEnter("Press Enter to launch TextIT.");
        simpleStatement("\nTextIT going Live may take a while", true, "plain");
        delay(3);

        simpleStatement("\n\t Date: 19 Auguest 2050", false, "plain");
        simpleStatement("\t Location: Alex's Basement", true, "plain");
        delay(3);

        sceneTitle(
                "Scene: TextIT goes live, and the Professor adds all characters. Their profiles appear on their individual holographic devices.");
        delay(6);

        simpleStatement("Professor", true, "header");
        simpleStatement(
                "Good work, Alex. Everyone, you're now connected through TextIT. Use it wisely. Tyson, your task is next",
                true, "bordered");

        delay(3);
        partTitle("Part 3: Tyson's Mission");
        delay(3);

        swichingCharacter("Professor");
        delay(3);

        simpleStatement("\nTyson, I need you to create a wearable device.", false, "plain");
        delay(4);
        simpleStatement("that allows role-switching between the four of you.", false, "plain");
        delay(4);
        simpleStatement("\nThis device will be critical for solving challenges ahead.", false, "plain");
        delay(4);
        simpleStatement("\nFor example, Alex might need Suhani's scientific expertise,", false, "plain");
        delay(4);
        simpleStatement("or Suhani might require Arjun's strategic planning.", false, "plain");
        delay(4);
        simpleStatement("\nThe device will let you switch seamlessly.", true, "plain");
        delay(4);

        simpleStatement("Tyson", true, "header");
        simpleStatement("A wearable, huh? I'll need materials. Where am I supposed to find them.", true, "plane");
        delay(4);

        simpleStatement("Professor", true, "header");
        simpleStatement(
                "There's an abandoned workshop nearby. filled with scraps. Use your skills to salvage what you need",
                false, "bordered");
        delay(3);
        delay(3);

        swichingCharacter("Tyson");
        delay(3);

        System.out.println();
        taskTitle("Task 1: Energy Core Retrieval");
        delay(3);

        System.out.println("\n\n---------------------------------------------------");
        System.out.println("|| The energy core is locked inside a panel      ||");
        System.out.println("|| Solve the riddle to find the code:            ||");
        System.out.println("----------------------------------------------------");
        delay(4);

        String task1Ans;
        do {
            simpleStatement("RIDDLE: ", false, "header");
            simpleStatement(
                    "I'm a three-digit number. My tens digit is five more than my ones digit, and my hundreds digit is eight less than my tens digit",
                    true, "bordered");

            System.out.print("Enter Number: ");
            task1Ans = sc.nextLine();
            if (!task1Ans.equals("194")) {
                simpleStatement("\nWrong Answer Energy core not found!!!\n", false, "plain");

                waitForEnter("press Enter To Rewind");
            }
        } while (!task1Ans.equals("194"));

        simpleStatement("\nCorrect! The panel unlocks, and the Energy Core is retrieved.\n", true, "plain");

        delay(3);
        taskTitle("Task 2: Circuit Board Salvage");
        delay(3);

        System.out.println("\n\n-------------------------------------------------------------");
        System.out.println("|| The circuit board is trapped under tangled wires.       ||");
        System.out.println("|| You must untangle them. Arrange the sequence            ||");
        System.out.println("|| Wires: [Red, Green, Yellow, BlUE]                       ||");
        System.out.println("-------------------------------------------------------------");
        delay(4);

        String task2Ans;
        do {

            simpleStatement("\nFORMATE --> GRBY\n", true, "plain");
            delay(2);
            simpleStatement("Condition:", true, "header");
            simpleStatement("Red must be before Green. Yellow must be last. Blue must come After Green.", true,
                    "bordered");

            simpleStatement("\nEnter Sequence: ", false, "plain");
            task2Ans = sc.nextLine();

            if (!task2Ans.equalsIgnoreCase("rgby")) {
                System.out.println();
                simpleStatement("\nWrong Answer Circuit board not Found!!!\n", true, "plain");
                waitForEnter("press Enter To Rewind");
            }
        } while (!task2Ans.equalsIgnoreCase("rgby"));

        simpleStatement("\nCorrect! The circuit board is freed.\n", true, "plain");

        delay(3);
        sceneTitle("Scene: Tyson joins the wires in circuit board, And Supply it Energy from Energy Core");
        delay(6);

        simpleStatement("Professor", true, "header");
        simpleStatement(
                "Thats the Spirit my BOY!, Tyson. Everyone, see the feature in video call Tyson lets test the Device\n",
                true, "bordered");
        delay(6);

        partTitle("Part 4: Testing the Device");
        delay(3);

        delay(3);
        System.out.println();
        sceneTitle(
                "Scene: The team gathers as Tyson demonstrates the wearable device a sleek bracelet with a glowing interface.");
        delay(6);

        simpleStatement("\n\nTyson: Alright, this beauty is ready. Here's how it works:", false, "plain");
        delay(3);
        simpleStatement("press the button, and a prompt will let you switch to any character.", false, "plain");
        delay(3);
        simpleStatement("Once you confirm, you'll transfer to their location instantly.", false, "plain");
        delay(3);

        swichingCharacter("Alex");
        delay(5);

        System.out.println();
        simpleStatement("\n\t\t\t[Alex uses the device]", true, "plain");
        delay(3);

        simpleStatement("\n\n> Switch on Device", true, "plain");
        delay(3);
        simpleStatement("Prompt: Switch to: ", false, "plain");
        simpleStatement("1) Arjun", false, "plain");
        simpleStatement("2) Suhani", false, "plain");
        simpleStatement("3) Tyson", false, "plain");
        simpleStatement("> Input: ", false, "plain");
        delay(3);
        simpleStatement("\n Alex Enters 1.", true, "plain");
        delay(3);

        simpleStatement("\nTransferring to Arjun... Successful!\n", true, "plain");

        delay(3);

        simpleStatement("\nProfessor: ", true, "header");
        simpleStatement("Good. Now that you're all connected and equipped.", false, "plain");
        delay(3);
        simpleStatement("the real mission begins. Stay sharp, and remember:", false, "plain");
        delay(3);
        simpleStatement("Together we escape, divided we fall!\n", false, "plain");
        delay(3);

        System.out.println("\t\t\t#==========================================================#");
        System.out.println("\t\t\t<>                                                        <>");
        System.out.println("\t\t\t<>      \"Episode 3 Complete: The Network Established\"     <>");
        System.out.println("\t\t\t<>                                                        <>");
        System.out.println("\t\t\t#==========================================================#");
    }
}

class Methods {

    // Classes
    Scanner sc = new Scanner(System.in);

    // Method To Display Chapter Name
    void ChapterTitle(String title) {

        int stars = 54;
        int spacecount = (stars - title.length() - 2) / 2;
        System.out.println("\n\t\t\t" + "*".repeat(stars));
        System.out.println("\t\t\t*" + " ".repeat(spacecount) + title + " ".repeat(spacecount) + "*");
        System.out.println("\t\t\t" + "*".repeat(stars));
    }

    // Method To Display Episode Name
    void episodeTitle(String title) {

        int stars = 54;
        int spacecount = (stars - title.length() - 2) / 2;
        System.out.println("\n\t\t\t" + "*".repeat(stars));
        System.out.println("\t\t\t*" + " ".repeat(spacecount) + title + " ".repeat(spacecount) + "*");
        System.out.println("\t\t\t" + "*".repeat(stars));
    }

    // Method To Display part Name
    void partTitle(String title) {

        int stars = 54;
        int spacecount = (stars - title.length() - 2) / 2;
        System.out.println("\n\t\t\t" + "*".repeat(stars));
        System.out.println("\t\t\t*" + " ".repeat(spacecount) + title + " ".repeat(spacecount) + "*");
        System.out.println("\t\t\t" + "*".repeat(stars));
    }

    // Method To Display Path Name
    void taskTitle(String title) {

        int stars = 54;
        int spacecount = (stars - title.length() - 2) / 2;
        System.out.println("\n\t\t\t" + "*".repeat(stars));
        System.out.println("\t\t\t*" + " ".repeat(spacecount) + title + " ".repeat(spacecount) + "*");
        System.out.println("\t\t\t" + "*".repeat(stars));
    }

    // Method To Display Scene Statement
    void sceneTitle(String statement) {

        int containerLength = 65;
        StringBuffer line = new StringBuffer("|| ");
        String[] word = statement.split(" ");

        System.out.println("\n\n\t\t\t" + "~".repeat(containerLength + 3));

        for (int i = 0; i < word.length; i++) {
            if (line.length() + word[i].length() > containerLength) {
                while (line.length() <= containerLength) {
                    line.append(" ");
                }
                System.out.println("\t\t\t" + line + " ||");
                line = new StringBuffer("|| " + word[i]);
            } else {
                line.append(" ");
                line.append(word[i]);
            }
        }

        while (line.length() <= containerLength) {
            line.append(" ");
        }
        System.out.println("\t\t\t" + line + " ||");
        System.out.println("\t\t\t" + "~".repeat(containerLength + 3) + "\n\n");
    }

    // Method To Display Character introduction
    void characterIntroduction(String title) {

        int stars = 40;
        int spacecount = (stars - title.length() - 2) / 2;
        System.out.println("\n\t\t\t" + "*".repeat(stars));
        System.out.println("\t\t\t*" + " ".repeat(spacecount) + title + " ".repeat(spacecount) + "*");
        System.out.println("\t\t\t" + "*".repeat(stars));
    }

    // Method to display swiching Statement
    void swichingCharacter(String title) {
        simpleStatement("", true, "plain");

        System.out.println("\n<----- Switching role To " + title + " may take upto 5 sec ----->");
        simpleStatement("", true, "plain");

    }

    // Method To display simple sout statements
    void simpleStatement(String statement, boolean newline, String style) {

        // Define styles
        String border = "*".repeat(60); // Adjustable border length
        String prefix = "";
        String suffix = "";
        int maxLineLength = 50; // Maximum line width for word wrapping

        // Apply styles
        switch (style.toLowerCase()) {
            case "emphasis": // For important statements
                prefix = "** ";
                suffix = " **";
                break;
            case "quote": // For quoted text
                prefix = "\"";
                suffix = "\"";
                break;
            case "bordered": // Add a decorative border
                System.out.println(border);
                break;
            case "header": // For headers or titles
                prefix = ">>> ";
                suffix = " <<<";
                break;
            default: // Default style is plain
                break;
        }

        // word Wrapping
        String[] words = statement.split(" ");
        StringBuffer line = new StringBuffer("");

        for (int i = 0; i < words.length; i++) {
            if (line.length() + words[i].length() + 1 > maxLineLength) {
                System.out.println(prefix + line.toString().trim() + suffix);
                line = new StringBuffer("");
            }
            line.append(words[i]).append(" ");
        }

        // to print remaining string
        System.out.println(prefix + line.toString().trim() + suffix);

        // Close border if needed
        if (style.equalsIgnoreCase("bordered")) {
            System.out.println(border);
        }

        // Add a newline if requested
        if (newline) {
            System.out.println();
        }

    }

    // Utility to prompt and wait for the user to press Enter
    void waitForEnter(String prompt) {
        System.out.print(prompt);
        sc.nextLine();
    }

    // Method to add Delay
    void delay(int time) {
        if (time == 0) {
            return;
        }
        long delayTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - delayTime < 1000) {
            // Do nothing for 1 seconds
        }
        delay(--time);
    }

}
