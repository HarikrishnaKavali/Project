package net.roseindia.action;

import com.opensymphony.xwork2.ActionSupport;

public class TilesAction extends ActionSupport {

	public String home() {
		return "home";
	}

	public String aboutUs() {
		return "aboutUs";
	}

	public String contactUs() {
		return "contactUs";
	}

	public String registration() {
		return "registration";
	}
}