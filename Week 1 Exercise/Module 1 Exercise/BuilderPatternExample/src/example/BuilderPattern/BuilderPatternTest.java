package example.BuilderPattern;

public class BuilderPatternTest {

	public static void main(String[] args) {
		
		Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .build();

        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .build();

        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel Core i3")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();

        // Print the configurations
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Office Computer: " + officeComputer);
        System.out.println("Basic Computer: " + basicComputer);
    }
	}
		
