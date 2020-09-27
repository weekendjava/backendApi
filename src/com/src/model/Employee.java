package com.src.model;
// Builder Pattern ---> large objects, with optional fields
public class Employee {
	
	private int id;
	private String login;
	private String name;
	private String type;
	private boolean siteAdmin;
	private String profilePicUrl;// opt
	private String company;// optional
	private String blog;// optional
	private String location;// opt
	private String email;// opt
	private String hireable;// opt
	private String bio;// opt
	private int folowing;
	private int followers;
	private int publicRepo;
	private int publicGist;
	
	private Employee() {}

	// static inner class --> s1
	public static class EmployeeBuilder{
		private int id;
		private String login;
		private String name;
		private String type;
		private boolean siteAdmin;
		private String profilePicUrl;// opt
		private String company;// optional
		private String blog;// optional
		private String location;// opt
		private String email;// opt
		private String hireable;// opt
		private String bio;// opt
		private int folowing;
		private int followers;
		private int publicRepo;
		private int publicGist;
		
		public EmployeeBuilder(int id, String login, String name, String type, boolean siteAdmin, int folowing,
				int followers, int publicRepo, int publicGist) {
			super();
			this.id = id;
			this.login = login;
			this.name = name;
			this.type = type;
			this.siteAdmin = siteAdmin;
			this.folowing = folowing;
			this.followers = followers;
			this.publicRepo = publicRepo;
			this.publicGist = publicGist;
		}
		
		public EmployeeBuilder withProfilePic(String profilePicUrl) {
			this.profilePicUrl = profilePicUrl;
			return this;
		}
		public EmployeeBuilder withCompany(String company) {
			this.company = company;
			return this;
		}
		public EmployeeBuilder withBlog(String blog) {
			this.blog = blog;
			return this;
		}
		public EmployeeBuilder withEmail(String email) {
			this.email = email;
			return this;
		}
		public EmployeeBuilder withBio(String bio) {
			this.bio = bio;
			return this;
		}
		
		
		public Employee build() {
			Employee e = new Employee();
			e.id = id;
			e.login = login;
			e.name = name;
			e.type = type;
			e.profilePicUrl = profilePicUrl;
			e.siteAdmin = siteAdmin;
			e.company = company;
			e.blog = blog;
			e.location = location;
			e.email = email;
			e.hireable = hireable;
			e.bio = bio;
			e.folowing = folowing;
			e.followers = followers;
			e.publicRepo = publicRepo;
			e.publicGist = publicGist;
			return e;
		}
		
	}
	
	
//	public Employee(int id, String login, String name, String type, boolean siteAdmin, String company, String blog,
//			String location, String email, String hireable, String bio, int folowing, int followers, int publicRepo,
//			int publicGist) {
//		super();
//		this.id = id;
//		this.login = login;
//		this.name = name;
//		this.type = type;
//		this.siteAdmin = siteAdmin;
//		this.company = company;
//		this.blog = blog;
//		this.location = location;
//		this.email = email;
//		this.hireable = hireable;
//		this.bio = bio;
//		this.folowing = folowing;
//		this.followers = followers;
//		this.publicRepo = publicRepo;
//		this.publicGist = publicGist;
//	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public boolean isSiteAdmin() {
		return siteAdmin;
	}


	public void setSiteAdmin(boolean siteAdmin) {
		this.siteAdmin = siteAdmin;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getBlog() {
		return blog;
	}


	public void setBlog(String blog) {
		this.blog = blog;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getHireable() {
		return hireable;
	}


	public void setHireable(String hireable) {
		this.hireable = hireable;
	}


	public String getBio() {
		return bio;
	}


	public void setBio(String bio) {
		this.bio = bio;
	}


	public int getFolowing() {
		return folowing;
	}


	public void setFolowing(int folowing) {
		this.folowing = folowing;
	}


	public int getFollowers() {
		return followers;
	}


	public void setFollowers(int followers) {
		this.followers = followers;
	}


	public int getPublicRepo() {
		return publicRepo;
	}


	public void setPublicRepo(int publicRepo) {
		this.publicRepo = publicRepo;
	}


	public int getPublicGist() {
		return publicGist;
	}


	public void setPublicGist(int publicGist) {
		this.publicGist = publicGist;
	}


	public String getProfilePicUrl() {
		return profilePicUrl;
	}


	public void setProfilePicUrl(String profilePicUrl) {
		this.profilePicUrl = profilePicUrl;
	}


	
	
	
	
	

}
