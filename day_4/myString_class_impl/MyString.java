public class MyString{

    char[] chars;

    // constructor for String input
    public MyString(String str){
        this.chars = str.toCharArray();
    }
    // constructor for char[]
    public MyString(char[] chars){
        this.chars = chars;
    }

    // METHODS

    @Override
    public String toString() {
        String res = "";
        for(int i=0; i<this.chars.length; i++){
            res += this.chars[i];
        }
        return res;
    }

    // length() method
    public int length(){
        int count = 0;
        for(char c : chars){
            count++;
        }
        return count;
    }

    // charAt() method
    public char charAt(int index){
        try{
            return chars[index];
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return '\u0000';
    }

    // equals() method
    public boolean equals(MyString given){
        if(given.length() != chars.length) return false;

        for(int i=0; i<chars.length; i++){
            if(chars[i] != given.charAt(i)) return false;
        }
        return true;
    }

    // toUpperCase() method
    public MyString toUpperCase(){
        char[] temp = new char[this.chars.length];
        for(int i=0; i<temp.length; i++){
            temp[i] = this.chars[i];
        }
        for(int i=0; i<temp.length; i++){
            if(temp[i] >= 97 && temp[i] <= 122){
                // decrement 32 ascii values for each Lowercase characters
                temp[i] = (char)(temp[i]-32);   
            }
        }
        return new MyString(temp);
    }
    // toLowerCase() method
    public MyString toLowerCase(){
        char[] temp = new char[this.chars.length];
        for(int i=0; i<temp.length; i++){
            temp[i] = this.chars[i];
        }
        for(int i=0; i<temp.length; i++){
            if(temp[i] >= 65 && temp[i] <= 90){
                // increment 32 ascii values for each Uppercase characters
                temp[i] = (char)(temp[i]+32); 
            }
        }
        return new MyString(temp);
    }

    // substring() method
    public MyString substring(int beg, int end){
        String sub = "";
        try{
            if(beg == end) return new MyString(sub); // edge case
            for(int i = beg; i<end; i++){
                sub += this.chars[i]; // concatinating subString chars
            }
        }catch(StringIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
        return new MyString(sub);
    }

    // concat() method
    public MyString concat(MyString str){
        String res = "";
        for(int i=0; i<this.chars.length; i++){
            res += this.chars[i];
        }
        for(int i=0; i<str.chars.length; i++){
            res += str.chars[i];
        }
        return new MyString(res);
    }

    // contains() method
    public boolean contains(MyString str){
        
        for(int i=0; i<=this.chars.length-str.chars.length; i++){
            boolean flag = true;
            for(int j=0; j<str.chars.length; j++){
                if(this.chars[i+j] != str.chars[j]){
                    flag = false;
                    break;
                } 
            }
            if(flag) return true;
        }
        return false;
    }

    // indexOf() method
    public int indexOf(char c){
        for(int i=0; i<this.chars.length; i++){
            if(this.chars[i] == c) return i;
        }
        return -1;
    }
    
    // replace() method
    public MyString replace(char pc, char nc){
        String res = "";
        char[] temp = new char[this.chars.length];

        for(int i=0; i<temp.length; i++){
            temp[i] = this.chars[i];
        }
        for(int i=0; i<temp.length; i++){
            if(temp[i] == pc) temp[i] = nc;
            res += temp[i];
        }
        return new MyString(res);
    }
}


/*
 6. Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
#1. int length() – Returns the number of characters.
#2. char charAt(int index) – Returns the character at the specified index.
#3. boolean equals(MyString other) – Checks if two MyString objects are equal.
#4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
#5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
#6. MyString substring(int start, int end) – Returns a substring from start to end-1.
#7. MyString concat(MyString other) – Concatenates another string to the current one.
#8. boolean contains(MyString sub) – Checks if a substring exists.
#9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class.   
 */