
function validation()
{
	var uid = document.getElementById('userID').value
	var pwd = document.getElementById('password').value

	if((uid == 'niit')&&(pwd == 'niit'))
	{
		document.getElementByID('message').innerHTML = "Invalid credentials"
		
	}
	
}