import java.text.ParseException;
import javax.swing.JFormattedTextField.AbstractFormatter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFormattedTextField.AbstractFormatter;

public class DateLabelFormatter extends AbstractFormatter
{
	private String datePattern = "yyyy-MM-dd";
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
    
	public Object stringToValue(String text) throws ParseException
	{
		// TODO Auto-generated method stub
		return dateFormatter.parseObject(text);
	}

	@Override
	public String valueToString(Object value) throws ParseException {
		 if (value != null) 
		 {
	            Calendar cal = (Calendar) value;
		return  dateFormatter.format(cal.getTime());
	    }
		return "";

}}
