package kc;

import Ba.l;
import Ub.n;
import kc.k;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: SerialDescriptors.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "serialName", "Lkc/j;", "kind", "", "Lkc/f;", "typeParameters", "Lkotlin/Function1;", "Lkc/a;", "Loa/F;", "builder", "a", "(Ljava/lang/String;Lkc/j;[Lkc/f;LBa/l;)Lkc/f;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SerialDescriptors.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkc/a;", "Loa/F;", "a", "(Lkc/a;)V"}, k = 3, mv = {1, 9, 0})
    public static final class a extends AbstractC3864v implements l<C3817a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f43916B = new a();

        a() {
            super(1);
        }

        public final void a(C3817a c3817a) {
            C3862t.g(c3817a, "$this$null");
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C3817a c3817a) {
            a(c3817a);
            return C4153F.f46609a;
        }
    }

    public static final f a(String serialName, j kind, f[] typeParameters, l<? super C3817a, C4153F> builder) {
        C3862t.g(serialName, "serialName");
        C3862t.g(kind, "kind");
        C3862t.g(typeParameters, "typeParameters");
        C3862t.g(builder, "builder");
        if (n.a0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (C3862t.b(kind, k.a.f43919a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C3817a c3817a = new C3817a(serialName);
        builder.invoke(c3817a);
        return new g(serialName, kind, c3817a.f().size(), C3831l.I0(typeParameters), c3817a);
    }

    public static /* synthetic */ f b(String str, j jVar, f[] fVarArr, l lVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            lVar = a.f43916B;
        }
        return a(str, jVar, fVarArr, lVar);
    }
}
