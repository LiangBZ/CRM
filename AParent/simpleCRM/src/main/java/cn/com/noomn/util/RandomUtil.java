package cn.com.noomn.util;

import java.util.Random;

public class RandomUtil {
	
	public static int getRandomNumber(final int minNum, final int maxNum) {
		if(minNum > maxNum) throw new RuntimeException("minNum > maxNum");
		Random rand = new Random();
		int num = rand.nextInt(maxNum);
		if(num < minNum) num += minNum;
		return num;
	}
}
