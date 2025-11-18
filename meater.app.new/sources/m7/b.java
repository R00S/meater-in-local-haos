package m7;

import android.os.IBinder;
import g7.C3445p;
import java.lang.reflect.Field;
import m7.InterfaceC3977a;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class b<T> extends InterfaceC3977a.AbstractBinderC0607a {

    /* renamed from: B, reason: collision with root package name */
    private final Object f45127B;

    private b(Object obj) {
        this.f45127B = obj;
    }

    public static <T> T k(InterfaceC3977a interfaceC3977a) throws SecurityException {
        if (interfaceC3977a instanceof b) {
            return (T) ((b) interfaceC3977a).f45127B;
        }
        IBinder iBinderAsBinder = interfaceC3977a.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        C3445p.k(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }

    public static <T> InterfaceC3977a u1(T t10) {
        return new b(t10);
    }
}
