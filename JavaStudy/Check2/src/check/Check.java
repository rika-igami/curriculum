package check;

import constants.Constants;

public class Check {
	
	/* 課題①
	【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
	firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
	なお、変数のアクセス修飾子は「private」とする。 */
	
	/* 課題②
	【Check.java】にてfirstNameとlastNameを引数で受け取って、
	連結して表示させるメソッド「printName」を作成しなさい。
	作成した関数のアクセス修飾子は「private」とする。 */
	
	/* 課題③
	【Check.java】にてPetクラスとRobotPetクラスをインスタンス化して、下記の完成イメージを出力させなさい。 */
	
	private String firstName = "伊上";
	private String lastName = "利加";
		
	public static void main(String[] args) {
		
		Check check = new Check();

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		System.out.print("printNameメソッド → ");
		check.printName(check.firstName, check.lastName);
		
		System.out.println("■僕の名前は" + pet.getName() + "です");
		System.out.println("■ご主人様は" + pet.getMasterName() + "です");
		
		System.out.println("◇私はロボット。" + robotPet.getName() + "。");
		System.out.println("◇ご主人さまは" + robotPet.getMasterName() + "。");
	
	}
	
	private void printName(String firstName, String lastName) {
		System.out.println(firstName + lastName);
	}

}

/*  System.out.println("printNameメソッド→" + );
		System.out.println("■僕の名前は" +  + "です");
		System.out.println("■ご主人様は" +  + "です");
		Constants.introduce();*/