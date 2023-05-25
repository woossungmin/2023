package ISP;

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class Programmer implements Workable {
    public void work() {
        System.out.println("���α׷��Ӱ� ���մϴ�.");
    }
}

class Chef implements Workable, Eatable {
    public void work() {
        System.out.println("�丮�簡 ���մϴ�.");
    }

    public void eat() {
        System.out.println("�丮�簡 �Ļ��մϴ�.");
    }
}

class SleepyPerson implements Sleepable {
    public void sleep() {
        System.out.println("���ڴ� ����� ���� ��ϴ�.");
    }
}

public class Main {
    public static void main(String[] args) {
        Workable programmer = new Programmer();
        programmer.work();

        Workable chef = new Chef();
        chef.work();
        ((Eatable) chef).eat();

        Sleepable sleepyPerson = new SleepyPerson();
        sleepyPerson.sleep();
    }
}