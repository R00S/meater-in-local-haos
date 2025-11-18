package H0;

import h0.C3478i;
import i0.AbstractC3582j0;
import i0.C3561Y;
import i0.InterfaceC3586l0;
import i0.R0;
import i0.Shadow;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;

/* compiled from: MultiParagraph.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJP\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 JX\u0010%\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020#¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020/2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b0\u00101J*\u00107\u001a\u0002042\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\b\b\u0001\u00106\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u0002092\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u0002092\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b<\u0010;J\u0015\u0010=\u001a\u00020/2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b=\u00101J\u0015\u0010>\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bB\u0010AJ\u0015\u0010C\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bC\u0010AJ\u0015\u0010D\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bD\u0010AJ\u0015\u0010E\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bE\u0010?J\u001f\u0010G\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010F\u001a\u00020\b¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010S\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b<\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010W\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b0\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010Y\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b=\u0010T\u001a\u0004\bX\u0010VR\u0017\u0010[\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bZ\u0010OR\u001f\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R \u0010d\u001a\b\u0012\u0004\u0012\u00020b0\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010^\u001a\u0004\bc\u0010`R\u0014\u0010g\u001a\u00020e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010fR\u0011\u0010h\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b]\u0010VR\u0011\u0010j\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bi\u0010V\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006k"}, d2 = {"LH0/j;", "", "LH0/k;", "intrinsics", "LU0/b;", "constraints", "", "maxLines", "", "ellipsis", "<init>", "(LH0/k;JIZLkotlin/jvm/internal/k;)V", "offset", "Loa/F;", "C", "(I)V", "D", "lineIndex", "E", "Li0/l0;", "canvas", "Li0/t0;", "color", "Li0/b1;", "shadow", "LR0/j;", "decoration", "Lk0/g;", "drawStyle", "Li0/b0;", "blendMode", "y", "(Li0/l0;JLi0/b1;LR0/j;Lk0/g;I)V", "Li0/j0;", "brush", "", "alpha", "A", "(Li0/l0;Li0/j0;FLi0/b1;LR0/j;Lk0/g;I)V", "start", "end", "Li0/R0;", "v", "(II)Li0/R0;", "vertical", "o", "(F)I", "Lh0/i;", "d", "(I)Lh0/i;", "LH0/H;", "range", "", "array", "arrayStart", "a", "(J[FI)[F", "LR0/h;", "t", "(I)LR0/h;", "c", "e", "n", "(I)I", "p", "(I)F", "q", "s", "k", "r", "visibleEnd", "m", "(IZ)I", "LH0/k;", "i", "()LH0/k;", "b", "I", "getMaxLines", "()I", "Z", "f", "()Z", "didExceedMaxLines", "F", "x", "()F", "width", "h", "height", "l", "lineCount", "", "g", "Ljava/util/List;", "w", "()Ljava/util/List;", "placeholderRects", "LH0/p;", "u", "paragraphInfoList", "LH0/d;", "()LH0/d;", "annotatedString", "firstBaseline", "j", "lastBaseline", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1066j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C1067k intrinsics;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float height;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int lineCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<C3478i> placeholderRects;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<ParagraphInfo> paragraphInfoList;

    /* compiled from: MultiParagraph.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH0/p;", "paragraphInfo", "Loa/F;", "a", "(LH0/p;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.j$a */
    static final class a extends AbstractC3864v implements Ba.l<ParagraphInfo, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ long f5405B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ float[] f5406C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M f5407D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f5408E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, float[] fArr, kotlin.jvm.internal.M m10, kotlin.jvm.internal.L l10) {
            super(1);
            this.f5405B = j10;
            this.f5406C = fArr;
            this.f5407D = m10;
            this.f5408E = l10;
        }

        public final void a(ParagraphInfo pVar) {
            long j10 = this.f5405B;
            float[] fArr = this.f5406C;
            kotlin.jvm.internal.M m10 = this.f5407D;
            kotlin.jvm.internal.L l10 = this.f5408E;
            long jB = I.b(pVar.n(pVar.getStartIndex() > H.j(j10) ? pVar.getStartIndex() : H.j(j10)), pVar.n(pVar.getEndIndex() < H.i(j10) ? pVar.getEndIndex() : H.i(j10)));
            pVar.getParagraph().d(jB, fArr, m10.f43976B);
            int iH = m10.f43976B + (H.h(jB) * 4);
            for (int i10 = m10.f43976B; i10 < iH; i10 += 4) {
                int i11 = i10 + 1;
                float f10 = fArr[i11];
                float f11 = l10.f43975B;
                fArr[i11] = f10 + f11;
                int i12 = i10 + 3;
                fArr[i12] = fArr[i12] + f11;
            }
            m10.f43976B = iH;
            l10.f43975B += pVar.getParagraph().a();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(ParagraphInfo pVar) {
            a(pVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: MultiParagraph.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH0/p;", "paragraphInfo", "Loa/F;", "a", "(LH0/p;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.j$b */
    static final class b extends AbstractC3864v implements Ba.l<ParagraphInfo, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ R0 f5409B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f5410C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f5411D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(R0 r02, int i10, int i11) {
            super(1);
            this.f5409B = r02;
            this.f5410C = i10;
            this.f5411D = i11;
        }

        public final void a(ParagraphInfo pVar) {
            R0.k(this.f5409B, pVar.j(pVar.getParagraph().y(pVar.n(this.f5410C), pVar.n(this.f5411D))), 0L, 2, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(ParagraphInfo pVar) {
            a(pVar);
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ C1066j(C1067k c1067k, long j10, int i10, boolean z10, C3854k c3854k) {
        this(c1067k, j10, i10, z10);
    }

    private final void C(int offset) {
        if (offset < 0 || offset >= b().getText().length()) {
            throw new IllegalArgumentException(("offset(" + offset + ") is out of bounds [0, " + b().length() + ')').toString());
        }
    }

    private final void D(int offset) {
        if (offset < 0 || offset > b().getText().length()) {
            throw new IllegalArgumentException(("offset(" + offset + ") is out of bounds [0, " + b().length() + ']').toString());
        }
    }

    private final void E(int lineIndex) {
        if (lineIndex < 0 || lineIndex >= this.lineCount) {
            throw new IllegalArgumentException(("lineIndex(" + lineIndex + ") is out of bounds [0, " + this.lineCount + ')').toString());
        }
    }

    private final C1060d b() {
        return this.intrinsics.getAnnotatedString();
    }

    public final void A(InterfaceC3586l0 canvas, AbstractC3582j0 brush, float alpha, Shadow shadow, R0.j decoration, k0.g drawStyle, int blendMode) {
        O0.b.a(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    public final float[] a(long range, float[] array, int arrayStart) {
        C(H.j(range));
        D(H.i(range));
        kotlin.jvm.internal.M m10 = new kotlin.jvm.internal.M();
        m10.f43976B = arrayStart;
        C1069m.d(this.paragraphInfoList, range, new a(range, array, m10, new kotlin.jvm.internal.L()));
        return array;
    }

    public final R0.h c(int offset) {
        D(offset);
        ParagraphInfo pVar = this.paragraphInfoList.get(offset == b().length() ? kotlin.collections.r.o(this.paragraphInfoList) : C1069m.a(this.paragraphInfoList, offset));
        return pVar.getParagraph().l(pVar.n(offset));
    }

    public final C3478i d(int offset) {
        C(offset);
        ParagraphInfo pVar = this.paragraphInfoList.get(C1069m.a(this.paragraphInfoList, offset));
        return pVar.i(pVar.getParagraph().o(pVar.n(offset)));
    }

    public final C3478i e(int offset) {
        D(offset);
        ParagraphInfo pVar = this.paragraphInfoList.get(offset == b().length() ? kotlin.collections.r.o(this.paragraphInfoList) : C1069m.a(this.paragraphInfoList, offset));
        return pVar.i(pVar.getParagraph().h(pVar.n(offset)));
    }

    /* renamed from: f, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float g() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().j();
    }

    /* renamed from: h, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: i, reason: from getter */
    public final C1067k getIntrinsics() {
        return this.intrinsics;
    }

    public final float j() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo pVar = (ParagraphInfo) kotlin.collections.r.u0(this.paragraphInfoList);
        return pVar.m(pVar.getParagraph().g());
    }

    public final float k(int lineIndex) {
        E(lineIndex);
        ParagraphInfo pVar = this.paragraphInfoList.get(C1069m.b(this.paragraphInfoList, lineIndex));
        return pVar.m(pVar.getParagraph().m(pVar.o(lineIndex)));
    }

    /* renamed from: l, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final int m(int lineIndex, boolean visibleEnd) {
        E(lineIndex);
        ParagraphInfo pVar = this.paragraphInfoList.get(C1069m.b(this.paragraphInfoList, lineIndex));
        return pVar.k(pVar.getParagraph().r(pVar.o(lineIndex), visibleEnd));
    }

    public final int n(int offset) {
        ParagraphInfo pVar = this.paragraphInfoList.get(offset >= b().length() ? kotlin.collections.r.o(this.paragraphInfoList) : offset < 0 ? 0 : C1069m.a(this.paragraphInfoList, offset));
        return pVar.l(pVar.getParagraph().i(pVar.n(offset)));
    }

    public final int o(float vertical) {
        ParagraphInfo pVar = this.paragraphInfoList.get(C1069m.c(this.paragraphInfoList, vertical));
        return pVar.d() == 0 ? pVar.getStartLineIndex() : pVar.l(pVar.getParagraph().x(pVar.p(vertical)));
    }

    public final float p(int lineIndex) {
        E(lineIndex);
        ParagraphInfo pVar = this.paragraphInfoList.get(C1069m.b(this.paragraphInfoList, lineIndex));
        return pVar.getParagraph().z(pVar.o(lineIndex));
    }

    public final float q(int lineIndex) {
        E(lineIndex);
        ParagraphInfo pVar = this.paragraphInfoList.get(C1069m.b(this.paragraphInfoList, lineIndex));
        return pVar.getParagraph().t(pVar.o(lineIndex));
    }

    public final int r(int lineIndex) {
        E(lineIndex);
        ParagraphInfo pVar = this.paragraphInfoList.get(C1069m.b(this.paragraphInfoList, lineIndex));
        return pVar.k(pVar.getParagraph().q(pVar.o(lineIndex)));
    }

    public final float s(int lineIndex) {
        E(lineIndex);
        ParagraphInfo pVar = this.paragraphInfoList.get(C1069m.b(this.paragraphInfoList, lineIndex));
        return pVar.m(pVar.getParagraph().f(pVar.o(lineIndex)));
    }

    public final R0.h t(int offset) {
        D(offset);
        ParagraphInfo pVar = this.paragraphInfoList.get(offset == b().length() ? kotlin.collections.r.o(this.paragraphInfoList) : C1069m.a(this.paragraphInfoList, offset));
        return pVar.getParagraph().e(pVar.n(offset));
    }

    public final List<ParagraphInfo> u() {
        return this.paragraphInfoList;
    }

    public final R0 v(int start, int end) {
        if (start >= 0 && start <= end && end <= b().getText().length()) {
            if (start == end) {
                return C3561Y.a();
            }
            R0 r0A = C3561Y.a();
            C1069m.d(this.paragraphInfoList, I.b(start, end), new b(r0A, start, end));
            return r0A;
        }
        throw new IllegalArgumentException(("Start(" + start + ") or End(" + end + ") is out of range [0.." + b().getText().length() + "), or start > end!").toString());
    }

    public final List<C3478i> w() {
        return this.placeholderRects;
    }

    /* renamed from: x, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final void y(InterfaceC3586l0 canvas, long color, Shadow shadow, R0.j decoration, k0.g drawStyle, int blendMode) {
        canvas.h();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ParagraphInfo pVar = list.get(i10);
            pVar.getParagraph().u(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.b(0.0f, pVar.getParagraph().a());
        }
        canvas.t();
    }

    private C1066j(C1067k c1067k, long j10, int i10, boolean z10) {
        boolean z11;
        this.intrinsics = c1067k;
        this.maxLines = i10;
        if (U0.b.n(j10) != 0 || U0.b.m(j10) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> listF = c1067k.f();
        int size = listF.size();
        int i11 = 0;
        int i12 = 0;
        float f10 = 0.0f;
        int i13 = 0;
        while (i13 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = listF.get(i13);
            o oVarC = t.c(paragraphIntrinsicInfo.getIntrinsics(), U0.c.b(0, U0.b.l(j10), 0, U0.b.g(j10) ? Ha.g.d(U0.b.k(j10) - t.d(f10), i11) : U0.b.k(j10), 5, null), this.maxLines - i12, z10);
            float fA = f10 + oVarC.a();
            int iS = i12 + oVarC.s();
            List<ParagraphIntrinsicInfo> list = listF;
            arrayList.add(new ParagraphInfo(oVarC, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i12, iS, f10, fA));
            if (oVarC.w() || (iS == this.maxLines && i13 != kotlin.collections.r.o(this.intrinsics.f()))) {
                z11 = true;
                i12 = iS;
                f10 = fA;
                break;
            } else {
                i13++;
                i12 = iS;
                f10 = fA;
                i11 = 0;
                listF = list;
            }
        }
        z11 = false;
        this.height = f10;
        this.lineCount = i12;
        this.didExceedMaxLines = z11;
        this.paragraphInfoList = arrayList;
        this.width = U0.b.l(j10);
        List<C3478i> arrayList2 = new ArrayList<>(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ParagraphInfo pVar = (ParagraphInfo) arrayList.get(i14);
            List<C3478i> listP = pVar.getParagraph().p();
            ArrayList arrayList3 = new ArrayList(listP.size());
            int size3 = listP.size();
            for (int i15 = 0; i15 < size3; i15++) {
                C3478i c3478i = listP.get(i15);
                arrayList3.add(c3478i != null ? pVar.i(c3478i) : null);
            }
            kotlin.collections.r.D(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.intrinsics.g().size()) {
            int size4 = this.intrinsics.g().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList4.add(null);
            }
            arrayList2 = kotlin.collections.r.F0(arrayList2, arrayList4);
        }
        this.placeholderRects = arrayList2;
    }
}
