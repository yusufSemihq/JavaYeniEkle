public class CustomerManager {
    private  BaseLogger baseLogger;


    public CustomerManager(BaseLogger logger) {
        this.logger = logger;

    }
    public void Add() {
        System.out.println("Müşteri Eklendi");
        DatebaseLogger logger = new DatebaseLogger();
        logger.Log("Log Mesajı");
    }
}
