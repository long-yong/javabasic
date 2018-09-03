package cls.factory_abstruct;

class PaperPrinter implements Printer{

    @Override
    public void print() {
        System.out.println("paper");
    }
}
