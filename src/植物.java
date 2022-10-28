interface Plants{
	void show();
}
class 豌豆射手 implements Plants{
	public void show(){
		System.out.print("豌豆射手");
	}
}
class 坚果墙 implements Plants{
	public void show(){
		System.out.print("坚果墙");
	}
}
class 向日葵 implements Plants{
	public void show(){
		System.out.print("向日葵");
	}
}
class PlantsFactory{
	public static Plants create(String s){
		if("豌豆射手".equalsIgnoreCase(s)){
			return new 豌豆射手();
		}
		else if("坚果墙".equalsIgnoreCase(s)){
			return new 坚果墙();
		}
		else{
			return new 向日葵();
		}
	}
}
public class 植物 {
	public static void main(String[] args){
		Plants p1=PlantsFactory.create("坚果墙");
		p1.show();
	}
}
