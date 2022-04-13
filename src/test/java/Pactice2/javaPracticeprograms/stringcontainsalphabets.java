package Pactice2.javaPracticeprograms;

public class stringcontainsalphabets {
    public static void main(String[] args) {
        String str="test";
        System.out.println(isStringOnlyAlphabet(str));

    }
    public static boolean isStringOnlyAlphabet(String str)
    {
        return (
                (str != null) && (!str.equals(""))
                        && (str.chars().allMatch(Character::isLetter)));
    }
}
