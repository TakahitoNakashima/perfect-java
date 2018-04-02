
class BookConstructer {
	// finalにしておくとコンストラクタ以降、フィールド値の書き換えがないことを明示可能です
	private final String title;
	private final String author;
	private final int price;
	
	BookConstructer(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BookConstructer book = new BookConstructer("Peopleware", "Demarco", 2310);
		System.out.println(book.title);
	}

}
