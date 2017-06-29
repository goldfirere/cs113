// Usage.java
// Custom handling for a @usage javadoc tag to build the JTF documentation

// See http://docs.oracle.com/javase/1.5.0/docs/guide/javadoc/taglet/overview.html
// and http://www.docjar.com/docs/api/com/sun/tools/doclets/Taglet.html

import com.sun.tools.doclets.Taglet;
import com.sun.javadoc.Tag;
import java.util.Map;
import java.util.Arrays;

public class Usage implements Taglet {
    public String getName()
    {
	return "usage";
    }

    public boolean inConstructor()
    {
	return true;
    }

    public boolean inField()
    {
	return false;
    }

    public boolean inMethod()
    {
	return true;
    }

    public boolean inOverview()
    {
	return false;
    }

    public boolean inPackage()
    {
	return false;
    }

    public boolean inType()
    {
	return false;
    }

    public boolean isInlineTag()
    {
	return false;
    }
    
    public String toString(Tag tag)
    {
	return "<dt><span class=\"paramLabel\">Usage:</span></dt><dd><pre>" + tag.text() + "</pre></dd>";
    }

    public String toString(Tag[] tags)
    {
	return String.join("", Arrays.stream(tags).map(this::toString).toArray(String[]::new));
    }

    public static void register(Map<String, Taglet> tagletMap)
    {
	Usage tag = new Usage();
	Taglet t = tagletMap.get(tag.getName());
	if(t != null)
	{
	    tagletMap.remove(tag.getName());
	}
	tagletMap.put(tag.getName(), tag);
    }	
}
