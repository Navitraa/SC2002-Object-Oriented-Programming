public static void countDigits() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        if (sc.hasNextInt()) 
        {
            int input = sc.nextInt();
            // Handle negative input case
            if (input < 0) {
                System.out.println("n: " + input + " - Error input!!");
            }
            // Positive input case
            else 
            {
                int count = 0;
                int n = input;
                // Special case: if n is 0, it has 1 digit
                if (n == 0) {
                    System.out.println("n: " + input + " - count = " + 1);
                }
                // Count the digits
                while (n > 0) {
                    n /= 10;
                    count++;
                }
                System.out.println("n: " + input + " - count = " + count);
            }
            
        } 
        else 
        {
            String input = sc.nextLine();
            System.out.println("n: " + input + " - Error input!!");
        }
        sc.close();
    }