package F4;

import F4.d;
import P5.z;
import V4.p;
import android.content.Intent;
import c5.C2316d;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.cloud.requests.FavouriteCookObj;
import com.apptionlabs.meater_app.cloud.responses.SyncApiResponse;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.SaveCookHelper;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.ProbeEventLog;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.model.SavedEventLog;
import com.apptionlabs.meater_app.v3protobuf.MCCookStatsMessage;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import nd.s;
import oc.AbstractC4179C;
import oc.E;
import oc.x;

/* compiled from: MEATERCloudCookSyncing.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J'\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010\u0003J\u0015\u0010&\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b&\u0010\rJ\u001d\u0010)\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010\u0003J\u000f\u0010.\u001a\u00020\u0007H\u0016¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u0010\u0003J\u000f\u00100\u001a\u00020\u001eH\u0016¢\u0006\u0004\b0\u00101R&\u00106\u001a\u0012\u0012\u0004\u0012\u00020\n02j\b\u0012\u0004\u0012\u00020\n`38\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"LF4/d;", "LF4/g;", "<init>", "()V", "", "Lcom/google/gson/l;", "cooks", "Loa/F;", "J", "(Ljava/util/List;)V", "Lcom/apptionlabs/meater_app/model/SavedCook;", "cook", "K", "(Lcom/apptionlabs/meater_app/model/SavedCook;)V", "G", "L", "M", "I", "R", "", "cookID", "deviceSerialNumber", "LT4/f;", "callback", "P", "(JJLT4/f;)V", "Lcom/apptionlabs/meater_app/model/ProbeEventLog;", "eventLog", "O", "(Lcom/apptionlabs/meater_app/model/ProbeEventLog;JJLT4/f;)V", "", "url", "hash", "u", "(Ljava/lang/String;Ljava/lang/String;)V", "s", "r", "w", "H", "", "offlineCookFavouriteCall", "N", "(Lcom/apptionlabs/meater_app/model/SavedCook;Z)V", "n", "o", "p", "c", "d", "e", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "g", "Ljava/util/ArrayList;", "offlineFavouriteCooks", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: f, reason: collision with root package name */
    public static final d f4532f = new d();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static ArrayList<SavedCook> offlineFavouriteCooks = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public static final int f4534h = 8;

    /* compiled from: MEATERCloudCookSyncing.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"F4/d$a", "Lnd/d;", "Loc/E;", "Lnd/b;", "call", "", "t", "Loa/F;", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "Lnd/s;", "response", "onResponse", "(Lnd/b;Lnd/s;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements nd.d<E> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SavedCook f4535a;

        a(SavedCook savedCook) {
            this.f4535a = savedCook;
        }

        @Override // nd.d
        public void onFailure(nd.b<E> call, Throwable t10) {
            C3862t.g(call, "call");
            C3862t.g(t10, "t");
            d.f4532f.o();
        }

        @Override // nd.d
        public void onResponse(nd.b<E> call, s<E> response) {
            C3862t.g(call, "call");
            C3862t.g(response, "response");
            if (response.f()) {
                LocalStorage.sharedStorage().savedCookDAO().c(this.f4535a);
                d.f4532f.o();
            } else {
                onFailure(call, new Exception());
                d.f4532f.g(response);
            }
        }
    }

    /* compiled from: MEATERCloudCookSyncing.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J+\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"F4/d$b", "Lnd/d;", "Lcom/apptionlabs/meater_app/cloud/responses/SyncApiResponse;", "Lnd/b;", "call", "Lnd/s;", "response", "Loa/F;", "onResponse", "(Lnd/b;Lnd/s;)V", "", "t", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements nd.d<SyncApiResponse> {
        b() {
        }

        @Override // nd.d
        public void onFailure(nd.b<SyncApiResponse> call, Throwable t10) {
            C3862t.g(call, "call");
            C3862t.g(t10, "t");
            d.f4532f.q();
        }

        @Override // nd.d
        public void onResponse(nd.b<SyncApiResponse> call, s<SyncApiResponse> response) {
            C3862t.g(call, "call");
            C3862t.g(response, "response");
            SyncApiResponse syncApiResponseA = response.a();
            if (!response.f() || syncApiResponseA == null) {
                onFailure(call, new Exception());
                return;
            }
            List<l> data = syncApiResponseA.getData();
            d dVar = d.f4532f;
            dVar.J(data);
            if (syncApiResponseA.getHasMore()) {
                dVar.f(null, null);
            } else {
                dVar.p();
            }
        }
    }

    /* compiled from: MEATERCloudCookSyncing.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J+\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"F4/d$c", "Lnd/d;", "Lcom/apptionlabs/meater_app/cloud/responses/SyncApiResponse;", "Lnd/b;", "call", "Lnd/s;", "response", "Loa/F;", "onResponse", "(Lnd/b;Lnd/s;)V", "", "t", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements nd.d<SyncApiResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4536a;

        c(String str) {
            this.f4536a = str;
        }

        @Override // nd.d
        public void onFailure(nd.b<SyncApiResponse> call, Throwable t10) {
            C3862t.g(call, "call");
            C3862t.g(t10, "t");
            d.f4532f.q();
        }

        @Override // nd.d
        public void onResponse(nd.b<SyncApiResponse> call, s<SyncApiResponse> response) {
            C3862t.g(call, "call");
            C3862t.g(response, "response");
            SyncApiResponse syncApiResponseA = response.a();
            List<l> data = syncApiResponseA != null ? syncApiResponseA.getData() : null;
            if (!response.f() || data == null) {
                onFailure(call, new Exception());
                return;
            }
            d dVar = d.f4532f;
            dVar.J(data);
            dVar.p();
            dVar.getPrefs().B0(this.f4536a);
        }
    }

    /* compiled from: MEATERCloudCookSyncing.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"F4/d$d", "Lnd/d;", "Loc/E;", "Lnd/b;", "call", "", "t", "Loa/F;", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "Lnd/s;", "response", "onResponse", "(Lnd/b;Lnd/s;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: F4.d$d, reason: collision with other inner class name */
    public static final class C0088d implements nd.d<E> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4537a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SavedCook f4538b;

        C0088d(boolean z10, SavedCook savedCook) {
            this.f4537a = z10;
            this.f4538b = savedCook;
        }

        @Override // nd.d
        public void onFailure(nd.b<E> call, Throwable t10) {
            C3862t.g(call, "call");
            C3862t.g(t10, "t");
            if (this.f4537a) {
                return;
            }
            d.f4532f.o();
        }

        @Override // nd.d
        public void onResponse(nd.b<E> call, s<E> response) {
            C3862t.g(call, "call");
            C3862t.g(response, "response");
            if (!response.f()) {
                if (this.f4537a) {
                    return;
                }
                onFailure(call, new Exception());
                d.f4532f.g(response);
                return;
            }
            if (this.f4537a) {
                d.offlineFavouriteCooks.remove(this.f4538b);
                d.f4532f.I();
            } else {
                LocalStorage.sharedStorage().savedCookDAO().h(this.f4538b);
                d.f4532f.o();
            }
        }
    }

    /* compiled from: MEATERCloudCookSyncing.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"F4/d$e", "Lnd/d;", "Loc/E;", "Lnd/b;", "call", "", "t", "Loa/F;", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "Lnd/s;", "response", "onResponse", "(Lnd/b;Lnd/s;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements nd.d<E> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProbeEventLog f4539a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f4540b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f4541c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T4.f f4542d;

        e(ProbeEventLog probeEventLog, long j10, long j11, T4.f fVar) {
            this.f4539a = probeEventLog;
            this.f4540b = j10;
            this.f4541c = j11;
            this.f4542d = fVar;
        }

        @Override // nd.d
        public void onFailure(nd.b<E> call, Throwable t10) {
            C3862t.g(call, "call");
            C3862t.g(t10, "t");
            d.f4532f.h(true);
        }

        @Override // nd.d
        public void onResponse(nd.b<E> call, s<E> response) {
            C3862t.g(call, "call");
            C3862t.g(response, "response");
            if (!response.f()) {
                onFailure(call, new Exception());
                return;
            }
            this.f4539a.markPostAfterDone();
            U4.b.v(e.class.getSimpleName() + ": uploadEventLog - Upload success", new Object[0]);
            d.f4532f.O(this.f4539a, this.f4540b, this.f4541c, this.f4542d);
        }
    }

    /* compiled from: MEATERCloudCookSyncing.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"F4/d$f", "Lnd/d;", "Loc/E;", "Lnd/b;", "call", "", "t", "Loa/F;", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "Lnd/s;", "response", "onResponse", "(Lnd/b;Lnd/s;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements nd.d<E> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SavedCook f4543a;

        f(SavedCook savedCook) {
            this.f4543a = savedCook;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(boolean z10) {
            d.f4532f.w();
        }

        @Override // nd.d
        public void onFailure(nd.b<E> call, Throwable t10) {
            C3862t.g(call, "call");
            C3862t.g(t10, "t");
            d.f4532f.h(true);
        }

        @Override // nd.d
        public void onResponse(nd.b<E> call, s<E> response) {
            E eA;
            String strJ;
            C3862t.g(call, "call");
            C3862t.g(response, "response");
            if (response.f() && (eA = response.a()) != null && (strJ = eA.j()) != null) {
                SavedCook savedCook = this.f4543a;
                j jVarD = m.d(strJ);
                C3862t.f(jVarD, "parseString(...)");
                if (Q4.h.s(jVarD) != null) {
                    savedCook.setNeedsUploading(false);
                    d dVar = d.f4532f;
                    dVar.M(savedCook);
                    dVar.P(savedCook.getCookID(), savedCook.getCookDeviceId(), new T4.f() { // from class: F4.e
                        @Override // T4.f
                        public final void a(boolean z10) {
                            d.f.b(z10);
                        }
                    });
                    U4.b.v(f.class.getSimpleName() + ": uploadIfNeeded - Cook uploaded " + savedCook.getCookID(), new Object[0]);
                    dVar.o();
                    return;
                }
            }
            onFailure(call, new Exception());
        }
    }

    private d() {
    }

    private final void G() {
        if (getPrefs().l() == null) {
            return;
        }
        List<SavedCook> listI = LocalStorage.sharedStorage().savedCookDAO().i();
        C3862t.f(listI, "ownedCook(...)");
        for (SavedCook savedCook : listI) {
            d dVar = f4532f;
            C3862t.d(savedCook);
            dVar.L(savedCook);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        SavedCook savedCook = (SavedCook) r.w0(offlineFavouriteCooks);
        if (savedCook == null) {
            return;
        }
        N(savedCook, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(List<l> cooks) {
        U4.b.v(d.class.getSimpleName() + ": processCooks " + cooks.size(), new Object[0]);
        Iterator<T> it = cooks.iterator();
        while (it.hasNext()) {
            f4532f.K(SaveCookHelper.INSTANCE.getSavedCookFromJson((l) it.next()));
        }
        l lVar = (l) r.w0(cooks);
        if (lVar != null) {
            f4532f.getPrefs().O0(lVar.D("updatedAt").v());
        }
    }

    private final void K(SavedCook cook) {
        U4.b.v(d.class.getSimpleName() + ": processWithCook - id = " + cook.getCookID() + ", time = " + cook.getCookTime() + ", peak = " + cook.getPeakTemperature() + ", cut = " + cook.getCutId() + " history_Size = " + cook.getTemperatureLog().getGraphData().count(), new Object[0]);
        cook.setFinished(true);
        SavedCook savedCookF = LocalStorage.sharedStorage().savedCookDAO().f(cook.getCookID());
        if (!cook.readyForSync()) {
            U4.b.v(d.class.getSimpleName() + ": processWithCook - Invalid cook id " + cook.getCookID(), new Object[0]);
            return;
        }
        if (cook.isNeedsDeleting()) {
            U4.b.v(d.class.getSimpleName() + ": processWithCook - Delete cook id " + cook.getCookID(), new Object[0]);
            LocalStorage.sharedStorage().savedEventLogDAO().e(cook.getCookID());
            L(cook);
            return;
        }
        if (savedCookF == null || !savedCookF.readyForSync() || savedCookF.getTemperatureLog().getTotalTime() == 0.0d || (savedCookF.cookDuration() <= cook.cookDuration() && ((savedCookF.getUpdatedAt() <= 0 || !SaveCookHelper.INSTANCE.isOlderCook(savedCookF.getUpdatedAt(), cook.getUpdatedAt())) && cook.isFinished()))) {
            U4.b.v(d.class.getSimpleName() + ": processWithCook - Save to DB cook id " + cook.getCookID(), new Object[0]);
            M(cook);
            return;
        }
        U4.b.v(d.class.getSimpleName() + ": processWithCook - Needs uploading cook id " + cook.getCookID(), new Object[0]);
        savedCookF.setNeedsUploading(true);
        M(savedCookF);
    }

    private final void L(SavedCook cook) {
        LocalStorage.sharedStorage().savedCookDAO().c(cook);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(SavedCook cook) {
        LocalStorage.sharedStorage().savedCookDAO().h(cook);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(ProbeEventLog eventLog, long cookID, long deviceSerialNumber, T4.f callback) {
        nd.b<E> bVarH;
        U4.b.v(d.class.getSimpleName() + ": uploadEventLog - " + cookID, new Object[0]);
        byte[] bArrMsgForCloudWithProbe = eventLog.msgForCloudWithProbe(deviceSerialNumber, cookID);
        if (bArrMsgForCloudWithProbe != null) {
            AbstractC4179C abstractC4179CG = AbstractC4179C.Companion.g(AbstractC4179C.INSTANCE, x.INSTANCE.b("application/octet-stream"), bArrMsgForCloudWithProbe, 0, 0, 12, null);
            F5.a authorizedMeaterApi = getAuthorizedMeaterApi();
            if (authorizedMeaterApi == null || (bVarH = authorizedMeaterApi.h(abstractC4179CG)) == null) {
                return;
            }
            bVarH.enqueue(new e(eventLog, cookID, deviceSerialNumber, callback));
            return;
        }
        U4.b.v(d.class.getSimpleName() + ": uploadEventLog - No more events to upload for cook " + cookID, new Object[0]);
        callback.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(final long cookID, long deviceSerialNumber, final T4.f callback) {
        U4.b.v(d.class.getSimpleName() + ": uploadEventLogWithCookID - " + cookID, new Object[0]);
        List<SavedEventLog> listF = LocalStorage.sharedStorage().savedEventLogDAO().f(cookID);
        C3862t.f(listF, "getEventLogWithCookId(...)");
        List<SavedEventLog> list = listF;
        final ArrayList arrayList = new ArrayList(r.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((SavedEventLog) it.next()).eventLogId));
        }
        ProbeEventLog eventLog = new SavedEventLog().getEventLog(cookID);
        C3862t.d(eventLog);
        O(eventLog, cookID, deviceSerialNumber, new T4.f() { // from class: F4.c
            @Override // T4.f
            public final void a(boolean z10) {
                d.Q(arrayList, cookID, callback, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(List list, long j10, T4.f fVar, boolean z10) {
        if (!z10) {
            U4.b.v(f4532f.getClass().getSimpleName() + ": uploadEventLogWithCookID - Delete event logs from DB " + list, new Object[0]);
            LocalStorage.sharedStorage().savedEventLogDAO().d(list, j10);
        }
        fVar.a(z10);
    }

    private final void R() {
        U4.b.v(d.class.getSimpleName() + ": uploadRemainingEventLogs", new Object[0]);
        List<Long> listA = LocalStorage.sharedStorage().savedEventLogDAO().a(Temperature.fromCelsius(40));
        C3862t.e(listA, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Long>");
        Long l10 = (Long) r.l0((ArrayList) listA);
        if (l10 == null) {
            U4.b.v(d.class.getSimpleName() + ": uploadRemainingEventLogs - No cooks with events to upload", new Object[0]);
            I();
            h(false);
            return;
        }
        SavedCook savedCookF = LocalStorage.sharedStorage().savedCookDAO().f(l10.longValue());
        if (savedCookF == null) {
            savedCookF = null;
        }
        if (savedCookF == null) {
            P(l10.longValue(), 0L, new T4.f() { // from class: F4.b
                @Override // T4.f
                public final void a(boolean z10) {
                    d.T(z10);
                }
            });
            return;
        }
        if (savedCookF.readyForSync()) {
            P(savedCookF.getCookID(), savedCookF.getCookDeviceId(), new T4.f() { // from class: F4.a
                @Override // T4.f
                public final void a(boolean z10) {
                    d.S(z10);
                }
            });
            return;
        }
        U4.b.v(d.class.getSimpleName() + ": uploadRemainingEventLogs - Cook " + l10 + " not ready for sync", new Object[0]);
        h(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(boolean z10) {
        if (z10) {
            f4532f.h(z10);
        } else {
            f4532f.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(boolean z10) {
        if (z10) {
            f4532f.h(z10);
        } else {
            f4532f.R();
        }
    }

    public final void H(SavedCook cook) {
        nd.b<E> bVarY;
        C3862t.g(cook, "cook");
        if (!z.f14085a.b()) {
            C2316d.n(x4.g.h().getString(R.string.establish_internet_connection), x4.g.h().getString(R.string.establish_internet_connection));
            o();
            return;
        }
        F5.a authorizedMeaterApi = getAuthorizedMeaterApi();
        if (authorizedMeaterApi == null || (bVarY = authorizedMeaterApi.y(cook.cookIDString())) == null) {
            return;
        }
        bVarY.enqueue(new a(cook));
    }

    public final void N(SavedCook cook, boolean offlineCookFavouriteCall) {
        nd.b<E> bVarT;
        C3862t.g(cook, "cook");
        if (!z.f14085a.b()) {
            if (offlineCookFavouriteCall) {
                return;
            }
            String string = x4.g.h().getString(!cook.isFavourite() ? R.string.failed_to_remove_favourite_cooks : R.string.failed_to_add_favourite_cooks);
            C3862t.f(string, "getString(...)");
            C2316d.n(string, x4.g.h().getString(R.string.please_try_again_later));
            o();
            return;
        }
        FavouriteCookObj favouriteCookObj = new FavouriteCookObj();
        favouriteCookObj.setFavourite(cook.isFavourite());
        favouriteCookObj.setCookId(cook.cookIDString());
        F5.a authorizedMeaterApi = getAuthorizedMeaterApi();
        if (authorizedMeaterApi == null || (bVarT = authorizedMeaterApi.t(favouriteCookObj)) == null) {
            return;
        }
        bVarT.enqueue(new C0088d(offlineCookFavouriteCall, cook));
    }

    @Override // F4.g
    public void c() {
        getPrefs().e0();
    }

    @Override // F4.g
    public void d() {
        getPrefs().g0();
    }

    @Override // F4.g
    public String e() {
        String strP = getPrefs().p();
        C3862t.f(strP, "getCurrentCookSyncHash(...)");
        return strP;
    }

    @Override // F4.g
    public void n() {
        super.n();
        List<SavedCook> listE = LocalStorage.sharedStorage().savedCookDAO().e();
        C3862t.e(listE, "null cannot be cast to non-null type java.util.ArrayList<com.apptionlabs.meater_app.model.SavedCook>");
        offlineFavouriteCooks = (ArrayList) listE;
        G();
    }

    @Override // F4.g
    public void o() {
        U4.b.v(d.class.getSimpleName() + ": notifySyncCookRequestCompleted", new Object[0]);
        Intent intent = new Intent(MEATERIntent.INTENT_REFRESH_PREVIOUS_COOKS);
        intent.putExtra(MEATERIntent.EXTRA_COOK_ID, 0);
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    @Override // F4.g
    public void p() {
        I();
        super.p();
        o();
    }

    @Override // F4.g
    public void r() {
        String str;
        nd.b<SyncApiResponse> bVarA;
        String strV = getPrefs().v();
        if (strV == null || strV.length() == 0) {
            str = null;
        } else {
            str = getGreenwichTime() + getPrefs().v();
        }
        F5.a authorizedMeaterApi = getAuthorizedMeaterApi();
        if (authorizedMeaterApi == null || (bVarA = authorizedMeaterApi.a(str, "updatedAt ASC")) == null) {
            return;
        }
        bVarA.enqueue(new b());
    }

    @Override // F4.g
    public void s(String url, String hash) {
        nd.b<SyncApiResponse> bVarV;
        C3862t.g(url, "url");
        C3862t.g(hash, "hash");
        F5.a unauthorizedMeaterApi = getUnauthorizedMeaterApi();
        if (unauthorizedMeaterApi == null || (bVarV = unauthorizedMeaterApi.v(url)) == null) {
            return;
        }
        bVarV.enqueue(new c(hash));
    }

    @Override // F4.g
    protected void u(String url, String hash) {
        List<SavedCook> listE = LocalStorage.sharedStorage().savedCookDAO().e();
        C3862t.e(listE, "null cannot be cast to non-null type java.util.ArrayList<com.apptionlabs.meater_app.model.SavedCook>");
        offlineFavouriteCooks = (ArrayList) listE;
        super.u(url, hash);
    }

    @Override // F4.g
    public void w() {
        nd.b<E> bVarM;
        U4.b.v(d.class.getSimpleName() + ": uploadIfNeeded", new Object[0]);
        List<SavedCook> listB = LocalStorage.sharedStorage().savedCookDAO().b(Temperature.fromCelsius(40));
        C3862t.e(listB, "null cannot be cast to non-null type java.util.ArrayList<com.apptionlabs.meater_app.model.SavedCook>");
        ArrayList arrayList = (ArrayList) listB;
        if (arrayList.isEmpty()) {
            U4.b.v(d.class.getSimpleName() + ": uploadIfNeeded - No cooks to upload", new Object[0]);
            R();
            return;
        }
        SavedCook savedCook = (SavedCook) r.j0(arrayList);
        MCCookStatsMessage mCCookStatsMessageH = p.h(savedCook);
        if (mCCookStatsMessageH == null) {
            U4.b.v(d.class.getSimpleName() + ": uploadIfNeeded - Invalid cook stats message", new Object[0]);
            h(true);
            return;
        }
        AbstractC4179C abstractC4179CG = AbstractC4179C.Companion.g(AbstractC4179C.INSTANCE, x.INSTANCE.b("application/octet-stream"), mCCookStatsMessageH.encode(), 0, 0, 12, null);
        F5.a authorizedMeaterApi = getAuthorizedMeaterApi();
        if (authorizedMeaterApi == null || (bVarM = authorizedMeaterApi.m(abstractC4179CG)) == null) {
            return;
        }
        bVarM.enqueue(new f(savedCook));
    }
}
