package io.sentry;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: TracesSamplingDecision.java */
@ApiStatus.Internal
/* renamed from: io.sentry.q5 */
/* loaded from: classes2.dex */
public final class C9574q5 {

    /* renamed from: a */
    private final Boolean f36799a;

    /* renamed from: b */
    private final Double f36800b;

    /* renamed from: c */
    private final Boolean f36801c;

    /* renamed from: d */
    private final Double f36802d;

    public C9574q5(Boolean bool) {
        this(bool, null);
    }

    /* renamed from: a */
    public Boolean m31560a() {
        return this.f36801c;
    }

    /* renamed from: b */
    public Double m31561b() {
        return this.f36800b;
    }

    /* renamed from: c */
    public Boolean m31562c() {
        return this.f36799a;
    }

    public C9574q5(Boolean bool, Double d2) {
        this(bool, d2, Boolean.FALSE, null);
    }

    public C9574q5(Boolean bool, Double d2, Boolean bool2, Double d3) {
        this.f36799a = bool;
        this.f36800b = d2;
        this.f36801c = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f36802d = d3;
    }
}
