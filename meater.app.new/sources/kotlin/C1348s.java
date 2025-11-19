package kotlin;

import Ba.p;
import O0.m;
import Xb.C1841i;
import Xb.F;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.J;
import Xb.K;
import Xb.R0;
import java.util.List;
import kotlin.InterfaceC1329W;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import oa.C4170o;
import oa.C4173r;
import ta.AbstractC4585a;
import ta.InterfaceC4588d;
import ta.g;
import ta.h;
import ua.C4696b;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"LL0/s;", "", "LL0/h;", "asyncTypefaceCache", "Lta/g;", "injectedContext", "<init>", "(LL0/h;Lta/g;)V", "LL0/U;", "typefaceRequest", "LL0/H;", "platformFontLoader", "Lkotlin/Function1;", "LL0/W$b;", "Loa/F;", "onAsyncCompletion", "createDefaultTypeface", "LL0/W;", "a", "(LL0/U;LL0/H;LBa/l;LBa/l;)LL0/W;", "LL0/h;", "LXb/I;", "b", "LXb/I;", "asyncLoadScope", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1348s {

    /* renamed from: d, reason: collision with root package name */
    public static final int f9043d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final C1351v f9044e = new C1351v();

    /* renamed from: f, reason: collision with root package name */
    private static final F f9045f = new c(F.INSTANCE);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C1337h asyncTypefaceCache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private I asyncLoadScope;

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {153}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: L0.s$b */
    static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f9048B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1336g f9049C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1336g c1336g, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f9049C = c1336g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new b(this.f9049C, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f9048B;
            if (i10 == 0) {
                C4173r.b(obj);
                C1336g c1336g = this.f9049C;
                this.f9048B = 1;
                if (c1336g.j(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    public C1348s(C1337h c1337h, g gVar) {
        this.asyncTypefaceCache = c1337h;
        this.asyncLoadScope = J.a(f9045f.s(m.a()).s(gVar).s(R0.a((InterfaceC1867v0) gVar.b(InterfaceC1867v0.INSTANCE))));
    }

    public InterfaceC1329W a(TypefaceRequest typefaceRequest, InterfaceC1315H platformFontLoader, Ba.l<? super InterfaceC1329W.b, C4153F> onAsyncCompletion, Ba.l<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        C4170o c4170oB = C1349t.b(f9044e.a(((FontListFontFamily) typefaceRequest.getFontFamily()).w(), typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, createDefaultTypeface);
        List list = (List) c4170oB.a();
        Object objB = c4170oB.b();
        if (list == null) {
            return new InterfaceC1329W.b(objB, false, 2, null);
        }
        C1336g c1336g = new C1336g(list, objB, typefaceRequest, this.asyncTypefaceCache, onAsyncCompletion, platformFontLoader);
        C1841i.d(this.asyncLoadScope, null, K.f19033E, new b(c1336g, null), 1, null);
        return new InterfaceC1329W.a(c1336g);
    }

    public /* synthetic */ C1348s(C1337h c1337h, g gVar, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? new C1337h() : c1337h, (i10 & 2) != 0 ? h.f50000B : gVar);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"L0/s$c", "Lta/a;", "LXb/F;", "Lta/g;", "context", "", "exception", "Loa/F;", "y", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L0.s$c */
    public static final class c extends AbstractC4585a implements F {
        public c(F.Companion companion) {
            super(companion);
        }

        @Override // Xb.F
        public void y(g context, Throwable exception) {
        }
    }
}
