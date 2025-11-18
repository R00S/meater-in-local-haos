package F0;

import H0.C1060d;
import H0.TextLayoutResult;
import h0.C3476g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.P;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aA\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u0007\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u000e\u0010\r\u001a\u0011\u0010\u000f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u000f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u0010\u0010\r\u001a%\u0010\u0015\u001a\u00020\u000b*\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u001c\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0011¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u001f\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 \u001a-\u0010!\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001e¢\u0006\u0004\b!\u0010 \u001a9\u0010#\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0006¢\u0006\u0004\b#\u0010$\u001a5\u0010'\u001a\u00020\u000b*\u00020\n2\"\u0010\u001b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0&\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0006¢\u0006\u0004\b'\u0010(\u001a1\u0010)\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001a0\u0011¢\u0006\u0004\b)\u0010\u001d\u001a3\u0010+\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0011¢\u0006\u0004\b+\u0010\u001d\u001a3\u0010,\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0011¢\u0006\u0004\b,\u0010\u001d\u001a-\u0010-\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001e¢\u0006\u0004\b-\u0010 \u001a-\u0010.\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001e¢\u0006\u0004\b.\u0010 \u001a-\u0010/\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001e¢\u0006\u0004\b/\u0010 \u001a-\u00100\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001e¢\u0006\u0004\b0\u0010 \"(\u00106\u001a\u00020\u0001*\u00020\n2\u0006\u00101\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105\"/\u0010?\u001a\u000207*\u00020\n2\u0006\u00108\u001a\u0002078F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<*\u0004\b=\u0010>\"/\u0010C\u001a\u00020\u0001*\u00020\n2\u0006\u00108\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b@\u00103\"\u0004\bA\u00105*\u0004\bB\u0010>\"/\u0010J\u001a\u00020D*\u00020\n2\u0006\u00108\u001a\u00020D8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H*\u0004\bI\u0010>\"/\u0010P\u001a\u00020\u001a*\u00020\n2\u0006\u00108\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N*\u0004\bO\u0010>\"5\u0010Q\u001a\u00020\u001a*\u00020\n2\u0006\u00108\u001a\u00020\u001a8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bS\u0010\r\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010N*\u0004\bT\u0010>\"/\u0010U\u001a\u00020\u001a*\u00020\n2\u0006\u00108\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bU\u0010L\"\u0004\bV\u0010N*\u0004\bW\u0010>\"/\u0010^\u001a\u00020X*\u00020\n2\u0006\u00108\u001a\u00020X8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\*\u0004\b]\u0010>\"/\u0010b\u001a\u00020X*\u00020\n2\u0006\u00108\u001a\u00020X8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b_\u0010Z\"\u0004\b`\u0010\\*\u0004\ba\u0010>\"/\u0010g\u001a\u00020c*\u00020\n2\u0006\u00108\u001a\u00020c8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bd\u0010F\"\u0004\be\u0010H*\u0004\bf\u0010>\"(\u0010l\u001a\u00020**\u00020\n2\u0006\u00101\u001a\u00020*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k\"/\u0010p\u001a\u00020**\u00020\n2\u0006\u00108\u001a\u00020*8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bm\u0010i\"\u0004\bn\u0010k*\u0004\bo\u0010>\"/\u0010q\u001a\u00020\u001a*\u00020\n2\u0006\u00108\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bq\u0010L\"\u0004\br\u0010N*\u0004\bs\u0010>\"/\u0010z\u001a\u00020t*\u00020\n2\u0006\u00108\u001a\u00020t8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bu\u0010v\"\u0004\bw\u0010x*\u0004\by\u0010>¨\u0006{"}, d2 = {"T", "", "name", "LF0/w;", "a", "(Ljava/lang/String;)LF0/w;", "Lkotlin/Function2;", "mergePolicy", "b", "(Ljava/lang/String;LBa/p;)LF0/w;", "LF0/x;", "Loa/F;", "f", "(LF0/x;)V", "n", "r", "e", "Lkotlin/Function1;", "", "", "mapping", "m", "(LF0/x;LBa/l;)V", "label", "", "LH0/F;", "", "action", "k", "(LF0/x;Ljava/lang/String;LBa/l;)V", "Lkotlin/Function0;", "o", "(LF0/x;Ljava/lang/String;LBa/a;)V", "q", "", "u", "(LF0/x;Ljava/lang/String;LBa/p;)V", "Lh0/g;", "Lta/d;", "w", "(LF0/x;LBa/p;)V", "x", "LH0/d;", "L", "P", "c", "g", "s", "i", "value", "getContentDescription", "(LF0/x;)Ljava/lang/String;", "B", "(LF0/x;Ljava/lang/String;)V", "contentDescription", "LF0/h;", "<set-?>", "getProgressBarRangeInfo", "(LF0/x;)LF0/h;", "G", "(LF0/x;LF0/h;)V", "getProgressBarRangeInfo$delegate", "(LF0/x;)Ljava/lang/Object;", "progressBarRangeInfo", "getPaneTitle", "F", "getPaneTitle$delegate", "paneTitle", "LF0/g;", "getLiveRegion", "(LF0/x;)I", "E", "(LF0/x;I)V", "getLiveRegion$delegate", "liveRegion", "getFocused", "(LF0/x;)Z", "C", "(LF0/x;Z)V", "getFocused$delegate", "focused", "isContainer", "A", "isContainer$annotations", "isContainer$delegate", "isTraversalGroup", "N", "isTraversalGroup$delegate", "LF0/j;", "getHorizontalScrollAxisRange", "(LF0/x;)LF0/j;", "D", "(LF0/x;LF0/j;)V", "getHorizontalScrollAxisRange$delegate", "horizontalScrollAxisRange", "getVerticalScrollAxisRange", "O", "getVerticalScrollAxisRange$delegate", "verticalScrollAxisRange", "LF0/i;", "getRole", "H", "getRole$delegate", "role", "getText", "(LF0/x;)LH0/d;", "J", "(LF0/x;LH0/d;)V", "text", "getTextSubstitution", "K", "getTextSubstitution$delegate", "textSubstitution", "isShowingTextSubstitution", "I", "isShowingTextSubstitution$delegate", "LF0/b;", "getCollectionInfo", "(LF0/x;)LF0/b;", "z", "(LF0/x;LF0/b;)V", "getCollectionInfo$delegate", "collectionInfo", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f4414a = {P.f(new A(v.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), P.f(new A(v.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), P.f(new A(v.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), P.f(new A(v.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), P.f(new A(v.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), P.f(new A(v.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), P.f(new A(v.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), P.f(new A(v.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1)), P.f(new A(v.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), P.f(new A(v.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), P.f(new A(v.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), P.f(new A(v.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), P.f(new A(v.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), P.f(new A(v.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), P.f(new A(v.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), P.f(new A(v.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), P.f(new A(v.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), P.f(new A(v.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), P.f(new A(v.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), P.f(new A(v.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), P.f(new A(v.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), P.f(new A(v.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), P.f(new A(v.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), P.f(new A(v.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), P.f(new A(v.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), P.f(new A(v.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<List<Float>, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.a<Float> f4415B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ba.a<Float> aVar) {
            super(1);
            this.f4415B = aVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<Float> list) {
            boolean z10;
            Float fInvoke = this.f4415B.invoke();
            if (fInvoke == null) {
                z10 = false;
            } else {
                list.add(fInvoke);
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static {
        s sVar = s.f4372a;
        sVar.B();
        sVar.x();
        sVar.v();
        sVar.t();
        sVar.i();
        sVar.s();
        sVar.s();
        sVar.e();
        sVar.c();
        sVar.H();
        sVar.k();
        sVar.I();
        sVar.y();
        sVar.C();
        sVar.F();
        sVar.r();
        sVar.g();
        sVar.E();
        sVar.l();
        sVar.A();
        sVar.a();
        sVar.b();
        sVar.G();
        sVar.p();
        sVar.u();
        k.f4315a.d();
    }

    public static final void A(x xVar, boolean z10) {
        s.f4372a.s().d(xVar, f4414a[5], Boolean.valueOf(z10));
    }

    public static final void B(x xVar, String str) {
        xVar.c(s.f4372a.d(), kotlin.collections.r.e(str));
    }

    public static final void C(x xVar, boolean z10) {
        s.f4372a.i().d(xVar, f4414a[4], Boolean.valueOf(z10));
    }

    public static final void D(x xVar, ScrollAxisRange scrollAxisRange) {
        s.f4372a.k().d(xVar, f4414a[10], scrollAxisRange);
    }

    public static final void E(x xVar, int i10) {
        s.f4372a.t().d(xVar, f4414a[3], g.c(i10));
    }

    public static final void F(x xVar, String str) {
        s.f4372a.v().d(xVar, f4414a[2], str);
    }

    public static final void G(x xVar, ProgressBarRangeInfo progressBarRangeInfo) {
        s.f4372a.x().d(xVar, f4414a[1], progressBarRangeInfo);
    }

    public static final void H(x xVar, int i10) {
        s.f4372a.y().d(xVar, f4414a[12], i.h(i10));
    }

    public static final void I(x xVar, boolean z10) {
        s.f4372a.r().d(xVar, f4414a[15], Boolean.valueOf(z10));
    }

    public static final void J(x xVar, C1060d c1060d) {
        xVar.c(s.f4372a.D(), kotlin.collections.r.e(c1060d));
    }

    public static final void K(x xVar, C1060d c1060d) {
        s.f4372a.F().d(xVar, f4414a[14], c1060d);
    }

    public static final void L(x xVar, String str, Ba.l<? super C1060d, Boolean> lVar) {
        xVar.c(k.f4315a.y(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void M(x xVar, String str, Ba.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        L(xVar, str, lVar);
    }

    public static final void N(x xVar, boolean z10) {
        s.f4372a.s().d(xVar, f4414a[6], Boolean.valueOf(z10));
    }

    public static final void O(x xVar, ScrollAxisRange scrollAxisRange) {
        s.f4372a.I().d(xVar, f4414a[11], scrollAxisRange);
    }

    public static final void P(x xVar, String str, Ba.l<? super Boolean, Boolean> lVar) {
        xVar.c(k.f4315a.z(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void Q(x xVar, String str, Ba.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        P(xVar, str, lVar);
    }

    public static final <T> w<T> a(String str) {
        return new w<>(str, true);
    }

    public static final <T> w<T> b(String str, Ba.p<? super T, ? super T, ? extends T> pVar) {
        return new w<>(str, true, pVar);
    }

    public static final void c(x xVar, String str, Ba.a<Boolean> aVar) {
        xVar.c(k.f4315a.a(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void d(x xVar, String str, Ba.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        c(xVar, str, aVar);
    }

    public static final void e(x xVar) {
        xVar.c(s.f4372a.o(), C4153F.f46609a);
    }

    public static final void f(x xVar) {
        xVar.c(s.f4372a.f(), C4153F.f46609a);
    }

    public static final void g(x xVar, String str, Ba.a<Boolean> aVar) {
        xVar.c(k.f4315a.f(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void h(x xVar, String str, Ba.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        g(xVar, str, aVar);
    }

    public static final void i(x xVar, String str, Ba.a<Float> aVar) {
        xVar.c(k.f4315a.h(), new AccessibilityAction(str, new a(aVar)));
    }

    public static /* synthetic */ void j(x xVar, String str, Ba.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        i(xVar, str, aVar);
    }

    public static final void k(x xVar, String str, Ba.l<? super List<TextLayoutResult>, Boolean> lVar) {
        xVar.c(k.f4315a.i(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void l(x xVar, String str, Ba.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        k(xVar, str, lVar);
    }

    public static final void m(x xVar, Ba.l<Object, Integer> lVar) {
        xVar.c(s.f4372a.m(), lVar);
    }

    public static final void n(x xVar) {
        xVar.c(s.f4372a.n(), C4153F.f46609a);
    }

    public static final void o(x xVar, String str, Ba.a<Boolean> aVar) {
        xVar.c(k.f4315a.j(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void p(x xVar, String str, Ba.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        o(xVar, str, aVar);
    }

    public static final void q(x xVar, String str, Ba.a<Boolean> aVar) {
        xVar.c(k.f4315a.l(), new AccessibilityAction(str, aVar));
    }

    public static final void r(x xVar) {
        xVar.c(s.f4372a.q(), C4153F.f46609a);
    }

    public static final void s(x xVar, String str, Ba.a<Boolean> aVar) {
        xVar.c(k.f4315a.r(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void t(x xVar, String str, Ba.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        s(xVar, str, aVar);
    }

    public static final void u(x xVar, String str, Ba.p<? super Float, ? super Float, Boolean> pVar) {
        xVar.c(k.f4315a.s(), new AccessibilityAction(str, pVar));
    }

    public static /* synthetic */ void v(x xVar, String str, Ba.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        u(xVar, str, pVar);
    }

    public static final void w(x xVar, Ba.p<? super C3476g, ? super InterfaceC4588d<? super C3476g>, ? extends Object> pVar) {
        xVar.c(k.f4315a.t(), pVar);
    }

    public static final void x(x xVar, String str, Ba.l<? super Integer, Boolean> lVar) {
        xVar.c(k.f4315a.u(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void y(x xVar, String str, Ba.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        x(xVar, str, lVar);
    }

    public static final void z(x xVar, b bVar) {
        s.f4372a.a().d(xVar, f4414a[20], bVar);
    }
}
