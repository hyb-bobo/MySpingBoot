//package com.shanghai.springboot.execl;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//
///**
// * Created by hyb on 2018/9/20.
// */
//public class InputExecl {
//
//    public List<Hero> importData(File file)
//    {
//        Workbook wb = null;
//        List<Hero> HeroList = new ArrayList();
//        try
//        {
//            if (ExcelUtil.isExcel2007(file.getPath())) {
//                wb = new XSSFWorkbook(new FileInputStream(file));
//            } else {
//                wb = new HSSFWorkbook(new FileInputStream(file));
//            }
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//
//            return null;
//        }
//
//        Sheet sheet = wb.getSheetAt(0);//获取第一张表
//        for (int i = 0; i < sheet.getLastRowNum(); i++)
//        {
//            Row row = sheet.getRow(i);//获取索引为i的行，以0开始
//            String name= row.getCell(0).getStringCellValue();//获取第i行的索引为0的单元格数据
//            int age = row.getCell(1).getNumericCellValue();
//            if (age==0 && name==null)
//            {
//                break;
//            }
//            Hero hero=New Hero();
//            hero.setName(name);
//            hero.setAge(age);
//            HeroList.add(hero);
//        }
//        try
//        {
//            wb.close();
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//        return HeroList;
//    }
//}
