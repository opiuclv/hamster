# hamster

JAVA oop

## 1.	開發項目（主題）
打地鼠小遊戲
## 2.	功能演示 （操作介面，選單與功能）
利用java awt 與swing的公能開起視窗並用滑鼠點擊遊玩
使用倒數計時限制時間並且計算得分．
## 3.	目的（寫這個程式帶來的效果）
放鬆壓力的小品遊戲．
## 4.	開發前的準備工作
熟讀java並了解所需功能API，構思介面與遊玩體驗．
## 5.	整體的架構（設計）

![](https://i.imgur.com/lmC4ofw.png)

 
利用java的視窗執行遊戲
利用滑鼠的事件來控制遊玩
利用時間與積分來限制規則

![](https://i.imgur.com/3cysl61.png)

 
## 6.	各個part的開發與實現
首先import所需函式與Implements所需的元件
定義所需的參數

hamster首先定義地鼠的位置，再用getContentPane取得平面
並設定初始UI介面與滑鼠觸發事件

paint先定義g並劃出元件Oval使用if else 判斷mode並執行條件（填滿Oval）使用Ramdom去隨機判斷
## 7.	優化與改進 
原先位置與數量都不盡理想，後來經過微調後增加地鼠的數量，並且將位置    也調整得當
