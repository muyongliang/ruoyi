package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.DataTable;
import com.ruoyi.system.domain.DataTableFieldValues;
import com.ruoyi.system.domain.DataTableFields;

import java.util.List;

public interface DataTableMapper {
    List<DataTable> selectDataTableList(DataTable dataTable);

    DataTable selectDataTableById(Long id);

    int deleteDataTableByIds(Long[] ids);

    int updateDataTable(DataTable dataTable);

    int insertDataTable(DataTable dataTable);

    int insertDataTableFields(DataTableFields dataTableFields);

    int insertDataTableFieldValues(DataTableFieldValues dataTableFieldValues);

}
