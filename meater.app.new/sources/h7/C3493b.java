package h7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: h7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3493b {
    public static int a(Parcel parcel) {
        return v(parcel, 20293);
    }

    public static void b(Parcel parcel, int i10) {
        w(parcel, i10);
    }

    public static void c(Parcel parcel, int i10, boolean z10) {
        x(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i10, Boolean bool, boolean z10) {
        if (bool != null) {
            x(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z10) {
            x(parcel, i10, 0);
        }
    }

    public static void e(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                x(parcel, i10, 0);
            }
        } else {
            int iV = v(parcel, i10);
            parcel.writeBundle(bundle);
            w(parcel, iV);
        }
    }

    public static void f(Parcel parcel, int i10, byte b10) {
        x(parcel, i10, 4);
        parcel.writeInt(b10);
    }

    public static void g(Parcel parcel, int i10, byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                x(parcel, i10, 0);
            }
        } else {
            int iV = v(parcel, i10);
            parcel.writeByteArray(bArr);
            w(parcel, iV);
        }
    }

    public static void h(Parcel parcel, int i10, Double d10, boolean z10) {
        if (d10 != null) {
            x(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z10) {
            x(parcel, i10, 0);
        }
    }

    public static void i(Parcel parcel, int i10, Float f10, boolean z10) {
        if (f10 != null) {
            x(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            x(parcel, i10, 0);
        }
    }

    public static void j(Parcel parcel, int i10, IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                x(parcel, i10, 0);
            }
        } else {
            int iV = v(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            w(parcel, iV);
        }
    }

    public static void k(Parcel parcel, int i10, int i11) {
        x(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    public static void l(Parcel parcel, int i10, int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                x(parcel, i10, 0);
            }
        } else {
            int iV = v(parcel, i10);
            parcel.writeIntArray(iArr);
            w(parcel, iV);
        }
    }

    public static void m(Parcel parcel, int i10, List<Integer> list, boolean z10) {
        if (list == null) {
            if (z10) {
                x(parcel, i10, 0);
                return;
            }
            return;
        }
        int iV = v(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(list.get(i11).intValue());
        }
        w(parcel, iV);
    }

    public static void n(Parcel parcel, int i10, long j10) {
        x(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    public static void o(Parcel parcel, int i10, Long l10, boolean z10) {
        if (l10 != null) {
            x(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        } else if (z10) {
            x(parcel, i10, 0);
        }
    }

    public static void p(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                x(parcel, i10, 0);
            }
        } else {
            int iV = v(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            w(parcel, iV);
        }
    }

    public static void q(Parcel parcel, int i10, String str, boolean z10) {
        if (str == null) {
            if (z10) {
                x(parcel, i10, 0);
            }
        } else {
            int iV = v(parcel, i10);
            parcel.writeString(str);
            w(parcel, iV);
        }
    }

    public static void r(Parcel parcel, int i10, String[] strArr, boolean z10) {
        if (strArr == null) {
            if (z10) {
                x(parcel, i10, 0);
            }
        } else {
            int iV = v(parcel, i10);
            parcel.writeStringArray(strArr);
            w(parcel, iV);
        }
    }

    public static void s(Parcel parcel, int i10, List<String> list, boolean z10) {
        if (list == null) {
            if (z10) {
                x(parcel, i10, 0);
            }
        } else {
            int iV = v(parcel, i10);
            parcel.writeStringList(list);
            w(parcel, iV);
        }
    }

    public static <T extends Parcelable> void t(Parcel parcel, int i10, T[] tArr, int i11, boolean z10) {
        if (tArr == null) {
            if (z10) {
                x(parcel, i10, 0);
                return;
            }
            return;
        }
        int iV = v(parcel, i10);
        parcel.writeInt(tArr.length);
        for (T t10 : tArr) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                y(parcel, t10, i11);
            }
        }
        w(parcel, iV);
    }

    public static <T extends Parcelable> void u(Parcel parcel, int i10, List<T> list, boolean z10) {
        if (list == null) {
            if (z10) {
                x(parcel, i10, 0);
                return;
            }
            return;
        }
        int iV = v(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            T t10 = list.get(i11);
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                y(parcel, t10, 0);
            }
        }
        w(parcel, iV);
    }

    private static int v(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void w(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    private static void x(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    private static void y(Parcel parcel, Parcelable parcelable, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
