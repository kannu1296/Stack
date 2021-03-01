package Stack;


import org.springframework.stereotype.Service;

/**
 * Expose Stack operations
 */
@Service
public interface Stack {
    public void push(int element);
    public int pop();
    public int peek();
    public int size();
}
