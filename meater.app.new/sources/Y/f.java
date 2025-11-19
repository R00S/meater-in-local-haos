package Y;

import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: SaveableStateHolder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"LY/d;", "a", "(LO/l;I)LY/d;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LY/e;", "a", "()LY/e;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<e> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f19172B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return new e(null, 1, null);
        }
    }

    public static final d a(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(15454635, i10, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:60)");
        }
        interfaceC1554l.S(-796080049);
        e eVar = (e) b.c(new Object[0], e.INSTANCE.a(), null, a.f19172B, interfaceC1554l, 3072, 4);
        eVar.i((g) interfaceC1554l.o(i.d()));
        interfaceC1554l.I();
        if (C1560o.J()) {
            C1560o.R();
        }
        return eVar;
    }
}
