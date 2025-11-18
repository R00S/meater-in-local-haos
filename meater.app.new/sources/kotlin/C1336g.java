package kotlin;

import Ba.l;
import Ba.p;
import Xb.I;
import java.util.List;
import kotlin.InterfaceC1329W;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.r1;
import kotlin.x1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R+\u0010(\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"LL0/g;", "LO/x1;", "", "", "LL0/k;", "fontList", "initialType", "LL0/U;", "typefaceRequest", "LL0/h;", "asyncTypefaceCache", "Lkotlin/Function1;", "LL0/W$b;", "Loa/F;", "onCompletion", "LL0/H;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;LL0/U;LL0/h;LBa/l;LL0/H;)V", "j", "(Lta/d;)Ljava/lang/Object;", "p", "(LL0/k;Lta/d;)Ljava/lang/Object;", "B", "Ljava/util/List;", "C", "LL0/U;", "D", "LL0/h;", "E", "LBa/l;", "F", "LL0/H;", "<set-?>", "G", "LO/p0;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "H", "Z", "i", "()Z", "setCacheable$ui_text_release", "(Z)V", "cacheable", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1336g implements x1<Object> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC1340k> fontList;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final TypefaceRequest typefaceRequest;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final C1337h asyncTypefaceCache;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final l<InterfaceC1329W.b, C4153F> onCompletion;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1315H platformFontLoader;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 value;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private boolean cacheable = true;

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @f(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {272, 285}, m = "load")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L0.g$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f8990B;

        /* renamed from: C, reason: collision with root package name */
        Object f8991C;

        /* renamed from: D, reason: collision with root package name */
        Object f8992D;

        /* renamed from: E, reason: collision with root package name */
        int f8993E;

        /* renamed from: F, reason: collision with root package name */
        int f8994F;

        /* renamed from: G, reason: collision with root package name */
        /* synthetic */ Object f8995G;

        /* renamed from: I, reason: collision with root package name */
        int f8997I;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8995G = obj;
            this.f8997I |= Integer.MIN_VALUE;
            return C1336g.this.j(this);
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {273}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L0.g$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements l<InterfaceC4588d<? super Object>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f8998B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC1340k f9000D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1340k interfaceC1340k, InterfaceC4588d<? super b> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f9000D = interfaceC1340k;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<Object> interfaceC4588d) {
            return ((b) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return C1336g.this.new b(this.f9000D, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f8998B;
            if (i10 == 0) {
                C4173r.b(obj);
                C1336g c1336g = C1336g.this;
                InterfaceC1340k interfaceC1340k = this.f9000D;
                this.f8998B = 1;
                obj = c1336g.p(interfaceC1340k, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @f(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {304}, m = "loadWithTimeoutOrNull$ui_text_release")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L0.g$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f9001B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f9002C;

        /* renamed from: E, reason: collision with root package name */
        int f9004E;

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9002C = obj;
            this.f9004E |= Integer.MIN_VALUE;
            return C1336g.this.p(null, this);
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {305}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "", "<anonymous>", "(LXb/I;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: L0.g$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super Object>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f9005B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC1340k f9007D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC1340k interfaceC1340k, InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f9007D = interfaceC1340k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return C1336g.this.new d(this.f9007D, interfaceC4588d);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(I i10, InterfaceC4588d<Object> interfaceC4588d) {
            return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f9005B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC1315H interfaceC1315H = C1336g.this.platformFontLoader;
                InterfaceC1340k interfaceC1340k = this.f9007D;
                this.f9005B = 1;
                obj = interfaceC1315H.a(interfaceC1340k, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return obj;
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Object invoke(I i10, InterfaceC4588d<? super Object> interfaceC4588d) {
            return invoke2(i10, (InterfaceC4588d<Object>) interfaceC4588d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1336g(List<? extends InterfaceC1340k> list, Object obj, TypefaceRequest typefaceRequest, C1337h c1337h, l<? super InterfaceC1329W.b, C4153F> lVar, InterfaceC1315H interfaceC1315H) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = c1337h;
        this.onCompletion = lVar;
        this.platformFontLoader = interfaceC1315H;
        this.value = r1.c(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.value.setValue(obj);
    }

    @Override // kotlin.x1
    public Object getValue() {
        return this.value.getValue();
    }

    /* renamed from: i, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00be, B:40:0x00f5), top: B:53:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5 A[Catch: all -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00be, B:40:0x00f5), top: B:53:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0108 -> B:44:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x010d -> B:46:0x010f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(ta.InterfaceC4588d<? super oa.C4153F> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1336g.j(ta.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(kotlin.InterfaceC1340k r7, ta.InterfaceC4588d<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlin.C1336g.c
            if (r0 == 0) goto L13
            r0 = r8
            L0.g$c r0 = (kotlin.C1336g.c) r0
            int r1 = r0.f9004E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9004E = r1
            goto L18
        L13:
            L0.g$c r0 = new L0.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f9002C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f9004E
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f9001B
            L0.k r7 = (kotlin.InterfaceC1340k) r7
            oa.C4173r.b(r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            goto L4f
        L2e:
            r8 = move-exception
            goto L51
        L30:
            r7 = move-exception
            goto L7d
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            oa.C4173r.b(r8)
            L0.g$d r8 = new L0.g$d     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r8.<init>(r7, r4)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.f9001B = r7     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.f9004E = r3     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = Xb.V0.c(r2, r8, r0)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            if (r8 != r1) goto L4f
            return r1
        L4f:
            r4 = r8
            goto L87
        L51:
            ta.g r1 = r0.getContext()
            Xb.F$a r2 = Xb.F.INSTANCE
            ta.g$b r1 = r1.b(r2)
            Xb.F r1 = (Xb.F) r1
            if (r1 == 0) goto L87
            ta.g r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.y(r0, r2)
            goto L87
        L7d:
            ta.g r8 = r0.getContext()
            boolean r8 = Xb.C1873y0.q(r8)
            if (r8 == 0) goto L88
        L87:
            return r4
        L88:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1336g.p(L0.k, ta.d):java.lang.Object");
    }
}
