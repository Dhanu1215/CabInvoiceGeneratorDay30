import com.blp.cabinvoicegenerator.CabInvoiceGenerator;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    @Test
    public void givenDistanceAndTimeWhenComputedShouldReturnTotalFare() {
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        double distance = 10, time = 1;
        double result = invoice.CalculateFare(distance, time);
        Assert.assertEquals(100, result, 0);
    }
    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinFare(){
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        double distance=0.1,time =1;
        double result = invoice.CalculateFare( distance , time);
        Assert.assertEquals(5,result,0);
    }
}
