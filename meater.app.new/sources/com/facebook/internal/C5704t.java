package com.facebook.internal;

import android.content.Intent;
import com.facebook.C5641a0;
import com.facebook.InterfaceC5958y;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: CallbackManagerImpl.kt */
/* renamed from: com.facebook.internal.t */
/* loaded from: classes2.dex */
public final class C5704t implements InterfaceC5958y {

    /* renamed from: a */
    public static final b f14540a = new b(null);

    /* renamed from: b */
    private static final Map<Integer, a> f14541b = new HashMap();

    /* renamed from: c */
    private final Map<Integer, a> f14542c = new HashMap();

    /* compiled from: CallbackManagerImpl.kt */
    /* renamed from: com.facebook.internal.t$a */
    public interface a {
        /* renamed from: a */
        boolean mo11707a(int i2, Intent intent);
    }

    /* compiled from: CallbackManagerImpl.kt */
    /* renamed from: com.facebook.internal.t$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }

        /* renamed from: b */
        private final synchronized a m11709b(int i2) {
            return (a) C5704t.f14541b.get(Integer.valueOf(i2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m11710d(int i2, int i3, Intent intent) {
            a aVarM11709b = m11709b(i2);
            if (aVarM11709b == null) {
                return false;
            }
            return aVarM11709b.mo11707a(i3, intent);
        }

        /* renamed from: c */
        public final synchronized void m11711c(int i2, a aVar) {
            C9801m.m32346f(aVar, "callback");
            if (C5704t.f14541b.containsKey(Integer.valueOf(i2))) {
                return;
            }
            C5704t.f14541b.put(Integer.valueOf(i2), aVar);
        }
    }

    /* compiled from: CallbackManagerImpl.kt */
    /* renamed from: com.facebook.internal.t$c */
    public enum c {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);


        /* renamed from: x */
        private final int f14561x;

        c(int i2) {
            this.f14561x = i2;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] cVarArrValuesCustom = values();
            return (c[]) Arrays.copyOf(cVarArrValuesCustom, cVarArrValuesCustom.length);
        }

        /* renamed from: k */
        public final int m11713k() {
            C5641a0 c5641a0 = C5641a0.f14199a;
            return C5641a0.m11289h() + this.f14561x;
        }
    }

    /* renamed from: b */
    public final void m11706b(int i2, a aVar) {
        C9801m.m32346f(aVar, "callback");
        this.f14542c.put(Integer.valueOf(i2), aVar);
    }

    @Override // com.facebook.InterfaceC5958y
    public boolean onActivityResult(int i2, int i3, Intent intent) {
        a aVar = this.f14542c.get(Integer.valueOf(i2));
        return aVar == null ? f14540a.m11710d(i2, i3, intent) : aVar.mo11707a(i3, intent);
    }
}
