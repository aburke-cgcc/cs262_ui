package main.java.classes;

//imports
import javax.swing.JTextField;

/**
 * Extends the JTextField to allow for a default field value
 */
public class MyJTextField extends JTextField{
    //attributes
    private static final long serialVersionUID = 1L;
    private String defaultValue;

    /**
     * unlike JTextField, this requires a text and width always to instantiate the MyJTextField
     * @param text field text value
     * @param width field size
     */
    MyJTextField(String text, int width){
        super(text, width);
        setDefaultValue(text);
    }

    //methods
    /**
     * sets the default field value
     * @param text String for default text field value
     */
    private void setDefaultValue(String text){
        defaultValue = text;
    }

    /**
     * gets the default field value from text field
     * @return defaultValue attribute
     */
    public String getDefaultValue(){
        return defaultValue;
    }
}