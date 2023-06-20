public class Persister{
	// Изначальный код
	//	 	private User user;
	//
	//		public Persister(User user){
	//			this.user = user;
	//		}
	//
	//		public void save(){
	//			System.out.println("Save user: " + user.getName());
	//		}
	//	}
	private User user;

	public Persister(User user){
		this.user = user;
	}
	public void save(){
		System.out.println("Save user: " + user.getName());
	}
}