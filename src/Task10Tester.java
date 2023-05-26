public class Task10Tester {
    public static void main(String[] args) {
        WebDriver[] webDrivers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (WebDriver webdriver : webDrivers) {
            webdriver.open();
            webdriver.close();
            webdriver.getTitle();

        }
    }
}



