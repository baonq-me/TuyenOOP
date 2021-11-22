package jobs;

public interface HeadOfIoTJob {

    Integer doBusProject(DataProcessorJob dataProcessor, String data);

    Integer doBusProject(ProductManagerJob pmJob, String data);
}
