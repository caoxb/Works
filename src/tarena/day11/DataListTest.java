package tarena.day11;

public class DataListTest {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		// 创建 DataList 实例
		// 加入多个整数值
		// 获得指定位置的值
		// 查看存入的数据量

		DataList list = new DataList();
		list.add(5);
		list.add(2);
		list.add(7);
		list.add(1);
		list.add(4);
		list.add(9);

		System.out.println(list.get(0));
		System.out.println(list.get(5));

		System.out.println(list.size());
		// 索引值遍历访问
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		// 迭代遍历访问
		DieDaiQi d = list.diedaiqi();

		while(d.hasNext()) {
			int n = d.next();
			System.out.println(n);
		}
	}
}
