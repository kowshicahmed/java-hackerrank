public class Add {
    public void add(int... values) {
        StringBuilder s = new StringBuilder();
        int sum = 0;
        for (int value : values) {
            sum += value;
            s.append(String.valueOf(value)).append("+");
        }
        System.out.println(s.deleteCharAt(s.length()-1).append("=").append(String.valueOf(sum)));
    }
}