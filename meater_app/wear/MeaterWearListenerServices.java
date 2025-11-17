package com.apptionlabs.meater_app.wear;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import l8.c;
import qb.h;
import qb.k;
import rb.n;
import rb.o;
import rb.p;
import rb.r;
import rb.u;
import rb.v;
import ua.d;
import ua.i;
import wh.g;
import wh.m;

/* compiled from: MeaterWearListenerServices.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002#$B\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006%"}, d2 = {"Lcom/apptionlabs/meater_app/wear/MeaterWearListenerServices;", "Lrb/v;", "Lua/d;", "Lua/i;", "Lrb/b;", "capabilityInfo", "Lih/u;", "f", "Landroid/os/Bundle;", "bundle", "l", "", "i", "Lsa/b;", "connectionResult", "k", "Lrb/o;", "messageEvent", "p", "onDestroy", "Landroid/content/Intent;", "intent", "", "onUnbind", "", "y", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "TAG", "<init>", "()V", "z", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class MeaterWearListenerServices extends v implements d, i {

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private String TAG = "WEAR**_APP_Ser";

    /* compiled from: MeaterWearListenerServices.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/apptionlabs/meater_app/wear/MeaterWearListenerServices$a;", "", "Landroid/content/Context;", "activity", "", "message", "Lih/u;", "a", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.wear.MeaterWearListenerServices$a, reason: from kotlin metadata */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void a(Context context, String str) {
            m.f(str, "message");
            try {
                Log.d("MainActivity******", "sendMessageToWearAble  " + str);
                m.c(context);
                n b10 = u.b(context);
                m.e(b10, "getMessageClient(...)");
                r c10 = u.c(context);
                m.e(c10, "getNodeClient(...)");
                new b("/wear-activity", str, b10, c10).start();
            } catch (Exception e10) {
                e10.getMessage();
            }
        }
    }

    /* compiled from: MeaterWearListenerServices.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/apptionlabs/meater_app/wear/MeaterWearListenerServices$b;", "Ljava/lang/Thread;", "Lih/u;", "run", "", "q", "Ljava/lang/String;", "path", "r", "message", "Lrb/n;", "s", "Lrb/n;", "messageClient", "Lrb/r;", "t", "Lrb/r;", "nodeClient", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrb/n;Lrb/r;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b extends Thread {

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private String path;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private String message;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private n messageClient;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private r nodeClient;

        public b(String str, String str2, n nVar, r rVar) {
            m.f(str, "path");
            m.f(str2, "message");
            m.f(nVar, "messageClient");
            m.f(rVar, "nodeClient");
            this.path = str;
            this.message = str2;
            this.messageClient = nVar;
            this.nodeClient = rVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            h n10 = this.nodeClient.n();
            m.e(n10, "getConnectedNodes(...)");
            try {
                Object a10 = k.a(n10);
                m.e(a10, "await(...)");
                for (p pVar : (List) a10) {
                    n nVar = this.messageClient;
                    String a11 = pVar.a();
                    String str = this.path;
                    byte[] bytes = this.message.getBytes(pk.d.b);
                    m.e(bytes, "this as java.lang.String).getBytes(charset)");
                    nVar.n(a11, str, bytes);
                    Log.d("MainActivity******", "sending message to watch   " + this.message);
                }
            } catch (Exception e10) {
                Log.d("MainActivity******", "Going background , Phone, please stop sending data ");
                e10.printStackTrace();
            }
        }
    }

    public void f(rb.b bVar) {
        m.f(bVar, "capabilityInfo");
        super.f(bVar);
        Set p10 = bVar.p();
        m.e(p10, "getNodes(...)");
        Log.d(this.TAG, "onCapabilityChanged nodes = " + p10.size());
        if (p10.size() > 0) {
            Iterator it = bVar.p().iterator();
            while (it.hasNext()) {
                if (((p) it.next()).M()) {
                    Log.d(this.TAG, "Found watch Nearby ");
                    return;
                }
            }
            return;
        }
        c.j().l();
    }

    public void k(sa.b bVar) {
        m.f(bVar, "connectionResult");
    }

    public void l(Bundle bundle) {
        Log.d(this.TAG, "onConnected;= ");
    }

    public void onDestroy() {
        Log.d("MainActivity******", "onDestroy  >>>>>>>>>  ");
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onUnbind(Intent intent) {
        Log.d("MainActivity******", "onUnbind >>>>>>>");
        return super/*android.app.Service*/.onUnbind(intent);
    }

    public void p(o oVar) {
        m.f(oVar, "messageEvent");
        super.p(oVar);
        Log.d(this.TAG, "onMessageReceived >>> path = " + oVar.e());
        if (m.a(oVar.e(), "/wear-activity")) {
            byte[] d10 = oVar.d();
            m.e(d10, "getData(...)");
            int parseInt = Integer.parseInt(new String(d10, pk.d.b));
            if (parseInt != 0) {
                if (parseInt == 1) {
                    Log.d(this.TAG, "onMessageReceived:  Start Sending data ");
                    c.j().k();
                    return;
                }
                return;
            }
            Log.d(this.TAG, "onMessageReceived:  Stop Sending data ");
            c.j().l();
        }
    }

    public void i(int i10) {
    }
}
