import java.util.Optional;


interface DataProcessor {

    /**
     * Process data
     * @param data input
     * @return output
     */
    Integer processData(String data);

}

class Tuyen implements DataProcessor {

    @Override
    public Integer processData(String data) {
        // process data
        return data.length();
    }
}

class Thang {

    private final DataProcessor dataProcessor;

    public Thang()
    {
        dataProcessor = new Tuyen();
    }

    public DataProcessor getDataProcessor() {
        return dataProcessor;
    }

    public Integer processData(String data) {
        return dataProcessor.processData(data);
    }


}

class Tiep {

    public Integer doBusProject(DataProcessor dataProcessor, String data)
    {
        // process data
        return dataProcessor.processData(data);
    }

    public Integer doBusProject(Thang thang, String data)
    {
        // process data
        return thang.processData(data);
    }

}


public class App {

    public static void main(String[] argv)
    {
        Thang thang = new Thang();
        Tiep tiep = new Tiep();

        int result1;
        int result2;

        // Dependency injection
        result1 = tiep.doBusProject(thang.getDataProcessor(), "daily_data");

        // Interface
        result2 = tiep.doBusProject(thang,"daily_data");

        if (result1 + result2 > 0)
        {
            System.out.println("Congrats !");
        } else {
            System.out.println("Bye...");
        }
    }

}
