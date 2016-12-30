package hello

import static java.lang.System.out
import static org.hamcrest.CoreMatchers.is
import static org.junit.Assert.assertThat

import hello.AppConfigAutoScan

import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.junit4.SpringRunner
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired

import spock.lang.Specification
import spock.lang.Unroll

@ContextConfiguration
//@RunWith(SpringRunner.class)
// @RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProjectManagerTest extends Specification {

  def "はじめましてSpock"() {
    expect:
      1 > 0
  }

  @Autowired
  private CostManager costManager

  def testCase02() {

    setup:
      def person = 3
      def position = "PG"
      def expected = 2_400_000

    when:
      def actul = costManager.getTotalCost(position, person)

    then:
      actul == 2_400_000
      // true
  }
}