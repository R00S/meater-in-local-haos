package oa;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: KotlinVersion.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006\""}, d2 = {"Loa/g;", "", "", "major", "minor", "patch", "<init>", "(III)V", "(II)V", "j", "(III)I", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "c", "(Loa/g;)I", "B", "I", "getMajor", "C", "getMinor", "D", "getPatch", "E", "version", "F", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oa.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4162g implements Comparable<C4162g> {

    /* renamed from: G, reason: collision with root package name */
    public static final C4162g f46619G = C4163h.a();

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int major;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final int minor;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final int patch;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final int version;

    public C4162g(int i10, int i11, int i12) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        this.version = j(i10, i11, i12);
    }

    private final int j(int major, int minor, int patch) {
        if (major >= 0 && major < 256 && minor >= 0 && minor < 256 && patch >= 0 && patch < 256) {
            return (major << 16) + (minor << 8) + patch;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + major + '.' + minor + '.' + patch).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4162g other) {
        C3862t.g(other, "other");
        return this.version - other.version;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        C4162g c4162g = other instanceof C4162g ? (C4162g) other : null;
        return c4162g != null && this.version == c4162g.version;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getVersion() {
        return this.version;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append('.');
        sb2.append(this.minor);
        sb2.append('.');
        sb2.append(this.patch);
        return sb2.toString();
    }

    public C4162g(int i10, int i11) {
        this(i10, i11, 0);
    }
}
