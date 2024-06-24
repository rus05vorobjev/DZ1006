package familytree.view;

import familytree.model.human.Gender;
import familytree.presenter.Presenter;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View {
private Scanner scanner;
private Presenter presenter;
private boolean work;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;

    }

    @Override
    public void start() {
        System.out.println("Меню");
        while (work) {
            System.out.println("1. Добавить человека");
            System.out.println("2. Получить список людей");
            System.out.println("3. Найти человека по id");
            System.out.println("4. Отсортировать по возрасту");
            System.out.println("5. Закончить работу");
            System.out.print("\nВаш выбор: ");


            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addHuman();
                    break;

                case "2":
                    getHumanInfo();
                    break;

                case "3":
                    findHuman();

                    break;

                case "4":
                    sortByName();
                    break;

                case "5":
                    finish();
                    break;

                default:
                    System.out.println("Ошибка. Некорректные данные");
            }
        }
    }

    private void finish() {
        work = false;
    }

    private void sortByName() {
        presenter.sortByName();
    }

    private void findHuman() {
        System.out.print("Укажите id: ");
        String idStr = scanner.nextLine();
        int id = Integer.parseInt(idStr);
        presenter.findHuman(id);
    }

    private void getHumanInfo() {
        presenter.getHumanInfo();
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);

    }
    public void addHuman(){
        System.out.print("Укажите имя: ");
        String name = scanner.nextLine();
        System.out.print("Укажите пол. Male или Female: ");
        Gender gender = Gender.valueOf(scanner.nextLine());
        System.out.println("Укажите дату рождения(год, месяц, число): ");
        LocalDate age = LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        scanner.nextLine();
        System.out.println("Введите имя отца: ");
        presenter.addHuman(name,gender,age);


    }


}
