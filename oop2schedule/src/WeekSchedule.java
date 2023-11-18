import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WeekSchedule {

    private List<DaySchedule> weekSchedule;


    public WeekSchedule() {
        this.weekSchedule = new ArrayList<>();
    }

    public void addToWeekSchedule(DaySchedule daySchedule){ //добавляем расписание одной пары и сортируем по времени
        weekSchedule.add(daySchedule);
        weekSchedule.sort(Comparator.comparing(DaySchedule::getTime));
    }
    public void printer(List<DaySchedule> ds) {
        System.out.println("---ПОНЕДЕЛЬНИК---");
        for (DaySchedule schedule : ds) {
            if (schedule.getDayoftheweek().equals(DayOfTheWeek.MONDAY)) {
                System.out.println(schedule.getInformation());
            }
        }
        System.out.println();
        System.out.println("---ВТОРНИК---");
            for (DaySchedule schedule : ds) {
                if (schedule.getDayoftheweek().equals(DayOfTheWeek.TUESDAY)) {
                    System.out.println(schedule.getInformation());
                }
        }
        System.out.println();
        System.out.println("---СРЕДА---");
        for (DaySchedule schedule : ds) {
            if (schedule.getDayoftheweek().equals(DayOfTheWeek.WEDNESDAY)) {
                System.out.println(schedule.getInformation());
            }
        }
        System.out.println();
        System.out.println("---ЧЕТВЕРГ---");
        for (DaySchedule schedule : ds) {
            if (schedule.getDayoftheweek().equals(DayOfTheWeek.THURSDAY)) {
                System.out.println(schedule.getInformation());
            }
        }
        System.out.println();
        System.out.println("---ПЯТНИЦА---");
        for (DaySchedule schedule : ds) {
            if (schedule.getDayoftheweek().equals(DayOfTheWeek.FRIDAY)) {
                System.out.println(schedule.getInformation());
            }
        }
        System.out.println();
        System.out.println("---СУББОТА---");
        for (DaySchedule schedule : ds) {
            if (schedule.getDayoftheweek().equals(DayOfTheWeek.SATURDAY)) {
                System.out.println(schedule.getInformation());
            }
        }
    }




    public List<DaySchedule> getWeekSchedule() {
        return weekSchedule;
    }

    public void setWeekSchedule(List<DaySchedule> weekSchedule) {
        this.weekSchedule = weekSchedule;
    }


    public void wholeSchedulePrinter() {

        for (DaySchedule schedule : weekSchedule) {
                System.out.println(schedule.getInformation());

        }
    }


}
