package com.shanghai.springboot.execl;

import com.idxwrd.excel.util.SimpleExcelCell;

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
 * Created by ttl on 2018/9/9.
 */
public class TestExcelCell extends SimpleExcelCell {

    private SimulationService simulationService;

    public TestExcelCell(SimulationService simulationService){
        this.simulationService = simulationService;
    }

    public TestExcelCell(int index, String dataKey, SimulationService simulationService){
        this.setIndex(index);
        this.setDataKey(dataKey);
        this.simulationService = simulationService;
    }

    @Override
    public String handle(String key, String value) {
        simulationService.handle();
        return value;
    }
}
