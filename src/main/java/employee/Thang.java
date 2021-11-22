package employee;

import jobs.DataProcessorJob;
import jobs.ProductManagerJob;

public class Thang implements ProductManagerJob {

    // Internal tool of Tiep. Nothing can touch
    private final DataProcessorJob dataProcessor;

    public Thang()
    {
        dataProcessor = new Tuyen();
    }

    // Give tool to someone if they ask
    public DataProcessorJob getDataProcessor() {
        return dataProcessor;
    }

    // Take input to work. No one know about the tool
    public Integer processData(String data) {
        return dataProcessor.processData(data);
    }

}