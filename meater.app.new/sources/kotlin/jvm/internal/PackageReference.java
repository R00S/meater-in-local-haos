package kotlin.jvm.internal;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: PackageReference.kt */
@Metadata(m32266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m32267d2 = {"Lkotlin/jvm/internal/PackageReference;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "moduleName", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Class;Ljava/lang/String;)V", "getJClass", "()Ljava/lang/Class;", "members", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.a0.d.u, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class PackageReference implements ClassBasedDeclarationContainer {

    /* renamed from: f */
    private final Class<?> f37189f;

    /* renamed from: g */
    private final String f37190g;

    public PackageReference(Class<?> cls, String str) {
        C9801m.m32346f(cls, "jClass");
        C9801m.m32346f(str, "moduleName");
        this.f37189f = cls;
        this.f37190g = str;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    /* renamed from: a */
    public Class<?> mo32283a() {
        return this.f37189f;
    }

    public boolean equals(Object other) {
        return (other instanceof PackageReference) && C9801m.m32341a(mo32283a(), ((PackageReference) other).mo32283a());
    }

    public int hashCode() {
        return mo32283a().hashCode();
    }

    public String toString() {
        return mo32283a().toString() + " (Kotlin reflection is not available)";
    }
}
