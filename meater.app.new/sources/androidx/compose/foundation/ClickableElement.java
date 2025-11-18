package androidx.compose.foundation;

import A0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import w.InterfaceC4949B;
import z.InterfaceC5162k;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "LA0/V;", "Landroidx/compose/foundation/e;", "Lz/k;", "interactionSource", "Lw/B;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "LF0/i;", "role", "Lkotlin/Function0;", "Loa/F;", "onClick", "<init>", "(Lz/k;Lw/B;ZLjava/lang/String;LF0/i;LBa/a;Lkotlin/jvm/internal/k;)V", "p", "()Landroidx/compose/foundation/e;", "node", "s", "(Landroidx/compose/foundation/e;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lz/k;", "c", "Lw/B;", "d", "Z", "e", "Ljava/lang/String;", "f", "LF0/i;", "g", "LBa/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickableElement extends V<e> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5162k interactionSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4949B indicationNodeFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String onClickLabel;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final F0.i role;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> onClick;

    public /* synthetic */ ClickableElement(InterfaceC5162k interfaceC5162k, InterfaceC4949B interfaceC4949B, boolean z10, String str, F0.i iVar, Ba.a aVar, C3854k c3854k) {
        this(interfaceC5162k, interfaceC4949B, z10, str, iVar, aVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || ClickableElement.class != other.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) other;
        return C3862t.b(this.interactionSource, clickableElement.interactionSource) && C3862t.b(this.indicationNodeFactory, clickableElement.indicationNodeFactory) && this.enabled == clickableElement.enabled && C3862t.b(this.onClickLabel, clickableElement.onClickLabel) && C3862t.b(this.role, clickableElement.role) && this.onClick == clickableElement.onClick;
    }

    public int hashCode() {
        InterfaceC5162k interfaceC5162k = this.interactionSource;
        int iHashCode = (interfaceC5162k != null ? interfaceC5162k.hashCode() : 0) * 31;
        InterfaceC4949B interfaceC4949B = this.indicationNodeFactory;
        int iHashCode2 = (((iHashCode + (interfaceC4949B != null ? interfaceC4949B.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str = this.onClickLabel;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        F0.i iVar = this.role;
        return ((iHashCode3 + (iVar != null ? F0.i.l(iVar.getValue()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public e m() {
        return new e(this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, this.onClick, null);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(e node) {
        node.J2(this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, this.onClick);
    }

    private ClickableElement(InterfaceC5162k interfaceC5162k, InterfaceC4949B interfaceC4949B, boolean z10, String str, F0.i iVar, Ba.a<C4153F> aVar) {
        this.interactionSource = interfaceC5162k;
        this.indicationNodeFactory = interfaceC4949B;
        this.enabled = z10;
        this.onClickLabel = str;
        this.role = iVar;
        this.onClick = aVar;
    }
}
