package com.sgtesting.Assignments_on_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Advance_Senario_01 {
	public Advance_Senario_01(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	private WebElement username;
	WebElement getUserName()
	{
		return username;
	}
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement LoginButton;
	public WebElement getLoginButton()
	{
		return  LoginButton;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	private WebElement Createuser;
	public WebElement getCreateuser()
	{
		return Createuser;
	}
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div")
	private WebElement Adduser;
	public WebElement  Adduser()
	{
		return  Adduser;
	}
	private WebElement firstName;
	public WebElement getFirstname()
	{
		return firstName;
	}
	private WebElement lastName;
	public WebElement getLastname()
	{
		return lastName;
	}
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_usernameField\"]")
	private WebElement userDataLightBox_usernameField1;
	public WebElement getusername()
	{
		return userDataLightBox_usernameField1;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")
	private WebElement userDataLightBox_passwordField1;
	public WebElement getpassword()
	{
		return userDataLightBox_passwordField1;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_passwordCopyField\"]")
	private WebElement userDataLightBox_passwordCopyField1;
	public WebElement getRepassword()
	{
		return userDataLightBox_passwordCopyField1;
	}
	@FindBy(xpath="//*//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement UserCreated;
	public WebElement getUserCreated()
	{
		return UserCreated;
	}
	

   //CREATE USER2.//////////////////////////////////////////////////////////////////////
@FindBy(xpath="//*[@id=\"createUserDiv\"]/div")
private WebElement Adduser2;
public WebElement  Adduser2()
{
	return  Adduser2;
}
private WebElement userDataLightBox_firstNameField;
public WebElement getFirstname2()
{
	return userDataLightBox_firstNameField;
}
private WebElement userDataLightBox_lastNameField;
public WebElement getLastname2()
{
	return userDataLightBox_lastNameField ;
}
private WebElement userDataLightBox_emailField;
public WebElement getemail2()
{
	return userDataLightBox_emailField;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_usernameField\"]")
private WebElement userDataLightBox_usernameField;
public WebElement getusername2()
{
	return userDataLightBox_usernameField1;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")
private WebElement userDataLightBox_passwordField;
public WebElement getpassword2()
{
	return userDataLightBox_passwordField1;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")
private WebElement userDataLightBox_passwordCopyField;
public WebElement getRepassword2()
{
	return userDataLightBox_passwordCopyField1;
}
@FindBy(xpath="//*//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
private WebElement UserCreated2;
public WebElement getUserCreated2()
{
	return UserCreated;
}
  /////////CREATE USER3//////////////////////////////////////////////////
@FindBy(xpath="//*[@id=\"createUserDiv\"]/div")
private WebElement Adduser3;
public WebElement  Adduser3()
{
	return  Adduser2;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_firstNameField\"]")
private WebElement firstName3;
public WebElement getFirstname3()
{
	return firstName3;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_lastNameField\"]")
private WebElement lastName3;
public WebElement getLastname3()
{
	return lastName3;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_emailField\"]")
private WebElement email3;
public WebElement getemail3()
{
	return email3;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_usernameField\"]")
private WebElement userDataLightBox_usernameField11;
public WebElement getusername3()
{
	return userDataLightBox_usernameField;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")
private WebElement passwordField;
public WebElement getpassword3()
{
	return passwordField;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_passwordCopyField\"]")
private WebElement passwordCopyField;
public WebElement getRepassword3()
{
	return passwordCopyField;
}
@FindBy(xpath="//*//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
private WebElement UserCreated3;
public WebElement getUserCreated3()
{
	return UserCreated;
}
@FindBy(linkText="Logout")
private WebElement Logout_01;
public WebElement LogoutButton()
{
	return Logout_01;
}
///////////////////////////////////////////////////////////////
/////LOGIN AS USER1

@FindBy(xpath="//*[@id=\"username\"]")
private WebElement username11;
WebElement getUserName11()
{
	return username11;
}
@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
private WebElement pwd11;
public WebElement getPassword11()
{
	return pwd11;
}
@FindBy(xpath="//div[text()='Login ']")
private WebElement LoginButton11;
public WebElement getLoginButton11()
{
	return  LoginButton11;
}
@FindBy(xpath="//*[@id=\"gettingStartedShortcutsPanelId\"]")
private WebElement gettintFlyOutWindow;
public WebElement getFlyOutWindow11()
{
	return gettintFlyOutWindow;
}
@FindBy(xpath="//span[text()='Start exploring actiTIME']")
private WebElement exp;
public WebElement getexp()
{
	return exp;
}
@FindBy(linkText="Logout")
private WebElement Logout_02;
public WebElement LogoutButton_02()
{
	return Logout_02;
}

//////////LOGIN AS USER2////////////////////////////////////

@FindBy(xpath="//*[@id=\"username\"]")
private WebElement username12;
WebElement getUserName12()
{
	return username12;
}
@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
private WebElement pwd12;
public WebElement getPassword12()
{
	return pwd11;
}
@FindBy(xpath="//div[text()='Login ']")
private WebElement LoginButton12;
public WebElement getLoginButton12()
{
	return  LoginButton11;
}
@FindBy(xpath="//*[@id=\"gettingStartedShortcutsPanelId\"]")
private WebElement gettintFlyOutWindow2;
public WebElement getFlyOutWindow12()
{
	return gettintFlyOutWindow2;
}
@FindBy(xpath="//span[text()='Start exploring actiTIME']")
private WebElement exp2;
public WebElement getexp2()
{
	return exp2;
}
@FindBy(linkText="Logout")
private WebElement Logout_03;
public WebElement LogoutButton_03()
{
	return Logout_03;
}
///////////////////LOGIN AS USER3///////////////////////////////////////
@FindBy(xpath="//*[@id=\"username\"]")
private WebElement username13;
WebElement getUserName13()
{
	return username12;
}
@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
private WebElement pwd1;
public WebElement getPassword13()
{
	return pwd11;
}
@FindBy(xpath="//div[text()='Login ']")
private WebElement LoginButton13;
public WebElement getLoginButton13()
{
	return  LoginButton11;
}
@FindBy(xpath="//*[@id=\"gettingStartedShortcutsPanelId\"]")
private WebElement gettintFlyOutWindow3;
public WebElement getFlyOutWindow13()
{
	return gettintFlyOutWindow3;
}
@FindBy(xpath="//span[text()='Start exploring actiTIME']")
private WebElement exp3;
public WebElement getexp3()
{
	return exp3;
}
@FindBy(linkText="Logout")
private WebElement Logout_04;
public WebElement LogoutButton_04()
{
	return Logout_04;
}
@FindBy(xpath="//*[@id=\"username\"]")
private  WebElement userad;
public WebElement getuserad()
{
	return userad;
}
//Create WebElement for password
@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
private WebElement pwd22;
public WebElement getPasswo()
{
	return pwd22;
}
//create WebElement for Login button
@FindBy(xpath="//*[@id=\"loginButton\"]/div")
private WebElement Login;
public WebElement getLogin()
{
	return Login;
}


/////////////////MODIFYPASSWORD//////////////////////
@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")
private WebElement user1;
public WebElement getuser1()
{
	return user1;
}
@FindBy(xpath="//span[text()='KOLKAR, ARIF']")
private  WebElement userco1;
public WebElement getuserco()
{
	return userco1;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
private WebElement pas1;
public WebElement getUSER1password()
{
	return pas1;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
private WebElement pas2;
public WebElement getpassword4()
{
	return pas2;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
private WebElement pasc1;
public WebElement passwordCopy3()
{
	return pasc1;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
private WebElement Savecopy3;
public WebElement getSavecopy3()
{
	return Savecopy3;
}
//////////modify for user2//////////////////////////////////////////////////

@FindBy(xpath="//span[text()='PRASAD, HARI']")
private  WebElement userco2;
public WebElement getuserco1()
{
return userco2;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
private WebElement pas4;
public WebElement getpassword6()
{
return pas4;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
private WebElement pas3;
public WebElement getpassword5()
{
return pas3;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
private WebElement pasc2;
public WebElement passwordCopy4()
{
return pasc2;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
private WebElement Savecopy4;
public WebElement getSavecopy4()
{
return Savecopy4;
}
////////////MODIFY USER3/////////////////////
@FindBy(xpath="//span[text()='KUMAR, VIJAY']")
private  WebElement userc2;
public WebElement getuserco2()
{
return userc2;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
private WebElement pasw1;
public WebElement getpasswor3()
{
return pasw1;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
private WebElement pasw2;
public WebElement getpasswor4()
{
return pasw2;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
private WebElement pasco1;
public WebElement passwordCop3()
{
return pasco1;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
private WebElement Savecop3;
public WebElement getSavecop3()
{
return Savecop3;
}
@FindBy(linkText="Logout")
private WebElement Logout;
public WebElement LogoutButton_05()
{
	return Logout;
}
/////////////////////////LOGIN AX USER1//////////
@FindBy(xpath="//*[@id=\"username\"]")
private WebElement username111;
WebElement getUserName111()
{
	return username111;
}
@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
private WebElement pwd111;
public WebElement getPassword111()
{
	return pwd111;
}
@FindBy(xpath="//div[text()='Login ']")
private WebElement LoginButton111;
public WebElement getLoginButton111()
{
	return  LoginButton111;
}@FindBy(xpath="//span[text()='Start exploring actiTIME']")
private WebElement exp111;
public WebElement getexp111()
{
	return exp111;
}


@FindBy(linkText="Logout")
private WebElement Logout_06;
public WebElement LogoutButton_06()
{
	return Logout_02;
}
///////////LOGINAS USER2//////////////////////////////
@FindBy(xpath="//*[@id=\"username\"]")
private WebElement username222;
WebElement getUserName222()
{
	return username222;
}
@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
private WebElement pwd222;
public WebElement getPassword222()
{
	return pwd222;
}
@FindBy(xpath="//div[text()='Login ']")
private WebElement LoginButton222;
public WebElement getLoginButton222()
{
	return  LoginButton222;
}
@FindBy(xpath="//span[text()='Start exploring actiTIME']")
private WebElement exp222;
public WebElement getexp222()
{
	return exp222;
}


@FindBy(linkText="Logout")
private WebElement Logout_07;
public WebElement LogoutButton_07()
{
	return Logout_07;
}
////////////login as user3//////////////////
@FindBy(xpath="//*[@id=\"username\"]")
private WebElement username333;
WebElement getUserName333()
{
	return username333;
}
@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
private WebElement pwd333;
public WebElement getPassword333()
{
	return pwd333;
}
@FindBy(xpath="//div[text()='Login ']")
private WebElement LoginButton333;
public WebElement getLoginButton333()
{
	return  LoginButton333;
}
@FindBy(xpath="//span[text()='Start exploring actiTIME']")
private WebElement exp333;
public WebElement getexp333()
{
	return exp333;
}


@FindBy(linkText="Logout")
private WebElement Logout_08;
public WebElement LogoutButton_08()
{
	return Logout_08;
}
@FindBy(xpath="//*[@id=\"username\"]")
private  WebElement userad11;
public WebElement getuserad11()
{
	return userad11;
}
//Create WebElement for password
@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
private WebElement pwd44;
public WebElement getPasswo44()
{
	return pwd44;
}
//create WebElement for Login button
@FindBy(xpath="//*[@id=\"loginButton\"]/div")
private WebElement Login11;
public WebElement getLogin11()
{
	return Login11;
}
@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")
private WebElement user2;
public WebElement getuser2()
{
	return user2;
}


//create webelement for delete
@FindBy(xpath="//span[text()='user1, demo1']")
private  WebElement userco3;
public WebElement getuserco3()
{
	return userco3;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
private WebElement userDataLightBox_deleteBtn;
public WebElement getdelete()
{
	return userDataLightBox_deleteBtn;
}

@FindBy(xpath="//span[text()='user2, demo2']")
private  WebElement userco4;
public WebElement getuserco4()
{
	return userco4;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
private WebElement delete1;
public WebElement getdelete1()
{
	return delete1;
}

@FindBy(xpath="//span[text()='user3, demo3']")
private  WebElement userco5;
public WebElement getuserco5()
{
	return userco5;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
private WebElement delete2;
public WebElement getdelete2()
{
	return delete2;
}

//create WebElement for Logoutlink()
@FindBy(linkText="Logout")
private WebElement o1Logout;
public WebElement getLogoutButton_09()
{
	return o1Logout;
}
 //create WebElement for Close()	
private WebElement close;
public WebElement Close()
{
	return close;
}


}




