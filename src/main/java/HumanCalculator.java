public interface HumanCalculator {

    /**
     * Calculates requested parameters. Arguments will be taken from user
     * @return String with calculated results divided by sign DIVIDER from class Constants
     */
    String calculate();


    /**
     * @return String of user understandable results for user by interpretation of results from calculate() method
     */
    String interpret();
}
