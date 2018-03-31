
public class Book {

	String title;
	String author;
	
	void printTitle() {
		System.out.println(this.title); // this.は省略可能
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Book book = new Book();
		book.title = "Peopleware";
		book.printTitle();
	}

}