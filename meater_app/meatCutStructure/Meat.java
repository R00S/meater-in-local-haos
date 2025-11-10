package com.apptionlabs.meater_app.meatCutStructure;

import java.util.ArrayList;

/* loaded from: /tmp/meat/meat/classes.dex */
public class Meat extends MeatModel {
    public MeatCategory category;
    public ArrayList<MeatCutType> cutTypes = new ArrayList<>();
    public String description;
    public String overEndHex;
    public String overStartHex;
    public String underEndHex;
    public String underStartHex;
}
