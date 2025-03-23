

publi602115c class petStore{
    public static void main(String[] args) {
        boolean isCatOwner = true;
        System.out.println("Welcome to Petstore");
        System.out.println("Please let us know if are a cat owner: ");
        System.out.println("Press 'Y' if you are, else select 'N' ");

        Scanner sc = new Scanner(System.in);
        char input = sc.next()Line.toLowerCase();
        if (isCatOwner = input.equals('y')) {
            isCatOwner = true;
            System.out.println("20% off select cat items with code MEOW2025");
        }
        else {
            isCatOwner = false;
            System.out.println("Welcome to the Pets Pets Pets store!");
        }


    }
}

/*
The pet store wants to send you a coupon if you're a cat owner!

Write a program with a isCatOwner variable, either true or false.

If true, print "20% off select cat items with code MEOW2025".
Otherwise, print a generic "Welcome to the Pets Pets Pets store!" message
 */