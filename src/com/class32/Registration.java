package com.class32;


	public class Registration {
		private String email;
		private String userName;
		private String password;
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			if(email.contains("gmail")) {
			this.email = email;
			}
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			if(password.length()>6 && !password.isEmpty()&& !password.contains(userName)) {
			this.password = password;
			}
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
	}

	