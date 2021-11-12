package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {
	ItemStock test1;//ItemStockTestメソッドの中にItemStock test1を定義すれば、
					//ItemStockTestメソッドに含まれているそれぞれのtestメソッドにtest1変数を呼び出すことができる
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach//テストの前に毎回実行される
	void setUp() throws Exception {
		ItemStock  itemStock = new ItemStock();
		Item item = new Item("梨", 100);
		itemStock.add(item);
		test1 = itemStock; //test1という変数を用意して、それに１回addしたitemStockを入れる。（次は１２行目を参照）
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test//初期状態で、getNumで０が取得できる
	void testGetNum() {
		ItemStock  itemStock = new ItemStock();
		Item item = new Item("梨", 100);
		int result= itemStock.getNum(item);
		assertEquals(0, result, "error");
	}
	@Test//初期状態で、addでItemを追加するとgetNumで１が取得できる
	void testAdd() {
		ItemStock itemStock = new ItemStock();//itemStockという箱を用意
		Item item = new Item("梨", 100);//値段が１００で、名前が梨　というitem変数を用意
		 itemStock.add(item);//itemStockにitemを追加
		int result =itemStock.getNum(item);//itemStockにitemが何個入っているか聞いて、resultに格納している
		assertEquals(1, result, "error");
	}
	@Test//Itemが１つ追加されている状態で、getNumで１が取得できる
	void testGetNum2() {
		Item item = new Item("梨", 100);
		int result= test1.getNum(item);	//test1にitemが何個入っているか聞いて、resultに格納している
		assertEquals(1, result, "error");
	}
	@Test//Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで２が取得できる
	void testGetNum3() {
		Item item = new Item("梨", 100);
		 test1.add(item);
		int result= test1.getNum(item);
		assertEquals(2, result, "error");
	}
	@Test//Itemが１つ追加されている状態で、addで異なるItemオブジェクトを追加するとgetNumで１が取得できる
	void testGetNum4() {
		Item item = new Item("梨", 100);
		Item item2 = new Item("りんご",150);
		test1.add(item2);
		int result = test1.getNum(item2);
		assertEquals(1, result, "error");	
	}
}
