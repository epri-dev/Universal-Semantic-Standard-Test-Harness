package com.sixthc.client;

public enum CommandType {
	CREATE("Create"),
	CHANGE("Change"),
	CLOSE("Close"),
	CANCEL("Cancel"),
	DELETE("Delete"),
	CREATED("Created"),
	CHANGED("Changed"),
	CLOSED("Closed"),
	CANCELED("Canceled"),
	DELETED("Deleted");

		private String name;
	CommandType(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
