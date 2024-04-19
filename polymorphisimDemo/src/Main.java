import java.util.logging.Logger;


public class Main {
    BaseLogger[] loggers = new BaseLogger[]
            {new FileLogger(), new EmailLogger(), new DatebaseLogger(), new ConsoleLogger()};

                        for (BaseLogger logger:loggers){
                        logger.Log("Log Mesaj");
        }
}