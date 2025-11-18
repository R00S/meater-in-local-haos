package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    /* renamed from: A */
    private static void m14463A(Parcel parcel, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(iDataPosition - i2);
        parcel.setDataPosition(iDataPosition);
    }

    /* renamed from: B */
    private static void m14464B(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    /* renamed from: C */
    private static void m14465C(Parcel parcel, Parcelable parcelable, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i2);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    /* renamed from: a */
    public static int m14466a(Parcel parcel) {
        return m14491z(parcel, 20293);
    }

    /* renamed from: b */
    public static void m14467b(Parcel parcel, int i2) {
        m14463A(parcel, i2);
    }

    /* renamed from: c */
    public static void m14468c(Parcel parcel, int i2, boolean z) {
        m14464B(parcel, i2, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m14469d(Parcel parcel, int i2, Boolean bool, boolean z) {
        if (bool != null) {
            m14464B(parcel, i2, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m14464B(parcel, i2, 0);
        }
    }

    /* renamed from: e */
    public static void m14470e(Parcel parcel, int i2, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m14464B(parcel, i2, 0);
            }
        } else {
            int iM14491z = m14491z(parcel, i2);
            parcel.writeBundle(bundle);
            m14463A(parcel, iM14491z);
        }
    }

    /* renamed from: f */
    public static void m14471f(Parcel parcel, int i2, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m14464B(parcel, i2, 0);
            }
        } else {
            int iM14491z = m14491z(parcel, i2);
            parcel.writeByteArray(bArr);
            m14463A(parcel, iM14491z);
        }
    }

    /* renamed from: g */
    public static void m14472g(Parcel parcel, int i2, double d2) {
        m14464B(parcel, i2, 8);
        parcel.writeDouble(d2);
    }

    /* renamed from: h */
    public static void m14473h(Parcel parcel, int i2, Double d2, boolean z) {
        if (d2 != null) {
            m14464B(parcel, i2, 8);
            parcel.writeDouble(d2.doubleValue());
        } else if (z) {
            m14464B(parcel, i2, 0);
        }
    }

    /* renamed from: i */
    public static void m14474i(Parcel parcel, int i2, float f2) {
        m14464B(parcel, i2, 4);
        parcel.writeFloat(f2);
    }

    /* renamed from: j */
    public static void m14475j(Parcel parcel, int i2, Float f2, boolean z) {
        if (f2 != null) {
            m14464B(parcel, i2, 4);
            parcel.writeFloat(f2.floatValue());
        } else if (z) {
            m14464B(parcel, i2, 0);
        }
    }

    /* renamed from: k */
    public static void m14476k(Parcel parcel, int i2, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m14464B(parcel, i2, 0);
            }
        } else {
            int iM14491z = m14491z(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            m14463A(parcel, iM14491z);
        }
    }

    /* renamed from: l */
    public static void m14477l(Parcel parcel, int i2, int i3) {
        m14464B(parcel, i2, 4);
        parcel.writeInt(i3);
    }

    /* renamed from: m */
    public static void m14478m(Parcel parcel, int i2, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                m14464B(parcel, i2, 0);
            }
        } else {
            int iM14491z = m14491z(parcel, i2);
            parcel.writeIntArray(iArr);
            m14463A(parcel, iM14491z);
        }
    }

    /* renamed from: n */
    public static void m14479n(Parcel parcel, int i2, List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                m14464B(parcel, i2, 0);
                return;
            }
            return;
        }
        int iM14491z = m14491z(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(list.get(i3).intValue());
        }
        m14463A(parcel, iM14491z);
    }

    /* renamed from: o */
    public static void m14480o(Parcel parcel, int i2, Integer num, boolean z) {
        if (num != null) {
            m14464B(parcel, i2, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            m14464B(parcel, i2, 0);
        }
    }

    /* renamed from: p */
    public static void m14481p(Parcel parcel, int i2, long j2) {
        m14464B(parcel, i2, 8);
        parcel.writeLong(j2);
    }

    /* renamed from: q */
    public static void m14482q(Parcel parcel, int i2, Long l, boolean z) {
        if (l != null) {
            m14464B(parcel, i2, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m14464B(parcel, i2, 0);
        }
    }

    /* renamed from: r */
    public static void m14483r(Parcel parcel, int i2, Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (z) {
                m14464B(parcel, i2, 0);
            }
        } else {
            int iM14491z = m14491z(parcel, i2);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m14463A(parcel, iM14491z);
        }
    }

    /* renamed from: s */
    public static void m14484s(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z) {
        if (parcelable == null) {
            if (z) {
                m14464B(parcel, i2, 0);
            }
        } else {
            int iM14491z = m14491z(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            m14463A(parcel, iM14491z);
        }
    }

    /* renamed from: t */
    public static void m14485t(Parcel parcel, int i2, short s) {
        m14464B(parcel, i2, 4);
        parcel.writeInt(s);
    }

    /* renamed from: u */
    public static void m14486u(Parcel parcel, int i2, String str, boolean z) {
        if (str == null) {
            if (z) {
                m14464B(parcel, i2, 0);
            }
        } else {
            int iM14491z = m14491z(parcel, i2);
            parcel.writeString(str);
            m14463A(parcel, iM14491z);
        }
    }

    /* renamed from: v */
    public static void m14487v(Parcel parcel, int i2, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                m14464B(parcel, i2, 0);
            }
        } else {
            int iM14491z = m14491z(parcel, i2);
            parcel.writeStringArray(strArr);
            m14463A(parcel, iM14491z);
        }
    }

    /* renamed from: w */
    public static void m14488w(Parcel parcel, int i2, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                m14464B(parcel, i2, 0);
            }
        } else {
            int iM14491z = m14491z(parcel, i2);
            parcel.writeStringList(list);
            m14463A(parcel, iM14491z);
        }
    }

    /* renamed from: x */
    public static <T extends Parcelable> void m14489x(Parcel parcel, int i2, T[] tArr, int i3, boolean z) {
        if (tArr == null) {
            if (z) {
                m14464B(parcel, i2, 0);
                return;
            }
            return;
        }
        int iM14491z = m14491z(parcel, i2);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m14465C(parcel, t, i3);
            }
        }
        m14463A(parcel, iM14491z);
    }

    /* renamed from: y */
    public static <T extends Parcelable> void m14490y(Parcel parcel, int i2, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m14464B(parcel, i2, 0);
                return;
            }
            return;
        }
        int iM14491z = m14491z(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m14465C(parcel, t, 0);
            }
        }
        m14463A(parcel, iM14491z);
    }

    /* renamed from: z */
    private static int m14491z(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }
}
