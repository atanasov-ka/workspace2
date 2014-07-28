import java.util.Stack;


public class XmlMarkupBuilder {
	private Stack<String> stack = new Stack<>();
	private StringBuilder xmlDocument = new StringBuilder();
	private boolean isJustOpened;
	
	
	public XmlMarkupBuilder openTag(String aTag)
	{
		stack.add(aTag);
		xmlDocument.append(String.format("<%s>", aTag));
		isJustOpened = true;
		return this;
	}
	
	public XmlMarkupBuilder closeTag()
	{
		String tag = stack.pop();
		xmlDocument.append(String.format("</%s>", tag));
		isJustOpened = false;
		return this;
	}
	
	public XmlMarkupBuilder addAttribute(String attribName, String attribValued)
	{
		
		return this;
	}
	
	public XmlMarkupBuilder addText(String text) 
	{
		return this;
	}
	
	public XmlMarkupBuilder closeTag() {
		
		return this;
	}
	
	public String finish() {
		
		return xmlDocument.toString();
	}
}
