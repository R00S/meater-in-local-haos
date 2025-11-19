package com.google.firebase.messaging;

import c9.C2347b;
import c9.InterfaceC2348c;
import c9.InterfaceC2349d;
import d9.InterfaceC3083a;
import d9.InterfaceC3084b;
import f9.C3347a;
import q9.C4320a;
import q9.C4321b;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2916a implements InterfaceC3083a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3083a f38327a = new C2916a();

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    private static final class C0489a implements InterfaceC2348c<C4320a> {

        /* renamed from: a, reason: collision with root package name */
        static final C0489a f38328a = new C0489a();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f38329b = C2347b.a("projectNumber").b(C3347a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f38330c = C2347b.a("messageId").b(C3347a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f38331d = C2347b.a("instanceId").b(C3347a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f38332e = C2347b.a("messageType").b(C3347a.b().c(4).a()).a();

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f38333f = C2347b.a("sdkPlatform").b(C3347a.b().c(5).a()).a();

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f38334g = C2347b.a("packageName").b(C3347a.b().c(6).a()).a();

        /* renamed from: h, reason: collision with root package name */
        private static final C2347b f38335h = C2347b.a("collapseKey").b(C3347a.b().c(7).a()).a();

        /* renamed from: i, reason: collision with root package name */
        private static final C2347b f38336i = C2347b.a("priority").b(C3347a.b().c(8).a()).a();

        /* renamed from: j, reason: collision with root package name */
        private static final C2347b f38337j = C2347b.a("ttl").b(C3347a.b().c(9).a()).a();

        /* renamed from: k, reason: collision with root package name */
        private static final C2347b f38338k = C2347b.a("topic").b(C3347a.b().c(10).a()).a();

        /* renamed from: l, reason: collision with root package name */
        private static final C2347b f38339l = C2347b.a("bulkId").b(C3347a.b().c(11).a()).a();

        /* renamed from: m, reason: collision with root package name */
        private static final C2347b f38340m = C2347b.a("event").b(C3347a.b().c(12).a()).a();

        /* renamed from: n, reason: collision with root package name */
        private static final C2347b f38341n = C2347b.a("analyticsLabel").b(C3347a.b().c(13).a()).a();

        /* renamed from: o, reason: collision with root package name */
        private static final C2347b f38342o = C2347b.a("campaignId").b(C3347a.b().c(14).a()).a();

        /* renamed from: p, reason: collision with root package name */
        private static final C2347b f38343p = C2347b.a("composerLabel").b(C3347a.b().c(15).a()).a();

        private C0489a() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C4320a c4320a, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.e(f38329b, c4320a.l());
            interfaceC2349d.a(f38330c, c4320a.h());
            interfaceC2349d.a(f38331d, c4320a.g());
            interfaceC2349d.a(f38332e, c4320a.i());
            interfaceC2349d.a(f38333f, c4320a.m());
            interfaceC2349d.a(f38334g, c4320a.j());
            interfaceC2349d.a(f38335h, c4320a.d());
            interfaceC2349d.f(f38336i, c4320a.k());
            interfaceC2349d.f(f38337j, c4320a.o());
            interfaceC2349d.a(f38338k, c4320a.n());
            interfaceC2349d.e(f38339l, c4320a.b());
            interfaceC2349d.a(f38340m, c4320a.f());
            interfaceC2349d.a(f38341n, c4320a.a());
            interfaceC2349d.e(f38342o, c4320a.c());
            interfaceC2349d.a(f38343p, c4320a.e());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: com.google.firebase.messaging.a$b */
    private static final class b implements InterfaceC2348c<C4321b> {

        /* renamed from: a, reason: collision with root package name */
        static final b f38344a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f38345b = C2347b.a("messagingClientEvent").b(C3347a.b().c(1).a()).a();

        private b() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C4321b c4321b, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f38345b, c4321b.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: com.google.firebase.messaging.a$c */
    private static final class c implements InterfaceC2348c<I> {

        /* renamed from: a, reason: collision with root package name */
        static final c f38346a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f38347b = C2347b.d("messagingClientEventExtension");

        private c() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(I i10, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f38347b, i10.b());
        }
    }

    private C2916a() {
    }

    @Override // d9.InterfaceC3083a
    public void a(InterfaceC3084b<?> interfaceC3084b) {
        interfaceC3084b.a(I.class, c.f38346a);
        interfaceC3084b.a(C4321b.class, b.f38344a);
        interfaceC3084b.a(C4320a.class, C0489a.f38328a);
    }
}
