package com.sparta.abdul.stepdefs;

import com.sparta.abdul.PlingPlangPlong;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class PlingPlangPlongStepDef {
    private int n;
    private String geneartorResult;

    @Given("I type in a number {int}")
    public void iTypeInANumber(int n) {
        this.n = n;
    }

    @When("I send the number into the PlingPlangPlong generator")
    public void iSendTheNumberIntoThePlingPlangPlongGenerator() {
        geneartorResult = PlingPlangPlong.generatePlingPlangPlong(n);
    }

    @Then("I should get a Pling")
    public void iShouldGetAPling() {
        Assertions.assertEquals("Pling", geneartorResult);
    }

    @Then("I should get a Plang")
    public void iShouldGetAPlang() {
        Assertions.assertEquals("Plang", geneartorResult);
    }

    @Then("I should get a Plong")
    public void iShouldGetAPlong() {
        Assertions.assertEquals("Plong", geneartorResult);
    }

    @Then("I should get a PlingPlang")
    public void iShouldGetAPlingPlang() {
        Assertions.assertEquals("PlingPlang", geneartorResult);
    }

    @Then("I should get a PlingPlong")
    public void iShouldGetAPlingPlong() {
        Assertions.assertEquals("PlingPlong", geneartorResult);
    }

    @Then("I should get a PlangPlong")
    public void iShouldGetAPlangPlong() {
        Assertions.assertEquals("PlangPlong", geneartorResult);
    }

    @Then("I should get a PlingPlangPlong")
    public void iShouldGetAPlingPlangPlong() {
        Assertions.assertEquals("PlingPlangPlong", geneartorResult);
    }

    @Then("I should get a {int}")
    public void iShouldGetA(int numberTyped) {
        Assertions.assertEquals(Integer.toString(numberTyped), geneartorResult);
    }
}
