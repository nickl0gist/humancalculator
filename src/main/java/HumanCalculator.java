public interface HumanCalculator {

    /**
     * Calculates requested parameters.
     * @return String with calculated results
     */
    String calculate();


    /**
     * @return String of user understandable results for user by interpretation of results from calculate() method
     */
    String interpret();
}
