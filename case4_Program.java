public class case4_Program {
    public static void main(String[] args) {
        // #region Robot1 demo
        case4_Robot1 robot1 = new case4_Robot1("name_1", 1);
        System.out.printf("%s %d\n", robot1.name, robot1.level);
        robot1.startBIOS();
        robot1.startOS();
        robot1.sayHi();
        robot1.work();
        robot1.work();
        robot1.work();
        robot1.sayBye();
        robot1.startOS();
        robot1.stopBIOS();

        robot1.level = 100500;
        System.out.printf("%s %d\n", robot1.name, robot1.level);

        // #region Robot2 demo
        case4_Robot2 robot2 = new case4_Robot2("name_2", 1);
        System.out.printf("%s %d\n", robot2.getName(), robot2.getLevel());
        robot2.powerOn();
        robot2.work();
        robot2.powerOff();

        // #region Robot3 demo
        case4_Robot3 robot3 = new case4_Robot3("name_3");
        System.out.println("------------------------");
        System.out.println(robot3);
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();
        robot3.power();
    }
}
