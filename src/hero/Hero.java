package hero;

public class Hero {

	String name; // 姓名
	float hp; // 血量
	float hujia; // 护甲
	int moveSpeed; // 移动速度
	int died;// 死亡次数
	int kill;// 杀人次数
	int golden;// 金钱

	//坑队友
	void keng() {
		System.out.println("坑队友！");

	}

	//超神
	void legendary() {
		System.out.println("超神");
	}

	//获取血量
	float getHp() {
		return hp;
	}

	//回血
	void rec(float blood) {
		hp = hp + blood;
	}

	//获取移速
	int getMoveSpeed() {
		return moveSpeed;
	}

	//增加金钱
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
		
		Hero wangpipi = new Hero();
		wangpipi.name = "汪冰桢";
		wangpipi.hp = 100;
		wangpipi.moveSpeed = 250;
		wangpipi.hujia = 10000;
		wangpipi.died = 9;
		wangpipi.kill =999999;
		wangpipi.golden =1000000;

		System.out.print(garen.name);
		System.out.println("血量:" + garen.hp);
		garen.rec(100);
		System.out.println("加血后:" + garen.hp);
		System.out.println("金钱：" + garen.golden);
		System.out.println("增加1000");
		garen.addGolden(1000);
		System.out.println("加钱后：" + garen.golden);
	  //  System.out.println(garen.kill);
	//    System.out.println("改下试试");
	    
	    System.out.println("姓名：" + wangpipi.name + "  血量：" + wangpipi.hp + "   护甲" + wangpipi.hujia);

	}

}
