import org.junit.*;
import static org.junit.Assert.*;

public class JobTest{
  @Test
  public void Job_instantiatesCorrectly_true(){
    Job myJob = new Job("Developer", "Epicodus", "Portland", "OR", "code", "review code", "code some more", "August 2015", "August 2016");
    assertEquals(true, myJob instanceof Job);
  }
}
