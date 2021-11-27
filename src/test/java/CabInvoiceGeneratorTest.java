import com.blp.cabinvoicegenerator.CabInvoiceGenerator;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    @Test
    public void givenDistanceAndTimeWhenComputedShouldReturnTotalFare() {
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        double result = invoice.CalculateFare(10, 1);
        Assert.assertEquals(101, result, 0.0);
    }

    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinFare() {
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        double result = invoice.CalculateFare(0.1, 1);
        Assert.assertEquals(5, result, 0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        double result1 = CabInvoiceGenerator.CalculateAvgFare(2.5, 10);
        double result2 = CabInvoiceGenerator.CalculateAvgFare(0.5, 5);
        double result3 = CabInvoiceGenerator.CalculateAvgFare(0.1, 1);
        double result = (result1+result2+result3)/3;
        Assert.assertEquals(16.666666666666668, result, 0.0);
    }
}
