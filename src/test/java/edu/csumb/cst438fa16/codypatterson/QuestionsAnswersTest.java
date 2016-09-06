package edu.csumb.cst438fa16.codypatterson;

import static org.junit.Assert.*;
import org.junit.Test;

public class QuestionsAnswersTest {

    @Test
    public void testGetRandomQuestion() {
        QuestionsAnswers qa = new QuestionsAnswers();

        qa.put("Is Cody awesome?", "Yes, yes he is.");
        qa.put("What is better? Programming or Cody?", "Yes!");

        String q = qa.getRandomQuestion();

        assertTrue(q.equals("What is better? Programming or Cody?") ||
            q.equals("Is Cody awesome?"));
    }

}