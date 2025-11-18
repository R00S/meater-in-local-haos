package F0;

import androidx.compose.ui.platform.C2046v0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.InterfaceC4160e;

/* compiled from: SemanticsConfiguration.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u0010\u0010\u000fJ(\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R&\u00100\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00105\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b.\u0010\u001c\"\u0004\b3\u00104R\"\u00108\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00102\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u00104¨\u00069"}, d2 = {"LF0/l;", "LF0/x;", "", "", "LF0/w;", "", "<init>", "()V", "T", "key", "x", "(LF0/w;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "y", "(LF0/w;LBa/a;)Ljava/lang/Object;", "z", "", "iterator", "()Ljava/util/Iterator;", "value", "Loa/F;", "c", "(LF0/w;Ljava/lang/Object;)V", "", "i", "(LF0/w;)Z", "j", "()Z", "child", "D", "(LF0/l;)V", "peer", "h", "w", "()LF0/l;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "B", "Ljava/util/Map;", "props", "C", "Z", "F", "(Z)V", "isMergingSemanticsOfDescendants", "A", "E", "isClearingSemantics", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements x, Iterable<Map.Entry<? extends w<?>, ? extends Object>>, Ca.a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Map<w<?>, Object> props = new LinkedHashMap();

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean isMergingSemanticsOfDescendants;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean isClearingSemantics;

    /* renamed from: A, reason: from getter */
    public final boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    /* renamed from: B, reason: from getter */
    public final boolean getIsMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    public final void D(l child) {
        for (Map.Entry<w<?>, Object> entry : child.props.entrySet()) {
            w<?> key = entry.getKey();
            Object value = entry.getValue();
            Object obj = this.props.get(key);
            C3862t.e(key, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object objC = key.c(obj, value);
            if (objC != null) {
                this.props.put(key, objC);
            }
        }
    }

    public final void E(boolean z10) {
        this.isClearingSemantics = z10;
    }

    public final void F(boolean z10) {
        this.isMergingSemanticsOfDescendants = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F0.x
    public <T> void c(w<T> key, T value) {
        if (!(value instanceof AccessibilityAction) || !i(key)) {
            this.props.put(key, value);
            return;
        }
        Object obj = this.props.get(key);
        C3862t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        Map<w<?>, Object> map = this.props;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) value;
        String label = accessibilityAction2.getLabel();
        if (label == null) {
            label = accessibilityAction.getLabel();
        }
        InterfaceC4160e interfaceC4160eA = accessibilityAction2.a();
        if (interfaceC4160eA == null) {
            interfaceC4160eA = accessibilityAction.a();
        }
        map.put(key, new AccessibilityAction(label, interfaceC4160eA));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return C3862t.b(this.props, lVar.props) && this.isMergingSemanticsOfDescendants == lVar.isMergingSemanticsOfDescendants && this.isClearingSemantics == lVar.isClearingSemantics;
    }

    public final void h(l peer) {
        if (peer.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (peer.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        for (Map.Entry<w<?>, Object> entry : peer.props.entrySet()) {
            w<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.props.containsKey(key)) {
                this.props.put(key, value);
            } else if (value instanceof AccessibilityAction) {
                Object obj = this.props.get(key);
                C3862t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                Map<w<?>, Object> map = this.props;
                String label = accessibilityAction.getLabel();
                if (label == null) {
                    label = ((AccessibilityAction) value).getLabel();
                }
                InterfaceC4160e interfaceC4160eA = accessibilityAction.a();
                if (interfaceC4160eA == null) {
                    interfaceC4160eA = ((AccessibilityAction) value).a();
                }
                map.put(key, new AccessibilityAction(label, interfaceC4160eA));
            }
        }
    }

    public int hashCode() {
        return (((this.props.hashCode() * 31) + Boolean.hashCode(this.isMergingSemanticsOfDescendants)) * 31) + Boolean.hashCode(this.isClearingSemantics);
    }

    public final <T> boolean i(w<T> key) {
        return this.props.containsKey(key);
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends w<?>, ? extends Object>> iterator() {
        return this.props.entrySet().iterator();
    }

    public final boolean j() {
        Set<w<?>> setKeySet = this.props.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            if (((w) it.next()).getIsImportantForAccessibility()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.isMergingSemanticsOfDescendants) {
            sb2.append("");
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.isClearingSemantics) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<w<?>, Object> entry : this.props.entrySet()) {
            w<?> key = entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(key.getName());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return C2046v0.a(this, null) + "{ " + ((Object) sb2) + " }";
    }

    public final l w() {
        l lVar = new l();
        lVar.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        lVar.isClearingSemantics = this.isClearingSemantics;
        lVar.props.putAll(this.props);
        return lVar;
    }

    public final <T> T x(w<T> key) {
        T t10 = (T) this.props.get(key);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    public final <T> T y(w<T> key, Ba.a<? extends T> defaultValue) {
        T t10 = (T) this.props.get(key);
        return t10 == null ? defaultValue.invoke() : t10;
    }

    public final <T> T z(w<T> key, Ba.a<? extends T> defaultValue) {
        T t10 = (T) this.props.get(key);
        return t10 == null ? defaultValue.invoke() : t10;
    }
}
