package week3.day2;

public class Elements extends Button
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//obj for main class
		Button ob1 = new Button();
	    ob1.click();
	    ob1.Submit();
	    
	    //obj for Textfield
	    TextField ob2 = new TextField();
	    ob2.SetText("TestLeaf");
	    ob2.getText();
	    
	    //obj for chkboxbutton
	    CheckBoxButton ob3 = new CheckBoxButton();
		ob3.click();
		ob3.clickCheckButton();
		ob3.Submit();
		
		// Object for RadioButton
		RadioButton ob4 = new RadioButton();
		ob4.click();
		ob4.selectRadioButton();
		

	}

}
