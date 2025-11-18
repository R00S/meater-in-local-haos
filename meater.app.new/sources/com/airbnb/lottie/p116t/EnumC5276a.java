package com.airbnb.lottie.p116t;

import cm.aptoide.p092pt.utils.MultiDexHelper;

/* compiled from: FileExtension.java */
/* renamed from: com.airbnb.lottie.t.a */
/* loaded from: classes.dex */
public enum EnumC5276a {
    Json(".json"),
    Zip(MultiDexHelper.EXTRACTED_SUFFIX);


    /* renamed from: i */
    public final String f12893i;

    EnumC5276a(String str) {
        this.f12893i = str;
    }

    /* renamed from: g */
    public String m9761g() {
        return ".temp" + this.f12893i;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f12893i;
    }
}
