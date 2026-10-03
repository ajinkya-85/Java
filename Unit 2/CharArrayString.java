// convert char array tot string.

class CharArrayString{

    public static void main(String[] arg){
        char[] ch = {'a','j','i','n','k','y','a'};

        //String str = String.valueOf(ch);
        String str = new String(ch);
        System.out.println(str);
    }
}