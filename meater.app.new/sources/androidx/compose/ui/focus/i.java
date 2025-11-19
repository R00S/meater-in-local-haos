package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.InterfaceC3857n;
import oa.C4153F;
import oa.InterfaceC4160e;

/* compiled from: FocusProperties.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb0/i;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/g;", "Loa/F;", "scope", "a", "(Lb0/i;LBa/l;)Lb0/i;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* compiled from: FocusProperties.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a implements g0.l, InterfaceC3857n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Ba.l f22761a;

        a(Ba.l lVar) {
            this.f22761a = lVar;
        }

        @Override // kotlin.jvm.internal.InterfaceC3857n
        public final InterfaceC4160e<?> a() {
            return this.f22761a;
        }

        @Override // g0.l
        public final /* synthetic */ void b(g gVar) {
            this.f22761a.invoke(gVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof g0.l) && (obj instanceof InterfaceC3857n)) {
                return C3862t.b(a(), ((InterfaceC3857n) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public static final b0.i a(b0.i iVar, Ba.l<? super g, C4153F> lVar) {
        return iVar.e(new FocusPropertiesElement(new a(lVar)));
    }
}
