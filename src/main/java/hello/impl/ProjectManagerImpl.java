package hello.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hello.CostManager;
import hello.Staff;

//プロジェクト管理者クラス(コスト管理者インタフェースを実装)
@Component
public class ProjectManagerImpl implements CostManager {

  private Staff staff;
  
  // @Autowired
  public ProjectManagerImpl(Staff staff) {
    this.staff = staff;
  }

  // 総開発費用算出メソッド(インタフェースのメソッドをオーバライド)
  @Override
  public int getTotalCost(String position, int person) {

    // 費用計算
    int cost = staff.getCost(position) * person;

    return cost;
  }
}