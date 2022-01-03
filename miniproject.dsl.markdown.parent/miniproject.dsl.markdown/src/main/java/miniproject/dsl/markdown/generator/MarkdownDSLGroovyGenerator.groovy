package miniproject.dsl.markdown.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet

import com.google.inject.Injector
import miniproject.dsl.markdown.MarkdownDSLStandaloneSetup
import miniproject.dsl.markdown.markdownDSL.Model
import miniproject.dsl.markdown.markdownDSL.Document
import miniproject.dsl.markdown.markdownDSL.Entity
import miniproject.dsl.markdown.markdownDSL.Text
import miniproject.dsl.markdown.markdownDSL.Paragraph
import miniproject.dsl.markdown.markdownDSL.Heading 
import miniproject.dsl.markdown.markdownDSL.Lists
import miniproject.dsl.markdown.markdownDSL.Image
import miniproject.dsl.markdown.markdownDSL.Blockquote
import miniproject.dsl.markdown.markdownDSL.Table
import miniproject.dsl.markdown.markdownDSL.Bold
import miniproject.dsl.markdown.markdownDSL.Italic
import miniproject.dsl.markdown.markdownDSL.Strikethrough
import miniproject.dsl.markdown.markdownDSL.Unordered
import miniproject.dsl.markdown.markdownDSL.Ordered
import miniproject.dsl.markdown.markdownDSL.Thr 
import miniproject.dsl.markdown.markdownDSL.Tbody
import miniproject.dsl.markdown.markdownDSL.Plaintext
import miniproject.dsl.markdown.markdownDSL.Horizonrule
import miniproject.dsl.markdown.markdownDSL.Emoticon


class MarkdownDSLGroovyGenerator {

	def static void main(String[] args) {
		
		
		// do this only once per application
		Injector injector = new MarkdownDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		// obtain a resourceset from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		// load a resource by URI, in this case from the file system
		Resource resource = resourceSet.getResource(URI.createFileURI("src/main/resources/Markdown1.markdown"), true);
		
		Model model = resource.getContents().get(0)
		/**
		 * TODO: call your code generator
		 */
		String text = ''	
		text+="""<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
</head>
<body>"""
		text += traverse(model)
		
text+="""
</body>
</html>"""		
		
		File output = new File("src/main/resources/output.txt")
	    output.createNewFile()
		output << text
	}


	
	def static String traverse(List<EObject> list) {
		String text = ''
		String meta = ''
		for (obj in list) {
			text += traverse(obj)
		}
		text
	}
	
	
	def static String traverse(EObject obj) {
		String text = ''
		String meta = ''
		switch(obj) {
			
			case Model :
				
				text+= traverse(obj.element)
				break
				
			case Document:
				
				 if(obj.texts!=null){
				 
					text += traverse(obj.texts)
					break
				}
				else{
					text+=traverse(obj.entities)
					break
				}
				
			case Text :
				
				 if(obj.headings !=null){
					 text+=traverse(obj.headings)
					break
				 }
				 else{
					 text+=traverse(obj.paragraphs)
					break
				 }
							
			case Entity :
			
				 if(obj.blockquotes!=null){
					 text+=traverse(obj.blockquotes)
					break
				 }
				 else if(obj.images!=null){
					 text+=traverse(obj.images)
					break
				 }			 
			 	else if(obj.lists!=null){
					 text+=traverse(obj.Lists)
					break
				 }
				 else if(obj.horizonrules!=null){
					 text+=traverse(obj.horizonrules)
					break
				 }
				 else if(obj.emoticons!=null){
					 text+=traverse(obj.emoticons)
					break
				 }
				 else{
					 text+=traverse(obj.tables)
					break
				 }
			 
			 case Heading :
								
					text += generate(obj)
					break

			 case Paragraph :
					
					text+= generate(obj)
					break
			
			case Emoticon :
				
				text += generate(obj)
				break

			case Horizonrule :
			
				text += generate(obj)
				break
					
			case Bold :
			
				text += generate(obj)
				break
		
							
			case Italic :
			
				text += generate(obj)
				break
	
			case Plaintext :
				
					text += generate(obj)
					break
						
			case Strikethrough :
				
				text += generate(obj)
				break
			
			case Blockquote :
				
				text += generate(obj)
				break
	
			case Image :
				
				 text += generate(obj)
				break
	
			case Lists :
				
				 text += generate(obj)
				break
		
			case Unordered :
				
				 text += generate(obj)
				break
		
			case Ordered :
				
				 text += generate(obj)
				break
										
			case Table :
				
				text+= generate(obj)
				break
			
			case Thr :
				
				text += generate(obj)
				break
			
			case Tbody :
			
				text += generate(obj)
				break 
		
		}
		
		
		
		text
	}
		
	
		def static generate(EObject obj) {
		String text = ''
		String meta = ''
		switch(obj) {
			
			case Paragraph :
				text += """<p>${traverse(obj.content)} ${traverse(obj.boldtext)} ${traverse(obj.italictext)} ${traverse(obj.textstrike)}</p>"""
				break
			
			case Heading :
				
					 if(obj.h1s!=null){
									text += """<h1>${obj.h1s}</h1>
"""
				break
					 }
					  else{
				text += """<h2>${obj.h2s}</h2>
"""
				break
					 }

		
			case Plaintext:
					 text += """${obj.content}"""
					 break
					 
			case Bold:
				text += """<strong> ${obj.content} </strong>"""
				break

			case Italic :
				text += """<em>${obj.content}</em>"""
				break
				
			case Strikethrough:
				text += """<del>${obj.content}</del>"""
				break
				
				
			case Blockquote:
				text += """
<blockquote>"""
				break	
			
			case Lists:
				if(obj.ul!=null){
					text += """<ul>
${traverse(obj.ul)}</ul>
"""
					break
				}
				else{
					text += """<ol>
${traverse(obj.ol)}</ol>
"""
					break
				}

			case Unordered:
				text += """<li>${obj.content}</li>
"""
				break
			
			case Ordered:
				text += """<li>${obj.content}</li>
"""
				break		
			
			case Image:
				text += """<img src=${obj.url} alt=${obj.name}>"""
				break
		
			case Table:
				text += """<table>
<tr>
${traverse(obj.thr)}</tr> 
<tr>
${traverse(obj.tbody)}</tr> 
</table>
"""
				break
				
			case Thr:
				text += """<th> ${obj.content} </th>
"""
				break
			
			case Tbody:
				text += """<td> ${obj.content} </td>
"""
				break
		
			case Horizonrule:
				text += """
<hr>"""
				break
				
			case Emoticon:
		
					switch(obj.content) {
						case "cry":
							text+="""&#128557;"""
							
							break
						
						case "grin":
							text+="""&#128513;"""
							
							break	
						
						case "smile":
							text+="""&#128522;"""
							
							break
						
						default:
							text+=""
						
					}
				
				}
	text
	
	}
	
}
