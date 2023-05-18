public class Q13LC {
    public static int Roman(String s) {
        int Roman = 0;

        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;

        char currentCharacter = '0',nextCharacter;
        
        int i=0;
        while(i<s.length()) {
            currentCharacter =(s.charAt(i));
            if (i<=s.length()-2) {
                nextCharacter = (s.charAt(i+1));
            }else{
                nextCharacter='0';
            }

            if ((currentCharacter=='I')&&(nextCharacter=='V'||nextCharacter=='X')) {
                // System.out.println(currentCharacter+" "+nextCharacter);
                Roman=nextCharacter=='V'?Roman+4:Roman+9;
                i+=2;
                continue;
            }
            if (currentCharacter=='X'&&(nextCharacter=='L'||nextCharacter=='C')) {
                // System.out.println(currentCharacter+" "+nextCharacter);
                Roman=nextCharacter=='L'?Roman+40:Roman+90;
                i+=2;
                continue;
            }
            if (currentCharacter=='C'&&(nextCharacter=='D'||nextCharacter=='M')) {
                // System.out.println(currentCharacter+" "+nextCharacter);
                Roman=nextCharacter=='D'?Roman+400:Roman+900;
                i+=2;
                continue;
            }
            // System.out.println("after special case : "+currentCharacter+" "+nextCharacter);
            switch (currentCharacter) {
                case 'I':
                    Roman+=I;
                    break;
                case 'V':
                    Roman+=V;
                    break;
                case 'X':
                    Roman+=X;
                    break;
                case 'L':
                    Roman+=L;
                    break;
                case 'C':
                    Roman+=C;
                    break;
                case 'D':
                    Roman+=D;
                    break;
                case 'M':
                    Roman+=M;
                    break;
                default:
                    break;
            }
            i+=1;
        }

        return Roman;
    }
    public static void main(String[] args) {
        System.out.println(Roman("MCMXCIV"));

    }
}
