package day04;

import java.awt.Choice;
import java.util.Scanner;

/**
 * 函数调用
 * 
 * @author ChangMQ267
 * @date 2018/03/13
 */
public class ClassOne {
	public ClassOne() {

	}

	/*
	 * A:求两个数据之和 B:判断两个数据是否相等 C:获取两个数中较大的值 D:打印m行n列的星形矩形 E:打印nn乘法表
	 * 
	 */
	/**
	 * 求两个数据之和
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int a(int a, int b) {
		return a + b;
	}

	/**
	 * 判断两个数据是否相等
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean b(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 获取两个数中较大的值
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int c(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	/**
	 * 打印m行n列的星形矩形
	 * 
	 * @param a
	 * @param b
	 */
	public static void d(int a, int b) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * 打印nn乘法表
	 * 
	 * @param n
	 */
	public static void e(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 字符控制界面
	 * 选择相应函数运算
	 */
	public static void choise(){
		Scanner in = new Scanner(System.in);
		System.out.println("函数列表：\n" + "A:求两个数据之和\n" + "B:判断两个数据是否相等\n" + "C:获取两个数中较大的值\n" + "D:打印m行n列的星形矩形\n"
				+ "E:打印nn乘法表\n" + "请输入你需要调用的函数:");
		String str = in.nextLine();
		//函数选择
		switch (str.charAt(0)) {
		//排除大小写区别
		case 'A':
		case 'a':
			System.out.println("----------------A:求两个数据之和：---------------\n" + "请输入两个数据：");
			int a = in.nextInt();
			int b = in.nextInt();
			int num = a(a, b);
			System.out.println(a + "+" + b + "=" + num);
			break;
		case 'b':
		case 'B':
			System.out.println("-------------B:判断两个数据是否相等：--------------\n" + "请输入两个数据：");
			a = in.nextInt();
			b = in.nextInt();
			if(b(a,b)) {
				System.out.println("相等");
			}else {
				System.out.println("不相等");
			}
			break;
		case 'c':
		case 'C':
			System.out.println("-------------C:获取两个数中较大的值:----------\n" + "请输入两个数据：");
			a = in.nextInt();
			b = in.nextInt();
			System.out.println(c(a,b) + "大");
			break;
		case 'd':
		case 'D':
			System.out.println("-------------D:打印m行n列的星形矩形------------\n" + "请输入m、n的值");
			a = in.nextInt();
			b = in.nextInt();
			d(a,b);
			break;
		case 'e':
		case 'E':
			System.out.println("----------------E:打印nn乘法表-------------\n" + "请输入n的值");
			a = in.nextInt();
			e(a);
			break;
		default:
			//错误选项重新选择
			System.out.println("-------------警告！！！请选择正确的函数！！！！--------------\n");
			choise();
			break;
		}
	}


	public static void main(String arg[]) {
		choise();
	}
}
