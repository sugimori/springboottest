package hello;

import static java.lang.System.out;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import hello.AppConfigAutoScan;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


//プロジェクト管理者クラスのテストクラス
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfigAutoScan.class)
// @SpringBootTest
public class ProjectManagerJavaTest {

  @Autowired
  private CostManager costManager;

  // 単体テスト実行メソッド
  @Test
  public void testCase01() {


    // テストデータ
    int person = 2;
    String position = "PG";

    // 期待結果
    int expected = 2_400_000;


    // 総費用算出
    int actul = costManager.getTotalCost(position, person);

    System.out.printf("%,3d円\n", actul);

    // テスト検証（期待値と実地値の比較）
    assertThat(actul, is(expected));
  }
}