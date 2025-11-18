package E8;

/* compiled from: SubtleUtil.java */
/* loaded from: classes2.dex */
public final class q {
    @Deprecated
    public static int a() {
        Integer numA = com.google.crypto.tink.internal.s.a();
        if (numA != null) {
            return numA.intValue();
        }
        return -1;
    }

    public static boolean b() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
