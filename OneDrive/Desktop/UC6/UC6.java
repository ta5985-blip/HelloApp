class UC6 {
    public static void main(String[] args) {
        String result = "";

        // Loop through command-line arguments
        for (int i = 0; i < args.length; i++) {
            result += args[i];
            result += " ";  // delimiter
        }

        // Remove trailing space using substring
        if (!result.isEmpty()) {
            result = result.substring(0, result.length() - 1);
        }

        System.out.println("Output: " + result);
    }
}