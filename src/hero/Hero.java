package hero;

public class Hero {

	String name; // ����
	float hp; // Ѫ��
	float hujia; // ����
	int moveSpeed; // �ƶ��ٶ�
	int died;// ��������
	int kill;// ɱ�˴���
	int golden;// ��Ǯ

	void keng() {
		System.out.println("�϶��ѣ�");

	}

	void legendary() {
		System.out.println("����");
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
		garen.name = "����";
		garen.hp = 616f;
		garen.moveSpeed = 350;
		garen.hujia = 100;
		garen.died = 100;
		garen.kill = 4;
		garen.golden = 500;

		System.out.print(garen.name);
		System.out.println("Ѫ��:" + garen.hp);
		garen.rec(100);
		System.out.println("��Ѫ��:" + garen.hp);
		System.out.println("��Ǯ��" + garen.golden);
		System.out.println("����1000");
		garen.addGolden(1000);
		System.out.println("��Ǯ��" + garen.golden);
//	    System.out.println(garen.kill);

	}

}
