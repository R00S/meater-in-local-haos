package com.trello.rxlifecycle.p234g;

import com.trello.rxlifecycle.C8757c;
import com.trello.rxlifecycle.InterfaceC8756b;
import com.trello.rxlifecycle.OutsideLifecycleException;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: RxLifecycleAndroid.java */
/* renamed from: com.trello.rxlifecycle.g.c */
/* loaded from: classes2.dex */
public class C8763c {

    /* renamed from: a */
    private static final InterfaceC11256e<EnumC8761a, EnumC8761a> f33277a = new a();

    /* renamed from: b */
    private static final InterfaceC11256e<EnumC8762b, EnumC8762b> f33278b = new b();

    /* compiled from: RxLifecycleAndroid.java */
    /* renamed from: com.trello.rxlifecycle.g.c$a */
    static class a implements InterfaceC11256e<EnumC8761a, EnumC8761a> {
        a() {
        }

        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public EnumC8761a call(EnumC8761a enumC8761a) {
            switch (c.f33279a[enumC8761a.ordinal()]) {
                case 1:
                    return EnumC8761a.DESTROY;
                case 2:
                    return EnumC8761a.STOP;
                case 3:
                    return EnumC8761a.PAUSE;
                case 4:
                    return EnumC8761a.STOP;
                case 5:
                    return EnumC8761a.DESTROY;
                case 6:
                    throw new OutsideLifecycleException("Cannot bind to Activity lifecycle when outside of it.");
                default:
                    throw new UnsupportedOperationException("Binding to " + enumC8761a + " not yet implemented");
            }
        }
    }

    /* compiled from: RxLifecycleAndroid.java */
    /* renamed from: com.trello.rxlifecycle.g.c$b */
    static class b implements InterfaceC11256e<EnumC8762b, EnumC8762b> {
        b() {
        }

        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public EnumC8762b call(EnumC8762b enumC8762b) {
            switch (c.f33280b[enumC8762b.ordinal()]) {
                case 1:
                    return EnumC8762b.DETACH;
                case 2:
                    return EnumC8762b.DESTROY;
                case 3:
                    return EnumC8762b.DESTROY_VIEW;
                case 4:
                    return EnumC8762b.STOP;
                case 5:
                    return EnumC8762b.PAUSE;
                case 6:
                    return EnumC8762b.STOP;
                case 7:
                    return EnumC8762b.DESTROY_VIEW;
                case 8:
                    return EnumC8762b.DESTROY;
                case 9:
                    return EnumC8762b.DETACH;
                case 10:
                    throw new OutsideLifecycleException("Cannot bind to Fragment lifecycle when outside of it.");
                default:
                    throw new UnsupportedOperationException("Binding to " + enumC8762b + " not yet implemented");
            }
        }
    }

    /* compiled from: RxLifecycleAndroid.java */
    /* renamed from: com.trello.rxlifecycle.g.c$c */
    static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f33279a;

        /* renamed from: b */
        static final /* synthetic */ int[] f33280b;

        static {
            int[] iArr = new int[EnumC8762b.values().length];
            f33280b = iArr;
            try {
                iArr[EnumC8762b.ATTACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33280b[EnumC8762b.CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33280b[EnumC8762b.CREATE_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33280b[EnumC8762b.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33280b[EnumC8762b.RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33280b[EnumC8762b.PAUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33280b[EnumC8762b.STOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33280b[EnumC8762b.DESTROY_VIEW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33280b[EnumC8762b.DESTROY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33280b[EnumC8762b.DETACH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[EnumC8761a.values().length];
            f33279a = iArr2;
            try {
                iArr2[EnumC8761a.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f33279a[EnumC8761a.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f33279a[EnumC8761a.RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f33279a[EnumC8761a.PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f33279a[EnumC8761a.STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f33279a[EnumC8761a.DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* renamed from: a */
    public static <T> InterfaceC8756b<T> m27905a(C11234e<EnumC8761a> c11234e) {
        return C8757c.m27897a(c11234e, f33277a);
    }

    /* renamed from: b */
    public static <T> InterfaceC8756b<T> m27906b(C11234e<EnumC8762b> c11234e) {
        return C8757c.m27897a(c11234e, f33278b);
    }
}
