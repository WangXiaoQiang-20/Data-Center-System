package com.spartan.dc.dao.write;

import com.spartan.dc.core.dto.dc.GasRechargeRecordDTO;
import com.spartan.dc.core.dto.task.req.GasRechargeRecordReqVO;
import com.spartan.dc.model.DcGasRechargeRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import java.util.List;
import java.util.Map;

public interface DcGasRechargeRecordMapper {
    int deleteByPrimaryKey(Long rechargeRecordId);

    int insert(DcGasRechargeRecord record);

    int insertSelective(DcGasRechargeRecord record);

    DcGasRechargeRecord selectByPrimaryKey(Long rechargeRecordId);

    int updateByPrimaryKeySelective(DcGasRechargeRecord record);

    int updateByPrimaryKey(DcGasRechargeRecord record);

    List<DcGasRechargeRecord> getUnSubmitGasRechargeRecord();

    DcGasRechargeRecord getOneByTxHash(@Param("txHash") String txHash);

    List<DcGasRechargeRecord> getSuccessSubmit();

    List<GasRechargeRecordDTO> getSuccessSubmitAndRechargingRecords(GasRechargeRecordReqVO  reqVO);

    int updateRechargeStateById(GasRechargeRecordDTO  reqVO);

    /**
     * Query charge list.
     * @param condition
     * @return
     */
    List<Map<String, Object>> queryChargeList(Map<String, Object> condition);

    /**
     * Insert recharge record and return id.
     * @param record
     * @return
     */
    int insertRechargeRecord(DcGasRechargeRecord record);

    DcGasRechargeRecord getOneByMd5Sign(String md5Sign);
}