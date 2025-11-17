package com.apptionlabs.meater_app.data;

import java.util.ArrayList;

/* loaded from: /tmp/meat/meat/classes.dex */
public class GroupInformation {
    private ArrayList<ChildInfo> list = new ArrayList<>();
    private String mainSetName;

    public String getName() {
        return this.mainSetName;
    }

    public ArrayList<ChildInfo> getSubsetName() {
        return this.list;
    }

    public void setName(String str) {
        this.mainSetName = str;
    }

    public void setSubsetName(ArrayList<ChildInfo> arrayList) {
        this.list = arrayList;
    }
}
