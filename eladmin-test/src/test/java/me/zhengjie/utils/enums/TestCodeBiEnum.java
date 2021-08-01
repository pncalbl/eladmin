package me.zhengjie.utils.enums;

import org.junit.Test;

/**
 * @author pncalbl
 * @date 2021/8/1 22:47
 * @e-mail pncalbl@qq.com
 * @description
 **/

public class TestCodeBiEnum {

	@Test
	public void test() {
		System.out.println("测试CodeBiEnum枚举类");
		for (int i = 1; i <= 2; i++) {
			CodeBiEnum codeBiEnum = CodeBiEnum.find(i);
			assert codeBiEnum != null;
			System.out.println(codeBiEnum.getCode() + "--" + codeBiEnum.getDescription());
		}
	}

}
