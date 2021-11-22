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

}

class Tiep {

    void doBusProject(DataProcessor dataProcessor, String data)
    {
        // process data
        int result = dataProcessor.processData(data);
    }

}


public class App1 {

    public static void main(String[] argv)
    {
        Thang thang = new Thang();
        Tiep tiep = new Tiep();

        tiep.doBusProject(thang.getDataProcessor(), "daily_data");
    }

}
