package com.cts.adb.model;

import com.cts.adb.entity.ContactEntity;

public class ContactModel {
	
	private Long contactId;
	private String firstName;
	private String lastName;
	private String mailId;
	private String mobileNumber;
	private String groupCode;
	private  String groupTitle;
	private String description;
	private int port;
	
	public ContactModel() {
	
	}
	
	public ContactModel(ContactEntity entity, GroupModel group) {
		setContactId(entity.getContactId());
		setFirstName(entity.getFirstName());
		setLastName(entity.getLastName());
		setMailId(entity.getMailId());
		setMobileNumber(entity.getMobileNumber());
		setGroupCode(group.getGroupCode());
		setGroupTitle(group.getGroupTitle());
		setDescription(group.getDescription());
		setPort(group.getPort());
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
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

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getGroupTitle() {
		return groupTitle;
	}

	public void setGroupTitle(String groupTitle) {
		this.groupTitle = groupTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

}
