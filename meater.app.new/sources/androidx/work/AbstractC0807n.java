package androidx.work;

import android.util.Log;

/* compiled from: Logger.java */
/* renamed from: androidx.work.n */
/* loaded from: classes.dex */
public abstract class AbstractC0807n {

    /* renamed from: a */
    private static AbstractC0807n f4973a = null;

    /* renamed from: b */
    private static final int f4974b = 20;

    /* compiled from: Logger.java */
    /* renamed from: androidx.work.n$a */
    public static class a extends AbstractC0807n {

        /* renamed from: c */
        private int f4975c;

        public a(int i2) {
            super(i2);
            this.f4975c = i2;
        }

        @Override // androidx.work.AbstractC0807n
        /* renamed from: a */
        public void mo5224a(String str, String str2, Throwable... thArr) {
            if (this.f4975c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.AbstractC0807n
        /* renamed from: b */
        public void mo5225b(String str, String str2, Throwable... thArr) {
            if (this.f4975c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.AbstractC0807n
        /* renamed from: d */
        public void mo5226d(String str, String str2, Throwable... thArr) {
            if (this.f4975c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.AbstractC0807n
        /* renamed from: g */
        public void mo5227g(String str, String str2, Throwable... thArr) {
            if (this.f4975c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.AbstractC0807n
        /* renamed from: h */
        public void mo5228h(String str, String str2, Throwable... thArr) {
            if (this.f4975c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public AbstractC0807n(int i2) {
    }

    /* renamed from: c */
    public static synchronized AbstractC0807n m5221c() {
        if (f4973a == null) {
            f4973a = new a(3);
        }
        return f4973a;
    }

    /* renamed from: e */
    public static synchronized void m5222e(AbstractC0807n abstractC0807n) {
        f4973a = abstractC0807n;
    }

    /* renamed from: f */
    public static String m5223f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i2 = f4974b;
        if (length >= i2) {
            sb.append(str.substring(0, i2));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public abstract void mo5224a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo5225b(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo5226d(String str, String str2, Throwable... thArr);

    /* renamed from: g */
    public abstract void mo5227g(String str, String str2, Throwable... thArr);

    /* renamed from: h */
    public abstract void mo5228h(String str, String str2, Throwable... thArr);
}
