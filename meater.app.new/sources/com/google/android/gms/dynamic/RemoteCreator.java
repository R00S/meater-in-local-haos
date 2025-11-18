package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class RemoteCreator<T> {

    /* renamed from: a */
    private final String f18034a;

    /* renamed from: b */
    private Object f18035b;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    public static class RemoteCreatorException extends Exception {
        @KeepForSdk
        public RemoteCreatorException(String str) {
            super(str);
        }

        @KeepForSdk
        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    @KeepForSdk
    protected RemoteCreator(String str) {
        this.f18034a = str;
    }

    @KeepForSdk
    /* renamed from: a */
    protected abstract T mo14396a(IBinder iBinder);

    @KeepForSdk
    /* renamed from: b */
    protected final T m14710b(Context context) throws RemoteCreatorException {
        if (this.f18035b == null) {
            Preconditions.m14372k(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                throw new RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.f18035b = mo14396a((IBinder) remoteContext.getClassLoader().loadClass(this.f18034a).newInstance());
            } catch (ClassNotFoundException e2) {
                throw new RemoteCreatorException("Could not load creator class.", e2);
            } catch (IllegalAccessException e3) {
                throw new RemoteCreatorException("Could not access creator.", e3);
            } catch (InstantiationException e4) {
                throw new RemoteCreatorException("Could not instantiate creator.", e4);
            }
        }
        return (T) this.f18035b;
    }
}
