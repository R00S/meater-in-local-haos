package com.apptionlabs.meater_app.model;

import android.content.Context;
import j6.p;
import java.util.Arrays;
import java.util.List;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum MenuOptionProbe implements p {
    PROBE_INFO(0, 2131231393, 2131231378, 2132018161, 2131099778),
    CONNECTION_DETAILS(1, 2131231197, 2132017519, 2131100472),
    ADJUST_COOK(2, 2131231190, 2132018159, 2131100472),
    VIEW_ALERTS(3, 2131231191, 2132018162, 2131100472),
    PREVIOUS_COOKS(4, 2131231192, 2132018445, 2131100472),
    COOK_GRAPH(5, 2131231196, 2132018160, 2131100472),
    WEB_CONNECT(7, 2131231370, 2132018927, 2131100472),
    SHARE_COOK(8, 2131231307, 2132018684, 2131100472),
    CANCEL_COOK(9, 2131230916, 2132017402, 2131100472);

    final int color;
    final int id;
    final int image;
    final int image2;
    final int text;
    String textString;

    MenuOptionProbe(int i10, int i11, int i12, int i13) {
        this(i10, i11, 0, i12, i13);
    }

    public static List<p> getOptions() {
        return Arrays.asList(values());
    }

    public static MenuOptionProbe getType(int i10) {
        for (MenuOptionProbe menuOptionProbe : values()) {
            if (i10 == menuOptionProbe.id) {
                return menuOptionProbe;
            }
        }
        return null;
    }

    @Override // j6.p
    public int getColor() {
        return this.color;
    }

    public int getId() {
        return this.id;
    }

    @Override // j6.p
    public int getImage() {
        return this.image;
    }

    @Override // j6.p
    public int getImage2() {
        return this.image2;
    }

    public int[] getImages() {
        int i10 = this.image2;
        if (i10 <= 0) {
            return new int[]{this.image};
        }
        return new int[]{this.image, i10};
    }

    public int getText() {
        return this.text;
    }

    @Override // j6.p
    public void setText(String str) {
        this.textString = str;
    }

    MenuOptionProbe(int i10, int i11, int i12, int i13, int i14) {
        this.id = i10;
        this.image = i11;
        this.image2 = i12;
        this.text = i13;
        this.color = i14;
    }

    @Override // j6.p
    public String getText(Context context) {
        String str = this.textString;
        return str != null ? str : context.getString(this.text);
    }
}
