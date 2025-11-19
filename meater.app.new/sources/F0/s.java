package F0;

import H0.C1060d;
import H0.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0010\u0010\nR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\nR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u0007\u0010\nR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b!\u0010\nR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u0016\u0010\nR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b&\u0010\nR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\b\u001a\u0004\b \u0010\nR\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\b\u001a\u0004\b,\u0010\nR\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\b\u001a\u0004\b.\u0010\nR \u00102\u001a\b\u0012\u0004\u0012\u0002000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010\b\u001a\u0004\b\u0012\u0010\nR \u00105\u001a\b\u0012\u0004\u0012\u0002030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010\b\u001a\u0004\b\f\u0010\nR\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002060\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\b\u001a\u0004\b8\u0010\nR\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\b\u001a\u0004\b%\u0010\nR\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020:0\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\b\u001a\u0004\b=\u0010\nR\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\b7\u0010\nR\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\b\u001a\u0004\b1\u0010\nR\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\bC\u0010\nR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\b\u001a\u0004\bF\u0010\nR#\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\bI\u0010\nR\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020H0\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\b\u001a\u0004\bK\u0010\nR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b;\u0010\nR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020H0\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\b\u001a\u0004\b\u001a\u0010\nR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020P0\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\bQ\u0010\nR\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\b\u001a\u0004\b)\u0010\nR\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\b\u001a\u0004\bN\u0010\nR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020V0\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\b\u001a\u0004\bW\u0010\nR\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\b\u001a\u0004\bE\u0010\nR\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\bW\u0010\b\u001a\u0004\b\u001e\u0010\nR)\u0010]\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\\0[0\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\b\u001a\u0004\b+\u0010\nR\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\b\u001a\u0004\b4\u0010\nR\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020\\0\u00048\u0006¢\u0006\f\n\u0004\b_\u0010\b\u001a\u0004\b@\u0010\n¨\u0006a"}, d2 = {"LF0/s;", "", "<init>", "()V", "LF0/w;", "", "", "b", "LF0/w;", "d", "()LF0/w;", "ContentDescription", "c", "B", "StateDescription", "LF0/h;", "x", "ProgressBarRangeInfo", "e", "v", "PaneTitle", "Loa/F;", "f", "z", "SelectableGroup", "LF0/b;", "g", "a", "CollectionInfo", "LF0/c;", "h", "CollectionItemInfo", "i", "j", "Heading", "Disabled", "LF0/g;", "k", "t", "LiveRegion", "", "l", "Focused", "m", "s", "IsTraversalGroup", "n", "InvisibleToUser", "Lc0/l;", "o", "ContentType", "Lc0/k;", "p", "ContentDataType", "", "q", "H", "TraversalIndex", "LF0/j;", "r", "HorizontalScrollAxisRange", "I", "VerticalScrollAxisRange", "IsPopup", "u", "IsDialog", "LF0/i;", "y", "Role", "w", "C", "TestTag", "LH0/d;", "D", "Text", "F", "TextSubstitution", "IsShowingTextSubstitution", "A", "EditableText", "LH0/H;", "E", "TextSelectionRange", "LM0/p;", "ImeAction", "Selected", "LG0/a;", "G", "ToggleableState", "Password", "Error", "Lkotlin/Function1;", "", "IndexForKey", "IsEditable", "J", "MaxTextLength", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f4372a = new s();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final w<List<String>> ContentDescription = v.b("ContentDescription", b.f4399B);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final w<String> StateDescription = v.a("StateDescription");

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final w<ProgressBarRangeInfo> ProgressBarRangeInfo = v.a("ProgressBarRangeInfo");

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final w<String> PaneTitle = v.b("PaneTitle", g.f4404B);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final w<C4153F> SelectableGroup = v.a("SelectableGroup");

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final w<F0.b> CollectionInfo = v.a("CollectionInfo");

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final w<F0.c> CollectionItemInfo = v.a("CollectionItemInfo");

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final w<C4153F> Heading = v.a("Heading");

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final w<C4153F> Disabled = v.a("Disabled");

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final w<F0.g> LiveRegion = v.a("LiveRegion");

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final w<Boolean> Focused = v.a("Focused");

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final w<Boolean> IsTraversalGroup = v.a("IsTraversalGroup");

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final w<C4153F> InvisibleToUser = new w<>("InvisibleToUser", d.f4401B);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final w<c0.l> ContentType = new w<>("ContentType", c.f4400B);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final w<c0.k> ContentDataType = new w<>("ContentDataType", a.f4398B);

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final w<Float> TraversalIndex = v.b("TraversalIndex", k.f4408B);

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final w<ScrollAxisRange> HorizontalScrollAxisRange = v.a("HorizontalScrollAxisRange");

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final w<ScrollAxisRange> VerticalScrollAxisRange = v.a("VerticalScrollAxisRange");

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final w<C4153F> IsPopup = v.b("IsPopup", f.f4403B);

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final w<C4153F> IsDialog = v.b("IsDialog", e.f4402B);

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final w<F0.i> Role = v.b("Role", h.f4405B);

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final w<String> TestTag = new w<>("TestTag", false, i.f4406B);

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final w<List<C1060d>> Text = v.b("Text", j.f4407B);

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final w<C1060d> TextSubstitution = new w<>("TextSubstitution", null, 2, null);

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final w<Boolean> IsShowingTextSubstitution = new w<>("IsShowingTextSubstitution", null, 2, null);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private static final w<C1060d> EditableText = v.a("EditableText");

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private static final w<H> TextSelectionRange = v.a("TextSelectionRange");

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private static final w<M0.p> ImeAction = v.a("ImeAction");

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private static final w<Boolean> Selected = v.a("Selected");

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private static final w<G0.a> ToggleableState = v.a("ToggleableState");

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private static final w<C4153F> Password = v.a("Password");

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private static final w<String> Error = v.a("Error");

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private static final w<Ba.l<Object, Integer>> IndexForKey = new w<>("IndexForKey", null, 2, null);

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private static final w<Boolean> IsEditable = new w<>("IsEditable", null, 2, null);

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private static final w<Integer> MaxTextLength = new w<>("MaxTextLength", null, 2, null);

    /* renamed from: K, reason: collision with root package name */
    public static final int f4371K = 8;

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "parentValue", "childValue", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.p<List<? extends String>, List<? extends String>, List<? extends String>> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f4399B = new b();

        b() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(List<String> list, List<String> list2) {
            List<String> listZ0;
            if (list == null || (listZ0 = kotlin.collections.r.Z0(list)) == null) {
                return list2;
            }
            listZ0.addAll(list2);
            return listZ0;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loa/F;", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(Loa/F;Loa/F;)Loa/F;"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.p<C4153F, C4153F, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f4402B = new e();

        e() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4153F invoke(C4153F c4153f, C4153F c4153f2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loa/F;", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(Loa/F;Loa/F;)Loa/F;"}, k = 3, mv = {1, 8, 0})
    static final class f extends AbstractC3864v implements Ba.p<C4153F, C4153F, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final f f4403B = new f();

        f() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4153F invoke(C4153F c4153f, C4153F c4153f2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class g extends AbstractC3864v implements Ba.p<String, String, String> {

        /* renamed from: B, reason: collision with root package name */
        public static final g f4404B = new g();

        g() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LH0/d;", "parentValue", "childValue", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class j extends AbstractC3864v implements Ba.p<List<? extends C1060d>, List<? extends C1060d>, List<? extends C1060d>> {

        /* renamed from: B, reason: collision with root package name */
        public static final j f4407B = new j();

        j() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<C1060d> invoke(List<C1060d> list, List<C1060d> list2) {
            List<C1060d> listZ0;
            if (list == null || (listZ0 = kotlin.collections.r.Z0(list)) == null) {
                return list2;
            }
            listZ0.addAll(list2);
            return listZ0;
        }
    }

    private s() {
    }

    public final w<Boolean> A() {
        return Selected;
    }

    public final w<String> B() {
        return StateDescription;
    }

    public final w<String> C() {
        return TestTag;
    }

    public final w<List<C1060d>> D() {
        return Text;
    }

    public final w<H> E() {
        return TextSelectionRange;
    }

    public final w<C1060d> F() {
        return TextSubstitution;
    }

    public final w<G0.a> G() {
        return ToggleableState;
    }

    public final w<Float> H() {
        return TraversalIndex;
    }

    public final w<ScrollAxisRange> I() {
        return VerticalScrollAxisRange;
    }

    public final w<F0.b> a() {
        return CollectionInfo;
    }

    public final w<F0.c> b() {
        return CollectionItemInfo;
    }

    public final w<c0.k> c() {
        return ContentDataType;
    }

    public final w<List<String>> d() {
        return ContentDescription;
    }

    public final w<c0.l> e() {
        return ContentType;
    }

    public final w<C4153F> f() {
        return Disabled;
    }

    public final w<C1060d> g() {
        return EditableText;
    }

    public final w<String> h() {
        return Error;
    }

    public final w<Boolean> i() {
        return Focused;
    }

    public final w<C4153F> j() {
        return Heading;
    }

    public final w<ScrollAxisRange> k() {
        return HorizontalScrollAxisRange;
    }

    public final w<M0.p> l() {
        return ImeAction;
    }

    public final w<Ba.l<Object, Integer>> m() {
        return IndexForKey;
    }

    public final w<C4153F> n() {
        return InvisibleToUser;
    }

    public final w<C4153F> o() {
        return IsDialog;
    }

    public final w<Boolean> p() {
        return IsEditable;
    }

    public final w<C4153F> q() {
        return IsPopup;
    }

    public final w<Boolean> r() {
        return IsShowingTextSubstitution;
    }

    public final w<Boolean> s() {
        return IsTraversalGroup;
    }

    public final w<F0.g> t() {
        return LiveRegion;
    }

    public final w<Integer> u() {
        return MaxTextLength;
    }

    public final w<String> v() {
        return PaneTitle;
    }

    public final w<C4153F> w() {
        return Password;
    }

    public final w<ProgressBarRangeInfo> x() {
        return ProgressBarRangeInfo;
    }

    public final w<F0.i> y() {
        return Role;
    }

    public final w<C4153F> z() {
        return SelectableGroup;
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/k;", "parentValue", "<anonymous parameter 1>", "a", "(Lc0/k;I)Lc0/k;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.p<c0.k, c0.k, c0.k> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f4398B = new a();

        a() {
            super(2);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ c0.k invoke(c0.k kVar, c0.k kVar2) {
            return a(kVar, kVar2.getDataType());
        }

        public final c0.k a(c0.k kVar, int i10) {
            return kVar;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/l;", "parentValue", "<anonymous parameter 1>", "a", "(Lc0/l;Lc0/l;)Lc0/l;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.p<c0.l, c0.l, c0.l> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f4400B = new c();

        c() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c0.l invoke(c0.l lVar, c0.l lVar2) {
            return lVar;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loa/F;", "parentValue", "<anonymous parameter 1>", "a", "(Loa/F;Loa/F;)Loa/F;"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.p<C4153F, C4153F, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f4401B = new d();

        d() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4153F invoke(C4153F c4153f, C4153F c4153f2) {
            return c4153f;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF0/i;", "parentValue", "<anonymous parameter 1>", "a", "(LF0/i;I)LF0/i;"}, k = 3, mv = {1, 8, 0})
    static final class h extends AbstractC3864v implements Ba.p<F0.i, F0.i, F0.i> {

        /* renamed from: B, reason: collision with root package name */
        public static final h f4405B = new h();

        h() {
            super(2);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ F0.i invoke(F0.i iVar, F0.i iVar2) {
            return a(iVar, iVar2.getValue());
        }

        public final F0.i a(F0.i iVar, int i10) {
            return iVar;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class i extends AbstractC3864v implements Ba.p<String, String, String> {

        /* renamed from: B, reason: collision with root package name */
        public static final i f4406B = new i();

        i() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Ljava/lang/Float;F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class k extends AbstractC3864v implements Ba.p<Float, Float, Float> {

        /* renamed from: B, reason: collision with root package name */
        public static final k f4408B = new k();

        k() {
            super(2);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11) {
            return a(f10, f11.floatValue());
        }

        public final Float a(Float f10, float f11) {
            return f10;
        }
    }
}
