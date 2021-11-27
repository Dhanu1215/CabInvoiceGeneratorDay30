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
    public void givenLessDistanceOrTime_ShouldReturnMinFare(){
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        double result = invoice.CalculateFare( 0.1 , 1);
        Assert.assertEquals(5,result,0.0);
    }
}
