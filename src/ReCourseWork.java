import java.util.Scanner;
public class ReCourseWork {

        int count = 0;
        int c_number[] = new int[5];
        String name[] = new String[5];
        int age[] = new int[5];
        int coins[] = new int[5];
        int score[] = new int[5];
        double distance[] = new double[5];

        int c_numberNew;
        String nameNew;
        int ageNew;
        int coinsNew;
        int scoreNew;
        double distanceNew;

        public static void main(String[] args){
            System.out.println("\t\t WELCOME TO TEMPLE RUN");
           ReCourseWork cw= new ReCourseWork();
            cw.addPlayer();
        }

        void menu(){
            Scanner sc = new Scanner(System.in);
            String input;
            System.out.println("  ");
            System.out.println("\t\t WELCOME TO TEMPLE RUN");
            System.out.println("\t\t\t MENU \n");
            System.out.println("A - Add a Player");
            System.out.println("V - View Players");
            System.out.println("C - Highest Coins");
            System.out.println("S - Highest Score");
            System.out.println("D - Highest Distance");
            System.out.println("E - Search");

            input = sc.next();

            switch (input.toUpperCase()){
                case "A":
                    addPlayer();
                    break;
                case "V":
                    viewPlayer();
                    break;
                case "C":
                    highestCoins();
                    break;
                case "S":
                    highestScore();
                    break;
                case "D":
                    highestDistance();
                    break;
                case "E":
                    search();
                    break;
                default:
                    System.out.println("invalid input");
                    menu();
            }
        }

        void addPlayer(){
            if(count<5){
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("  ");
                    System.out.println("\t\t    Add Your Details \n");
                    System.out.println("Competitor Number: ");
                    //int x = sc.nextInt();
                    c_numberNew = sc.nextInt();
                    for (int i = 0; i < c_number.length; i++) {
                        if(c_number[i] == c_numberNew){
                            System.out.println("Invalid input");
                            addPlayer();
                        }
                    }
                    //c_number[count] = sc.nextInt();
                    //c_numberNew = sc.next();
                    System.out.println("Player Name: ");
                    nameNew = sc.next();

                    System.out.println("Player Age: ");
                    ageNew = sc.nextInt();
                    System.out.println("Number of coins collected: ");
                    coinsNew = sc.nextInt();
                    System.out.println("Score achieved: ");
                    scoreNew = sc.nextInt();
                    System.out.println("Distance reached: ");
                    distanceNew = sc.nextDouble();
                    
                   
                }catch(Exception e){
                    System.out.println("Invalid input try again");
                    System.out.println("   ");
                    addPlayer();
                }
                c_number[count] = c_numberNew;
                name[count] = nameNew;
                age[count] = ageNew;
                coins[count] = coinsNew;
                score[count] = scoreNew;
                distance[count] = distanceNew;
                count++;
                menu();

            }//else if(count==5){
            else{
                System.out.println("\n \t Game Competitors are Full. Try again Later.");
                menu();
            }
        }

        void viewPlayer(){
            for (int i =0; i < name.length; i++){
                System.out.println("  ");
                if(c_number[i]!=0){
                    System.out.println("\t \t  Player Details \n ");
                    System.out.println("Competitor Number: "+c_number[i]);
                    System.out.println("Player Name: "+name[i]);
                    System.out.println("Player Age: "+age[i]);
                    System.out.println("Number of coins collected: "+coins[i]);
                    System.out.println("Score achieved: "+score[i]);
                    System.out.println("Distance reached: "+distance[i]+" m");
                }
            }
            menu();
        }

        void highestCoins(){
            int max=0;
            for (int i =0; i < name.length; i++){
                if(max<coins[i]){
                    max = coins[i];
                }
            }
            for (int i =0; i < name.length; i++){
                if(coins[i] == max){
                    System.out.println("  ");
                    System.out.println("Competitor Number: "+c_number[i]);
                    System.out.println("Player Name: "+name[i]);
                    System.out.println("Player Age: "+age[i]);
                    System.out.println("Number of coins collected: "+coins[i]);
                    System.out.println("Score achieved: "+score[i]);
                    System.out.println("Distance reached: "+distance[i]+" m");
                }
            }
            menu();
        }

        void highestScore(){
            int max=0;
            for (int i =0; i < name.length; i++){
                if(max<score[i]){
                    max = score[i];
                }
            }
            for (int i =0; i < name.length; i++){
                if(score[i] == max){
                    System.out.println("Competitor Number: "+c_number[i]);
                    System.out.println("Player Name: "+name[i]);
                    System.out.println("Player Age: "+age[i]);
                    System.out.println("Number of coins collected: "+coins[i]);
                    System.out.println("Score achieved: "+score[i]);
                    System.out.println("Distance reached: "+distance[i]+" m");
                }
            }
            menu();
        }

        void highestDistance(){
            int max=0;
            for (int i =0; i < name.length; i++){
                if(max<distance[i]){
                    max = (int) distance[i];
                }
            }
            for (int i =0; i < name.length; i++){
                if(distance[i] == max){
                    System.out.println("  ");
                    System.out.println("Competitor Number: "+c_number[i]);
                    System.out.println("Player Name: "+name[i]);
                    System.out.println("Player Age: "+age[i]);
                    System.out.println("Number of coins collected: "+coins[i]);
                    System.out.println("Score achieved: "+score[i]);
                    System.out.println("Distance reached: "+distance[i]+" m");
                }
            }
            menu();
        }

        void search(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Competitor Number");

            int search = sc.nextInt();
            for(int i=0; i< c_number.length; i++){
                if(c_number[i] == search){
                    System.out.println("\t \t  Player Details \n ");
                    System.out.println("Competitor Number: "+c_number[i]);
                    System.out.println("Player Name: "+name[i]);
                    System.out.println("Player Age: "+age[i]);
                    System.out.println("Number of coins collected: "+coins[i]);
                    System.out.println("Score achieved: "+score[i]);
                    System.out.println("Distance reached: "+distance[i]+" m");
                    menu();
                }
            }
            System.out.println("Invalid Competitor Number");
            menu();
        }
    }