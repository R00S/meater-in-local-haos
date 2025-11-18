package kotlin;

import Ba.p;
import W.c;
import Y.d;
import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: LazyLayoutItemContentFactory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"LC/q;", "itemProvider", "LC/P;", "LY/d;", "saveableStateHolder", "", "index", "", "key", "Loa/F;", "a", "(LC/q;Ljava/lang/Object;ILjava/lang/Object;LO/l;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: C.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0977p {

    /* compiled from: LazyLayoutItemContentFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: C.p$a */
    static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ q f2068B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f2069C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Object f2070D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar, int i10, Object obj) {
            super(2);
            this.f2068B = qVar;
            this.f2069C = i10;
            this.f2070D = obj;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(980966366, i10, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:135)");
            }
            this.f2068B.f(this.f2069C, this.f2070D, interfaceC1554l, 0);
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

    /* compiled from: LazyLayoutItemContentFactory.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: C.p$b */
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ q f2071B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Object f2072C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f2073D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Object f2074E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f2075F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, Object obj, int i10, Object obj2, int i11) {
            super(2);
            this.f2071B = qVar;
            this.f2072C = obj;
            this.f2073D = i10;
            this.f2074E = obj2;
            this.f2075F = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C0977p.a(this.f2071B, this.f2072C, this.f2073D, this.f2074E, interfaceC1554l, C1509K0.a(this.f2075F | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(q qVar, Object obj, int i10, Object obj2, InterfaceC1554l interfaceC1554l, int i11) {
        int i12;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1439843069);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC1554lR.R(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC1554lR.R(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC1554lR.h(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC1554lR.R(obj2) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(1439843069, i12, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:133)");
            }
            ((d) obj).f(obj2, c.d(980966366, true, new a(qVar, i10, obj2), interfaceC1554lR, 54), interfaceC1554lR, 48);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new b(qVar, obj, i10, obj2, i11));
        }
    }
}
