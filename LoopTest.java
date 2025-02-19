
/*What will the following program print? 
it print 3 because the outer loop excutes 3 times,so counter++ happens 3 times

*/
class LoopTest{
    public static void main(String args[]) {
        int counter = 0;
        outer:
        for (int i = 0; i < 3; i++) {
            middle:
            for (int j = 0; j < 3; j++) {
                inner:
		
                for (int k = 0; k < 3; k++) {
                    if (k - j > 0) {
			System.out.println("i="+i+" j="+j+" k="+k);
                        break middle;
                    }
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
/*
1️⃣ First Iteration of Outer Loop (i = 0)
j = 0 starts.
k = 0 starts.
counter++ runs once (counter = 1).
At k = 1, break middle; exits the j loop completely.
The next value of i starts → j resets to 0, k resets to 0.
2️⃣ Second Iteration of Outer Loop (i = 1)
j = 0 starts fresh.
k = 0 starts fresh.
counter++ runs again (counter = 2).
At k = 1, break middle; exits the j loop completely.
The next value of i starts → j resets to 0, k resets to 0.
3️⃣ Third Iteration of Outer Loop (i = 2)
j = 0 starts fresh.
k = 0 starts fresh.
counter++ runs again (counter = 3).
At k = 1, break middle; exits the j loop completely.
The next value of i starts, but i = 3 stops the outer loop.
*/
