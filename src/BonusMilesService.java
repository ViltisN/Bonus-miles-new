// Создаем класс BonusMilesService
public class BonusMilesService {
    // Метод calculate принимает цену билета и возвращает количество миль
    public int calculate(int ticketPrice)
    {
        int milesPerRubles = 20; // Количество миль за 20 рублей
        int miles = ticketPrice / milesPerRubles;
        return miles;
    }
}