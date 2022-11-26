public class Main {
    public static void main(String[] args) {
        human Maxim = new human("муж","Максим","Минск",1988,"бренд-менеджера");
        human Anya = new human("жен","Аня","Москва",1993,"методист образовательных программ");
        human Katya = new human("жен","Катя","Калининград",1992,"продакт-менеджер");
        human Artem = new human("муж","Артем","Москва",1995,"директор по развитию бизнеса");
        //human spy = new human("муж","","",-1995,"");
        human Vladimir = new human("муж","Владимир","Казань",2001,"... хм, нет, я же не работаю");
        System.out.println(Maxim);
        System.out.println(Anya);
        System.out.println(Katya);
        System.out.println(Artem);
        System.out.println(Vladimir);
        //System.out.println(spy);
        flower Rose = new flower("Роза обыкновенная","Голландия",35.5999999,"");
        flower Chrysanthemum = new flower("Хризантема","",15 ,"5 дней");
        flower Peony = new flower("Пион","Англия",69.9,"1 день");
        flower Gypsophila = new flower("Гипсофила","Турция",19.5,"10 дней");
        System.out.println(Rose);
        System.out.println(Chrysanthemum);
        System.out.println(Peony);
        System.out.println(Gypsophila);
    }
}