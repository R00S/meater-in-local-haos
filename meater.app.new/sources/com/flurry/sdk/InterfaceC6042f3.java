package com.flurry.sdk;

/* renamed from: com.flurry.sdk.f3 */
/* loaded from: classes2.dex */
public interface InterfaceC6042f3 {

    /* renamed from: a */
    public static final a f15851a = new a(b.DO_NOT_DROP, null);

    /* renamed from: b */
    public static final a f15852b = new a(b.DROP_EVENTS_UNIQUE_NAME_EXCEEDED, null);

    /* renamed from: c */
    public static final a f15853c = new a(b.DROP_EVENTS_NAME_INVALID, null);

    /* renamed from: d */
    public static final a f15854d = new a(b.DROP_EVENTS_COUNT_EXCEEDED, null);

    /* renamed from: e */
    public static final a f15855e = new a(b.DROP_STANDARD_EVENTS_COUNT_EXCEEDED, null);

    /* renamed from: f */
    public static final a f15856f = new a(b.DROP_TIMED_EVENTS_START_NOT_FOUND, null);

    /* renamed from: g */
    public static final a f15857g = new a(b.DROP_EVENTS_REASON_UNKNOWN, null);

    /* renamed from: h */
    public static final a f15858h = new a(b.DROP_ERROR_COUNT_EXCEEDED, null);

    /* renamed from: i */
    public static final a f15859i = new a(b.DROP_ORIGINS_COUNT_EXCEEDED, null);

    /* renamed from: j */
    public static final a f15860j = new a(b.DROP_SESSION_PROPERTIES_COUNT_EXCEEDED, null);

    /* renamed from: com.flurry.sdk.f3$a */
    public static class a {

        /* renamed from: a */
        public b f15861a;

        /* renamed from: b */
        public InterfaceC6177u6 f15862b;

        a(b bVar, InterfaceC6177u6 interfaceC6177u6) {
            this.f15861a = bVar;
            this.f15862b = interfaceC6177u6;
        }
    }

    /* renamed from: com.flurry.sdk.f3$b */
    public enum b {
        DO_NOT_DROP("DoNotDrop"),
        DROP_EVENTS_UNIQUE_NAME_EXCEEDED("Unique Event Name exceeded"),
        DROP_EVENTS_NAME_INVALID("Invalid Event Name"),
        DROP_EVENTS_COUNT_EXCEEDED("Events count exceeded"),
        DROP_STANDARD_EVENTS_COUNT_EXCEEDED("Standard events count exceeded"),
        DROP_TIMED_EVENTS_START_NOT_FOUND("End Timed Event but Start not found"),
        DROP_EVENTS_REASON_UNKNOWN("reason unknown"),
        DROP_ERROR_COUNT_EXCEEDED("Error count exceeded"),
        DROP_ORIGINS_COUNT_EXCEEDED("Origins count exceeded"),
        DROP_SESSION_PROPERTIES_COUNT_EXCEEDED("Session properties count exceeded");


        /* renamed from: q */
        public final String f15874q;

        b(String str) {
            this.f15874q = str;
        }
    }

    /* renamed from: a */
    void mo13043a();

    /* renamed from: b */
    a mo13044b(InterfaceC6177u6 interfaceC6177u6);
}
