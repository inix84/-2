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
    }
}