package m7;

import android.os.IBinder;
import android.os.IInterface;
import r7.BinderC4358c;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3977a extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* renamed from: m7.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0607a extends BinderC4358c implements InterfaceC3977a {
        public AbstractBinderC0607a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static InterfaceC3977a g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3977a ? (InterfaceC3977a) iInterfaceQueryLocalInterface : new c(iBinder);
        }
    }
}
