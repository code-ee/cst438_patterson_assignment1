package edu.csumb.cst438fa16.codypatterson;

import java.util.*;
/*
*  A half-secretive map of question to answers (at most one anser per question)
*  Gives out random questions (keys) from the map, and
*  can be queries to test if a given question maps to a given answer.
*/
public class QuestionsAnswers {
	HashMap<String, String> questionsAnswers = new HashMap<String, String>();
	Set questionsSet;

	// Maps question to asnwer.
	void put(String	question, String answer) {
		questionsAnswers.put(question, answer);
	}

	// Queries if question maps to answer.
	boolean	testAnswer(String question, String answer) {
		if (questionsAnswers.containsKey(question))
			return questionsAnswers.get(question).equals(answer);
		return false;
	}

	// Gives out a random question from the key set.
	String getRandomQuestion() {
		// create a set of all the keys in the HashMap
		questionsSet = questionsAnswers.keySet();

		// create the random object
		Random r = new Random();

		// return random element by making an array and accessing random index
		return questionsSet.toArray()[r.nextInt(questionsSet.size())].toString();
	}
}
