package com.shanghai.springboot.execl;

import com.idxwrd.excel.util.*;
import com.idxwrd.excel.util.inf.ExcelData;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 　　 へ　　　　　／|
 * 　　/＼7　　　 ∠＿/
 * 　 /　│　　 ／　／
 * 　│　Z ＿,＜　／　　  /`ヽ
 * 　│　　　　　ヽ　　  /　　〉
 * 　 Y　　　　　`　    /　　/
 * 　ｲ●　､　●　⊂⊃  〈　　/
 * 　()　 へ　　　　|　＼ 〈
 * 　　ｰ ､_　 ィ　 │ ／ ／
 * 　 / へ　　 /　ﾉ＜| ＼＼
 * 　 ヽ_ﾉ　　(_／　 │／／
 * 　　7　　　　　　　|／
 * 　　＞―r￣￣`ｰ―＿
 * <p>
 * <p>
 * 去吧！皮卡丘！
 * <p>
 * Created by ttl on 2018/9/8.
 */
public class TestMain {

    private SimulationService simulationService = new SimulationService();


    @Test
    public void testList() {
        List<String> strings = new LinkedList<>();
        strings.add(null);
        strings.add(null);
        strings.add(null);
        strings.set(2, "2");
    }

    @Test
    public void test() {
        try {
            // 创建输入数据源，从excel里读取的数据会被初始化到这个list内
            List<ExcelData> testInputExcelData = new ArrayList<>();

            // 用注解配置Excel第一个参数是上面准备的数据，第二个参数是excel对应列的处理类
            SimpleAnnotationExcelInstance excelInstance = new SimpleAnnotationExcelInstance(TestExcelData.class, new TestExcelCell(simulationService));

            // 为excel配置数据源
            excelInstance.setData(testInputExcelData);


            // 设置Excel的操作流程，可以根据不同情况在内部的操作里配置不同的excel，在流程内的操作顺序执行
            SimpleOperationProgress simpleOperationProgress = new SimpleOperationProgress();

            File testInputExcel = new File("D:/testInputExcel.xlsx");
            FileInputStream fileInputStream = new FileInputStream(testInputExcel);

            //配置导入操作，第一个参数是输入流，第二个参数是文件长度，第三个参数是文件名用来判断后缀是xlsx还是xls
            SimpleInputOperation simpleInputOperation = new SimpleInputOperation(fileInputStream, (int) testInputExcel.length(), testInputExcel.getName());
            simpleInputOperation.setDefaultInstance(excelInstance);

            // 把输入操作添加到操作流程内,false表示不使用流程内的默认excel描述
            simpleOperationProgress.addOperation(simpleInputOperation, false);


            List<ExcelData> testOutputExcelData = new ArrayList<>();
            testOutputExcelData.add(null);
            testOutputExcelData.add(null);
            testOutputExcelData.add(new TestExcelData("导出的第三行第一列", "导出的第三行第二列"));

            // 配置输出的excel在第三行的第一列和第二列输出
            // 第三行第一列输出数据列表中第三个数据项的testOneCell字段
            // 第三行第二列输出数据列表中第三个数据项的testTowCell字段
            SimpleExcelInstance simpleOutputExcelInstance = new SimpleExcelInstance();
            simpleOutputExcelInstance.rowMapping(
                    2,
                    new TestExcelCell(0, "testOneCell", simulationService),
                    new TestExcelCell(1, "testTwoCell", simulationService));
            simpleOutputExcelInstance.setData(testOutputExcelData);

            File testOutputExcel = new File("D:/testOutputExcel.xls");
            FileOutputStream fileOutputStream = new FileOutputStream(testOutputExcel);

            // 配置输出操作
            SimpleOutputOperation simpleOutputOperation = new SimpleOutputOperation(fileOutputStream);
            simpleOutputOperation.setDefaultInstance(simpleOutputExcelInstance);

            // 把输出操作添加到操作流程内,false表示不使用流程内的默认excel描述
            simpleOperationProgress.addOperation(simpleOutputOperation, false);

            // 执行对excel的处理
            simpleOperationProgress.execute();
            System.out.println(testInputExcelData);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
