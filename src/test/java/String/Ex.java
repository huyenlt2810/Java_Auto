package String;

import org.junit.Test;

public class Ex {
    //cho 1 chuoi bat ky, hay kiem tra xem chuoi do có phải la so dt hay email hay khong?
    // neu la sdt thi in ra day la so dien thoai, neu la email thi in ra day la email, con lai thi bao toi khong biet

    @Test
    public void checkPhoneEmail () {
        String st = "@967787777";
        for (int i = 0; i < st.length(); i++) {
            if (Character.isLetter(st.charAt(i))) {
                System.out.println("Toi khong biet");
                break;
            }
            if (i + 1 == st.length()) {
                if (st.length()==10 && (st.startsWith("09")|| st.startsWith("03")|| st.startsWith("08"))){
                    System.out.printf("Day la so dien thoai");
                }
                else {
                    System.out.printf("Toi khong biet");
                }
            }
        }
    }
}
