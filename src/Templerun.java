
    import java.util.Scanner;

public class Templerun {

	        public final int SIZE=2;                                               //intializing size of the array
                int count =0;
                
			Scanner sc= new Scanner(System.in);                            //Ceating a Scanner
			
			public  String playerName[]      =  new   String[SIZE];        //decleration of the array and intializing of the array
			public  String playerAge[]       =  new   String[SIZE];        //decleration of the array and intializing of the array
			public  double playerCoins[]     =  new   double[SIZE];        //decleration of the array and intializing of the array
			public  double playerDistance[]  =  new   double[SIZE];        //decleration of the array and intializing of the array
			public  double playerScore[]     =  new   double[SIZE];        //decleration of the array and intializing of the array
			
			public static void main(String[] args){							
				
                            Templerun Templerun = new Templerun();                      //Creating a object
				Templerun.menu();                                       //method invocation
				
			}
			
			public void menu(){
					
				System.out.println("\n     ****************************************!!!!WELCOME!!!!******************************************       ");
				System.out.println("\n  ____________________TEMPLE RUN GAME_______________________   ");
				System.out.println("_______________________________________________________________________________________________");
				System.out.println("|\n-----Enter 'A' to enter player details-----------------------------------------------------|");
				System.out.println("|\n------Enter 'B' to display player details--------------------------------------------------|");
				System.out.println("|\n------Enter 'C' to display winners---------------------------------------------------------|");
                                System.out.println("|\n------Enter 'X' to exit from the program---------------------------------------------------------|");
				System.out.println("|\n------Enter any other key to return to the menu--------------------------------------------|");
				System.out.println("|_____________________________________________________________________________________________|");
				
				String inputletter = sc.next();                         //geting inputs by scanner
				
                                if(inputletter.equalsIgnoreCase("A")){
				    addPlayer(); 
				}else if(inputletter.equalsIgnoreCase("B")){
                                    getDetails();
                                }else if(inputletter.equalsIgnoreCase("C")){
                                    getMaxValues();
                                }else if(inputletter.equalsIgnoreCase("X")){
                                     System.exit(0);
                                }else{
                                    System.out.println("Input valid option letter");
                                    System.out.println("  ");
                                    menu();
                                }
			}
                        
                        public void addPlayer(){
                                    
                            for( int i = 0 ; i<SIZE; i++ ){ 
				    
                                if(count < SIZE){
                                    count++;
                                    int x = i;
                                        x++;
                                            System.out.println(" Enter player " + x + " Name : ");
                                            sc.nextLine();
                                            playerName[i]    = validateName(sc);
						
                                            System.out.println(" Enter player " + x + " Age : ");
                                            playerAge[i]     = String.valueOf(validatenum(sc));
						
                                            System.out.println(" Enter player " + x + " Coins : ");
                                            playerCoins[i]   = validatenum(sc);
						
                                            System.out.println(" Enter player " + x + " Distance : ");
                                            playerDistance[i]= validatenum(sc);
						
                                            System.out.println("Enter player" + x + " Score : ");
                                            playerScore[i]   = validatenum(sc);
                                }else{
                                            System.out.println("Array is Full");
                                            break;
                                }
                            }
                            menu();
                        }
                                
                        public void getDetails(){
                                     
                            if(count != 0){
                                    System.out.println("===========================\n");
				    System.out.println("Enter E to view all player details\n");
				    System.out.println("Enter F to view a selected player's details\n");
				    	
                                    String choice1 = sc.next(); 
                                        
				    	    if(choice1.equalsIgnoreCase("E")){  
				    	        for(int i=0;i<SIZE ;i++){
                                                    int x=i;
                                                    x++;
				    	            System.out.println("Player " +x +"\n----------------\nName: " +playerName[i] + "\nAge: " 
                                                            +playerAge[i]+ "\nCoins gained: " +playerCoins[i] + "\nDistance: "+playerDistance[i]+ "\nScore: "
                                                            +playerScore[i] +"\n");
				    	        }
				            }
                                        
				    	    if(choice1.equalsIgnoreCase("F")){
				    		System.out.println("===========================\n");
					    	System.out.println("Enter player number\n");
					        
					    	int num = sc.nextInt();
					    	int i = num;
					    	i--;
                                                
					    	if(i <SIZE){
						    	System.out.println("Player " +num +"\n----------------\nName: " +playerName[i] + "\nAge: " 
                                                                +playerAge[i]+ "\nCoins gained: " +playerCoins[i] + "\nDistance: " +playerDistance[i]+ "\nScore: "
                                                                +playerScore[i] +"\n");
				    		}else{
					    		System.out.println("Insert a valid player number");
					    	}
				    	    }
                                            
                            }else{
                                    System.out.println("  ");
                                    System.out.println("First you have to Add a player");
                                    System.out.println("  ");
                            }
                            menu();
                        }
			
