public class JavaCheck{
	public static void main(String[ ]arg){

String version = System.getProperty("java.version");
System.out.println("Java version: " + version);

String runtimeVersion = System.getProperty("java.runtime.version");
System.out.println("Java Runtime Version: " + runtimeVersion);

String home = System.getProperty("java.home");
System.out.println("Java Home: " + home);

String vendor = System.getProperty("java.vendor");
System.out.println("Java Vendor: " + vendor);

String vendorUrl = System.getProperty("java.vendor.url");
System.out.println("Java Vendor URL: " + vendorUrl);

String classPath = System.getProperty("java.class.path");
System.out.println("Java Class Path: " + classPath);

}
}