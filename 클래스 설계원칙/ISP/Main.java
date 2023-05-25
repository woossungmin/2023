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
        System.out.println("프로그래머가 일합니다.");
    }
}

class Chef implements Workable, Eatable {
    public void work() {
        System.out.println("요리사가 일합니다.");
    }

    public void eat() {
        System.out.println("요리사가 식사합니다.");
    }
}

class SleepyPerson implements Sleepable {
    public void sleep() {
        System.out.println("잠자는 사람이 잠을 잡니다.");
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