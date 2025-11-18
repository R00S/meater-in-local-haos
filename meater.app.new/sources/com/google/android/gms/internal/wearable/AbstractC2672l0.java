package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.AbstractC2672l0;
import com.google.android.gms.internal.wearable.C2663i0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2672l0<MessageType extends AbstractC2672l0<MessageType, BuilderType>, BuilderType extends C2663i0<MessageType, BuilderType>> extends C<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C2673l1 zzc = C2673l1.c();

    private final int B(Z0 z02) {
        return W0.a().b(getClass()).b(this);
    }

    static AbstractC2672l0 j(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        AbstractC2672l0 abstractC2672l0 = (AbstractC2672l0) map.get(cls);
        if (abstractC2672l0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2672l0 = (AbstractC2672l0) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2672l0 == null) {
            abstractC2672l0 = (AbstractC2672l0) ((AbstractC2672l0) C2690r1.j(cls)).g(6, null, null);
            if (abstractC2672l0 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, abstractC2672l0);
        }
        return abstractC2672l0;
    }

    protected static InterfaceC2681o0 o() {
        return C2657g0.h();
    }

    protected static InterfaceC2684p0 p() {
        return C0.h();
    }

    protected static InterfaceC2687q0 q() {
        return X0.f();
    }

    protected static InterfaceC2687q0 r(InterfaceC2687q0 interfaceC2687q0) {
        int size = interfaceC2687q0.size();
        return interfaceC2687q0.C(size + size);
    }

    static Object s(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object t(N0 n02, String str, Object[] objArr) {
        return new Y0(n02, str, objArr);
    }

    protected static void w(Class cls, AbstractC2672l0 abstractC2672l0) {
        abstractC2672l0.v();
        zzb.put(cls, abstractC2672l0);
    }

    protected static final boolean y(AbstractC2672l0 abstractC2672l0, boolean z10) {
        byte bByteValue = ((Byte) abstractC2672l0.g(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zE = W0.a().b(abstractC2672l0.getClass()).e(abstractC2672l0);
        if (z10) {
            abstractC2672l0.g(2, true != zE ? null : abstractC2672l0, null);
        }
        return zE;
    }

    final boolean A() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.wearable.C
    final int a(Z0 z02) {
        if (A()) {
            int iB = z02.b(this);
            if (iB >= 0) {
                return iB;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iB);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iB2 = z02.b(this);
        if (iB2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iB2;
            return iB2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iB2);
    }

    @Override // com.google.android.gms.internal.wearable.N0
    public final int b() {
        int iB;
        if (A()) {
            iB = B(null);
            if (iB < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iB);
            }
        } else {
            iB = this.zzd & Integer.MAX_VALUE;
            if (iB == Integer.MAX_VALUE) {
                iB = B(null);
                if (iB < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iB);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iB;
            }
        }
        return iB;
    }

    @Override // com.google.android.gms.internal.wearable.N0
    public final void c(W w10) {
        W0.a().b(getClass()).a(this, X.L(w10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return W0.a().b(getClass()).g(this, (AbstractC2672l0) obj);
    }

    protected abstract Object g(int i10, Object obj, Object obj2);

    final int h() {
        return W0.a().b(getClass()).c(this);
    }

    public final int hashCode() {
        if (A()) {
            return h();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iH = h();
        this.zza = iH;
        return iH;
    }

    protected final C2663i0 i() {
        return (C2663i0) g(5, null, null);
    }

    final AbstractC2672l0 k() {
        return (AbstractC2672l0) g(4, null, null);
    }

    @Override // com.google.android.gms.internal.wearable.O0
    public final boolean l() {
        return y(this, true);
    }

    @Override // com.google.android.gms.internal.wearable.N0
    public final /* synthetic */ M0 m() {
        return (C2663i0) g(5, null, null);
    }

    @Override // com.google.android.gms.internal.wearable.O0
    public final /* synthetic */ N0 n() {
        return (AbstractC2672l0) g(6, null, null);
    }

    public final String toString() {
        return P0.a(this, super.toString());
    }

    protected final void u() {
        W0.a().b(getClass()).d(this);
        v();
    }

    final void v() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void x(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }
}
