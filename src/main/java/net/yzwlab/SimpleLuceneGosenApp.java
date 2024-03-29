package net.yzwlab;

import java.util.ArrayList;
import java.util.List;

import net.java.sen.SenFactory;
import net.java.sen.StringTagger;
import net.java.sen.dictionary.Token;

/**
 * lucene-gosenΜPΘTv
 */
public class SimpleLuceneGosenApp {
	public static void main(String[] args) throws Exception {
		StringTagger tagger = SenFactory.getStringTagger(null);
		List<Token> tokens = tagger.analyze("@η(CV. ‘δό)",
				new ArrayList<Token>());

		for (Token token : tokens) {
			System.err.println(token.getSurface() + ": "
					+ token.getMorpheme().getReadings() + " - "
					+ token.getMorpheme().getPartOfSpeech());
		}
	}
}
