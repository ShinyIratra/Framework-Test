package test2;

import framework.ControllerAnnot;
import framework.UrlAnnot;

@ControllerAnnot
public class Test2A {
	@UrlAnnot("/test1")
	public void test1() {
	}

    @UrlAnnot("/test2")
	public void test2() {
	}
}