                        public void getMaxValues (){
                                   
                            if(count != 0){
                                    
                                double cmax = 0;
                                double smax = 0;
                                double dmax = 0;
                                        
					for(int i=0;i<SIZE ;i++){
						
						if(playerCoins[i] > cmax ){
							cmax=playerCoins[i];
						}
						if(playerScore[i] > smax) {
							smax=playerScore[i];	
						}
						if(playerDistance[i] > dmax){
							dmax=playerDistance[i];
						}
					}
					
                                        
				System.out.println("===========================\n");
			    	System.out.println("Enter G to view all winner details\n");
			    	System.out.println("Enter H to view a selected winner's details\n");

			    	String choice2 = sc.next();
                                
			    	if(choice2.equalsIgnoreCase("G")){
			    	
                                    for(int i=0;i<SIZE ;i++){
                                        
                                        if (playerCoins[i]==cmax){
                                            System.out.println(" Player with the maximum number of gold coins: "+ playerName[i] );
                                            System.out.println(" num of coins : " + playerCoins[i]);//printing arrays
                                        }
                                        
                                        if(playerScore[i]==smax){
                                            System.out.println("Player with the highest score:"+ playerName[i]);
                                            System.out.println(" Highest Score : " + playerScore[i]);//printing arrays	
                                        }
                                        
                                        if(playerDistance[i]==dmax){
                                            System.out.println("Player with the maximum distance reached):"+  playerName[i]);
                                            System.out.println("maximum distance reached : " + playerDistance[i] );//printing arrays
                                        }
                                    }
				
			    	}
			    	
			    	if(choice2.equalsIgnoreCase("H")){
			    		
                                    System.out.println("===========================\n");
				    System.out.println("Enter 'C' for Coins winner\n");
				    System.out.println("Enter 'S' for Score winner\n");
				    System.out.println("Enter 'D' for Distance winner\n");
				    	
				    String choice3 = sc.next();
				    	
                                        if(choice3.equalsIgnoreCase("C")){
                                            
                                            for(int i=0;i<SIZE ;i++){
				    		if (playerCoins[i]==cmax){
                                                    System.out.println(" Player with the maximum number of gold coins: "+ playerName[i] );
                                                    System.out.println(" num of coins : " + playerCoins[i]);//printing arrays
                                                }
                                            }
                                            
                                        }else if(choice3.equalsIgnoreCase("S")){
                                            
                                            for(int i=0;i<SIZE ;i++){
				    		if(playerScore[i]==smax){
                                                    System.out.println("Player with the highest score:"+ playerName[i]);
                                                    System.out.println(" Highest Score : " +playerScore[i]);//printing arrays	
                                                }
                                            }
                                        }else if(choice3.equalsIgnoreCase("D")){
                                            
                                            for(int i=0;i<SIZE ;i++){
				    		if(playerDistance[i]==dmax){
                                                    System.out.println("Player with the maximum distance reached):"+  playerName[i]);
                                                    System.out.println("maximum distance reached : " + playerDistance[i] );//printing arrays
                                                }
                                            }
                                        }
			    	}
                            }else{
                                        System.out.println("  ");
                                        System.out.println("First Add a player");
                                        System.out.println("  ");
                                  }
                            menu();
			}

				
			private String validateName(Scanner sc) {

				String name = sc.nextLine();

					/*
					 * if (!name.matches("[A-Z][a-zA-Z]*" )) {
					 * System.out.println("Invalid name");
					 * 
					 * sc.next(); }
					 */
				boolean run = true;
                                    while (run) {
						
					run = false;
					for (int x = 0; x < name.length(); x++) {
                                            char templetter = name.charAt(x);
                                            if (Character.isDigit(templetter)) {
                                                    System.out.println("Invalid name. re-enter the name");
                                                    name = sc.nextLine();
                                                    x = 0;
                                            }
					}
                                    }

                            return name;
			}
				
                        private int validatenum(Scanner sc) {

				String number = sc.next();
					
                                    for(int x = 0; x <number.length();x++){
					char temp = number.charAt(x);
					if(!Character.isDigit(temp)){
                                                    System.out.println("Invalid number. Enter an interger value");
                                                    number = sc.next();
                                                    x = 0;
					}
                                    }
					
                                    int validatedNo = Integer.valueOf(number);

                            return validatedNo;
			}
				
				//private static int validatepnum(Scanner sc) {
					
}

