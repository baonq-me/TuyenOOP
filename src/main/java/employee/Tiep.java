package employee;

import jobs.DataProcessorJob;
import jobs.HeadOfIoTJob;
import jobs.ProductManagerJob;

public class Tiep implements HeadOfIoTJob {

    public Integer doBusProject(DataProcessorJob dataProcessor, String data)
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
