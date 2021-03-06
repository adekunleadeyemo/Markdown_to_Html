package miniproject.dsl.markdown.tests

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

import com.google.inject.Inject

import miniproject.dsl.markdown.markdownDSL.Model

@ExtendWith(InjectionExtension)
@InjectWith(MarkdownDSLInjectorProvider)

class MarkdownDSLParsingTest2 {

	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	void testBasic() {
		def result = parseHelper.parse("""# "Agile Cloud Automation" 
"this is a contemporary field of computer science which involves partially or fully automating 
the programming aspect of software development process within a particular domain this is often times practised using"
**"model driven engineering"** "this is based on the principles of" *"kolb cycle for experiential learning"*
## "the two main methods for generating DSL are:" 
1"Metamodel First"
2"Grammar First" """)
		Assertions.assertNotNull(result)
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), """Unexpected errors: ${errors.join(", ")}""")
	}

	@Test
	void testIntermidiate() {
		def result = parseHelper.parse(""" > "A pictorial representation is shown below"
!["Metamodel and Textural syntax"]("https://image.slidesharecdn.com/20090714unikiel-090716073814-phpapp02/95/textual-modeling-framework-xtext-36-728.jpg?cb=1247729992")  
""")
		Assertions.assertNotNull(result)
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), """Unexpected errors: ${errors.join(", ")}""")
	}
	
	@Test
	void testAdvance() {
		def result = parseHelper.parse(""" |"Metamodel"| "Grammar" | 
|---|---|
|"Metamodel first"|"Grammar First"|
---
"Automating codes are great" :"smile": ",but it my leave programmers Jobless" :"cry":
""")
		Assertions.assertNotNull(result)
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), """Unexpected errors: ${errors.join(", ")}""")
	}
	
}
