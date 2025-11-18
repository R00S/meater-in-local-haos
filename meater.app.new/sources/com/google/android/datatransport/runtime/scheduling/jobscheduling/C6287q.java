package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t;
import java.util.Map;
import p241e.p254e.p256b.p257a.EnumC8787d;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8854a;

/* compiled from: AutoValue_SchedulerConfig.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.q */
/* loaded from: classes2.dex */
final class C6287q extends AbstractC6290t {

    /* renamed from: a */
    private final InterfaceC8854a f16822a;

    /* renamed from: b */
    private final Map<EnumC8787d, AbstractC6290t.b> f16823b;

    C6287q(InterfaceC8854a interfaceC8854a, Map<EnumC8787d, AbstractC6290t.b> map) {
        if (interfaceC8854a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f16822a = interfaceC8854a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f16823b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t
    /* renamed from: e */
    InterfaceC8854a mo13543e() {
        return this.f16822a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6290t)) {
            return false;
        }
        AbstractC6290t abstractC6290t = (AbstractC6290t) obj;
        return this.f16822a.equals(abstractC6290t.mo13543e()) && this.f16823b.equals(abstractC6290t.mo13544h());
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t
    /* renamed from: h */
    Map<EnumC8787d, AbstractC6290t.b> mo13544h() {
        return this.f16823b;
    }

    public int hashCode() {
        return ((this.f16822a.hashCode() ^ 1000003) * 1000003) ^ this.f16823b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f16822a + ", values=" + this.f16823b + "}";
    }
}
