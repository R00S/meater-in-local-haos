package mc;

import kc.f;
import kc.k;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: NothingSerialDescriptor.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0014\u0010\"\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u0006#"}, d2 = {"Lmc/C;", "Lkc/f;", "<init>", "()V", "", "b", "()Ljava/lang/Void;", "", "index", "", "d", "(I)Ljava/lang/String;", "", "f", "(I)Z", "e", "(I)Lkc/f;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lkc/j;", "Lkc/j;", "i", "()Lkc/j;", "kind", "c", "Ljava/lang/String;", "a", "serialName", "elementsCount", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class C implements kc.f {

    /* renamed from: a, reason: collision with root package name */
    public static final C f45439a = new C();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final kc.j kind = k.c.f43921a;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String serialName = "kotlin.Nothing";

    private C() {
    }

    private final Void b() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kc.f
    /* renamed from: a */
    public String getSerialName() {
        return serialName;
    }

    @Override // kc.f
    /* renamed from: c */
    public int getElementsCount() {
        return 0;
    }

    @Override // kc.f
    public String d(int index) {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // kc.f
    public kc.f e(int index) {
        b();
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object other) {
        return this == other;
    }

    @Override // kc.f
    public boolean f(int index) {
        b();
        throw new KotlinNothingValueException();
    }

    public int hashCode() {
        return getSerialName().hashCode() + (i().hashCode() * 31);
    }

    @Override // kc.f
    public kc.j i() {
        return kind;
    }

    @Override // kc.f
    public boolean isInline() {
        return f.a.a(this);
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
