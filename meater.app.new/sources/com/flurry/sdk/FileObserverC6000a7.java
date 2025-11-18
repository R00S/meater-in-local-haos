package com.flurry.sdk;

import android.os.FileObserver;

/* renamed from: com.flurry.sdk.a7 */
/* loaded from: classes2.dex */
public final class FileObserverC6000a7 extends FileObserver {

    /* renamed from: a */
    private InterfaceC6209y6 f15666a;

    /* renamed from: b */
    private String f15667b;

    public FileObserverC6000a7(String str, InterfaceC6209y6 interfaceC6209y6) {
        super(str);
        this.f15667b = str;
        this.f15666a = interfaceC6209y6;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i2, String str) {
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((i2 & 8) != 0) {
            sb.append(this.f15667b + "/" + str + " is written and closed\n");
            StringBuilder sb2 = new StringBuilder("Observer triggered ");
            sb2.append(sb.toString());
            C6021d1.m13030c(3, "VNodeObserver", sb2.toString());
            this.f15666a.mo13379h(str);
        }
    }
}
