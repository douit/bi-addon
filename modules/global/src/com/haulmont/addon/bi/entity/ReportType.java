package com.haulmont.addon.bi.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ReportType implements EnumClass<Integer> {

    Pentaho(1),
    Qlik(2);

    private Integer id;

    ReportType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static ReportType fromId(Integer id) {
        for (ReportType at : ReportType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}