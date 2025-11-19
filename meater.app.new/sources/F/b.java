package F;

import H0.C1060d;
import H0.Placeholder;
import H0.TextLayoutResult;
import H0.TextStyle;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.b;
import h0.C3478i;
import i0.InterfaceC3608w0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC1341l;
import kotlin.C1509K0;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4170o;
import y0.H;
import y0.Z;

/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001az\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0090\u0001\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00170\u00162\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001aG\u0010)\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020'\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010$0&\u0018\u00010!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0$H\u0002¢\u0006\u0004\b)\u0010*\u001aÂ\u0001\u00106\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+2\u0014\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0018\u00010!2\u001c\u00101\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001000!\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u00103\u001a\u0004\u0018\u0001022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a°\u0001\u00109\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00152\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u00108\u001a\u00020\f2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+2\b\u00103\u001a\u0004\u0018\u0001022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<²\u0006\u000e\u0010;\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"", "text", "Lb0/i;", "modifier", "LH0/J;", "style", "Lkotlin/Function1;", "LH0/F;", "Loa/F;", "onTextLayout", "LR0/q;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Li0/w0;", "color", "b", "(Ljava/lang/String;Lb0/i;LH0/J;LBa/l;IZIILi0/w0;LO/l;II)V", "LH0/d;", "", "LF/e;", "inlineContent", "a", "(LH0/d;Lb0/i;LH0/J;LBa/l;IZIILjava/util/Map;Li0/w0;LO/l;II)V", "LH/i;", "selectionRegistrar", "LY/j;", "", "j", "(LH/i;)LY/j;", "", "Ly0/H;", "measurables", "Lkotlin/Function0;", "shouldMeasureLinks", "Loa/o;", "Ly0/Z;", "LU0/n;", "i", "(Ljava/util/List;LBa/a;)Ljava/util/List;", "LL0/l$b;", "fontFamilyResolver", "LH0/d$c;", "LH0/w;", "placeholders", "Lh0/i;", "onPlaceholderLayout", "LG/g;", "selectionController", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "k", "(Lb0/i;LH0/d;LH0/J;LBa/l;IZIILL0/l$b;Ljava/util/List;LBa/l;LG/g;Li0/w0;LBa/l;)Lb0/i;", "hasInlineContent", "e", "(Lb0/i;LH0/d;LBa/l;ZLjava/util/Map;LH0/J;IZIILL0/l$b;LG/g;Li0/w0;LBa/l;LO/l;III)V", "displayedText", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* compiled from: BasicText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f4165B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b0.i f4166C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ TextStyle f4167D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.l<TextLayoutResult, C4153F> f4168E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f4169F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f4170G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f4171H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f4172I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ InterfaceC3608w0 f4173J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f4174K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f4175L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, b0.i iVar, TextStyle textStyle, Ba.l<? super TextLayoutResult, C4153F> lVar, int i10, boolean z10, int i11, int i12, InterfaceC3608w0 interfaceC3608w0, int i13, int i14) {
            super(2);
            this.f4165B = str;
            this.f4166C = iVar;
            this.f4167D = textStyle;
            this.f4168E = lVar;
            this.f4169F = i10;
            this.f4170G = z10;
            this.f4171H = i11;
            this.f4172I = i12;
            this.f4173J = interfaceC3608w0;
            this.f4174K = i13;
            this.f4175L = i14;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            b.b(this.f4165B, this.f4166C, this.f4167D, this.f4168E, this.f4169F, this.f4170G, this.f4171H, this.f4172I, this.f4173J, interfaceC1554l, C1509K0.a(this.f4174K | 1), this.f4175L);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/modifiers/b$a;", "substitutionValue", "Loa/F;", "a", "(Landroidx/compose/foundation/text/modifiers/b$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: F.b$b, reason: collision with other inner class name */
    static final class C0078b extends AbstractC3864v implements Ba.l<b.TextSubstitutionValue, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<C1060d> f4176B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0078b(InterfaceC1563p0<C1060d> interfaceC1563p0) {
            super(1);
            this.f4176B = interfaceC1563p0;
        }

        public final void a(b.TextSubstitutionValue textSubstitutionValue) {
            b.d(this.f4176B, textSubstitutionValue.getIsShowingSubstitution() ? textSubstitutionValue.getSubstitution() : textSubstitutionValue.getOriginal());
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(b.TextSubstitutionValue textSubstitutionValue) {
            a(textSubstitutionValue);
            return C4153F.f46609a;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C1060d f4177B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b0.i f4178C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ TextStyle f4179D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.l<TextLayoutResult, C4153F> f4180E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f4181F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f4182G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f4183H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f4184I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ Map<String, F.e> f4185J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ InterfaceC3608w0 f4186K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f4187L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f4188M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(C1060d c1060d, b0.i iVar, TextStyle textStyle, Ba.l<? super TextLayoutResult, C4153F> lVar, int i10, boolean z10, int i11, int i12, Map<String, F.e> map, InterfaceC3608w0 interfaceC3608w0, int i13, int i14) {
            super(2);
            this.f4177B = c1060d;
            this.f4178C = iVar;
            this.f4179D = textStyle;
            this.f4180E = lVar;
            this.f4181F = i10;
            this.f4182G = z10;
            this.f4183H = i11;
            this.f4184I = i12;
            this.f4185J = map;
            this.f4186K = interfaceC3608w0;
            this.f4187L = i13;
            this.f4188M = i14;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            b.a(this.f4177B, this.f4178C, this.f4179D, this.f4180E, this.f4181F, this.f4182G, this.f4183H, this.f4184I, this.f4185J, this.f4186K, interfaceC1554l, C1509K0.a(this.f4187L | 1), this.f4188M);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.a<Long> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ H.i f4189B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(H.i iVar) {
            super(0);
            this.f4189B = iVar;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(this.f4189B.c());
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.a<Long> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ H.i f4190B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(H.i iVar) {
            super(0);
            this.f4190B = iVar;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(this.f4190B.c());
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH0/F;", "it", "Loa/F;", "a", "(LH0/F;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends AbstractC3864v implements Ba.l<TextLayoutResult, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ F.l f4191B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.l<TextLayoutResult, C4153F> f4192C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(F.l lVar, Ba.l<? super TextLayoutResult, C4153F> lVar2) {
            super(1);
            this.f4191B = lVar;
            this.f4192C = lVar2;
        }

        public final void a(TextLayoutResult textLayoutResult) {
            F.l lVar = this.f4191B;
            if (lVar != null) {
                lVar.r(textLayoutResult);
            }
            Ba.l<TextLayoutResult, C4153F> lVar2 = this.f4192C;
            if (lVar2 != null) {
                lVar2.invoke(textLayoutResult);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return C4153F.f46609a;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class g extends AbstractC3864v implements Ba.a<Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ F.l f4193B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(F.l lVar) {
            super(0);
            this.f4193B = lVar;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            F.l lVar = this.f4193B;
            return Boolean.valueOf(lVar != null ? lVar.l().invoke().booleanValue() : false);
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class h extends AbstractC3864v implements Ba.a<Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ F.l f4194B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(F.l lVar) {
            super(0);
            this.f4194B = lVar;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            F.l lVar = this.f4194B;
            return Boolean.valueOf(lVar != null ? lVar.l().invoke().booleanValue() : false);
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lh0/i;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class i extends AbstractC3864v implements Ba.a<List<? extends C3478i>> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<List<C3478i>> f4195B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC1563p0<List<C3478i>> interfaceC1563p0) {
            super(0);
            this.f4195B = interfaceC1563p0;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<C3478i> invoke() {
            InterfaceC1563p0<List<C3478i>> interfaceC1563p0 = this.f4195B;
            if (interfaceC1563p0 != null) {
                return interfaceC1563p0.getValue();
            }
            return null;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ b0.i f4196B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1060d f4197C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.l<TextLayoutResult, C4153F> f4198D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f4199E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Map<String, F.e> f4200F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ TextStyle f4201G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f4202H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ boolean f4203I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f4204J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f4205K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ AbstractC1341l.b f4206L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ G.g f4207M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ InterfaceC3608w0 f4208N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ba.l<b.TextSubstitutionValue, C4153F> f4209O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ int f4210P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ int f4211Q;

        /* renamed from: R, reason: collision with root package name */
        final /* synthetic */ int f4212R;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(b0.i iVar, C1060d c1060d, Ba.l<? super TextLayoutResult, C4153F> lVar, boolean z10, Map<String, F.e> map, TextStyle textStyle, int i10, boolean z11, int i11, int i12, AbstractC1341l.b bVar, G.g gVar, InterfaceC3608w0 interfaceC3608w0, Ba.l<? super b.TextSubstitutionValue, C4153F> lVar2, int i13, int i14, int i15) {
            super(2);
            this.f4196B = iVar;
            this.f4197C = c1060d;
            this.f4198D = lVar;
            this.f4199E = z10;
            this.f4200F = map;
            this.f4201G = textStyle;
            this.f4202H = i10;
            this.f4203I = z11;
            this.f4204J = i11;
            this.f4205K = i12;
            this.f4206L = bVar;
            this.f4207M = gVar;
            this.f4208N = interfaceC3608w0;
            this.f4209O = lVar2;
            this.f4210P = i13;
            this.f4211Q = i14;
            this.f4212R = i15;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            b.e(this.f4196B, this.f4197C, this.f4198D, this.f4199E, this.f4200F, this.f4201G, this.f4202H, this.f4203I, this.f4204J, this.f4205K, this.f4206L, this.f4207M, this.f4208N, this.f4209O, interfaceC1554l, C1509K0.a(this.f4210P | 1), C1509K0.a(this.f4211Q), this.f4212R);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lh0/i;", "it", "Loa/F;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends AbstractC3864v implements Ba.l<List<? extends C3478i>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<List<C3478i>> f4213B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(InterfaceC1563p0<List<C3478i>> interfaceC1563p0) {
            super(1);
            this.f4213B = interfaceC1563p0;
        }

        public final void a(List<C3478i> list) {
            InterfaceC1563p0<List<C3478i>> interfaceC1563p0 = this.f4213B;
            if (interfaceC1563p0 == null) {
                return;
            }
            interfaceC1563p0.setValue(list);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(List<? extends C3478i> list) {
            a(list);
            return C4153F.f46609a;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LH0/d;", "a", "()LH0/d;"}, k = 3, mv = {1, 8, 0})
    static final class l extends AbstractC3864v implements Ba.a<C1060d> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ F.l f4214B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1060d f4215C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(F.l lVar, C1060d c1060d) {
            super(0);
            this.f4214B = lVar;
            this.f4215C = c1060d;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1060d invoke() {
            C1060d c1060dI;
            F.l lVar = this.f4214B;
            return (lVar == null || (c1060dI = lVar.i()) == null) ? this.f4215C : c1060dI;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LH0/d;", "a", "()LH0/d;"}, k = 3, mv = {1, 8, 0})
    static final class m extends AbstractC3864v implements Ba.a<C1060d> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C1060d f4216B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(C1060d c1060d) {
            super(0);
            this.f4216B = c1060d;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1060d invoke() {
            return this.f4216B;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LY/l;", "", "it", "a", "(LY/l;J)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class n extends AbstractC3864v implements Ba.p<Y.l, Long, Long> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ H.i f4217B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(H.i iVar) {
            super(2);
            this.f4217B = iVar;
        }

        public final Long a(Y.l lVar, long j10) {
            if (H.j.b(this.f4217B, j10)) {
                return Long.valueOf(j10);
            }
            return null;
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Long invoke(Y.l lVar, Long l10) {
            return a(lVar, l10.longValue());
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(J)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class o extends AbstractC3864v implements Ba.l<Long, Long> {

        /* renamed from: B, reason: collision with root package name */
        public static final o f4218B = new o();

        o() {
            super(1);
        }

        public final Long a(long j10) {
            return Long.valueOf(j10);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Long invoke(Long l10) {
            return a(l10.longValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(H0.C1060d r52, b0.i r53, H0.TextStyle r54, Ba.l<? super H0.TextLayoutResult, oa.C4153F> r55, int r56, boolean r57, int r58, int r59, java.util.Map<java.lang.String, F.e> r60, i0.InterfaceC3608w0 r61, kotlin.InterfaceC1554l r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F.b.a(H0.d, b0.i, H0.J, Ba.l, int, boolean, int, int, java.util.Map, i0.w0, O.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r42, b0.i r43, H0.TextStyle r44, Ba.l<? super H0.TextLayoutResult, oa.C4153F> r45, int r46, boolean r47, int r48, int r49, i0.InterfaceC3608w0 r50, kotlin.InterfaceC1554l r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F.b.b(java.lang.String, b0.i, H0.J, Ba.l, int, boolean, int, int, i0.w0, O.l, int, int):void");
    }

    private static final C1060d c(InterfaceC1563p0<C1060d> interfaceC1563p0) {
        return interfaceC1563p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC1563p0<C1060d> interfaceC1563p0, C1060d c1060d) {
        interfaceC1563p0.setValue(c1060d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(b0.i r46, H0.C1060d r47, Ba.l<? super H0.TextLayoutResult, oa.C4153F> r48, boolean r49, java.util.Map<java.lang.String, F.e> r50, H0.TextStyle r51, int r52, boolean r53, int r54, int r55, kotlin.AbstractC1341l.b r56, G.g r57, i0.InterfaceC3608w0 r58, Ba.l<? super androidx.compose.foundation.text.modifiers.b.TextSubstitutionValue, oa.C4153F> r59, kotlin.InterfaceC1554l r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F.b.e(b0.i, H0.d, Ba.l, boolean, java.util.Map, H0.J, int, boolean, int, int, L0.l$b, G.g, i0.w0, Ba.l, O.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<C4170o<Z, Ba.a<U0.n>>> i(List<? extends H> list, Ba.a<Boolean> aVar) {
        if (!aVar.invoke().booleanValue()) {
            return null;
        }
        q qVar = new q();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            H h10 = list.get(i10);
            Object parentData = h10.getParentData();
            C3862t.e(parentData, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            p pVarA = ((r) parentData).getMeasurePolicy().a(qVar);
            arrayList.add(new C4170o(h10.T(U0.b.INSTANCE.b(pVarA.getWidth(), pVarA.getWidth(), pVarA.getHeight(), pVarA.getHeight())), pVarA.b()));
        }
        return arrayList;
    }

    private static final Y.j<Long, Long> j(H.i iVar) {
        return Y.k.a(new n(iVar), o.f4218B);
    }

    private static final b0.i k(b0.i iVar, C1060d c1060d, TextStyle textStyle, Ba.l<? super TextLayoutResult, C4153F> lVar, int i10, boolean z10, int i11, int i12, AbstractC1341l.b bVar, List<C1060d.Range<Placeholder>> list, Ba.l<? super List<C3478i>, C4153F> lVar2, G.g gVar, InterfaceC3608w0 interfaceC3608w0, Ba.l<? super b.TextSubstitutionValue, C4153F> lVar3) {
        if (gVar == null) {
            return iVar.e(b0.i.INSTANCE).e(new TextAnnotatedStringElement(c1060d, textStyle, bVar, lVar, i10, z10, i11, i12, list, lVar2, null, interfaceC3608w0, lVar3, null));
        }
        return iVar.e(gVar.getModifier()).e(new SelectableTextAnnotatedStringElement(c1060d, textStyle, bVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, interfaceC3608w0, null));
    }
}
