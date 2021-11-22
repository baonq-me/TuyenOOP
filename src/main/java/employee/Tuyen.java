package employee;

import jobs.DataProcessorJob;

public class Tuyen implements DataProcessorJob {

    public Integer processData(String data) {
        // process data
        return data.length();
    }

}