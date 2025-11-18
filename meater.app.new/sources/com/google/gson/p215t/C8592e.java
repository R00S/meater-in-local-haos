package com.google.gson.p215t;

/* compiled from: JavaVersion.java */
/* renamed from: com.google.gson.t.e */
/* loaded from: classes2.dex */
public final class C8592e {

    /* renamed from: a */
    private static final int f32540a = m27084a();

    /* renamed from: a */
    private static int m27084a() {
        return m27087d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m27085b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb.append(cCharAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m27086c() {
        return f32540a;
    }

    /* renamed from: d */
    static int m27087d(String str) throws NumberFormatException {
        int iM27089f = m27089f(str);
        if (iM27089f == -1) {
            iM27089f = m27085b(str);
        }
        if (iM27089f == -1) {
            return 6;
        }
        return iM27089f;
    }

    /* renamed from: e */
    public static boolean m27088e() {
        return f32540a >= 9;
    }

    /* renamed from: f */
    private static int m27089f(String str) throws NumberFormatException {
        try {
            String[] strArrSplit = str.split("[._]");
            int i2 = Integer.parseInt(strArrSplit[0]);
            return (i2 != 1 || strArrSplit.length <= 1) ? i2 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
