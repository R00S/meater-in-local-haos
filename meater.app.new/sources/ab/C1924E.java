package ab;

import java.util.EnumMap;
import kotlin.jvm.internal.C3862t;

/* compiled from: JavaTypeQualifiersByElementType.kt */
/* renamed from: ab.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1924E {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap<EnumC1943c, C1963w> f20127a;

    public C1924E(EnumMap<EnumC1943c, C1963w> defaultQualifiers) {
        C3862t.g(defaultQualifiers, "defaultQualifiers");
        this.f20127a = defaultQualifiers;
    }

    public final C1963w a(EnumC1943c enumC1943c) {
        return this.f20127a.get(enumC1943c);
    }

    public final EnumMap<EnumC1943c, C1963w> b() {
        return this.f20127a;
    }
}
