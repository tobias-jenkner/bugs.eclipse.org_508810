/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.bug508810.mydsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/bug508810/mydsl/parser/antlr/internal/InternalMyDsl.tokens");
	}
}
