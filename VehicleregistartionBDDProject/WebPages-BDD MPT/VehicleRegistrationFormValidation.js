function formValidation(){
	
	var title = document.registration.title;
	var ownername = document.registration.ownername;
	
	var malegender = document.registration.gender[0];
	var femalegender = document.registration.gender[1];
	
	var address = document.registration.address;
	var city = document.registration.city;
	var state = document.registration.state;
	var country = document.registration.country;
	var zip = document.registration.zip;
	
	var fourwheeler = document.registration.vehicletype[0];
	var twowheeler = document.registration.vehicletype[1];
	
	var pType = document.registration.fueltype[0];
	var dType = document.registration.fueltype[1];
	
	var year = document.registration.mfg;
	
	if(titleSelect(title)){
		if(validName(ownername,5,20)){
			if(validGender(malegender,femalegender)){
				if(validAddress(address,5,20)){ 
					if(validCity(city)){
						if(validState(state)){
							if(countrySelect(country)){
								if(validZip(zip)){
									if(validVehicle(fourwheeler,twowheeler)){
										if(validFuel(pType,dType)){
											if(mfgSelect(year)){
												
											}
										}
									}
								}
							} 
						}
					} 
				}
			}
		}
	}
	return false;
} 

function titleSelect(title){
	if(title.value == "Default"){
		alert('Select title from the list');
		title.focus();
		return false;
	}
	else{
		return true;
	}
}

function validName(ownername,min,max){ 
	
	var namelength = ownername.value.length;
	var letters = /^[a-zA-Z]+$/;
	
	if((namelength == 0 || namelength>max || namelength<min) || !letters.test(ownername.value)) {
		alert("Owner Name should not be empty and must contain alphabets with in the range of " + min + " to " + max);
		ownername.focus();
		return false;
	}
	return true;
}

function validGender(malegender,femalegender){
	
	if(malegender.checked==false&&femalegender.checked==false){
		alert('Please Select gender');
		malegender.focus();
		return false;
	}
	else{
		//alert('Your Registration with JobsWorld.com has successfully done plz check your registred email addres to activate your profile');
		return true;
	}
}

function validAddress(address,min,max){ 
	
	var addresslength = address.value.length;
	var letters = /^[0-9a-zA-Z]+$/;
	
	if((addresslength == 0 || addresslength>max || addresslength<min) || !letters.test(address.value)) {
		alert("address should not be empty and must be alphanumeric with in the range of " + min + " to " + max);
		address.focus();
		return false;
	}
	return true;
}

function validCity(city){ 
	var letters = /^[A-Za-z]+$/;
	if(city.value.match(letters)){
		return true;
	}
	else{
		alert('city should not be empty and must have alphabet characters only');
		city.focus();
		return false;
	}
}

function validState(state){ 
	var letters = /^[A-Za-z]+$/;
	if(state.value.match(letters)){
		return true;
	}
	else{
		alert('State should not be empty and must have alphabet characters only');
		state.focus();
		return false;
	}
}

function countrySelect(country){
	if(country.value == "Default"){
		alert('Select the country from the list');
		country.focus();
		return false;
	}
	else{
		return true;
	}
}

function validZip(zip){ 
	var numbers = /^[0-9]{6}$/;
	if(zip.value.match(numbers)){
		return true;
	}
	else{
		alert('ZIP code should not be empty and must have 6 numeric characters only');
		zip.focus();
		return false;
	}
}

function validVehicle(fourwheeler,twowheeler){
	
	if(fourwheeler.checked==false&&twowheeler.checked==false){
		alert('Please Select Vehicle type');
		fourwheeler.focus();
		return false;
	}
	else{
		//alert('Your Registration with JobsWorld.com has successfully done plz check your registred email addres to activate your profile');
		return true;
	}
}

function validFuel(pType,dType){
	
	if(pType.checked==false&&dType.checked==false){
		alert('Please Select fuel type');
		pType.focus();
		return false;
	}
	else{
		//alert('Your Registration with JobsWorld.com has successfully done plz check your registred email addres to activate your profile');
		return true;
	}
}

function mfgSelect(year){
	if(year.value == "Default"){
		alert('Select mfg year from the list');
		year.focus();
		return false;
	}
	else{
		alert('You are Succesfully registered your vehicle');
		return true;
	}
}