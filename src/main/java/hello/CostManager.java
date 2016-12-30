package hello;

//コスト管理者インタフェース
public interface CostManager {

  // 総開発費用算出メソッド
  int getTotalCost(String position, int person);

}