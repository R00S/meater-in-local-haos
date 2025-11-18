package kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10803n;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10322f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10338c0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10353h0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10357i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10379q;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;

/* compiled from: CapturedTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.i.q.a.d */
/* loaded from: classes3.dex */
public final class C10203d {

    /* compiled from: CapturedTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.q.a.d$a */
    static final class a extends Lambda implements Function0<AbstractC10344e0> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10351g1 f39554f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC10351g1 interfaceC10351g1) {
            super(0);
            this.f39554f = interfaceC10351g1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10344e0 invoke() {
            AbstractC10344e0 type = this.f39554f.getType();
            C9801m.m32345e(type, "this@createCapturedIfNeeded.type");
            return type;
        }
    }

    /* compiled from: CapturedTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.q.a.d$b */
    public static final class b extends C10379q {

        /* renamed from: d */
        final /* synthetic */ boolean f39555d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC10360j1 abstractC10360j1, boolean z) {
            super(abstractC10360j1);
            this.f39555d = z;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
        /* renamed from: b */
        public boolean mo36012b() {
            return this.f39555d;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.C10379q, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
        /* renamed from: e */
        public InterfaceC10351g1 mo33536e(AbstractC10344e0 abstractC10344e0) {
            C9801m.m32346f(abstractC10344e0, RoomNotification.KEY);
            InterfaceC10351g1 interfaceC10351g1Mo33536e = super.mo33536e(abstractC10344e0);
            if (interfaceC10351g1Mo33536e == null) {
                return null;
            }
            InterfaceC10594h interfaceC10594hMo32887c = abstractC10344e0.mo35993O0().mo32891w();
            return C10203d.m36006b(interfaceC10351g1Mo33536e, interfaceC10594hMo32887c instanceof InterfaceC10587e1 ? (InterfaceC10587e1) interfaceC10594hMo32887c : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final InterfaceC10351g1 m36006b(InterfaceC10351g1 interfaceC10351g1, InterfaceC10587e1 interfaceC10587e1) {
        if (interfaceC10587e1 == null || interfaceC10351g1.mo36708a() == EnumC10384r1.INVARIANT) {
            return interfaceC10351g1;
        }
        if (interfaceC10587e1.mo37672n() != interfaceC10351g1.mo36708a()) {
            return new C10357i1(m36007c(interfaceC10351g1));
        }
        if (!interfaceC10351g1.mo36710c()) {
            return new C10357i1(interfaceC10351g1.getType());
        }
        InterfaceC10330n interfaceC10330n = C10322f.f40008b;
        C9801m.m32345e(interfaceC10330n, "NO_LOCKS");
        return new C10357i1(new C10353h0(interfaceC10330n, new a(interfaceC10351g1)));
    }

    /* renamed from: c */
    public static final AbstractC10344e0 m36007c(InterfaceC10351g1 interfaceC10351g1) {
        C9801m.m32346f(interfaceC10351g1, "typeProjection");
        return new C10200a(interfaceC10351g1, null, false, null, 14, null);
    }

    /* renamed from: d */
    public static final boolean m36008d(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        return abstractC10344e0.mo35993O0() instanceof InterfaceC10201b;
    }

    /* renamed from: e */
    public static final AbstractC10360j1 m36009e(AbstractC10360j1 abstractC10360j1, boolean z) {
        C9801m.m32346f(abstractC10360j1, "<this>");
        if (!(abstractC10360j1 instanceof C10338c0)) {
            return new b(abstractC10360j1, z);
        }
        C10338c0 c10338c0 = (C10338c0) abstractC10360j1;
        InterfaceC10587e1[] interfaceC10587e1ArrM36594j = c10338c0.m36594j();
        List<Pair> listM38760n0 = C10803n.m38760n0(c10338c0.m36593i(), c10338c0.m36594j());
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38760n0, 10));
        for (Pair pair : listM38760n0) {
            arrayList.add(m36006b((InterfaceC10351g1) pair.m37648c(), (InterfaceC10587e1) pair.m37649d()));
        }
        Object[] array = arrayList.toArray(new InterfaceC10351g1[0]);
        C9801m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new C10338c0(interfaceC10587e1ArrM36594j, (InterfaceC10351g1[]) array, z);
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC10360j1 m36010f(AbstractC10360j1 abstractC10360j1, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return m36009e(abstractC10360j1, z);
    }
}
