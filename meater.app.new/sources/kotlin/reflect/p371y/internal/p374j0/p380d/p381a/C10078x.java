package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.EnumMap;
import kotlin.jvm.internal.C9801m;

/* compiled from: JavaTypeQualifiersByElementType.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.x */
/* loaded from: classes2.dex */
public final class C10078x {

    /* renamed from: a */
    private final EnumMap<EnumC9946b, C10071q> f38322a;

    public C10078x(EnumMap<EnumC9946b, C10071q> enumMap) {
        C9801m.m32346f(enumMap, "defaultQualifiers");
        this.f38322a = enumMap;
    }

    /* renamed from: a */
    public final C10071q m33822a(EnumC9946b enumC9946b) {
        return this.f38322a.get(enumC9946b);
    }

    /* renamed from: b */
    public final EnumMap<EnumC9946b, C10071q> m33823b() {
        return this.f38322a;
    }
}
