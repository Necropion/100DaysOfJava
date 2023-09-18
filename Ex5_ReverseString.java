class ReverseString {

    String reverse(String inputString) {

        char[] stringArray = inputString.toCharArray();
        StringBuilder reverse = new StringBuilder();

        for(int i = stringArray.length-1; i >= 0; i--) {

            reverse.append(stringArray[i]);
        }

        return reverse.toString();
    }
}
