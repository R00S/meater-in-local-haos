package A;

import java.util.List;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;

/* compiled from: FlowLayoutOverflow.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0014Ba\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R(\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c\u0082\u0001\u0001\u001e¨\u0006\u001f"}, d2 = {"LA/u;", "", "LA/u$a;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "Lkotlin/Function1;", "LA/v;", "Lkotlin/Function0;", "Loa/F;", "seeMoreGetter", "collapseGetter", "<init>", "(LA/u$a;IILBa/l;LBa/l;)V", "b", "()LA/v;", "state", "", "list", "a", "(LA/v;Ljava/util/List;)V", "LA/u$a;", "getType$foundation_layout_release", "()LA/u$a;", "I", "c", "d", "LBa/l;", "e", "LA/z;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0812u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minLinesToShowCollapse;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minCrossAxisSizeToShowCollapse;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<FlowLayoutOverflowState, Ba.p<InterfaceC1554l, Integer, C4153F>> seeMoreGetter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<FlowLayoutOverflowState, Ba.p<InterfaceC1554l, Integer, C4153F>> collapseGetter;

    /* compiled from: FlowLayoutOverflow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LA/u$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "E", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.u$a */
    public enum a {
        Visible,
        Clip,
        ExpandIndicator,
        ExpandOrCollapseIndicator
    }

    /* compiled from: FlowLayoutOverflow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.u$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f219a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f219a = iArr;
        }
    }

    public /* synthetic */ AbstractC0812u(a aVar, int i10, int i11, Ba.l lVar, Ba.l lVar2, C3854k c3854k) {
        this(aVar, i10, i11, lVar, lVar2);
    }

    public final void a(FlowLayoutOverflowState state, List<Ba.p<InterfaceC1554l, Integer, C4153F>> list) {
        Ba.l<FlowLayoutOverflowState, Ba.p<InterfaceC1554l, Integer, C4153F>> lVar = this.seeMoreGetter;
        Ba.p<InterfaceC1554l, Integer, C4153F> pVarInvoke = lVar != null ? lVar.invoke(state) : null;
        Ba.l<FlowLayoutOverflowState, Ba.p<InterfaceC1554l, Integer, C4153F>> lVar2 = this.collapseGetter;
        Ba.p<InterfaceC1554l, Integer, C4153F> pVarInvoke2 = lVar2 != null ? lVar2.invoke(state) : null;
        int i10 = b.f219a[this.type.ordinal()];
        if (i10 == 1) {
            if (pVarInvoke != null) {
                list.add(pVarInvoke);
            }
        } else {
            if (i10 != 2) {
                return;
            }
            if (pVarInvoke != null) {
                list.add(pVarInvoke);
            }
            if (pVarInvoke2 != null) {
                list.add(pVarInvoke2);
            }
        }
    }

    public final FlowLayoutOverflowState b() {
        return new FlowLayoutOverflowState(this.type, this.minLinesToShowCollapse, this.minCrossAxisSizeToShowCollapse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractC0812u(a aVar, int i10, int i11, Ba.l<? super FlowLayoutOverflowState, ? extends Ba.p<? super InterfaceC1554l, ? super Integer, C4153F>> lVar, Ba.l<? super FlowLayoutOverflowState, ? extends Ba.p<? super InterfaceC1554l, ? super Integer, C4153F>> lVar2) {
        this.type = aVar;
        this.minLinesToShowCollapse = i10;
        this.minCrossAxisSizeToShowCollapse = i11;
        this.seeMoreGetter = lVar;
        this.collapseGetter = lVar2;
    }
}
