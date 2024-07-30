package example.Proxypattern;

public class RealImage  implements Image {
	
	private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromRemoteServer(filename);
    }

    private void loadFromRemoteServer(String filename) {
        System.out.println("Loading " + filename + " from remote server...");
        try {
            Thread.sleep(2000); // Simulating delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

	@Override
	public void display() {
		 System.out.println("Displaying " + filename);
		
	}

}
