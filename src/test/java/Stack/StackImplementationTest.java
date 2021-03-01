package Stack;


import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(PowerMockRunner.class)
@PrepareForTest(StackImplementation.class)
public class StackImplementationTest {


    private StackImplementation stackImplementation;

    @Before
    public void StackImplementationTest(){
        stackImplementation = new StackImplementation();
    }

    @Test
    public void stackEmptyTestTrue(){
        Assert.assertThat("isEmpty method reports true for an empty stack", stackImplementation.stackEmpty(), is(true));
    }

    @Test
    public void stackEmptyTestFalse(){
        stackImplementation.push(1);
        assertThat("isEmpty method reports false for non empty stack", stackImplementation.stackEmpty(), is(false));
    }

    @Test
    public void oneElementPushTest(){
        stackImplementation.push(1);
        Assert.assertEquals(1, stackImplementation.size());
    }

    @Test
    public void twoElementPushTest(){
        stackImplementation.push(1);
        stackImplementation.push(2);
        Assert.assertEquals(2, stackImplementation.size());
    }

    @Test
    public void pushOnePopOneValueOnStack(){
        stackImplementation.push(1);
        int popReturn = stackImplementation.pop();
        Assert.assertEquals(0, stackImplementation.size());
        Assert.assertEquals(1, popReturn);
    }

    @Test
    public void pushOneAndPeek() {
        stackImplementation.push(1);
        assertThat("1 was pushed on the stack and 1 should be returned when calling peek.", stackImplementation.peek(), is(1));
    }

    @Test(expected = EmptyStackException.class)
    public void peekOnEmptyStack() {
       stackImplementation.peek();
    }

    @Test(expected = EmptyStackException.class)
    public void popOnEmptyStack() {
        stackImplementation.pop();
    }

}

