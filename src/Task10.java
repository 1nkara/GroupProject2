public class Task10 {
    /*Provide Implementation for the diagram below. Then create a test class in which you need to
    create Objects of ChromeDriver,
        FirefoxDrive and SafariDriver classes and see which methods available to them.*/
}
interface WebDriver{
    void open();
    void close();
    String getTitle();

}
interface RemoteWebDriver extends WebDriver {
    void navigate();

}
interface TakesScreenshot extends RemoteWebDriver{
    void getSecreenshot();
}

class ChromeDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Open the ChromeDriver");

    }

    @Override
    public void close() {
        System.out.println("Close the ChromeDriver");

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Naviagte to Chrome Browser");

    }
}
class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open Firefox Driver");

    }

    @Override
    public void close() {
        System.out.println("Close Firefox Driver");

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Firefox Driver");

    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open Safari Driver");

    }

    @Override
    public void close() {
        System.out.println("Close Safari Driver");

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to SafariDriver");

    }
}

