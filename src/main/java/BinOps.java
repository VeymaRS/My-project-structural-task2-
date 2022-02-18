public class BinOps {
    public String sum(String a, String b) throws NumberFormatException {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int cInt = aInt + bInt;
        return Integer.toBinaryString(cInt);
    }

    public String mult(String a, String b) throws NumberFormatException {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int cInt = aInt * bInt;
        return Integer.toBinaryString(cInt);
    }
}
