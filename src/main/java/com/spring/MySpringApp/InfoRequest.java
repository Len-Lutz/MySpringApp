package com.spring.MySpringApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InfoRequest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	public String firstName;
	public String lastName;
	public String address1;
	public String address2;
	public String city;
	public String state;
	public String zip;
	public String phone;
	public String eMail;
	public String prefContactMethod;
	public String callTime;
	public String timeZone;
	public boolean okMon;
	public boolean okTue;
	public boolean okWed;
	public boolean okThu;
	public boolean okFri;
	public boolean okSat;
	public boolean okSun;
	public String infoRequested;
	public String dateRequested;
	
	public InfoRequest() {
		// @Entity needs a non-argument constructor
	}

	public InfoRequest(String firstName, String lastName, String address1, String address2, String city, String state,
			String zip, String phone, String eMail, String prefContactMethod, String callTime, String timeZone,
			boolean okMon, boolean okTue, boolean okWed, boolean okThu, boolean okFri, boolean okSat, boolean okSun,
			String infoRequested, String dateRequested) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.eMail = eMail;
		this.prefContactMethod = prefContactMethod;
		this.callTime = callTime;
		this.timeZone = timeZone;
		this.okMon = okMon;
		this.okTue = okTue;
		this.okWed = okWed;
		this.okThu = okThu;
		this.okFri = okFri;
		this.okSat = okSat;
		this.okSun = okSun;
		this.infoRequested = infoRequested;
		this.dateRequested = dateRequested;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPrefContactMethod() {
		return prefContactMethod;
	}

	public void setPrefContactMethod(String prefContactMethod) {
		this.prefContactMethod = prefContactMethod;
	}

	public String getCallTime() {
		return callTime;
	}

	public void setCallTime(String callTime) {
		this.callTime = callTime;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public boolean isOkMon() {
		return okMon;
	}

	public void setOkMon(boolean okMon) {
		this.okMon = okMon;
	}

	public boolean isOkTue() {
		return okTue;
	}

	public void setOkTue(boolean okTue) {
		this.okTue = okTue;
	}

	public boolean isOkWed() {
		return okWed;
	}

	public void setOkWed(boolean okWed) {
		this.okWed = okWed;
	}

	public boolean isOkThu() {
		return okThu;
	}

	public void setOkThu(boolean okThu) {
		this.okThu = okThu;
	}

	public boolean isOkFri() {
		return okFri;
	}

	public void setOkFri(boolean okFri) {
		this.okFri = okFri;
	}

	public boolean isOkSat() {
		return okSat;
	}

	public void setOkSat(boolean okSat) {
		this.okSat = okSat;
	}

	public boolean isOkSun() {
		return okSun;
	}

	public void setOkSun(boolean okSun) {
		this.okSun = okSun;
	}

	public String getInfoRequested() {
		return infoRequested;
	}

	public void setInfoRequested(String infoRequested) {
		this.infoRequested = infoRequested;
	}

	public String getDateRequested() {
		return dateRequested;
	}

	public void setDateRequested(String dateRequested) {
		this.dateRequested = dateRequested;
	}

	@Override
	public String toString() {
		return "InfoRequest [" + 
				"id=" + id + 
				"\n\tfirstName=" + firstName + ", lastName=" + lastName + 
				"\n\taddress1=" + address1 + 
				"\n\taddress2=" + address2 + 
				"\n\tcity=" + city + ", state=" + state + ", zip=" + zip + 
				"\n\tphone=" + phone + 
				"\n\teMail=" + eMail + 
				"\n\tprefContactMethod=" + prefContactMethod + 
				"\n\tcallTime=" + callTime + 
				"\n\ttimeZone=" + timeZone + 
				"\n\tokMon=" + okMon + ", okTue=" + okTue + ", okWed=" + okWed +
				"\n\tokThu=" + okThu + ", okFri=" + okFri + 
				"\n\tokSat=" + okSat + ", okSun=" + okSun + 
				"\n\tinfoRequested=" + infoRequested + 
				"\n\tdateRequested=" + dateRequested + "\n]";
	}
	
}
