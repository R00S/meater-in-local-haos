package x7;

import android.os.Parcel;
import p7.BinderC4243b;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: x7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5067e extends BinderC4243b implements InterfaceC5068f {
    public AbstractBinderC5067e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p7.BinderC4243b
    protected final boolean u1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                p7.c.b(parcel);
                break;
            case 4:
                p7.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                p7.c.b(parcel);
                break;
            case 7:
                p7.c.b(parcel);
                break;
            case 8:
                C5074l c5074l = (C5074l) p7.c.a(parcel, C5074l.CREATOR);
                p7.c.b(parcel);
                l0(c5074l);
                break;
            case 9:
                p7.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
