package com.apptionlabs.meater_app.model;

import android.content.Context;
import j6.p;
import java.util.Arrays;
import java.util.List;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum MenuOptionMain implements p {
    CONNECTIONS(1, 2131231198, 2132017522, 2131100472),
    ADD_DEVICES(3, 2131231189, 2132018154, 2131100472),
    COOK_HISTORY(4, 2131231192, 2132018445, 2131100472),
    SETTINGS(5, 2131231201, 2132018158, 2131100472),
    HELP(6, 2131231200, 2132018157, 2131100472);

    final int color;
    final int id;
    final int image;
    final int image2;
    final int text;
    String textStr;

    MenuOptionMain(int i10, int i11, int i12, int i13) {
        this(i10, i11, 0, i12, i13);
    }

    public static List<p> getOptions() {
        return Arrays.asList(values());
    }

    public static MenuOptionMain getType(int i10) {
        for (MenuOptionMain menuOptionMain : values()) {
            if (i10 == menuOptionMain.id) {
                return menuOptionMain;
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

    @Override // j6.p
    public String getText(Context context) {
        String str = this.textStr;
        if (str == null) {
            return context.getString(this.text);
        }
        return str;
    }

    @Override // j6.p
    public void setText(String str) {
        this.textStr = str;
    }

    MenuOptionMain(int i10, int i11, int i12, int i13, int i14) {
        this.id = i10;
        this.image = i11;
        this.image2 = i12;
        this.text = i13;
        this.color = i14;
    }
}
