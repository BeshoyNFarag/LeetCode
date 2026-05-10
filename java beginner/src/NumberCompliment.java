import java.util.ArrayList;

public class NumberCompliment {

    public int findComplement(int num) {
        ArrayList<Integer> binary = new ArrayList<Integer>();

        while (num != 0) {
            binary.add(num % 2);
            num /= 2;
        }
        for(int i = 0; i< binary.size(); i++){
            if(binary.get(i) == 0){
                binary.set(i,1);
            }
            else
                binary.set(i,9);
        }

        int decimalResult = 0;
        for (int i = 0; i < binary.size(); i++) {
            if (binary.get(i) == 1) {
                decimalResult |= (1 << i);
            }
        }

        return decimalResult;
    }
}
