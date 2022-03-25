class Homework1 {
    static void countWords(String str){
        int count = 1;
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("Number of words are : " + count);
    }
    
    public static void main(String[] args) {
        countWords("My name is Putin. i am a Russia president.");
    }
}
