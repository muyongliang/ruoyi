package com.ruoyi.system.service;

import com.ruoyi.system.domain.DataTable;
import com.ruoyi.system.domain.DataTableFieldValues;
import com.ruoyi.system.domain.DataTableFields;

public interface IDataTableService {
    int insertDataTable(DataTable dataTable);

    int insertDataTableFields(DataTableFields fields);

    int insertDataTableFieldValues(DataTableFieldValues fields);
}
