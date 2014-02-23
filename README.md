jextractor
==========

	a dom-scan engine for html written in java -- work in way like jquery

```java
import static com.doomdagger.jextractor.Extractor.$;
import com.doomdagger.jextractor.support.DomElement;

public class Example {
	public static void main(String[] args){
		//htmlContent is an instance of java.lang.String, you can grab a snnipet of html by using HttpClient from Apache Projects
		List<DomElement> domElements = $("input[class=form-control]", htmlContent);
		
		for(DomElement domElement : domElements){
			System.out.println(domElement.getTag());
		}
	}
}
```

### Quick Start

##### Class Selector

>select DOM element by css class.

```java
$(".feature-heading", htmlContent);
```

##### ID Selector

>select DOM element by the id of html tag.

```java
$("#myModal", htmlContent);
```

##### Tag and Attributes Selector

>select DOM element by the name and attributes of html tag.

```java
$("input[name=password][class=input-control]", htmlContent);
```

>you can even use extra symbols.

> `^`: attribute starts with the given string.

> `*`: attribute contains the given string.

> `$`: attribute ends with the given string.

```java
$("input[name$=password][class^=input-control]", htmlContent);
$("input[name^=password][class*=input-control]", htmlContent);
$("input[name*=password][class$=input-control]", htmlContent);
```

##### Multiple Selectors

>just like jquery, you can use multiple selectors to make your search more concise.

```java
// grab all the descendants fullfil the second selector from the dom elements fullfil the first selector
$("#myModal input[name=password][class=input-control]", htmlContent); 

// grab all the direct children fullfil the second selector from the dom elements fullfil the first selector
//attention, the whitespace between '>' is compulsory.
$("#myModal > input[name=password][class=input-control]", htmlContent); 
```

##### The 'DomElement' Class

>It contains all the convenient methods and properties for your need to get more infos from the DOM element.
>You can also use `find()` and `children()` to furthermore search the html content of the DomElement itself.
```java
domElement.find("#myModal");
domElement.children("tr");
```

>Notice the `find()` and `children()` methods do not support multiple selectors.

### Filter

> I also provide filter support and the grammar just like jquery's.

```java
$("input:first", htmlContent);
```

