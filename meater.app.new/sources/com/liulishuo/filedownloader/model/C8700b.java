package com.liulishuo.filedownloader.model;

import p241e.p307h.p308a.InterfaceC8991a;

/* compiled from: FileDownloadStatus.java */
/* renamed from: com.liulishuo.filedownloader.model.b */
/* loaded from: classes2.dex */
public class C8700b {
    /* renamed from: a */
    public static boolean m27597a(int i2) {
        return i2 > 0;
    }

    /* renamed from: b */
    public static boolean m27598b(int i2, int i3) {
        if ((i2 != 3 && i2 != 5 && i2 == i3) || m27601e(i2)) {
            return false;
        }
        if (i2 >= 1 && i2 <= 6 && i3 >= 10 && i3 <= 11) {
            return false;
        }
        if (i2 == 1) {
            return i3 != 0;
        }
        if (i2 == 2) {
            return (i3 == 0 || i3 == 1 || i3 == 6) ? false : true;
        }
        if (i2 == 3) {
            return (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 6) ? false : true;
        }
        if (i2 == 5) {
            return (i3 == 1 || i3 == 6) ? false : true;
        }
        if (i2 != 6) {
            return true;
        }
        return (i3 == 0 || i3 == 1) ? false : true;
    }

    /* renamed from: c */
    public static boolean m27599c(int i2, int i3) {
        if ((i2 != 3 && i2 != 5 && i2 == i3) || m27601e(i2)) {
            return false;
        }
        if (i3 == -2 || i3 == -1) {
            return true;
        }
        if (i2 == 0) {
            return i3 == 10;
        }
        if (i2 == 1) {
            return i3 == 6;
        }
        if (i2 == 2 || i2 == 3) {
            return i3 == -3 || i3 == 3 || i3 == 5;
        }
        if (i2 == 5 || i2 == 6) {
            return i3 == 2 || i3 == 5;
        }
        if (i2 == 10) {
            return i3 == 11;
        }
        if (i2 != 11) {
            return false;
        }
        return i3 == -4 || i3 == -3 || i3 == 1;
    }

    /* renamed from: d */
    public static boolean m27600d(InterfaceC8991a interfaceC8991a) {
        return interfaceC8991a.getStatus() == 0 || interfaceC8991a.getStatus() == 3;
    }

    /* renamed from: e */
    public static boolean m27601e(int i2) {
        return i2 < 0;
    }
}
