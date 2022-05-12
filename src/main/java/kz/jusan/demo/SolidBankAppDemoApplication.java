package kz.jusan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SolidBankAppDemoApplication {

	public static void main(String[] args) {
		String help = "Welcome to CLI bank serviceEnter operation number:\n" +
				"1 - show accounts\n" +
				"2 - create account\n" +
				"3 - deposit\n" +
				"4 - withdraw\n" +
				"5 - transfer\n" +
				"6 - this message\n" +
				"7 - exit\n";
		boolean running = true;
		ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
		AccountBasicCLI accountBasicCLI = (AccountBasicCLI)context.getBean("accountBasicCLI");

		MyCLI myCLI = (MyCLI)context.getBean("myCLI");
		String clientId = "1";

		System.out.println(help);

		while(running) {
			switch (myCLI.getScanner().nextLine()) {
				case "1":
					accountBasicCLI.getAccounts(clientId);
					break;
				case "2":
					accountBasicCLI.createAccountRequest(clientId);
					break;
				case "6":
					System.out.println(help);;
					break;
				case "7":
					System.out.println("Application closed");
					running = false;
					break;
				default:
					System.out.println("Error: invalid command");
			}
			//myCLI.getScanner().close();
		}
	}

}
