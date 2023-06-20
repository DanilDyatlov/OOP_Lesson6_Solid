public class Main{
	// изначальный код
//		public static void main(String[] args){
//			User user = new User("Bob");
//			user.report();
//			user.save();
//		}
	public static void main(String[] args){
		User user = new User("Bob");
		Persister persister = new Persister(user);
		Report report = new Report();
		report.report(user);
		persister.save();
	}

}