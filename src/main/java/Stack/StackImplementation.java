package Stack;

import org.springframework.stereotype.Component;

/**
 * Create Stack operations
 */
@Component
public class StackImplementation implements Stack {

    private int stackElement[];
    private int top = -1;

    public StackImplementation(){
        this.stackElement = new int[CapacityReturnConstants.capacity];
    }


    public Boolean stackEmpty(){
        if(top == -1)
            return CapacityReturnConstants.YES;
        else
            return CapacityReturnConstants.NO;
    }

    @Override
    public void push(int element){
        this.top++;
        stackElement[top] = element;
    }

    @Override
    public int pop(){
        if(this.stackEmpty())
            throw new EmptyStackException();

        int stackTopEle = stackElement[top];
        top--;
        return stackTopEle;
    }


    @Override
    public int peek(){
        if(this.stackEmpty())
            throw new EmptyStackException();
        return stackElement[top];
    }

    @Override
    public int size() {
        return top+1;
    }


}
