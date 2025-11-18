package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public interface IObjectWrapper extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IObjectWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: P */
        public static IObjectWrapper m14707P(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof IObjectWrapper ? (IObjectWrapper) iInterfaceQueryLocalInterface : new zzb(iBinder);
        }
    }
}
