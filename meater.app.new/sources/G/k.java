package G;

import A0.B;
import A0.C0839s;
import A0.E;
import A0.r;
import A0.v0;
import A0.w0;
import Ba.l;
import F0.x;
import H0.C1060d;
import H0.TextLayoutResult;
import H0.TextStyle;
import H0.o;
import R0.q;
import U0.v;
import b0.i;
import i0.AbstractC3582j0;
import i0.C3602t0;
import i0.InterfaceC3586l0;
import i0.InterfaceC3608w0;
import i0.Shadow;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.InterfaceC3783c;
import kotlin.AbstractC1341l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import y0.AbstractC5096a;
import y0.C5097b;
import y0.H;
import y0.InterfaceC5112q;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: TextStringSimpleNode.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001gBS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010 J\u001f\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b%\u0010\u001dJ@\u0010&\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b&\u0010'J%\u0010+\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\u00020\u001e*\u00020-H\u0016¢\u0006\u0004\b.\u0010/J&\u00106\u001a\u000205*\u0002002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J#\u0010;\u001a\u00020\u000f*\u0002082\u0006\u00102\u001a\u0002092\u0006\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b;\u0010<J#\u0010>\u001a\u00020\u000f*\u0002082\u0006\u00102\u001a\u0002092\u0006\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b>\u0010<J#\u0010?\u001a\u00020\u000f*\u0002082\u0006\u00102\u001a\u0002092\u0006\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010<J#\u0010@\u001a\u00020\u000f*\u0002082\u0006\u00102\u001a\u0002092\u0006\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b@\u0010<J\u0013\u0010B\u001a\u00020\u001e*\u00020AH\u0016¢\u0006\u0004\bB\u0010CR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010KR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010KR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR*\u0010W\u001a\u0010\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u000f\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bT\u0010U\u0012\u0004\bV\u0010 R\u0018\u0010Z\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR*\u0010`\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\\\u0012\u0004\u0012\u00020\r\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010bR\u0014\u0010f\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"LG/k;", "Lb0/i$c;", "LA0/B;", "LA0/r;", "LA0/v0;", "", "text", "LH0/J;", "style", "LL0/l$b;", "fontFamilyResolver", "LR0/q;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Li0/w0;", "overrideColor", "<init>", "(Ljava/lang/String;LH0/J;LL0/l$b;IZIILi0/w0;Lkotlin/jvm/internal/k;)V", "LU0/d;", "density", "LG/f;", "t2", "(LU0/d;)LG/f;", "updatedText", "v2", "(Ljava/lang/String;)Z", "Loa/F;", "q2", "()V", "u2", "color", "w2", "(Li0/w0;LH0/J;)Z", "y2", "x2", "(LH0/J;IIZLL0/l$b;I)Z", "drawChanged", "textChanged", "layoutChanged", "r2", "(ZZZ)V", "LF0/x;", "m1", "(LF0/x;)V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "Ly0/r;", "Ly0/q;", "height", "t", "(Ly0/r;Ly0/q;I)I", "width", "L", "z", "o", "Lk0/c;", "d", "(Lk0/c;)V", "O", "Ljava/lang/String;", "P", "LH0/J;", "Q", "LL0/l$b;", "R", "I", "S", "Z", "T", "U", "V", "Li0/w0;", "", "Ly0/a;", "W", "Ljava/util/Map;", "getBaselineCache$annotations", "baselineCache", "X", "LG/f;", "_layoutCache", "Lkotlin/Function1;", "", "LH0/F;", "Y", "LBa/l;", "semanticsTextLayoutResult", "LG/k$a;", "LG/k$a;", "textSubstitution", "s2", "()LG/f;", "layoutCache", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k extends i.c implements B, r, v0 {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private TextStyle style;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private AbstractC1341l.b fontFamilyResolver;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private InterfaceC3608w0 overrideColor;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private Map<AbstractC5096a, Integer> baselineCache;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private G.f _layoutCache;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private l<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private TextSubstitution textSubstitution;

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LH0/F;", "textLayoutResult", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements l<List<TextLayoutResult>, Boolean> {
        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<TextLayoutResult> list) {
            G.f fVarS2 = k.this.s2();
            TextStyle textStyle = k.this.style;
            InterfaceC3608w0 interfaceC3608w0 = k.this.overrideColor;
            TextLayoutResult textLayoutResultO = fVarS2.o(textStyle.J((16777214 & 1) != 0 ? C3602t0.INSTANCE.e() : interfaceC3608w0 != null ? interfaceC3608w0.a() : C3602t0.INSTANCE.e(), (16777214 & 2) != 0 ? v.INSTANCE.a() : 0L, (16777214 & 4) != 0 ? null : null, (16777214 & 8) != 0 ? null : null, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : null, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : 0L, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? C3602t0.INSTANCE.e() : 0L, (16777214 & 4096) != 0 ? null : null, (16777214 & 8192) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? R0.i.INSTANCE.g() : 0, (16777214 & 65536) != 0 ? R0.k.INSTANCE.f() : 0, (16777214 & 131072) != 0 ? v.INSTANCE.a() : 0L, (16777214 & 262144) != 0 ? null : null, (16777214 & 524288) != 0 ? null : null, (16777214 & 1048576) != 0 ? R0.e.INSTANCE.b() : 0, (16777214 & 2097152) != 0 ? R0.d.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null));
            if (textLayoutResultO != null) {
                list.add(textLayoutResultO);
            } else {
                textLayoutResultO = null;
            }
            return Boolean.valueOf(textLayoutResultO != null);
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH0/d;", "updatedText", "", "a", "(LH0/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements l<C1060d, Boolean> {
        c() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C1060d c1060d) {
            k.this.v2(c1060d.getText());
            k.this.u2();
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements l<Boolean, Boolean> {
        d() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            if (k.this.textSubstitution == null) {
                return Boolean.FALSE;
            }
            TextSubstitution textSubstitution = k.this.textSubstitution;
            if (textSubstitution != null) {
                textSubstitution.e(z10);
            }
            k.this.u2();
            return Boolean.TRUE;
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.a<Boolean> {
        e() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            k.this.q2();
            k.this.u2();
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends AbstractC3864v implements l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Z f4846B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Z z10) {
            super(1);
            this.f4846B = z10;
        }

        public final void a(Z.a aVar) {
            Z.a.h(aVar, this.f4846B, 0, 0, 0.0f, 4, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ k(String str, TextStyle textStyle, AbstractC1341l.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC3608w0 interfaceC3608w0, C3854k c3854k) {
        this(str, textStyle, bVar, i10, z10, i11, i12, interfaceC3608w0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2() {
        this.textSubstitution = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G.f s2() {
        if (this._layoutCache == null) {
            this._layoutCache = new G.f(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        }
        G.f fVar = this._layoutCache;
        C3862t.d(fVar);
        return fVar;
    }

    private final G.f t2(U0.d density) {
        G.f layoutCache;
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution != null && textSubstitution.getIsShowingSubstitution() && (layoutCache = textSubstitution.getLayoutCache()) != null) {
            layoutCache.m(density);
            return layoutCache;
        }
        G.f fVarS2 = s2();
        fVarS2.m(density);
        return fVarS2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u2() {
        w0.b(this);
        E.b(this);
        C0839s.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v2(String updatedText) {
        C4153F c4153f;
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution == null) {
            TextSubstitution textSubstitution2 = new TextSubstitution(this.text, updatedText, false, null, 12, null);
            G.f fVar = new G.f(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
            fVar.m(s2().getDensity());
            textSubstitution2.d(fVar);
            this.textSubstitution = textSubstitution2;
            return true;
        }
        if (C3862t.b(updatedText, textSubstitution.getSubstitution())) {
            return false;
        }
        textSubstitution.f(updatedText);
        G.f layoutCache = textSubstitution.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.p(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
            c4153f = C4153F.f46609a;
        } else {
            c4153f = null;
        }
        return c4153f != null;
    }

    @Override // A0.B
    public int L(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return t2(rVar).f(i10, rVar.getLayoutDirection());
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        G.f fVarT2 = t2(k10);
        boolean zH = fVarT2.h(j10, k10.getLayoutDirection());
        fVarT2.d();
        o paragraph = fVarT2.getParagraph();
        C3862t.d(paragraph);
        long layoutSize = fVarT2.getLayoutSize();
        if (zH) {
            E.a(this);
            Map<AbstractC5096a, Integer> linkedHashMap = this.baselineCache;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>(2);
            }
            linkedHashMap.put(C5097b.a(), Integer.valueOf(Math.round(paragraph.j())));
            linkedHashMap.put(C5097b.b(), Integer.valueOf(Math.round(paragraph.g())));
            this.baselineCache = linkedHashMap;
        }
        Z zT = h10.T(U0.b.INSTANCE.b(U0.r.g(layoutSize), U0.r.g(layoutSize), U0.r.f(layoutSize), U0.r.f(layoutSize)));
        int iG = U0.r.g(layoutSize);
        int iF = U0.r.f(layoutSize);
        Map<AbstractC5096a, Integer> map = this.baselineCache;
        C3862t.d(map);
        return k10.h0(iG, iF, map, new f(zT));
    }

    @Override // A0.r
    public void d(InterfaceC3783c interfaceC3783c) {
        if (getIsAttached()) {
            G.f fVarT2 = t2(interfaceC3783c);
            o paragraph = fVarT2.getParagraph();
            if (paragraph == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this._layoutCache + ", textSubstitution=" + this.textSubstitution + ')').toString());
            }
            InterfaceC3586l0 interfaceC3586l0G = interfaceC3783c.getDrawContext().G();
            boolean didOverflow = fVarT2.getDidOverflow();
            if (didOverflow) {
                float fG = U0.r.g(fVarT2.getLayoutSize());
                float f10 = U0.r.f(fVarT2.getLayoutSize());
                interfaceC3586l0G.h();
                InterfaceC3586l0.g(interfaceC3586l0G, 0.0f, 0.0f, fG, f10, 0, 16, null);
            }
            try {
                R0.j jVarA = this.style.A();
                if (jVarA == null) {
                    jVarA = R0.j.INSTANCE.b();
                }
                R0.j jVar = jVarA;
                Shadow shadowX = this.style.x();
                if (shadowX == null) {
                    shadowX = Shadow.INSTANCE.a();
                }
                Shadow shadow = shadowX;
                k0.g gVarI = this.style.i();
                if (gVarI == null) {
                    gVarI = k0.j.f43725a;
                }
                k0.g gVar = gVarI;
                AbstractC3582j0 abstractC3582j0G = this.style.g();
                if (abstractC3582j0G != null) {
                    o.v(paragraph, interfaceC3586l0G, abstractC3582j0G, this.style.d(), shadow, jVar, gVar, 0, 64, null);
                } else {
                    InterfaceC3608w0 interfaceC3608w0 = this.overrideColor;
                    long jA = interfaceC3608w0 != null ? interfaceC3608w0.a() : C3602t0.INSTANCE.e();
                    if (jA == 16) {
                        jA = this.style.h() != 16 ? this.style.h() : C3602t0.INSTANCE.a();
                    }
                    o.n(paragraph, interfaceC3586l0G, jA, shadow, jVar, gVar, 0, 32, null);
                }
                if (didOverflow) {
                    interfaceC3586l0G.t();
                }
            } catch (Throwable th) {
                if (didOverflow) {
                    interfaceC3586l0G.t();
                }
                throw th;
            }
        }
    }

    @Override // A0.v0
    public void m1(x xVar) {
        l bVar = this.semanticsTextLayoutResult;
        if (bVar == null) {
            bVar = new b();
            this.semanticsTextLayoutResult = bVar;
        }
        F0.v.J(xVar, new C1060d(this.text, null, null, 6, null));
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution != null) {
            F0.v.I(xVar, textSubstitution.getIsShowingSubstitution());
            F0.v.K(xVar, new C1060d(textSubstitution.getSubstitution(), null, null, 6, null));
        }
        F0.v.M(xVar, null, new c(), 1, null);
        F0.v.Q(xVar, null, new d(), 1, null);
        F0.v.d(xVar, null, new e(), 1, null);
        F0.v.l(xVar, null, bVar, 1, null);
    }

    @Override // A0.B
    public int o(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return t2(rVar).f(i10, rVar.getLayoutDirection());
    }

    public final void r2(boolean drawChanged, boolean textChanged, boolean layoutChanged) {
        if (textChanged || layoutChanged) {
            s2().p(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                w0.b(this);
            }
            if (textChanged || layoutChanged) {
                E.b(this);
                C0839s.a(this);
            }
            if (drawChanged) {
                C0839s.a(this);
            }
        }
    }

    @Override // A0.B
    public int t(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return t2(rVar).k(rVar.getLayoutDirection());
    }

    public final boolean w2(InterfaceC3608w0 color, TextStyle style) {
        boolean zB = C3862t.b(color, this.overrideColor);
        this.overrideColor = color;
        return (zB && style.F(this.style)) ? false : true;
    }

    public final boolean x2(TextStyle style, int minLines, int maxLines, boolean softWrap, AbstractC1341l.b fontFamilyResolver, int overflow) {
        boolean z10 = !this.style.G(style);
        this.style = style;
        if (this.minLines != minLines) {
            this.minLines = minLines;
            z10 = true;
        }
        if (this.maxLines != maxLines) {
            this.maxLines = maxLines;
            z10 = true;
        }
        if (this.softWrap != softWrap) {
            this.softWrap = softWrap;
            z10 = true;
        }
        if (!C3862t.b(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z10 = true;
        }
        if (q.e(this.overflow, overflow)) {
            return z10;
        }
        this.overflow = overflow;
        return true;
    }

    public final boolean y2(String text) {
        if (C3862t.b(this.text, text)) {
            return false;
        }
        this.text = text;
        q2();
        return true;
    }

    @Override // A0.B
    public int z(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return t2(rVar).j(rVar.getLayoutDirection());
    }

    private k(String str, TextStyle textStyle, AbstractC1341l.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC3608w0 interfaceC3608w0) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.overrideColor = interfaceC3608w0;
    }

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0013\u0010 \"\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"LG/k$a;", "", "", "original", "substitution", "", "isShowingSubstitution", "LG/f;", "layoutCache", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLG/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOriginal", "b", "f", "(Ljava/lang/String;)V", "c", "Z", "()Z", "e", "(Z)V", "d", "LG/f;", "()LG/f;", "(LG/f;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: G.k$a, reason: from toString */
    public static final /* data */ class TextSubstitution {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String original;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String substitution;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean isShowingSubstitution;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private G.f layoutCache;

        public TextSubstitution(String str, String str2, boolean z10, G.f fVar) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z10;
            this.layoutCache = fVar;
        }

        /* renamed from: a, reason: from getter */
        public final G.f getLayoutCache() {
            return this.layoutCache;
        }

        /* renamed from: b, reason: from getter */
        public final String getSubstitution() {
            return this.substitution;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void d(G.f fVar) {
            this.layoutCache = fVar;
        }

        public final void e(boolean z10) {
            this.isShowingSubstitution = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSubstitution)) {
                return false;
            }
            TextSubstitution textSubstitution = (TextSubstitution) other;
            return C3862t.b(this.original, textSubstitution.original) && C3862t.b(this.substitution, textSubstitution.substitution) && this.isShowingSubstitution == textSubstitution.isShowingSubstitution && C3862t.b(this.layoutCache, textSubstitution.layoutCache);
        }

        public final void f(String str) {
            this.substitution = str;
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            G.f fVar = this.layoutCache;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.layoutCache + ", isShowingSubstitution=" + this.isShowingSubstitution + ')';
        }

        public /* synthetic */ TextSubstitution(String str, String str2, boolean z10, G.f fVar, int i10, C3854k c3854k) {
            this(str, str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : fVar);
        }
    }
}
