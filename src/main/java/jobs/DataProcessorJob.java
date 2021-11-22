package jobs;

// Define task clearly with clear input and output
public interface DataProcessorJob {

    /**
     * Process data task
     * @param data input
     * @return output
     */
    Integer processData(String data);

}