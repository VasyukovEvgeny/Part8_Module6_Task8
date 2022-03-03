class Client extends Person implements Printable,SeasonHandler {
    public int size;
    protected int weight;

    Client(int speed) {
        super(speed);
    }

    @Override
    public void setColour(String colour) {
        super.setColour(colour);
    }

    public void print() {
        System.out.printf("%d   %d", size, weight);
    }
    public void print_season(){
        System.out.printf("Сейчас *%s*.*Золотистый*", Season.Autumn.toString());
        System.out.printf("Сейчас *%s*.*Серый*", Season.Spring.toString());
        System.out.printf("Сейчас *%s*.*Белый*", Season.Winter.toString());
        System.out.printf("Сейчас *%s*.*Желтый*", Season.Summer.toString());
    };



}


