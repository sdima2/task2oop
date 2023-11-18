import java.util.List;

public class Main {
    public static void main(String[] args) {

        Time time = new Time();
        WeekSchedule weekSchedule = new WeekSchedule();

        Subject subject1 = new Subject(1,"Математика", 1);
        Subject subject2 = new Subject(2,"Физика", 1);
        Subject subject3 = new Subject(3,"Философия", 1);
        Subject subject4 = new Subject(4,"Литература", 1);
        Subject subject5 = new Subject(4,"Программирование", 1);

        Lecturer lecturer1 = new Lecturer(1,"Сергей", "Иванов");
        Lecturer lecturer2 = new Lecturer(2,"Сергей", "Петров");
        Lecturer lecturer3 = new Lecturer(3,"Надежда", "Андреевна");
        Lecturer lecturer4 = new Lecturer(3,"Виктор", "Сергеев");

        Group group1 = new Group(1);

        Student student1 = new Student(1,"Петр", "Петров");
        Student student2 = new Student(1,"Алена", "Попова");

        group1.addStudent(student1);
        group1.addStudent(student2);

        DaySchedule schedule1 = new DaySchedule(DayOfTheWeek.MONDAY, time.firstPair, subject1, lecturer1, group1);
        DaySchedule schedule2 = new DaySchedule(DayOfTheWeek.MONDAY, time.secondPair, subject2, lecturer2, group1);
        DaySchedule schedule3 = new DaySchedule(DayOfTheWeek.TUESDAY, time.thirdPair, subject1, lecturer1, group1);
        DaySchedule schedule4 = new DaySchedule(DayOfTheWeek.FRIDAY, time.secondPair, subject3, lecturer3, group1);
        DaySchedule schedule5 = new DaySchedule(DayOfTheWeek.FRIDAY, time.fifthPair, subject4, lecturer3, group1);
        DaySchedule schedule6 = new DaySchedule(DayOfTheWeek.WEDNESDAY, time.secondPair, subject5, lecturer4, group1);
        DaySchedule schedule7 = new DaySchedule(DayOfTheWeek.THURSDAY, time.firstPair, subject1, lecturer1, group1);
        DaySchedule schedule8 = new DaySchedule(DayOfTheWeek.THURSDAY, time.fourthPair, subject2, lecturer2, group1);
        DaySchedule schedule9 = new DaySchedule(DayOfTheWeek.SATURDAY, time.fourthPair, subject5, lecturer4, group1);



        weekSchedule.addToWeekSchedule(schedule1);
        weekSchedule.addToWeekSchedule(schedule2);
        weekSchedule.addToWeekSchedule(schedule3);
        weekSchedule.addToWeekSchedule(schedule4);
        weekSchedule.addToWeekSchedule(schedule5);
        weekSchedule.addToWeekSchedule(schedule6);
        weekSchedule.addToWeekSchedule(schedule7);
        weekSchedule.addToWeekSchedule(schedule8);
        weekSchedule.addToWeekSchedule(schedule9);

        List<DaySchedule> weekSchedule1 = weekSchedule.getWeekSchedule();

        weekSchedule.printer(weekSchedule1);




    }
}