package buoi_5;

public class CheckBracket {
    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(checkBracket(s));
    }

    public static boolean checkBracket(String bracket) {
        String oppenning = "[{(";
        String closing = "]})";

        // initial stack
        MyStack<Character> myStack = new MyStack<>();

        for (char c : bracket.toCharArray()) {
            if (oppenning.indexOf(c) != -1) {
                myStack.push(c);
            } else if (closing.indexOf(c) != -1) {
                if (myStack.isEmpty())
                    return false;
                else if (closing.indexOf(c) != oppenning.indexOf(myStack.pop()))
                    return false;

            }
        }
        return true;
    }
}
