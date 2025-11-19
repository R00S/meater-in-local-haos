package H0;

import H0.C1060d;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC1341l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: MultiParagraphIntrinsics.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR\u001b\u0010\"\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR \u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010'¨\u0006)"}, d2 = {"LH0/k;", "LH0/r;", "LH0/d;", "annotatedString", "LH0/J;", "style", "", "LH0/d$c;", "LH0/w;", "placeholders", "LU0/d;", "density", "LL0/l$b;", "fontFamilyResolver", "<init>", "(LH0/d;LH0/J;Ljava/util/List;LU0/d;LL0/l$b;)V", "LH0/u;", "defaultStyle", "h", "(LH0/u;LH0/u;)LH0/u;", "a", "LH0/d;", "e", "()LH0/d;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "", "c", "Loa/i;", "()F", "minIntrinsicWidth", "d", "maxIntrinsicWidth", "LH0/q;", "f", "infoList", "", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1067k implements r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C1060d annotatedString;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<C1060d.Range<Placeholder>> placeholders;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i minIntrinsicWidth;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i maxIntrinsicWidth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<ParagraphIntrinsicInfo> infoList;

    /* compiled from: MultiParagraphIntrinsics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.k$a */
    static final class a extends AbstractC3864v implements Ba.a<Float> {
        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo;
            r intrinsics;
            List<ParagraphIntrinsicInfo> listF = C1067k.this.f();
            if (listF.isEmpty()) {
                paragraphIntrinsicInfo = null;
            } else {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = listF.get(0);
                float fC = paragraphIntrinsicInfo2.getIntrinsics().c();
                int iO = kotlin.collections.r.o(listF);
                int i10 = 1;
                if (1 <= iO) {
                    while (true) {
                        ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = listF.get(i10);
                        float fC2 = paragraphIntrinsicInfo3.getIntrinsics().c();
                        if (Float.compare(fC, fC2) < 0) {
                            paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                            fC = fC2;
                        }
                        if (i10 == iO) {
                            break;
                        }
                        i10++;
                    }
                }
                paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
            return Float.valueOf((paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) ? 0.0f : intrinsics.c());
        }
    }

    /* compiled from: MultiParagraphIntrinsics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.k$b */
    static final class b extends AbstractC3864v implements Ba.a<Float> {
        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo;
            r intrinsics;
            List<ParagraphIntrinsicInfo> listF = C1067k.this.f();
            if (listF.isEmpty()) {
                paragraphIntrinsicInfo = null;
            } else {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = listF.get(0);
                float fB = paragraphIntrinsicInfo2.getIntrinsics().b();
                int iO = kotlin.collections.r.o(listF);
                int i10 = 1;
                if (1 <= iO) {
                    while (true) {
                        ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = listF.get(i10);
                        float fB2 = paragraphIntrinsicInfo3.getIntrinsics().b();
                        if (Float.compare(fB, fB2) < 0) {
                            paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                            fB = fB2;
                        }
                        if (i10 == iO) {
                            break;
                        }
                        i10++;
                    }
                }
                paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
            return Float.valueOf((paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) ? 0.0f : intrinsics.b());
        }
    }

    public C1067k(C1060d c1060d, TextStyle textStyle, List<C1060d.Range<Placeholder>> list, U0.d dVar, AbstractC1341l.b bVar) {
        this.annotatedString = c1060d;
        this.placeholders = list;
        EnumC4168m enumC4168m = EnumC4168m.f46628D;
        this.minIntrinsicWidth = C4165j.b(enumC4168m, new b());
        this.maxIntrinsicWidth = C4165j.b(enumC4168m, new a());
        ParagraphStyle paragraphStyle = textStyle.getParagraphStyle();
        List<C1060d.Range<ParagraphStyle>> listL = C1061e.l(c1060d, paragraphStyle);
        ArrayList arrayList = new ArrayList(listL.size());
        int size = listL.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1060d.Range<ParagraphStyle> range = listL.get(i10);
            C1060d c1060dM = C1061e.m(c1060d, range.h(), range.f());
            arrayList.add(new ParagraphIntrinsicInfo(s.a(c1060dM.getText(), textStyle.H(h(range.g(), paragraphStyle)), c1060dM.g(), C1068l.b(g(), range.h(), range.f()), dVar, bVar), range.h(), range.f()));
        }
        this.infoList = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle h(ParagraphStyle style, ParagraphStyle defaultStyle) {
        return !R0.k.j(style.getTextDirection(), R0.k.INSTANCE.f()) ? style : style.a((509 & 1) != 0 ? style.textAlign : 0, (509 & 2) != 0 ? style.textDirection : defaultStyle.getTextDirection(), (509 & 4) != 0 ? style.lineHeight : 0L, (509 & 8) != 0 ? style.textIndent : null, (509 & 16) != 0 ? style.platformStyle : null, (509 & 32) != 0 ? style.lineHeightStyle : null, (509 & 64) != 0 ? style.lineBreak : 0, (509 & 128) != 0 ? style.hyphens : 0, (509 & 256) != 0 ? style.textMotion : null);
    }

    @Override // H0.r
    public boolean a() {
        List<ParagraphIntrinsicInfo> list = this.infoList;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).getIntrinsics().a()) {
                return true;
            }
        }
        return false;
    }

    @Override // H0.r
    public float b() {
        return ((Number) this.minIntrinsicWidth.getValue()).floatValue();
    }

    @Override // H0.r
    public float c() {
        return ((Number) this.maxIntrinsicWidth.getValue()).floatValue();
    }

    /* renamed from: e, reason: from getter */
    public final C1060d getAnnotatedString() {
        return this.annotatedString;
    }

    public final List<ParagraphIntrinsicInfo> f() {
        return this.infoList;
    }

    public final List<C1060d.Range<Placeholder>> g() {
        return this.placeholders;
    }
}
