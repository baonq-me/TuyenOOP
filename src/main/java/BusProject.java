import employee.Thang;
import employee.Tiep;
import jobs.HeadOfIoTJob;
import jobs.ProductManagerJob;

public class BusProject {

    public static void main(String[] argv)
    {
        ProductManagerJob pmJob = new Thang();
        HeadOfIoTJob headOfIoTJob = new Tiep();

        boolean result1IsOk;
        boolean result2IsOk;

        // Dependency injection: Thang give Tiep tool to work
        result1IsOk = headOfIoTJob.doBusProject(pmJob.getDataProcessor(), "daily_data") > 0;

        // Thang work with Tiep around the data
        result2IsOk = headOfIoTJob.doBusProject(pmJob, "daily_data") > 0;

        if (result1IsOk || result2IsOk)
        {
            System.out.println("Congrats !");
        } else {
            System.out.println("Bye...");
        }
    }

}
