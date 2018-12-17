package hero;

public class Hero {

	String name; // 姓名
	float hp; // 血量
	float hujia; // 护甲
	int moveSpeed; // 移动速度
	int died;// 死亡次数
	int kill;// 杀人次数
	int golden;// 金钱

	void keng() {
		System.out.println("肯队友！");

	}

	void legendary() {
		System.out.println("超神");
	}

	float getHp() {
		return hp;
	}

	void rec(float blood) {
		hp = hp + blood;
	}

	int getMoveSpeed() {
		return moveSpeed;
	}

	void addGolden(int coin) {
		golden = golden + coin;
	}

	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.hp = 616f;
		garen.moveSpeed = 350;
		garen.hujia = 100;
		garen.died = 100;
		garen.kill = 4;
		garen.golden = 500;

		System.out.print(garen.name);
		System.out.println("血量:" + garen.hp);
		garen.rec(100);
		System.out.println("加血后:" + garen.hp);
		System.out.println("金钱：" + garen.golden);
		System.out.println("增加1000");
		garen.addGolden(1000);
		System.out.println("加钱后：" + garen.golden);
//	    System.out.println(garen.kill);

	}

}
