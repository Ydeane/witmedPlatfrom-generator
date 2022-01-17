package com.yrx.witmedPlatform.util;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.util.ResourceUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * <b></b>
 *
 * @author Ydeane
 * @date 2022-01-12
 * @since
 */
public class FreemarkerUtil {
	public static boolean create(Object param, String className, String templateName) {
		//创建Freemarker Configuration对象
		Configuration configuration = new Configuration(Configuration.VERSION_2_3_31);
		try{
			//获得位于resources路径下的freemarker文件
			String freemarkerPath = ResourceUtils.getURL("classpath:").getPath()+"templates";
			//设置所使用的Freemarker的模板所在的路径位置
			configuration.setDirectoryForTemplateLoading(new File(freemarkerPath));
			//生成目标文件的编码格式
			configuration.setDefaultEncoding("UTF-8");
			//设定所需要生成目标文件的freemarker目标是哪个
			Template template = configuration.getTemplate(templateName + ".ftl");
			String targetPath = "C:\\target";
			File folder = new File(targetPath);
			if (!folder.exists()) {
				folder.mkdirs();
			}
			//根据路径和生成文件创建对应的File对象
			File targetFile = new File(targetPath + File.separator + className + ".java");
			//为了能够得到对应输出的文件，那么需要使用到输出流将生成的文件传输到硬盘上。
			//创建字符输出流
			BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
			//使用freemarker生成对应的文件
			template.process(param, bw);
			bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
}
