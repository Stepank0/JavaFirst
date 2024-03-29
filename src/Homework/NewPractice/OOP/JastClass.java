package Homework.NewPractice.OOP;

public class JastClass {

    public static void main(String[] args) {


        MonitoringSystem generalModule = () -> System.out.println("Мониторинг общих показателей стартовал!");

        MonitoringSystem errorModule  = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок стартовал!");
            }
        };

        MonitoringSystem securityModule   = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал!");
            }
        };


    }
}
