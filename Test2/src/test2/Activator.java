package test2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello World!!");
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
		System.out.println("Goodbye Albania!!");
		System.out.println("Goodbye Albania!!");
		System.out.println("Goodbye Sister");
		

	}

}
