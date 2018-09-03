package cls.factory_abstruct;

public class FactoryAbstractMain {

    public static void main(String[] args) {

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        //get an object of Shape Square
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        //get printer factory
        AbstractFactory printerFactory = FactoryProducer.getFactory("printer");

        Printer printer1 = printerFactory.getPrinter("Paper");
        printer1.print();

        Printer printer2 = printerFactory.getPrinter("Web");
        printer2.print();

        Printer printer3 = printerFactory.getPrinter("Screen");
        printer3.print();
    }

}
