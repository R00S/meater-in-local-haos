package kotlin.reflect.p371y.internal.p374j0.p415l;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.List;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;

/* compiled from: TypeSubstitution.kt */
/* renamed from: kotlin.f0.y.e.j0.l.c0 */
/* loaded from: classes3.dex */
public final class C10338c0 extends AbstractC10360j1 {

    /* renamed from: c */
    private final InterfaceC10587e1[] f40044c;

    /* renamed from: d */
    private final InterfaceC10351g1[] f40045d;

    /* renamed from: e */
    private final boolean f40046e;

    public /* synthetic */ C10338c0(InterfaceC10587e1[] interfaceC10587e1Arr, InterfaceC10351g1[] interfaceC10351g1Arr, boolean z, int i2, C9789g c9789g) {
        this(interfaceC10587e1Arr, interfaceC10351g1Arr, (i2 & 4) != 0 ? false : z);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: b */
    public boolean mo36012b() {
        return this.f40046e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: e */
    public InterfaceC10351g1 mo33536e(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, RoomNotification.KEY);
        InterfaceC10594h interfaceC10594hMo32887c = abstractC10344e0.mo35993O0().mo32887c();
        InterfaceC10587e1 interfaceC10587e1 = interfaceC10594hMo32887c instanceof InterfaceC10587e1 ? (InterfaceC10587e1) interfaceC10594hMo32887c : null;
        if (interfaceC10587e1 == null) {
            return null;
        }
        int iMo37670g = interfaceC10587e1.mo37670g();
        InterfaceC10587e1[] interfaceC10587e1Arr = this.f40044c;
        if (iMo37670g >= interfaceC10587e1Arr.length || !C9801m.m32341a(interfaceC10587e1Arr[iMo37670g].mo32877h(), interfaceC10587e1.mo32877h())) {
            return null;
        }
        return this.f40045d[iMo37670g];
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: f */
    public boolean mo33537f() {
        return this.f40045d.length == 0;
    }

    /* renamed from: i */
    public final InterfaceC10351g1[] m36593i() {
        return this.f40045d;
    }

    /* renamed from: j */
    public final InterfaceC10587e1[] m36594j() {
        return this.f40044c;
    }

    public C10338c0(InterfaceC10587e1[] interfaceC10587e1Arr, InterfaceC10351g1[] interfaceC10351g1Arr, boolean z) {
        C9801m.m32346f(interfaceC10587e1Arr, "parameters");
        C9801m.m32346f(interfaceC10351g1Arr, "arguments");
        this.f40044c = interfaceC10587e1Arr;
        this.f40045d = interfaceC10351g1Arr;
        this.f40046e = z;
        int length = interfaceC10587e1Arr.length;
        int length2 = interfaceC10351g1Arr.length;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10338c0(List<? extends InterfaceC10587e1> list, List<? extends InterfaceC10351g1> list2) {
        C9801m.m32346f(list, "parameters");
        C9801m.m32346f(list2, "argumentsList");
        Object[] array = list.toArray(new InterfaceC10587e1[0]);
        C9801m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        InterfaceC10587e1[] interfaceC10587e1Arr = (InterfaceC10587e1[]) array;
        Object[] array2 = list2.toArray(new InterfaceC10351g1[0]);
        C9801m.m32344d(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this(interfaceC10587e1Arr, (InterfaceC10351g1[]) array2, false, 4, null);
    }
}
