package com.servlet.project;

import java.util.*;

public class Connection {

	public static void main(String[] args) {
		
		try {
			Connection con = (Connection) CrudDbCnnection.getConnnection();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}
	}

