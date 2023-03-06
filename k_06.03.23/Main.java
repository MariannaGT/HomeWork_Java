public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        // 1. Создать массив котов. Пусть все коты из массива по очереди едят из одной тарелки.
        // В конце каждого цикла мы досыпаем в тарелку еду.
        // Для досыпания еды сделать метод increaseFood в классе Plate.
        // 2. Поменять поле satiety у кота с boolean на int.
        // Допустим у кота аппетит 10, сытость 3. Значит кот захочет поесть 7 единиц.
        // 3. * Доработать поток thread в классе Cat, чтобы он каждую секунду уменьшал сытость кота на 1.

        Cat Garfield = new Cat("Гарфилд", 15);
        Cat Tom = new Cat("Том",10); 
        Cat Pushok = new Cat("Пушок",10); 
        Cat Murzik = new Cat("Мурзик", 7);
        Cat Barsik = new Cat("Барсик", 4);
        Cat Ryzhik = new Cat("Рыжик", 5);
        Cat Oblachko = new Cat("Облачко", 4);


        Cat[] Cats = new Cat[]{Garfield, Tom, Pushok, Murzik, Barsik, Ryzhik, Oblachko};

        Plate plate = new Plate(30, 30);

        while (true) {
            for (Cat cat : Cats) {
                System.out.println(plate);
                cat.eat(plate);
                System.out.println(cat);
                plate.increaseFood(20);
                System.out.println(plate);
            }
        }

    }
}