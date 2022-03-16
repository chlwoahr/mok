package com.pod;

public class BookExample {

	public static void main(String[] args) {
		// 책(책제목, 저자, 출판사, 책가격)
		Book b = new Book();

		b.bn = "혼공자";
		b.j = "신용권";
		b.c = "한빛미디어";
		b.g = 24000;

		Book b1 = new Book();

		b1.bn = "powerJava";
		b1.j = "천인국";
		b1.c = "인피니티";
		b1.g = 35000;

		Book b2 = new Book();

		b2.bn = "재밌는자바";
		b2.j = "이호준";
		b2.c = "인피니티";
		b2.g = 20000;

		Book[] books = { b, b1, b2 };
		for (int i = 0; i < books.length; i++) {
			// 책제목, 저자, 가격 출판사의 이름이 인피니티
			if (books[i].c == "인피니티") {
				System.out.println(books[i].bn + " " + books[i].j + " " + books[i].g);
			}

		}
		for (int i = 0; i < books.length; i++) {
			if (books[i].j == "신용권") {
				System.out.println(books[i].bn);
			}
		}

	}

}


