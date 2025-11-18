package cd;

import Ia.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ParametersHolder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\r\u0010\fJ#\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0019\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0017¨\u0006&"}, d2 = {"Lcd/a;", "", "", "_values", "", "useIndexedValues", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "T", "LIa/d;", "clazz", "a", "(LIa/d;)Ljava/lang/Object;", "b", "c", "Loa/F;", "e", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "get_values", "()Ljava/util/List;", "get_values$annotations", "Ljava/lang/Boolean;", "getUseIndexedValues", "()Ljava/lang/Boolean;", "", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "", "d", "values", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Object> _values;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Boolean useIndexedValues;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int index;

    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final <T> T a(d<?> clazz) {
        T next;
        Iterator<T> it = this._values.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (clazz.s(next)) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        return next;
    }

    private final <T> T b(d<?> clazz) {
        Object obj = this._values.get(this.index);
        T t10 = null;
        if (!clazz.s(obj)) {
            obj = null;
        }
        if (obj != null) {
            t10 = (T) obj;
        }
        if (t10 != null) {
            e();
        }
        return t10;
    }

    public <T> T c(d<?> clazz) {
        C3862t.g(clazz, "clazz");
        if (this._values.isEmpty()) {
            return null;
        }
        Boolean bool = this.useIndexedValues;
        if (bool != null) {
            return C3862t.b(bool, Boolean.TRUE) ? (T) b(clazz) : (T) a(clazz);
        }
        T t10 = (T) b(clazz);
        return t10 == null ? (T) a(clazz) : t10;
    }

    public final List<Object> d() {
        return this._values;
    }

    public final void e() {
        if (this.index < r.o(this._values)) {
            this.index++;
        }
    }

    public String toString() {
        return "DefinitionParameters" + r.W0(this._values);
    }

    public a(List<Object> _values, Boolean bool) {
        C3862t.g(_values, "_values");
        this._values = _values;
        this.useIndexedValues = bool;
    }

    public /* synthetic */ a(List list, Boolean bool, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? new ArrayList() : list, (i10 & 2) != 0 ? null : bool);
    }
}
