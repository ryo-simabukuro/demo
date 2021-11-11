package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDivide() {
		//tryの中でエラーが起きたらcatchに行く。エラーが起きなければ①に行く
		//今回第２引数のｙに０を入れるとエラーがでる、というメソッドをCalculator.javaのdivideメソッドの中で定義している。
		//なので39行目のdivide(1,0)をするとエラーがでる。するとcatchに行くのでなにも起きず、テストをしてもエラーが起きない。
		//fail()を入れている理由
		//もしCalculator.javaのdivideメソッド内で”第２引数のｙに０を入れるとエラーがでる”という定義をしていないとエラーが起きずにcatchを飛ばしていき、テストも成功してしまう。
		//fail()を入れて強制的にエラーが出るようにしておけば、定義し忘れていてもfail()でひっかかるので大丈夫
		try{
			Calculator calculator=new Calculator();
			int result = calculator.divide(1,0);
			fail();
		}catch(IllegalArgumentException e){	
			
		}
		//①
	}

}
