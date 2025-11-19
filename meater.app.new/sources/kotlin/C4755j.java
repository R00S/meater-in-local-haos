package kotlin;

import Ba.l;
import kotlin.C4729S;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: AnimationSpec.kt */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a;\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a@\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a1\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"T", "Lv/q;", "V", "Lv/q0;", "data", "b", "(Lv/q0;Ljava/lang/Object;)Lv/q;", "", "durationMillis", "delayMillis", "Lv/D;", "easing", "Lv/p0;", "i", "(IILv/D;)Lv/p0;", "", "dampingRatio", "stiffness", "visibilityThreshold", "Lv/f0;", "g", "(FFLjava/lang/Object;)Lv/f0;", "Lkotlin/Function1;", "Lv/S$b;", "Loa/F;", "init", "Lv/S;", "f", "(LBa/l;)Lv/S;", "Lv/C;", "animation", "Lv/a0;", "repeatMode", "Lv/i0;", "initialStartOffset", "Lv/M;", "d", "(Lv/C;Lv/a0;J)Lv/M;", "Lv/i;", "animationSpec", "", "startDelayNanos", "c", "(Lv/i;J)Lv/i;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4755j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AbstractC4769q> V b(InterfaceC4770q0<T, V> interfaceC4770q0, T t10) {
        if (t10 == null) {
            return null;
        }
        return interfaceC4770q0.a().invoke(t10);
    }

    public static final <T> InterfaceC4753i<T> c(InterfaceC4753i<T> interfaceC4753i, long j10) {
        return new C4750g0(interfaceC4753i, j10);
    }

    public static final <T> C4724M<T> d(InterfaceC4710C<T> interfaceC4710C, EnumC4738a0 enumC4738a0, long j10) {
        return new C4724M<>(interfaceC4710C, enumC4738a0, j10, null);
    }

    public static /* synthetic */ C4724M e(InterfaceC4710C interfaceC4710C, EnumC4738a0 enumC4738a0, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC4738a0 = EnumC4738a0.Restart;
        }
        if ((i10 & 4) != 0) {
            j10 = C4754i0.c(0, 0, 2, null);
        }
        return d(interfaceC4710C, enumC4738a0, j10);
    }

    public static final <T> C4729S<T> f(l<? super C4729S.b<T>, C4153F> lVar) {
        C4729S.b bVar = new C4729S.b();
        lVar.invoke(bVar);
        return new C4729S<>(bVar);
    }

    public static final <T> C4748f0<T> g(float f10, float f11, T t10) {
        return new C4748f0<>(f10, f11, t10);
    }

    public static /* synthetic */ C4748f0 h(float f10, float f11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return g(f10, f11, obj);
    }

    public static final <T> C4768p0<T> i(int i10, int i11, InterfaceC4712D interfaceC4712D) {
        return new C4768p0<>(i10, i11, interfaceC4712D);
    }

    public static /* synthetic */ C4768p0 j(int i10, int i11, InterfaceC4712D interfaceC4712D, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            interfaceC4712D = C4716F.d();
        }
        return i(i10, i11, interfaceC4712D);
    }
}
