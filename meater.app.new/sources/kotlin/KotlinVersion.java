package kotlin;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.IntRange;
import okhttp3.HttpUrl;

/* compiled from: KotlinVersion.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m32267d2 = {"Lkotlin/KotlinVersion;", HttpUrl.FRAGMENT_ENCODE_SET, "major", HttpUrl.FRAGMENT_ENCODE_SET, "minor", "(II)V", "patch", "(III)V", "getMajor", "()I", "getMinor", "getPatch", "version", "compareTo", "other", "equals", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "isAtLeast", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "versionOf", "Companion", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.e, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {

    /* renamed from: f */
    public static final a f37198f = new a(null);

    /* renamed from: g */
    public static final KotlinVersion f37199g = KotlinVersionCurrentValue.m32429a();

    /* renamed from: h */
    private final int f37200h;

    /* renamed from: i */
    private final int f37201i;

    /* renamed from: j */
    private final int f37202j;

    /* renamed from: k */
    private final int f37203k;

    /* compiled from: KotlinVersion.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m32267d2 = {"Lkotlin/KotlinVersion$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "CURRENT", "Lkotlin/KotlinVersion;", "MAX_COMPONENT_VALUE", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public KotlinVersion(int i2, int i3, int i4) {
        this.f37200h = i2;
        this.f37201i = i3;
        this.f37202j = i4;
        this.f37203k = m32386k(i2, i3, i4);
    }

    /* renamed from: k */
    private final int m32386k(int i2, int i3, int i4) {
        boolean z = false;
        if (new IntRange(0, 255).m32399o(i2) && new IntRange(0, 255).m32399o(i3) && new IntRange(0, 255).m32399o(i4)) {
            z = true;
        }
        if (z) {
            return (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        KotlinVersion kotlinVersion = other instanceof KotlinVersion ? (KotlinVersion) other : null;
        return kotlinVersion != null && this.f37203k == kotlinVersion.f37203k;
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(KotlinVersion kotlinVersion) {
        C9801m.m32346f(kotlinVersion, "other");
        return this.f37203k - kotlinVersion.f37203k;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getF37203k() {
        return this.f37203k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f37200h);
        sb.append('.');
        sb.append(this.f37201i);
        sb.append('.');
        sb.append(this.f37202j);
        return sb.toString();
    }

    public KotlinVersion(int i2, int i3) {
        this(i2, i3, 0);
    }
}
