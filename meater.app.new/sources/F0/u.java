package F0;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.InterfaceC4160e;

/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Loa/e;", "", "T", "LF0/a;", "parentValue", "childValue", "a", "(LF0/a;LF0/a;)LF0/a;"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class u extends AbstractC3864v implements Ba.p<AccessibilityAction<InterfaceC4160e<? extends Boolean>>, AccessibilityAction<InterfaceC4160e<? extends Boolean>>, AccessibilityAction<InterfaceC4160e<? extends Boolean>>> {

    /* renamed from: B, reason: collision with root package name */
    public static final u f4413B = new u();

    public u() {
        super(2);
    }

    @Override // Ba.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AccessibilityAction<InterfaceC4160e<? extends Boolean>> invoke(AccessibilityAction<InterfaceC4160e<? extends Boolean>> accessibilityAction, AccessibilityAction<InterfaceC4160e<? extends Boolean>> accessibilityAction2) {
        String label;
        InterfaceC4160e interfaceC4160eA;
        if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
            label = accessibilityAction2.getLabel();
        }
        if (accessibilityAction == null || (interfaceC4160eA = accessibilityAction.a()) == null) {
            interfaceC4160eA = accessibilityAction2.a();
        }
        return new AccessibilityAction<>(label, interfaceC4160eA);
    }
}
