package kotlin;

import Ba.l;
import kotlin.AbstractC1341l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.x1;
import oa.C4153F;

/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"LL0/n;", "LL0/l$b;", "LL0/H;", "platformFontLoader", "LL0/I;", "platformResolveInterceptor", "LL0/V;", "typefaceRequestCache", "LL0/s;", "fontListFontFamilyTypefaceAdapter", "LL0/G;", "platformFamilyTypefaceAdapter", "<init>", "(LL0/H;LL0/I;LL0/V;LL0/s;LL0/G;)V", "LL0/U;", "typefaceRequest", "LO/x1;", "", "h", "(LL0/U;)LO/x1;", "LL0/l;", "fontFamily", "LL0/B;", "fontWeight", "LL0/w;", "fontStyle", "LL0/x;", "fontSynthesis", "b", "(LL0/l;LL0/B;II)LO/x1;", "a", "LL0/H;", "g", "()LL0/H;", "LL0/I;", "c", "LL0/V;", "d", "LL0/s;", "e", "LL0/G;", "Lkotlin/Function1;", "f", "LBa/l;", "createDefaultTypeface", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1343n implements AbstractC1341l.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1315H platformFontLoader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1316I platformResolveInterceptor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C1328V typefaceRequestCache;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C1348s fontListFontFamilyTypefaceAdapter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C1314G platformFamilyTypefaceAdapter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l<TypefaceRequest, Object> createDefaultTypeface;

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL0/U;", "it", "", "a", "(LL0/U;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: L0.n$a */
    static final class a extends AbstractC3864v implements l<TypefaceRequest, Object> {
        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TypefaceRequest typefaceRequest) {
            return C1343n.this.h(TypefaceRequest.b(typefaceRequest, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "LL0/W;", "Loa/F;", "onAsyncCompletion", "a", "(LBa/l;)LL0/W;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: L0.n$b, reason: from Kotlin metadata */
    static final class Function1 extends AbstractC3864v implements l<l<? super InterfaceC1329W, ? extends C4153F>, InterfaceC1329W> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ TypefaceRequest f9038C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Function1(TypefaceRequest typefaceRequest) {
            super(1);
            this.f9038C = typefaceRequest;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1329W invoke(l<? super InterfaceC1329W, C4153F> lVar) {
            InterfaceC1329W interfaceC1329WA = C1343n.this.fontListFontFamilyTypefaceAdapter.a(this.f9038C, C1343n.this.getPlatformFontLoader(), lVar, C1343n.this.createDefaultTypeface);
            if (interfaceC1329WA == null && (interfaceC1329WA = C1343n.this.platformFamilyTypefaceAdapter.a(this.f9038C, C1343n.this.getPlatformFontLoader(), lVar, C1343n.this.createDefaultTypeface)) == null) {
                throw new IllegalStateException("Could not load font");
            }
            return interfaceC1329WA;
        }
    }

    public C1343n(InterfaceC1315H interfaceC1315H, InterfaceC1316I interfaceC1316I, C1328V c1328v, C1348s c1348s, C1314G c1314g) {
        this.platformFontLoader = interfaceC1315H;
        this.platformResolveInterceptor = interfaceC1316I;
        this.typefaceRequestCache = c1328v;
        this.fontListFontFamilyTypefaceAdapter = c1348s;
        this.platformFamilyTypefaceAdapter = c1314g;
        this.createDefaultTypeface = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x1<Object> h(TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.c(typefaceRequest, new Function1(typefaceRequest));
    }

    @Override // kotlin.AbstractC1341l.b
    public x1<Object> b(AbstractC1341l fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis) {
        return h(new TypefaceRequest(this.platformResolveInterceptor.b(fontFamily), this.platformResolveInterceptor.a(fontWeight), this.platformResolveInterceptor.c(fontStyle), this.platformResolveInterceptor.d(fontSynthesis), this.platformFontLoader.getCacheKey(), null));
    }

    /* renamed from: g, reason: from getter */
    public final InterfaceC1315H getPlatformFontLoader() {
        return this.platformFontLoader;
    }

    public /* synthetic */ C1343n(InterfaceC1315H interfaceC1315H, InterfaceC1316I interfaceC1316I, C1328V c1328v, C1348s c1348s, C1314G c1314g, int i10, C3854k c3854k) {
        this(interfaceC1315H, (i10 & 2) != 0 ? InterfaceC1316I.INSTANCE.a() : interfaceC1316I, (i10 & 4) != 0 ? C1344o.b() : c1328v, (i10 & 8) != 0 ? new C1348s(C1344o.a(), null, 2, 0 == true ? 1 : 0) : c1348s, (i10 & 16) != 0 ? new C1314G() : c1314g);
    }
}
