package net.yzwlab;

import java.util.ArrayList;
import java.util.List;

import net.java.sen.SenFactory;
import net.java.sen.StringTagger;
import net.java.sen.dictionary.Token;

/**
 * lucene-gosen‚Ì’Pƒ‚ÈƒTƒ“ƒvƒ‹
 */
public class SimpleLuceneGosenApp {
	public static void main(String[] args) throws Exception {
		StringTagger tagger = SenFactory.getStringTagger(null);
		List<Token> tokens = tagger.analyze("”@Œç‘(CV. ¡ˆä–ƒ”ü)",
				new ArrayList<Token>());

		for (Token token : tokens) {
			System.err.println(token.getSurface() + ": "
					+ token.getMorpheme().getReadings() + " - "
					+ token.getMorpheme().getPartOfSpeech());
		}
	}
}
