package pattern;

public class FactoryProvider {

    public static SpeciesFactory getFactory(String type) throws IllegalArgumentException{

        if("Animal".equalsIgnoreCase(type)){
            return new AnimalFactory();
        }

        throw new IllegalArgumentException();
    }
}
