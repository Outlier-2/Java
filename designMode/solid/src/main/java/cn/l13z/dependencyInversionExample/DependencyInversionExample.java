package cn.l13z.dependencyInversionExample;

// 抽象接口
interface Logger {

    void log(String message);
}

// 低层模块，具体实现类
class FileLogger implements Logger {

    @Override
    public void log(String message) {
        // 文件日志记录逻辑
        System.out.println("Logging to file: " + message);
    }
}

class ConsoleLogger implements Logger {

    @Override
    public void log(String message) {
        // 控制台日志记录逻辑
        System.out.println("Logging to console: " + message);
    }
}

// 高层模块，依赖于抽象接口
class LogManager {

    private final Logger logger;

    LogManager(Logger logger) {
        this.logger = logger;
    }


    void logMessage(String message) {
        this.logger.log(message);
    }
}

/**
 * &#064;Project: solid <br>
 * &#064;ClassName:     DependencyInversionExample.java <br>
 * @author AlfredOrlando <br>
 */

 // 使用示例
public class DependencyInversionExample {

    public static void main(String[] args) {
        // 低层模块
        Logger fileLogger = new FileLogger();
        Logger consoleLogger = new ConsoleLogger();

        // 高层模块
        LogManager logManager = new LogManager(fileLogger);
        logManager.logMessage("Log message to file");

        logManager = new LogManager(consoleLogger);
        logManager.logMessage("Log message to console");
    }
}