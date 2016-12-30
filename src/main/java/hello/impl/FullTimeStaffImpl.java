package hello.impl;

import org.springframework.stereotype.Component;

import hello.Staff;

//正社員クラス(作業員インタフェースを実装)
@Component
public class FullTimeStaffImpl implements Staff {

  // 開発費用算出メソッド(インタフェースのメソッドをオーバライド)
  @Override
  public int getCost(String position) {

    int cost = 1_000_000;

    if (position.equals("設計")) {
      cost *= 1.5;
    } else if (position.equals("PG")) {
      cost *= 1.3;
    } else {
      throw new IllegalArgumentException("引数指定エラー");
    }

    return cost;
  }
}