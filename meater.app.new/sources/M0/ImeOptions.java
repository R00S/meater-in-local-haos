package M0;

import N0.LocaleList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ImeOptions.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001aBO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0016R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b#\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"LM0/q;", "", "", "singleLine", "LM0/v;", "capitalization", "autoCorrect", "LM0/w;", "keyboardType", "LM0/p;", "imeAction", "LM0/y;", "platformImeOptions", "LN0/e;", "hintLocales", "<init>", "(ZIZIILM0/y;LN0/e;Lkotlin/jvm/internal/k;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Z", "g", "()Z", "b", "I", "c", "d", "e", "f", "LN0/e;", "getHintLocales", "()LN0/e;", "LM0/y;", "()LM0/y;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: M0.q, reason: from toString */
/* loaded from: classes.dex */
public final class ImeOptions {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    private static final ImeOptions f11939h = new ImeOptions(false, 0, false, 0, 0, null, null, 127, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean singleLine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int capitalization;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoCorrect;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int keyboardType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int imeAction;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocaleList hintLocales;

    /* compiled from: ImeOptions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LM0/q$a;", "", "<init>", "()V", "LM0/q;", "Default", "LM0/q;", "a", "()LM0/q;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: M0.q$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final ImeOptions a() {
            return ImeOptions.f11939h;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, y yVar, LocaleList localeList, C3854k c3854k) {
        this(z10, i10, z11, i11, i12, yVar, localeList);
    }

    /* renamed from: b, reason: from getter */
    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: c, reason: from getter */
    public final int getCapitalization() {
        return this.capitalization;
    }

    /* renamed from: d, reason: from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    /* renamed from: e, reason: from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) other;
        if (this.singleLine != imeOptions.singleLine || !v.f(this.capitalization, imeOptions.capitalization) || this.autoCorrect != imeOptions.autoCorrect || !w.k(this.keyboardType, imeOptions.keyboardType) || !p.l(this.imeAction, imeOptions.imeAction)) {
            return false;
        }
        imeOptions.getClass();
        return C3862t.b(null, null) && C3862t.b(this.hintLocales, imeOptions.hintLocales);
    }

    public final y f() {
        return null;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.singleLine) * 31) + v.g(this.capitalization)) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + w.l(this.keyboardType)) * 31) + p.m(this.imeAction)) * 961) + this.hintLocales.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) v.h(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) w.m(this.keyboardType)) + ", imeAction=" + ((Object) p.n(this.imeAction)) + ", platformImeOptions=" + ((Object) null) + ", hintLocales=" + this.hintLocales + ')';
    }

    private ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, y yVar, LocaleList localeList) {
        this.singleLine = z10;
        this.capitalization = i10;
        this.autoCorrect = z11;
        this.keyboardType = i11;
        this.imeAction = i12;
        this.hintLocales = localeList;
    }

    public /* synthetic */ ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, y yVar, LocaleList localeList, int i13, C3854k c3854k) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? v.INSTANCE.b() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? w.INSTANCE.h() : i11, (i13 & 16) != 0 ? p.INSTANCE.a() : i12, (i13 & 32) != 0 ? null : yVar, (i13 & 64) != 0 ? LocaleList.INSTANCE.b() : localeList, null);
    }
}
