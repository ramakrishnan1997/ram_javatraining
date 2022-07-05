package com.bank.server.request;

import java.util.HashMap;

public class validation {
	public static int valid(String card, String pin) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("cardnumber", "1234567834343423");
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("pin", "3412");

		int flag = 0;
		try {
			if (!map.get("cardnumber").contains(card)) {
				throw new UserExceptionClass();
			} else if (!map1.get("pin").contains(pin)) {

				throw new UserExceptionClass();
			} else {
				flag = 1;
			}
		} catch (UserExceptionClass e) {
			System.out.println(e.cardException());
			System.out.println(e.pinException());
		}
		return flag;
	}
}
