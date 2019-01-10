package tarena.day17;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayIOTest {
	public static void main(String[] args) throws Exception{
		test1();
	}

	private static void test1() throws Exception {
		ByteArrayOutputStream out =
				new ByteArrayOutputStream();
		// 输出的数据，会保存在其内部一个字节数组中
		out.write(97);
		out.write(new byte[]{98,99,100});
		byte[] arr = out.toByteArray();// 获取其内部数组

		System.out.println(Arrays.toString(arr));
		///////////////////////////////////
		ByteArrayInputStream in =
				new ByteArrayInputStream(arr);
		int b;
		while((b = in.read()) != -1) {
			System.out.println(b);
		}

	}
}









