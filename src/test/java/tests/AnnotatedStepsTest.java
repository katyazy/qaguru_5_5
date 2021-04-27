package tests;

import org.junit.jupiter.api.Test;
import steps.WebSteps;

public class AnnotatedStepsTest {
    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static int ISSUE_NUMBER = 68;

    private final WebSteps steps = new WebSteps();

    @Test
    public void testSearch() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.clickIssuesTab();
        steps.checkIssueNumber(ISSUE_NUMBER);
    }
}