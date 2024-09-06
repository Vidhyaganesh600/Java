package Sdp;

public class pg4 {
    public static void main(String[] args) {
        String s = "we are reva students";
        char[] ch= s.toCharArray();
        int f=0;
        for(int i=0;i<ch.length;i++){
            if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' '){
                System.out.println(ch[i]);
                f=i;
            }
            if(i==ch.length-1 || ch[i]!=' ' && ch[i+1]==' '){
                System.out.println(ch[i]);
                char c = ch[i];
                ch[i]=ch[f];
                ch[f]=c;
            }
        }
        System.out.println(s);
        System.out.println(ch);
    }
}
