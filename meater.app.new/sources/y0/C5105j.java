package y0;

import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: SubcomposeLayout.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: y0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5105j {

    /* renamed from: a, reason: collision with root package name */
    public static final C5105j f53050a = new C5105j();

    /* renamed from: b, reason: collision with root package name */
    public static Ba.p<InterfaceC1554l, Integer, C4153F> f53051b = W.c.b(-1741544742, false, a.f53052B);

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: y0.j$a */
    static final class a extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f53052B = new a();

        a() {
            super(2);
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1741544742, i10, -1, "androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.lambda-1.<anonymous> (SubcomposeLayout.kt:473)");
            }
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public final Ba.p<InterfaceC1554l, Integer, C4153F> a() {
        return f53051b;
    }
}
