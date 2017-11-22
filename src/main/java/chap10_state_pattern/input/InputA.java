package chap10_state_pattern.input;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月9日
 **/
public class InputA implements Input {
    String key;
    private final static InputA instance = new InputA("InputA");

    private InputA(String key) {
        this.key = key;
    }
    
    public static InputA getInstance() {
        return instance;
    }
    
    @Override
    public boolean equals(Input in) {
        if (key.equals(in.getKey())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getKey() {
        return key;
    }

}
