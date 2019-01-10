package tarena.day06;
// 对即时战略游戏中的士兵进行抽象
// 抽象为一个独立代码单元
// 面向对象好处：
//		简化问题
//		便于代码维护
public class Soldier {
	// 属性
	// 成员变量 (Member variable)
	int blood = 100;	// 血量
	int power = 50;	// 攻击力
	int defend = 30;	// 防御力
	// 行为、方法
	// 通过这些方法，可以控制一个对象的行为
	// 或者说对一个对象下达指令，
	// 要求一个对象执行一个动作，或执行运算
	public void go() {
		System.out.println("士兵前进");
	}
	public void standby() {
		System.out.println("士兵待命");
	}
}







