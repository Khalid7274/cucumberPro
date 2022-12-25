package utils;

import java.util.Iterator;
import java.util.Set;

import base.BaseClass;

public class CommonUtils extends BaseClass{

	public static void switchWindow() {
		  Set<String> window=getDriver().getWindowHandles();
		    Iterator<String> child=window.iterator();
		    String parentWindow=child.next();
		    String childWindow=child.next();
		    getDriver().switchTo().window(childWindow);
	}
}
