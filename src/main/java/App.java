
// Define task clearly with clear input and output
interface DataProcessor {

    /**
     * Process data task
     * @param data input
     * @return output
     */
    Integer processData(String data);

}

interface ProductManagerJob {

    // Give tool to someone if they ask
    DataProcessor getDataProcessor();

    // Take input to work. No one know about the tool
    Integer processData(String data);
}

class Tuyen implements DataProcessor {

    public Integer processData(String data) {
        // process data
        return data.length();
    }

}

class Thang implements ProductManagerJob {

    // Internal tool of Tiep. Nothing can touch
    private final DataProcessor dataProcessor;

    public Thang()
    {
        dataProcessor = new Tuyen();
    }

    // Give tool to someone if they ask
    public DataProcessor getDataProcessor() {
        return dataProcessor;
    }

    // Take input to work. No one know about the tool
    public Integer processData(String data) {
        return dataProcessor.processData(data);
    }

}

interface HeadOfIoTJob {

    Integer doBusProject(DataProcessor dataProcessor, String data);

    Integer doBusProject(ProductManagerJob pmJob, String data);
}

class Tiep implements HeadOfIoTJob {

    public Integer doBusProject(DataProcessor dataProcessor, String data)
    {
        // process data
        return dataProcessor.processData(data);
    }

    public Integer doBusProject(ProductManagerJob pmJob, String data)
    {
        // process data
        return pmJob.processData(data);
    }

}


public class App {

    public static void main(String[] argv)
    {
        ProductManagerJob pmJob = new Thang();
        HeadOfIoTJob headJob = new Tiep();

        int result1;
        int result2;

        // Dependency injection: Thang give Tiep tool to work
        result1 = headJob.doBusProject(pmJob.getDataProcessor(), "daily_data");

        // Thang work with Tiep around the data
        result2 = headJob.doBusProject(pmJob, "daily_data");

        if (result1 + result2 > 0)
        {
            System.out.println("Congrats !");
        } else {
            System.out.println("Bye...");
        }
    }

}
