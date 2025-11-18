package kotlin;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: NavArgument.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u001cB;\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001f\u0010\"R\u001a\u0010%\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lg3/k;", "", "Lg3/C;", "type", "", "isNullable", "defaultValue", "defaultValuePresent", "unknownDefaultValuePresent", "<init>", "(Lg3/C;ZLjava/lang/Object;ZZ)V", "", "name", "Landroid/os/Bundle;", "bundle", "Loa/F;", "e", "(Ljava/lang/String;Landroid/os/Bundle;)V", "f", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lg3/C;", "()Lg3/C;", "b", "Z", "d", "()Z", "c", "isDefaultValuePresent", "isDefaultValueUnknown", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3405k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3386C<Object> type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isNullable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefaultValuePresent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefaultValueUnknown;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object defaultValue;

    /* compiled from: NavArgument.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, d2 = {"Lg3/k$a;", "", "<init>", "()V", "T", "Lg3/C;", "type", "d", "(Lg3/C;)Lg3/k$a;", "", "isNullable", "c", "(Z)Lg3/k$a;", "defaultValue", "b", "(Ljava/lang/Object;)Lg3/k$a;", "Lg3/k;", "a", "()Lg3/k;", "Lg3/C;", "Z", "Ljava/lang/Object;", "defaultValuePresent", "e", "unknownDefaultValuePresent", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.k$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private AbstractC3386C<Object> type;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean isNullable;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Object defaultValue;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean defaultValuePresent;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean unknownDefaultValuePresent;

        public final C3405k a() {
            AbstractC3386C<Object> abstractC3386CC = this.type;
            if (abstractC3386CC == null) {
                abstractC3386CC = AbstractC3386C.INSTANCE.c(this.defaultValue);
                C3862t.e(abstractC3386CC, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new C3405k(abstractC3386CC, this.isNullable, this.defaultValue, this.defaultValuePresent, this.unknownDefaultValuePresent);
        }

        public final a b(Object defaultValue) {
            this.defaultValue = defaultValue;
            this.defaultValuePresent = true;
            return this;
        }

        public final a c(boolean isNullable) {
            this.isNullable = isNullable;
            return this;
        }

        public final <T> a d(AbstractC3386C<T> type) {
            C3862t.g(type, "type");
            this.type = type;
            return this;
        }
    }

    public C3405k(AbstractC3386C<Object> type, boolean z10, Object obj, boolean z11, boolean z12) {
        C3862t.g(type, "type");
        if (!type.getIsNullableAllowed() && z10) {
            throw new IllegalArgumentException((type.getName() + " does not allow nullable values").toString());
        }
        if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.getName() + " has null value but is not nullable.").toString());
        }
        this.type = type;
        this.isNullable = z10;
        this.defaultValue = obj;
        this.isDefaultValuePresent = z11 || z12;
        this.isDefaultValueUnknown = z12;
    }

    public final AbstractC3386C<Object> a() {
        return this.type;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsDefaultValueUnknown() {
        return this.isDefaultValueUnknown;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    public final void e(String name, Bundle bundle) {
        Object obj;
        C3862t.g(name, "name");
        C3862t.g(bundle, "bundle");
        if (!this.isDefaultValuePresent || (obj = this.defaultValue) == null) {
            return;
        }
        this.type.h(bundle, name, obj);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !C3862t.b(C3405k.class, other.getClass())) {
            return false;
        }
        C3405k c3405k = (C3405k) other;
        if (this.isNullable != c3405k.isNullable || this.isDefaultValuePresent != c3405k.isDefaultValuePresent || !C3862t.b(this.type, c3405k.type)) {
            return false;
        }
        Object obj = this.defaultValue;
        return obj != null ? C3862t.b(obj, c3405k.defaultValue) : c3405k.defaultValue == null;
    }

    public final boolean f(String name, Bundle bundle) {
        C3862t.g(name, "name");
        C3862t.g(bundle, "bundle");
        if (!this.isNullable && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.type.a(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + (this.isNullable ? 1 : 0)) * 31) + (this.isDefaultValuePresent ? 1 : 0)) * 31;
        Object obj = this.defaultValue;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C3405k.class.getSimpleName());
        sb2.append(" Type: " + this.type);
        sb2.append(" Nullable: " + this.isNullable);
        if (this.isDefaultValuePresent) {
            sb2.append(" DefaultValue: " + this.defaultValue);
        }
        String string = sb2.toString();
        C3862t.f(string, "sb.toString()");
        return string;
    }
}
