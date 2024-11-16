package test4;

//Occurance of Each character using int array and two for loop .

public class Question57 {
    public static void main(String[] args) {
        
        String str = "ababaccddd";
        int size = str.length();
        
        // Frequency array to store the frequency of each character
        int freq[] = new int[size];
        
        // Convert the string to a character array
        char[] charac = str.toCharArray();
        
        // Initialize the frequency array
        for (int i = 0; i < size; i++) {
            freq[i] = 1; 
            for (int j = i + 1; j < size; j++) {
                // If a duplicate character is found
                if (charac[i] == charac[j] && charac[j] != '0') {
                    freq[i]++;
                    // Mark the duplicate character as '0' so it's not counted again
                    charac[j] = '0';
                }
            }
        }
        
        // Print the characters and their frequencies
        System.out.println("Character frequencies:");
        for (int i = 0; i < size; i++) {
            // We skip characters that were marked as '0' (duplicates)
            if (charac[i] != '0') {
                System.out.println(charac[i] + " = " + freq[i]);
            }
        }
        
        for(char c:charac)
        {
        	System.out.print(c+",");
        }
        
        System.out.println();
        
        for(int arr:freq)
        {
        	System.out.print(arr+",");
        }
    }
}




/*
 * we need two array . one for frequence count and one for iterate over String using character array , and replace the character array with '0' which character is been repeated
 * frequancey array will look like
 * freq[size] = [3,2,1,1,1,2,1,3,1,1]
 * 
 * charac array will look like
 * charac[] =['a','b','0','0','0','c','0','d','0','0'];
 *  * 
 * */
 