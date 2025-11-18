package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@RetainForClient
@KeepForSdk
/* loaded from: classes2.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {

    /* renamed from: f */
    private final Object f18033f;

    private ObjectWrapper(Object obj) {
        this.f18033f = obj;
    }

    @KeepForSdk
    /* renamed from: E0 */
    public static <T> IObjectWrapper m14708E0(T t) {
        return new ObjectWrapper(t);
    }

    @KeepForSdk
    /* renamed from: k0 */
    public static <T> T m14709k0(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return (T) ((ObjectWrapper) iObjectWrapper).f18033f;
        }
        IBinder iBinderAsBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i2 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
        }
        if (i2 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        Preconditions.m14372k(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
        } catch (NullPointerException e3) {
            throw new IllegalArgumentException("Binder object is null.", e3);
        }
    }
}
