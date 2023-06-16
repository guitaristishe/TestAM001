package HomeWork3;

public class LuckyTicket {
    public static void main(String[] args) {
        int[] ticket = {1, 2, 3, 4, 5, 6}; // Пример шестизначного билета

        if (isLuckyTicket(ticket)) {
            System.out.println("Это счастливый билет!");
        } else {
            System.out.println("Это не счастливый билет.");
        }
    }

    public static boolean isLuckyTicket(int[] ticket) {
        if (ticket.length != 6) {
            return false; // Билет должен быть шестизначным
        }

        int sumFirstHalf = ticket[0] + ticket[1] + ticket[2];
        int sumSecondHalf = ticket[3] + ticket[4] + ticket[5];

        return sumFirstHalf == sumSecondHalf;
    }
}
