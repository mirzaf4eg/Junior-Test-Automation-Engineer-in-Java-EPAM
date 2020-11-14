package JavaCollectionsMainTask;

import JavaCollectionsMainTask.Classification.*;
import JavaCollectionsMainTask.Planes.CargoPlane;
import JavaCollectionsMainTask.Planes.MilitaryPlane;
import JavaCollectionsMainTask.Planes.PassengerPlane;
import JavaCollectionsMainTask.Planes.Plane;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mirzaf4eg in sep 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Collections
 * Main Task
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 *    - Каждый класс должен иметь отражающее смысл название и информативный состав;
 *    - Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция;
 *    - Наследование должно применяться только тогда, когда это имеет смысл;
 *    - При кодировании должны быть использованы соглашения об оформлении кода java code convention;
 *    - Классы должны быть грамотно разложены по пакетам;
 *    - Консольное меню должно быть минимальным;
 *    - Для хранения параметров инициализации можно использовать файлы.
 * Вариант 9: Авиакомпания:
 * Определить иерархию самолетов.
 * Создать авиакомпанию.
 * Посчитать общую вместимость и грузоподъемность.
 * Провести сортировку самолетов компании по дальности полета.
 * Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.
 */

public class Main {
  static List<Plane> planes = Arrays.asList(
    new PassengerPlane(Brand.AIRBUS, "A320 100", "EW50010", Assignment.PASSENGER, AlongTheLine.INTERNATIONAL, 870, 6150, 24210, 2700, ServiceLevel.PLANED, 150),
    new PassengerPlane(Brand.AIRBUS, "A380-800", "EW50011", Assignment.PASSENGER, AlongTheLine.INTERNATIONAL,850, 15000, 320000, 1400, ServiceLevel.CHARTER, 525),
    new PassengerPlane(Brand.BOEING, "737-MAX9", "EW00001", Assignment.SPECIAL, AlongTheLine.REGIONAL,852, 5800, 26022, 2550, ServiceLevel.LITER_A, 215),
    new PassengerPlane(Brand.CESSNA, "Citation-CJ4", "EW00002", Assignment.SPECIAL, AlongTheLine.LOCAL,770, 3380, 2635, 500, ServiceLevel.PRIVATE, 6),
    new PassengerPlane(Brand.TU, "154M", "EW30111", Assignment.SPECIAL, AlongTheLine.INTERNATIONAL,850, 4000, 30000, 5401, ServiceLevel.LITER_B, 164),
    new CargoPlane(Brand.IL, "76MD-90A", "EW70010", Assignment.CARGO, AlongTheLine.REGIONAL, 850, 4000, 109000, 5900, 60000),
    new CargoPlane(Brand.AN, "124-100M", "EW70035", Assignment.CARGO, AlongTheLine.INTERNATIONAL, 800, 4800, 212350, 12600, 120000),
    new CargoPlane(Brand.BOEING, "747-8F", "EW70151", Assignment.CARGO, AlongTheLine.INTERNATIONAL, 908, 14000, 181000, 5000, 132000),
    new CargoPlane(Brand.AIRBUS, "A300-600ST-Beluga", "EW70254", Assignment.CARGO, AlongTheLine.INTERNATIONAL, 750, 3800, 120000, 4500, 47000),
    new CargoPlane(Brand.AN, "225-Mria", "EW70178", Assignment.CARGO, AlongTheLine.INTERNATIONAL, 850, 4000, 300000, 5700, 250000),
    new MilitaryPlane(Brand.MIG, "29UB", "EW30010", Assignment.MILITARY, AlongTheLine.TRAINING, 850, 1430, 4200, 1000, MilitaryType.FIGHTER),
    new MilitaryPlane(Brand.TU, "160M2", "EW90411", Assignment.MILITARY, AlongTheLine.INTERNATIONAL, 750, 5000, 70000, 5200, MilitaryType.BOMBER),
    new MilitaryPlane(Brand.IL, "76TD", "EW90810", Assignment.MILITARY, AlongTheLine.REGIONAL, 800, 3600, 109000, 5900, MilitaryType.TRANSPORT)
    );

  public static void main(String[] args) {
    Mirzaf4egAirLines mirzaf4egAirLines = new Mirzaf4egAirLines(planes);
    System.out.println("\nСписок всех самолетов:");
    mirzaf4egAirLines.printPlane(planes);
    System.out.println("\nПарк пассажирских самолетов:");
    mirzaf4egAirLines.printPlane(mirzaf4egAirLines.getPassengerPlanes());
    System.out.println("Вместимость всех пассажирских самолетов (пассажиров): " + mirzaf4egAirLines.getTotalCapacityPassengers());
    System.out.println("\nПарк грузовых самолетов:");
    mirzaf4egAirLines.printPlane(mirzaf4egAirLines.getCargoPlanes());
    System.out.println("Грузоподъемность всех грузовых самолетов (килограмм): " + mirzaf4egAirLines.getTotalCapacityCargo());
    System.out.println("\nПарк военных самолетов:");
    mirzaf4egAirLines.printPlane(mirzaf4egAirLines.getMilitaryPlanes());
    System.out.println("\nСамолеты, расход топлива которых, при максимальной загрузке, в пределах 4500-5500 литров/час:");
    mirzaf4egAirLines.printPlane(mirzaf4egAirLines.filterAverageFuelConsumption(4500, 5500));
    System.out.println("\nСписок всех самолетов, отсортированный по дальности полета:");
    mirzaf4egAirLines.printPlane(mirzaf4egAirLines.sortByFlightDistance());
  }
}
