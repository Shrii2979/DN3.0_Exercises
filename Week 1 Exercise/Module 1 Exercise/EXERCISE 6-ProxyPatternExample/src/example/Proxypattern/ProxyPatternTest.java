package example.Proxypattern;

public class ProxyPatternTest {

	public static void main(String[] args) {
		Image image1 = new ProxyImage("test_image_1.jpg");
        Image image2 = new ProxyImage("test_image_2.jpg");

        // Image will be loaded from remote server
        image1.display(); 
        System.out.println("");

        // Image will not be loaded from remote server, but displayed from cache
        image1.display(); 
        System.out.println("");

        // Image will be loaded from remote server
        image2.display(); 
        System.out.println("");

        // Image will not be loaded from remote server, but displayed from cache
        image2.display(); 
    }

}
