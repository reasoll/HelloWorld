package hero;

public class Hero {

	String name; // ����
	float hp; // Ѫ��
	float hujia; // ����
	int moveSpeed; // �ƶ��ٶ�
	int died;// ��������
	int kill;// ɱ�˴���
	int golden;// ��Ǯ

	//�Ӷ���
	void keng() {
		System.out.println("�Ӷ��ѣ�");

	}

	//����
	void legendary() {
		System.out.println("����");
	}

	//��ȡѪ��
	float getHp() {
		return hp;
	}

	//��Ѫ
	void rec(float blood) {
		hp = hp + blood;
	}

	//��ȡ����
	int getMoveSpeed() {
		return moveSpeed;
	}

	//���ӽ�Ǯ
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
		
		Hero wangpipi = new Hero();
		wangpipi.name = "������";
		wangpipi.hp = 100;
		wangpipi.moveSpeed = 250;
		wangpipi.hujia = 10000;
		wangpipi.died = 9;
		wangpipi.kill =999999;
		wangpipi.golden =1000000;

		System.out.print(garen.name);
		System.out.println("Ѫ��:" + garen.hp);
		garen.rec(100);
		System.out.println("��Ѫ��:" + garen.hp);
		System.out.println("��Ǯ��" + garen.golden);
		System.out.println("����1000");
		garen.addGolden(1000);
		System.out.println("��Ǯ��" + garen.golden);
	  //  System.out.println(garen.kill);
	//    System.out.println("��������");
	    
	    System.out.println("������" + wangpipi.name + "  Ѫ����" + wangpipi.hp + "   ����" + wangpipi.hujia);

	}

}
