package androidx.work.impl.p016n;

import android.os.Build;
import androidx.work.C0705d;
import androidx.work.C0817x;
import androidx.work.EnumC0701a;
import androidx.work.EnumC0808o;
import androidx.work.EnumC0811r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;

/* compiled from: WorkTypeConverters.java */
/* renamed from: androidx.work.impl.n.v */
/* loaded from: classes.dex */
public class C0781v {

    /* compiled from: WorkTypeConverters.java */
    /* renamed from: androidx.work.impl.n.v$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4849a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4850b;

        /* renamed from: c */
        static final /* synthetic */ int[] f4851c;

        /* renamed from: d */
        static final /* synthetic */ int[] f4852d;

        static {
            int[] iArr = new int[EnumC0811r.values().length];
            f4852d = iArr;
            try {
                iArr[EnumC0811r.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4852d[EnumC0811r.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0808o.values().length];
            f4851c = iArr2;
            try {
                iArr2[EnumC0808o.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4851c[EnumC0808o.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4851c[EnumC0808o.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4851c[EnumC0808o.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4851c[EnumC0808o.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[EnumC0701a.values().length];
            f4850b = iArr3;
            try {
                iArr3[EnumC0701a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4850b[EnumC0701a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[C0817x.a.values().length];
            f4849a = iArr4;
            try {
                iArr4[C0817x.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4849a[C0817x.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4849a[C0817x.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4849a[C0817x.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4849a[C0817x.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4849a[C0817x.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: a */
    public static int m5122a(EnumC0701a enumC0701a) {
        int i2 = a.f4850b[enumC0701a.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + enumC0701a + " to int");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.C0705d m5123b(byte[] r6) throws java.lang.Throwable {
        /*
            androidx.work.d r0 = new androidx.work.d
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            int r6 = r2.readInt()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
        L17:
            if (r6 <= 0) goto L2b
            java.lang.String r3 = r2.readUTF()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            boolean r4 = r2.readBoolean()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            r0.m4818a(r3, r4)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r2.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r6 = move-exception
            r6.printStackTrace()
        L33:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L37:
            r6 = move-exception
            goto L41
        L39:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L58
        L3d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L41:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r6 = move-exception
            r6.printStackTrace()
        L4e:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r6 = move-exception
            r6.printStackTrace()
        L56:
            return r0
        L57:
            r6 = move-exception
        L58:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r0.printStackTrace()
        L62:
            r1.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            goto L6c
        L6b:
            throw r6
        L6c:
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p016n.C0781v.m5123b(byte[]):androidx.work.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0067 -> B:35:0x006a). Please report as a decompilation issue!!! */
    /* renamed from: c */
    public static byte[] m5124c(C0705d c0705d) throws Throwable {
        boolean zHasNext;
        ObjectOutputStream objectOutputStream = null;
        ObjectOutputStream objectOutputStream2 = null;
        objectOutputStream = null;
        if (c0705d.m4820c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
        } catch (IOException e2) {
            e2.printStackTrace();
            objectOutputStream = objectOutputStream;
        }
        try {
            try {
                ObjectOutputStream objectOutputStream3 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream3.writeInt(c0705d.m4820c());
                    Iterator<C0705d.a> it = c0705d.m4819b().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        if (zHasNext != 0) {
                            C0705d.a next = it.next();
                            objectOutputStream3.writeUTF(next.m4821a().toString());
                            objectOutputStream3.writeBoolean(next.m4822b());
                        } else {
                            try {
                                break;
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    objectOutputStream3.close();
                    byteArrayOutputStream.close();
                    objectOutputStream = zHasNext;
                } catch (IOException e4) {
                    e = e4;
                    objectOutputStream2 = objectOutputStream3;
                    e.printStackTrace();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    byteArrayOutputStream.close();
                    objectOutputStream = objectOutputStream2;
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream3;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e8) {
                e = e8;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: d */
    public static EnumC0701a m5125d(int i2) {
        if (i2 == 0) {
            return EnumC0701a.EXPONENTIAL;
        }
        if (i2 == 1) {
            return EnumC0701a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to BackoffPolicy");
    }

    /* renamed from: e */
    public static EnumC0808o m5126e(int i2) {
        if (i2 == 0) {
            return EnumC0808o.NOT_REQUIRED;
        }
        if (i2 == 1) {
            return EnumC0808o.CONNECTED;
        }
        if (i2 == 2) {
            return EnumC0808o.UNMETERED;
        }
        if (i2 == 3) {
            return EnumC0808o.NOT_ROAMING;
        }
        if (i2 == 4) {
            return EnumC0808o.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i2 == 5) {
            return EnumC0808o.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to NetworkType");
    }

    /* renamed from: f */
    public static EnumC0811r m5127f(int i2) {
        if (i2 == 0) {
            return EnumC0811r.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i2 == 1) {
            return EnumC0811r.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to OutOfQuotaPolicy");
    }

    /* renamed from: g */
    public static C0817x.a m5128g(int i2) {
        if (i2 == 0) {
            return C0817x.a.ENQUEUED;
        }
        if (i2 == 1) {
            return C0817x.a.RUNNING;
        }
        if (i2 == 2) {
            return C0817x.a.SUCCEEDED;
        }
        if (i2 == 3) {
            return C0817x.a.FAILED;
        }
        if (i2 == 4) {
            return C0817x.a.BLOCKED;
        }
        if (i2 == 5) {
            return C0817x.a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to State");
    }

    /* renamed from: h */
    public static int m5129h(EnumC0808o enumC0808o) {
        int i2 = a.f4851c[enumC0808o.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        if (i2 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && enumC0808o == EnumC0808o.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + enumC0808o + " to int");
    }

    /* renamed from: i */
    public static int m5130i(EnumC0811r enumC0811r) {
        int i2 = a.f4852d[enumC0811r.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + enumC0811r + " to int");
    }

    /* renamed from: j */
    public static int m5131j(C0817x.a aVar) {
        switch (a.f4849a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
    }
}
