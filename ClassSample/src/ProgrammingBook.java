
class ProgrammingBook extends BookConstructer {
	private final String language;
	ProgrammingBook(String title, String author, int price, String language) {
		super(title, author, price); // BookConstructerクラスのコンストラクタ呼び出し
		this.language = language;
	}
}
