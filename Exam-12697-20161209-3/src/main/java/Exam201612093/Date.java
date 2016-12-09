package Exam201612093;

import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入日期：");
		String date = in.next();
		String[] dates = date.split("-");
		try {
			//拆分数据
			int year = Integer.parseInt(dates[0]);
			int month = Integer.parseInt(dates[1]);
			int day = Integer.parseInt(dates[2]);
			//判断日期数据是否正确
			if(year <=0 || month <=0 || month>13 || day <=0 || day>32){
				System.out.println("输入日期有误");
				return;
			}
			boolean isLeap = isLeap(year);
			int num = 0;
			switch (month) {
			case 12:
				num += 30;
			case 11:
				num += 31;
			case 10:
				num += 30;
			case 9:
				num += 31;
			case 8:
				num += 31;
			case 7:
				num += 30;
			case 6:
				num += 31;
			case 5:
				num += 30;
			case 4:
				num += 31;
			case 3:
				num += 28;
			case 2:
				num += 31;
			}
			if (month < 2)
				isLeap = false;
			if (isLeap)
				num++;
			System.out.println("你输入的日期为当年的第" + (num + day) + "天");

		} catch (NumberFormatException e) {
			
			System.out.println("输入的格式有误");
		}

	}
	
	//判断闰年
	public static boolean isLeap(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return true;
		return false;
	}

}