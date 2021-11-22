package jobs;

public interface ProductManagerJob {

    // Give tool to someone if they ask
    DataProcessorJob getDataProcessor();

    // Take input to work. No one know about the tool
    Integer processData(String data);
}