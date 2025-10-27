package test1;

import framework.ControllerAnnot;
import framework.UrlAnnot;

@ControllerAnnot
public class Test1A {
	@UrlAnnot("/test1")
	public void test1() {
	}

    @UrlAnnot("/test2")
	public void test2() {
	}
}
