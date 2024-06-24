package familytree;


import familytree.model.familytreelist.FamilyTree;
import familytree.model.human.Gender;
import familytree.model.human.Human;
import familytree.model.load.FileHandler;
import familytree.model.load.Writable;
import familytree.view.ConsoleUI;
import familytree.view.View;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {


        //String filePath = "C:\\Java\\DzTree\\tree.txt";
        //FamilyTree tree = fmTast();

        //FamilyTree tree = load(filePath);

        //System.out.println(tree);

        //save(tree,filePath);
        //FamilyTree tree = fmTast();
        //System.out.println(tree);
        //tree.sortName(); // Сортировка по алфовиту.
        // tree.sortBirthData();
        // System.out.println(tree); // Сортировка по дню рождения.

         View view = new ConsoleUI();
         view.start();

    }
          private static void save(FamilyTree tree, String filePath) {
          Writable writable = new FileHandler();
          writable.save(tree, filePath);
         }

          private static FamilyTree load(String filePath) {
          Writable writable = new FileHandler();
          return (FamilyTree) writable.read(filePath);
         }

        private static FamilyTree fmTast(){

        FamilyTree fm = new FamilyTree<>();

        Human Vera = new Human("Вера", Gender.Female,
                LocalDate.of(1953, 5, 18));
        Human Valentin = new Human("Валентин", Gender.Male,
                LocalDate.of(1946, 9, 21));
        Human Ruslan = new Human("Руслан", Gender.Male,
                LocalDate.of(1986, 6, 5), Valentin, Vera);
        Human Luda = new Human("Людмила", Gender.Female,
                LocalDate.of(1975, 8, 24), Valentin, Vera);
        Human Sasha = new Human("Александр", Gender.Male,
                LocalDate.of(1974, 10, 15));
        Human Olga = new Human("Ольга", Gender.Female,
                LocalDate.of(1999, 12, 28), Sasha, Luda);
        Human Egor = new Human("Егор", Gender.Male,
                LocalDate.of(2008, 3, 6), Sasha, Luda);


        Vera.addChild(Ruslan);
        Valentin.addChild(Ruslan);
        Vera.addChild(Luda);
        Valentin.addChild(Luda);
        Luda.addChild(Olga);
        Luda.addChild(Egor);
        Sasha.addChild(Olga);
        Sasha.addChild(Egor);


        fm.addHuman(Vera);
        fm.addHuman(Valentin);
        fm.addHuman(Ruslan);
        fm.addHuman(Luda);
        fm.addHuman(Sasha);
        fm.addHuman(Olga);
        fm.addHuman(Egor);

    return fm; }









        //System.out.println(fm.findHuman(3)); // - Найти человека по id.


    }


