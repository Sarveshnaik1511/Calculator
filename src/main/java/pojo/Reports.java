package pojo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	public static ExtentReports configureReports() {
		ExtentReports reports = new ExtentReports();
		ExtentSparkReporter html = new ExtentSparkReporter("CalculatorReports.html");
		reports.attachReporter(html);
		reports.setSystemInfo("Application", "Calculator");
		reports.setSystemInfo("Created By", "Sarvesh Naik");
		return reports;
	}

}
