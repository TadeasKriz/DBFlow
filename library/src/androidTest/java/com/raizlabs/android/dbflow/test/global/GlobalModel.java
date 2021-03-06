package com.raizlabs.android.dbflow.test.global;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ConflictAction;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Description:
 */
@Table(databaseName = GlobalDatabase.NAME, updateConflict = ConflictAction.IGNORE)
public class GlobalModel extends BaseModel {

    @Column(columnType = Column.PRIMARY_KEY_AUTO_INCREMENT)
    int id;

    @Column
    String name;
}
