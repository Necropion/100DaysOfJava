

class SqueakyClean {
    static String clean(String identifier) {

        //Remove whitespace in string
        String cleanSpace = identifier.replaceAll(" ", "_");

        //Remove control characters in string
        String cleanCTRL = cleanSpace.replaceAll("[\\u0000-\\u001F]", "CTRL");
        String cleanCTRL2 = cleanCTRL.replaceAll("[\\u007F-\\u009F]", "CTRL");

        //Convert kebab-case words to camelCase in string
        String[] kebabArray = cleanCTRL2.split("-");
        StringBuilder camelBuilder = new StringBuilder();

        //Loop through array and make every 2nd word and its first character a capital letter
        for(int i = 1; i < kebabArray.length + 1; i++) {

            if (i % 2 == 0) {

                char[] kebabChars = kebabArray[i-1].toCharArray();
                kebabChars[0] = Character.toUpperCase(kebabChars[0]);
                String kebabString = new String(kebabChars);
                kebabArray[i-1] = kebabString;
            }
        }

        //Build camelCase String
        for (int n = 0; n < kebabArray.length; n++) {

            camelBuilder.append(kebabArray[n]);
        }


        //Omit characters that are not letters

        char[] nonLetterArray = camelBuilder.toString().toCharArray();
        StringBuilder letterOnlyString = new StringBuilder();
        for(int i = 0; i < nonLetterArray.length; i++) {

            char current = nonLetterArray[i];

            if(current == '_'  || Character.toLowerCase(current) == 'o') {

                letterOnlyString.append(nonLetterArray[i]);
            }

            if(Character.isLetter(current)) {

                letterOnlyString.append(nonLetterArray[i]);
            }
        }

        String cleanString = letterOnlyString.toString().replaceAll("[\\u0370-\\u038f]", "");

        return cleanString.replaceAll("[\\u03af-\\u03ff]", "");
    }
}
